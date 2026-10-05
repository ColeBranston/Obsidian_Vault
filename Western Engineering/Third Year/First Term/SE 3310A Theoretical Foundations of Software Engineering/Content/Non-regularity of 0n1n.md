**Theorem.** L = {0ⁿ1ⁿ : n ≥ 0} is [[Non-regular Language|not regular]]. This is the fully worked [[Pumping Lemma]] proof, following the [[Pumping Lemma Proof Template|four-move template]].

**Setup**
1. Assume L is regular, with pumping length p
2. Let s = 0ᵖ1ᵖ. Clearly s ∈ L and |s| ≥ p
3. Let s = xyz, with |y| > 0 and |xy| ≤ p. If L is regular (as assumed), the lemma says xyⁱz ∈ L for every i ≥ 0
4. Show that s **cannot be pumped**: however it is split, some s′ = xyⁱz falls outside L

**The full case analysis** — by what y contains. It uses only conditions 1 and 2.

| Case | y contains | What pumping does | Why s′ ∉ L |
|---|---|---|---|
| 1 | only 0s | i > 1 adds a non-zero number of 0s; i = 0 takes 0s away | more 0s than 1s, or fewer |
| 2 | only 1s | i > 1 adds 1s; i = 0 removes 1s | the counts are no longer equal |
| 3a | both, in unequal amounts | adds (or removes) unequal numbers of 0s and 1s | the counts are no longer equal |
| 3b | both, in equal amounts: y = 0ʲ1ʲ, j > 0 | for i > 1, yⁱ = 0ʲ1ʲ0ʲ1ʲ…0ʲ1ʲ | the counts are right, but the symbols are **out of order** |

Case 3b is the odd one out: pumping keeps the counts balanced, so the contradiction has to come from the order instead.

**The shortcut — what to write on an assignment or test.** Condition 3 shortens all of that (the [[Condition-3 Shortcut]]):
- s = 0ᵖ1ᵖ and |xy| ≤ p, so x and y live entirely inside the first p symbols, which are all zeros
- Hence y = 0ᵏ with k ≥ 1: only Case 1 can occur. Cases 2, 3a and 3b are ruled out before they arise
- One line finishes it: xy²z = 0ᵖ⁺ᵏ1ᵖ ∉ L. Contradiction

Both proofs are correct. The full case analysis shows the mechanics; the shortcut is the one to write.

**Conclusion.** If L were regular, the lemma says every long enough string in L has a pumpable y portion. But s cannot be pumped no matter how it is sliced — and s is clearly in L. This is a contradiction; therefore L is not regular. ∎

**Where each condition was used**
1. **xyⁱz ∈ L for all i ≥ 0** — the assumption being contradicted: exhibiting one i with xyⁱz ∉ L is the killing blow
2. **|y| > 0** — guarantees pumping changes the string. With y = ε, xy²z = s and no contradiction could ever arise
3. **|xy| ≤ p** — pinned y inside the leading zeros: the whole shortcut. Without it, the case analysis is needed instead
