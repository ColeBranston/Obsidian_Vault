A machine allowed to follow several transition arrows at once, for the same symbol, is a **non-deterministic finite automaton (NFA)**. It accepts a string when *at least one* of the paths it could follow ends in an accepting state (see [[Non-determinism]]).

This breaks the [[Deterministic Finite Automaton]] rule that δ is a function from (state, symbol) to exactly one state — an NFA can have several arrows for one symbol from a state, or none at all. It first showed up in this course when reversing a DFA (Lecture 3, Example 6); NFAs turn those "defects" into the definition.

Informally, an NFA is like a DFA except that:
1. **Several** transitions (or none) are allowed for each symbol
2. Transitions can be made **without reading any symbol** — [[Epsilon-Transition|ε-transitions]]
3. It accepts if **any** sequence of choices leads to an accept state

| | DFA | NFA |
|---|---|---|
| arrows out of a state, per symbol | exactly one | zero, one, or several |
| moves that read no input (ε) | never | allowed |
| runs on one input | exactly one | possibly many |
| accepts when | the run accepts | *some* run accepts |

> [!note] Definition 2 — Non-deterministic Finite Automaton
> An **NFA** is a 5-tuple (Q, Σ, δ, q₀, F) where
> 1. **Q** — a finite set of states
> 2. **Σ** — a finite [[Alphabet]]
> 3. **δ : Q × Σ<sub>ε</sub> → 𝒫(Q)** — a transition [[Function]]
> 4. **q₀ ∈ Q** — the starting state
> 5. **F ⊆ Q** — the set of accepting states
>
> where Σ<sub>ε</sub> = Σ ∪ {ε}, and 𝒫(Q) is the **power set** of Q ([[Set]]).

**What changed from the DFA definition** — exactly two things, both inside δ. Q, Σ, q₀ and F are unchanged.

| | DFA | NFA |
|---|---|---|
| δ's input | Q × Σ | Q × Σ<sub>ε</sub> — a move may read a symbol, *or read nothing* |
| δ's output | one state, in Q | a **set** of states, in 𝒫(Q) — possibly empty, possibly several |

In words: δ takes a state and a symbol (or ε) and produces a *set of possible next states*.

**Reading δ's set values**
- δ(q, a) = {r, s} — reading a in q, follow both arrows: one thread goes to r, another to s
- δ(q, a) = {r} — one arrow, just like a DFA move
- δ(q, a) = ∅ — no arrow; that computation path terminates (now permitted)
- δ(q, ε) = {r} — the machine may slide from q to r without reading anything

In a DFA neither ∅ nor ε-moves are permitted; in an NFA both are part of the definition.

> [!note] Definition 3 — NFA acceptance
> An NFA N = (Q, Σ, δ, q₀, F) **accepts** a string w if w can be written as w = y₁y₂⋯yₘ with each yᵢ ∈ Σ<sub>ε</sub>, and there is a sequence of states r₀, r₁, …, rₘ such that
> 1. r₀ = q₀
> 2. rᵢ₊₁ ∈ δ(rᵢ, yᵢ₊₁) for each i
> 3. rₘ ∈ F

A single valid state sequence suffices; the number of failed sequences is irrelevant.

> [!question] Why yᵢ ∈ Σ<sub>ε</sub> and not yᵢ ∈ Σ?
> Answer — ε-moves read nothing, so the state sequence can be *longer* than the string. Writing w with some yᵢ = ε makes room for those silent steps without changing w, since xεy = xy. E.g. for w = ab the machine might really take the steps a, ε, b — so m = 3 and the run visits four states.

**Every DFA is an NFA** — one that never uses its freedoms: every δ-set has exactly one element and ε is never used. So very few diagrams fail to be valid NFAs (the definition is permissive); what actually needs checking is a *DFA* claim — every row filled, exactly one entry per cell, and no ε.

To run one by hand, see [[Set View of an NFA]].

> [!note] Coming up
> Lecture 5: the **subset construction** — every NFA can be converted mechanically into an equivalent DFA, so NFAs recognize exactly the same languages as DFAs. Non-determinism buys convenience, not power — though the DFA can need far more states.
