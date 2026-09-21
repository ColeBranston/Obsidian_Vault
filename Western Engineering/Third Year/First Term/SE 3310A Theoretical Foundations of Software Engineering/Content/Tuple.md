A **tuple** is an *ordered* list of elements that need not be unique. Two differences from a [[Set]], and they're the whole point:

- **Order matters** — (x₁, x₂, x₃, x₄) ≠ (x₄, x₃, x₂, x₁). Equality holds position by position
- **Repeats are allowed**

**Cartesian product:** A × B = {(a, b) : a ∈ A, b ∈ B} — every element of A paired with every element of B, in that order.

With A = {x₁, x₂, x₃, x₄} and B = {x₄, x₅, x₆}, A × B has the 12 pairs (x₁,x₄) (x₁,x₅) (x₁,x₆) (x₂,x₄) (x₂,x₅) (x₂,x₆) (x₃,x₄) (x₃,x₅) (x₃,x₆) (x₄,x₄) (x₄,x₅) (x₄,x₆).

Generalizes to any number of sets: A × B × … × Z = {(a, b, … z) : a ∈ A, b ∈ B, … z ∈ Z}.

**Size:** |A × B| = |A| · |B|. So |B × B| = 3 · 3 = 9, and |A × B| = 4 · 3 = 12, matching the twelve pairs above.

This is what makes a [[Deterministic Finite Automaton]]'s transition function δ : Q × Σ → Q well-defined — its domain is a set of (state, symbol) pairs, and order within the pair matters.
