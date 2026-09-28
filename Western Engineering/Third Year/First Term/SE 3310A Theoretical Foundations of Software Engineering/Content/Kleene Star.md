The **Kleene star** of an [[Alphabet]] is the union of all its powers:

Σ* = Σ⁰ ∪ Σ¹ ∪ Σ² ∪ …

For Σ = {0, 1}, Σ* = {ε, 0, 1, 00, 01, 10, 11, 000, …} — the set of **all finite binary strings**, including the empty string.

> [!note] Infinite set, finite elements
> Σ* is infinite, but every element of Σ* has finite length. These are not in tension: there is no longest string, yet no string is endless. This is the distinction that makes [[String]]'s finiteness requirement compatible with an infinite language.

Σ* is the universe every [[Formal Language]] is carved out of: L ⊆ Σ*.

**Star of a language** (Lecture 6). The same idea applies to any language L, not just an alphabet: L* = {s₁s₂⋯sₖ : k ≥ 0, sᵢ ∈ L} — zero or more strings of L concatenated. ε ∈ L* always (take k = 0), even for L = ∅: ∅* = {ε}. The regular languages are closed under this operation — see [[Closure Under Kleene Star]] — and it's one of the three combiners of a [[Regular Expression]].
