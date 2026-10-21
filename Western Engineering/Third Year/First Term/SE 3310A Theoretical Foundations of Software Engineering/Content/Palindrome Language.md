The **palindrome language** L = {w ∈ {0,1}\* : w reads the same forwards and backwards} — e.g. 0110, 10101, ε — is context-free but not regular.

**Grammar:**
> **P → 0P0 | 1P1 | 0 | 1 | ε**

Build from the outside in, adding equal symbols at both ends; the three closing rules handle odd length (middle 0 or 1) and even length (ε). Example: P ⇒ 0P0 ⇒ 01P10 ⇒ 01110.

**Not regular.** Intuition: after reading the first half, a machine would have to remember it entirely to check the second half — unbounded memory. A [[Pumping Lemma]] proof makes this precise with s = 0ᵖ10ᵖ: the [[Condition-3 Shortcut]] traps y in the leading 0-block, and pumping breaks the symmetry.

> [!tip] The common pattern
> Like {0ⁿ1ⁿ}, the pattern is **paired positions at unbounded distance** — exactly what grammars handle and finite automata cannot. The even-length half of this language is {wwᴿ}, recognized in Lecture 9 by [[PDA for wwR]].
