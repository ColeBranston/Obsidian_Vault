Every proof that a language L is [[Non-regular Language|non-regular]] by the [[Pumping Lemma]] is a **proof by contradiction** with the same four moves:

1. **Assume L is regular**; the lemma grants a pumping length p
2. **Choose one string** s ∈ L with |s| ≥ p, written in terms of p
3. **Consider every legal split** s = xyz (with |y| > 0 and |xy| ≤ p); for each, exhibit an i with xyⁱz ∉ L
4. **Conclude:** the lemma fails for L, contradicting step 1. Hence L is not regular

Steps 1 and 4 are the same words in every proof. All the mathematics lives in steps 2 and 3 — your two moves in the [[Pumping Lemma Game]].

**Step 2 — choosing s.** For L = {0ⁿ1ⁿ : n ≥ 0}:

| Candidate | Legitimate? | Why |
|---|---|---|
| s = 0ᵖ1ᵖ | yes | in L, length 2p ≥ p, and phrased in terms of the unknown p |
| s = (01)ᵖ | no | (01)ᵖ = 0101… is not in L at all (for p ≥ 2). The string must be a member |
| s = 0⁵⁰⁰1⁵⁰⁰ | no, as written | concrete numbers cannot dominate an unknown p — the adversary's p may be too big for the string, and then the length requirement fails |

> [!note] "p might exceed 500"
> That's how the slide puts it. Strictly this string has length 1000, so the length requirement only breaks once p > 1000 — the moral is the same: never fix a number where p should be.

> [!tip] Choose strategically
> Among the legal strings, pick one whose **first p symbols are uniform** — condition 3 will then pin y down completely (the [[Condition-3 Shortcut]]).

**Step 3 — showing s cannot be pumped.** Consider *all* the ways s can be divided into xyz, and for each find some i ≥ 0 such that xyⁱz is not in the language. Two things keep that manageable:
- **p stays unknown.** We never pick a specific string; we leave s abstract, fix its general form, and define it so that |s| ≥ p
- **Cases, not individual splits.** Because s has a general form, we don't examine every partition one by one — we look at the possible *cases* of how s could be partitioned

> [!tip] i = 0 is a legal move
> Condition 1 covers i = 0, so deleting y counts as pumping — see [[Pumping Down]].

Worked in full: [[Non-regularity of 0n1n]].
