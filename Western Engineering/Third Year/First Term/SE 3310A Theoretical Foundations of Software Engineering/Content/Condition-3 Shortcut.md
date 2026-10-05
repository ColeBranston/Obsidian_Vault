The **condition-3 shortcut**: condition 3 of the [[Pumping Lemma]], |xy| ≤ p, puts x and y inside the *first p symbols* of s. So if you choose s to **begin with p identical symbols**, y is forced to consist of that symbol only — and the entire case analysis collapses to one case.

**Recipe**
1. Pick s ∈ L whose first p symbols are uniform (e.g. it begins 0ᵖ…)
2. By condition 3, y = 0ᵏ with k ≥ 1 — no other split is legal
3. Pick one i (usually i = 2, sometimes [[Pumping Down|i = 0]]) and show xyⁱz leaves L

**Where it's used in Lecture 7**

| Language | s | One pump |
|---|---|---|
| {0ⁿ1ⁿ} — [[Non-regularity of 0n1n]] | 0ᵖ1ᵖ | xy²z = 0ᵖ⁺ᵏ1ᵖ — too many 0s |
| equally many 0s and 1s (L₄) | 0ᵖ1ᵖ | xy²z has p + k zeros and p ones |
| {0ᵐ1ⁿ : m > n} — [[Pumping Down]] | 0ᵖ⁺¹1ᵖ | xz = 0ᵖ⁺¹⁻ᵏ1ᵖ — the surplus is gone |
| {ww} — [[Copy Language]] | 0ᵖ1 0ᵖ1 | xy²z = 0ᵖ⁺ᵏ1 0ᵖ1 — no longer two equal halves |

> [!tip] This is the version to write on an assignment or test
> The full case analysis is also correct and shows the mechanics — but the shortcut is what the deck says to write.
