Two automata are **equivalent** when they accept exactly the same language. NFAs and DFAs turn out to be equivalent as *models*: every machine of one kind has an equivalent machine of the other kind.

> [!note] Theorem 1 — Every DFA has an equivalent NFA
> Every [[Deterministic Finite Automaton]] has an equivalent [[Non-deterministic Finite Automaton]].

*Proof — by definition.* A DFA already **is** an NFA. Read each transition δ(q, a) = q′ as the one-element set δ(q, a) = {q′}; nothing else changes. The DFA simply never uses the NFA's extra freedoms: every set has exactly one element, and it never uses ∅ or ε. "DFA" names a special case of "NFA", just as a square is a special case of a rectangle.

> [!note] Theorem 2 — Every NFA has an equivalent DFA
> Every non-deterministic finite automaton has an equivalent deterministic finite automaton.

*Proof — by algorithm.* It's enough to give a general procedure that converts *any* NFA into an equivalent DFA: the [[Subset Construction]]. This is the direction that takes real work.

> [!note] Corollary
> NFAs have no more computational "power" than DFAs. The languages recognized by DFAs and by NFAs are the same class: the [[Regular Language|regular languages]].

**Consequences**
- **One notion of recognisable.** Both models draw exactly the same boundary, so "regular" no longer depends on which machine model you pick
- **Freedom of design.** To show a language is regular, an NFA suffices — the construction converts it mechanically
- **A cost bound.** Conversion may need exponentially many states (k → 2ᵏ in the worst case). Simple to design, potentially costly to determinize
