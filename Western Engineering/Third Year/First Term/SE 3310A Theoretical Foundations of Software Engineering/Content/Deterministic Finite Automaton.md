> [!note] Definition 1 — Deterministic Finite Automaton
> A **DFA** is a 5-tuple (Q, Σ, δ, q₀, F) where
> 1. **Q** — a finite set of states
> 2. **Σ** — a finite [[Alphabet]]
> 3. **δ : Q × Σ → Q** — a transition [[Function]]
> 4. **q₀ ∈ Q** — the starting state
> 5. **F ⊆ Q** — the set of accepting states

*Finite* because Q is finite — the machine's entire memory is which state it's in. *Deterministic* because δ is a function: every (state, symbol) pair has exactly one outcome.

**Worked example.** Q = {q₀, q₁}, Σ = {0, 1}, start q₀, F = {q₁}:

![[DFA Odd Number of 1s.png]]

| δ | 0 | 1 |
|---|---|---|
| **q₀** | q₀ | q₁ |
| **q₁** | q₁ | q₀ |

Reading a 0 is a self-loop on either state; reading a 1 swaps them. q₁ is drawn with a double circle, and an incoming `start` arrow marks q₀.

**The language of a machine** is the set of all strings it accepts. Here:

L = { s ∈ {0,1}* : s contains an **odd number of 1s** }

**Tracing.** Start in q₀ and read one symbol at a time.

- `0100` → q₀ →⁰ q₀ →¹ q₁ →⁰ q₁ →⁰ q₁. Ends in q₁ ∈ F, so **accepted** — one 1, odd
- `0110` → q₀ →⁰ q₀ →¹ q₁ →¹ q₀ →⁰ q₀. Ends in q₀ ∉ F, so **rejected** — two 1s, even

*Why the language is exactly "odd number of 1s":* reading a 0 never changes state · reading a 1 always switches q₀ ↔ q₁ · so the machine sits in q₁ exactly when it has read an odd number of 1s.

> [!question] Check yourself
> Which are accepted? `111` · `0000` · `1010`
> Answers — **111** accepted (three 1s, odd; q₀→q₁→q₀→q₁) · **0000** rejected (zero 1s, even; never leaves q₀) · **1010** rejected (two 1s, even; q₀→q₁→q₁→q₀→q₀). Two methods, one answer: trace the transitions, or just count the 1s.

Diagrams of these must be produced with software — see [[Drawing Automata]].
