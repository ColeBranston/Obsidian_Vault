A set S is **closed** under an operation f when applying f to elements of S always produces an element of S. ℤ is closed under addition (integers in, integer out) but not under division (2/3 ∉ ℤ).

> [!note] Definition 1 — Regular Language Closure
> Let 𝓡𝓔𝓖 be the set of [[Regular Language|regular languages]] and let f take one or more languages and produce a language. 𝓡𝓔𝓖 is **closed under f** if for all L₁, …, Lₙ ∈ 𝓡𝓔𝓖, f(L₁, …, Lₙ) ∈ 𝓡𝓔𝓖.

The objects are now whole languages: feed f regular languages only, and its output is guaranteed regular — applying f can never leave 𝓡𝓔𝓖.

**Proving vs. disproving**
- **To prove a closure:** show how to build a machine for f(L₁, …, Lₙ) out of machines for L₁, …, Lₙ — and the construction must work for *any* input machines, not just an example
- **To disprove one:** exactly one counterexample suffices
- Two proof techniques: build a machine directly, or combine closures already proved (e.g. [[Closure Under Intersection|intersection via De Morgan]])

**Every closure proof by construction checks three things**
1. **Language** — the new machine recognizes exactly the intended language
2. **Validity** — the result is a legal NFA (or DFA)
3. **Generality** — the construction is a black box that works for any pair of machines

The regular languages are closed under [[Closure Under Complement|complement]] · [[Closure Under Reversal|reversal]] · [[Closure Under Union|union]] · [[Closure Under Intersection|intersection]] · [[Closure Under Concatenation|concatenation]] · [[Closure Under Kleene Star|Kleene star]] · and many more.

> [!question] Three quick closure checks
> 1. Is ℤ closed under subtraction? 2. Is ℤ closed under division? 3. Is ℕ = {0, 1, 2, …} closed under subtraction?
>
> Answers — **1.** Yes: the difference of two integers is an integer. **2.** No: 2/3 is not an integer — one counterexample settles it. **3.** No: 1 − 2 = −1 ∉ ℕ. Closure depends on both the set *and* the operation.
