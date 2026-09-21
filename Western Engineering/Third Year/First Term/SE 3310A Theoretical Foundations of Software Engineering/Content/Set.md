A **set** is an *unordered* collection of *unique* elements. Two sets are equal exactly when they contain the same elements, so {x₁, x₂, x₃, x₄} = {x₄, x₃, x₂, x₁}.

**Set-builder notation** — {x | statement} reads "the set of all x for which *statement* is true". Some texts write `:` instead of `|`. So {x ∈ ℤ : x > 0} = {1, 2, 3, …} = ℕ.

Standard sets: **ℤ** = {…, −1, 0, 1, …} the integers · **ℕ** = {1, 2, …} the naturals · **∅** the empty set.

| Notion | Notation | Meaning |
|---|---|---|
| Membership | x ∈ A, x ∉ A | x is / is not an element of A |
| Subset | A ⊆ B | every element of A is in B; **every set is a subset of itself** |
| Proper subset | A ⊂ B | a subset that also differs from B |
| Power set | 𝒫(A) | the set of **all** subsets of A, and \|𝒫(A)\| = 2^\|A\| |
| Union | A ∪ B = {x \| x ∈ A **or** x ∈ B} | everything in either set; no duplicates — a shared element appears once |
| Intersection | A ∩ B = {x \| x ∈ A **and** x ∈ B} | only the elements belonging to **both** sets |
| Cardinality | \|A\| | the number of elements in A |

**Worked on the lecture's sets.** Let A = {x₁, x₂, x₃, x₄} and B = {x₄, x₅, x₆}.

- A ∪ B = {x₁, x₂, x₃, x₄, x₅, x₆} — x₄ belongs to both but appears **once**: sets contain no duplicates
- A ∩ B = {x₄} — the only element in both
- |A| = 4, |B| = 3, so |B| > |A| is **false**

**Why \|𝒫(A)\| = 2^\|A\|:** each element makes one independent in-or-out choice. Four elements, two choices each → 2·2·2·2 = 16 subsets (∅, four singletons, six pairs, four triples, and A itself).

> [!warning] The traps worth memorizing
> - `x₁ ⊂ A` is **not a subset statement** — x₁ is an element, not a set. `{x₁} ⊂ A` is.
> - `{x₁, x₂, x₃, x₄} ⊂ A` is **false** when A is that same set (proper subset must differ), but `⊆` is **true**.
> - `{∅} ≠ ∅`. The empty set has no elements, so \|∅\| = 0; but {∅} is a set containing one element — the empty set — so \|{∅}\| = 1.
> - Likewise \|{{1, 2}}\| = 1: one element, which happens to be a set.

Contrast [[Tuple]], where order matters and repeats are allowed.
