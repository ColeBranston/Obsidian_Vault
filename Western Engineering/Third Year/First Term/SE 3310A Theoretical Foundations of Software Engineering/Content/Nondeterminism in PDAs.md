For [[Pushdown Automaton|pushdown automata]], [[Non-determinism|nondeterminism]] is **power**, not convenience.

| | Finite automata | Pushdown automata |
|---|---|---|
| Can nondeterminism be removed? | always — the [[Subset Construction]] (Lecture 5) | no — the subset construction doesn't carry over |
| Deterministic vs nondeterministic | same languages | deterministic PDAs recognize **strictly fewer** languages |

Why the subset construction fails: one cannot track many stacks at once with one stack.

**Standard example:** {wwᴿ} ([[PDA for wwR]]). No deterministic PDA recognizes it — nothing in the input marks the middle, and a deterministic machine gets no second chance. *(Statement only; the proof is beyond this course.)*
