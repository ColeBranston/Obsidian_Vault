A second way to prove a language [[Non-regular Language|non-regular]] — **without pumping anything new**: combine it with a known regular language using a [[Closure Property|closure property]], and land on a language already known to be non-regular.

**Pattern.** Suppose L were regular. Then L ∩ R is regular for any regular R ([[Closure Under Intersection]]). If L ∩ R is a language already proved non-regular, that is a contradiction — so L is not regular.

**Example — equally many 0s and 1s.** L₄ = {s : s contains equally many 0s and 1s}.
- Suppose L₄ were regular. Then L₄ ∩ 0\*1\* would be regular
- But L₄ ∩ 0\*1\* = {0ⁿ1ⁿ : n ≥ 0} — [[Non-regularity of 0n1n|proved non-regular]]. Contradiction

> [!tip] Let a known non-regular language do the work
> This is often shorter than a direct pumping proof. Both arguments are examinable technique.
