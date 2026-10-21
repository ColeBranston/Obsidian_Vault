> [!note] Definition 2 — Context-free language
> A language is **context-free** if and only if there exists some [[Context-free Grammar]] that describes it.

The context-free languages (**CFL**) are a broader class than the [[Regular Language|regular languages]]: **REG ⊂ CFL**, strictly.
- If L ∈ REG then L ∈ CFL ([[Regular Languages are Context-free]])
- But some M ∈ CFL has M ∉ REG — the witness is {0ⁿ1ⁿ : n ≥ 0}: context-free by [[CFG for 0n1n]], not regular by [[Non-regularity of 0n1n|Lecture 7]]

From Lecture 9, a second, equivalent face: a language is context-free iff some [[Pushdown Automaton]] recognizes it ([[Equivalence of PDAs and CFGs]]). See [[Chomsky Hierarchy]] for where the class sits.
