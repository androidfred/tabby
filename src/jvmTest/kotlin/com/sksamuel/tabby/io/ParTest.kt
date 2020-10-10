package com.sksamuel.tabby.io

import com.sksamuel.tabby.Either
import com.sksamuel.tabby.right
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.coroutines.delay
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

@OptIn(ExperimentalTime::class)
class ParTest : FunSpec() {
   init {

      test("multiple ios should run in parallel").config(timeout = 350.milliseconds) {
         val a = IO.effect {
            delay(250)
            "foo"
         }
         val b = IO.effect {
            delay(250)
            "bar"
         }
         IO.par(a, b).run() shouldBe listOf("foo", "bar").right()
      }

      test("a failure should short circuit").config(timeout = 1000.milliseconds) {
         val a = IO.effect {
            delay(100)
            error("boom")
         }
         val b = IO.effect {
            delay(10000)
            "foo"
         }
         IO.par(a, b).run().shouldBeInstanceOf<Either.Left<*>>()
      }
   }
}
