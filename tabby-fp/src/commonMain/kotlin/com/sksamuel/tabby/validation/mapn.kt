package com.sksamuel.tabby.validation

fun <A, B, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   f: (A, B) -> RETURN
): Validated<ERROR, RETURN> {
   val errors = listOf(a, b).filterIsInstance<Validated.Invalid<ERROR>>().flatMap { it.errors }
   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      f(a.getValueUnsafe(), b.getValueUnsafe()).valid()
   }
}

fun <A, B, C, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   f: (A, B, C) -> RETURN
): Validated<ERROR, RETURN> {
   val errors = listOf(a, b, c).filterIsInstance<Validated.Invalid<ERROR>>().flatMap { it.errors }
   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      f(a.getValueUnsafe(), b.getValueUnsafe(), c.getValueUnsafe()).valid()
   }
}

fun <A, B, C, D, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   f: (A, B, C, D) -> RETURN
): Validated<ERROR, RETURN> {
   val errors = listOf(a, b, c, d).filterIsInstance<Validated.Invalid<ERROR>>().flatMap { it.errors }
   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      f(a.getValueUnsafe(), b.getValueUnsafe(), c.getValueUnsafe(), d.getValueUnsafe()).valid()
   }
}

fun <A, B, C, D, E, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: (A, B, C, D, E) -> RETURN
): Validated<ERROR, RETURN> {
   val errors = listOf(a, b, c, d, e).filterIsInstance<Validated.Invalid<ERROR>>().flatMap { it.errors }
   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      f(a.getValueUnsafe(), b.getValueUnsafe(), c.getValueUnsafe(), d.getValueUnsafe(), e.getValueUnsafe()).valid()
   }
}

fun <A, B, C, D, E, F, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   fn: (A, B, C, D, E, F) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   fn: (A, B, C, D, E, F, G) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   fn: (A, B, C, D, E, F, G, H) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   fn: (A, B, C, D, E, F, G, H, I) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   fn: (A, B, C, D, E, F, G, H, I, J) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, K, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   fn: (A, B, C, D, E, F, G, H, I, J, K) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, K, L, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, K, L, M, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
      ).valid()
   }
}


fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
      ).valid()
   }
}


fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
      ).valid()
   }
}


fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   q: Validated<ERROR, Q>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
         q.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   q: Validated<ERROR, Q>,
   r: Validated<ERROR, R>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
         q.getValueUnsafe(),
         r.getValueUnsafe(),
      ).valid()
   }
}

fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   q: Validated<ERROR, Q>,
   r: Validated<ERROR, R>,
   s: Validated<ERROR, S>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
         q.getValueUnsafe(),
         r.getValueUnsafe(),
         s.getValueUnsafe(),
      ).valid()
   }
}


fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   q: Validated<ERROR, Q>,
   r: Validated<ERROR, R>,
   s: Validated<ERROR, S>,
   t: Validated<ERROR, T>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
         q.getValueUnsafe(),
         r.getValueUnsafe(),
         s.getValueUnsafe(),
         t.getValueUnsafe(),
      ).valid()
   }
}


fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   q: Validated<ERROR, Q>,
   r: Validated<ERROR, R>,
   s: Validated<ERROR, S>,
   t: Validated<ERROR, T>,
   u: Validated<ERROR, U>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
         q.getValueUnsafe(),
         r.getValueUnsafe(),
         s.getValueUnsafe(),
         t.getValueUnsafe(),
         u.getValueUnsafe(),
      ).valid()
   }
}


fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, RETURN, ERROR> Validated.Companion.mapN(
   a: Validated<ERROR, A>,
   b: Validated<ERROR, B>,
   c: Validated<ERROR, C>,
   d: Validated<ERROR, D>,
   e: Validated<ERROR, E>,
   f: Validated<ERROR, F>,
   g: Validated<ERROR, G>,
   h: Validated<ERROR, H>,
   i: Validated<ERROR, I>,
   j: Validated<ERROR, J>,
   k: Validated<ERROR, K>,
   l: Validated<ERROR, L>,
   m: Validated<ERROR, M>,
   n: Validated<ERROR, N>,
   o: Validated<ERROR, O>,
   p: Validated<ERROR, P>,
   q: Validated<ERROR, Q>,
   r: Validated<ERROR, R>,
   s: Validated<ERROR, S>,
   t: Validated<ERROR, T>,
   u: Validated<ERROR, U>,
   v: Validated<ERROR, V>,
   fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V) -> RETURN
): Validated<ERROR, RETURN> {

   val errors = listOf(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v)
      .filterIsInstance<Validated.Invalid<ERROR>>()
      .flatMap { it.errors }

   return if (errors.isNotEmpty()) Validated.Invalid(errors) else {
      fn(
         a.getValueUnsafe(),
         b.getValueUnsafe(),
         c.getValueUnsafe(),
         d.getValueUnsafe(),
         e.getValueUnsafe(),
         f.getValueUnsafe(),
         g.getValueUnsafe(),
         h.getValueUnsafe(),
         i.getValueUnsafe(),
         j.getValueUnsafe(),
         k.getValueUnsafe(),
         l.getValueUnsafe(),
         m.getValueUnsafe(),
         n.getValueUnsafe(),
         o.getValueUnsafe(),
         p.getValueUnsafe(),
         q.getValueUnsafe(),
         r.getValueUnsafe(),
         s.getValueUnsafe(),
         t.getValueUnsafe(),
         u.getValueUnsafe(),
         v.getValueUnsafe(),
      ).valid()
   }
}