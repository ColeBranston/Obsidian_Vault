The [[Non-regular Language|non-regular]] language L = {0ⁿ1ⁿ : n ≥ 0} — no DFA, NFA or RE describes it — has a one-line [[Context-free Grammar]]:

> **A → 0A1 | ε**

Start with A; any A may be replaced by 0A1 or by ε.

*Deriving 000111:* A ⇒ 0A1 ⇒ 00A11 ⇒ 000A111 ⇒ 000111 — no more variables, so stop.

| Task | Answer |
|---|---|
| Derive 01 | A ⇒ 0A1 ⇒ 01 (A → 0A1 once, then A → ε) |
| Derive ε | A ⇒ ε — one step, so ε ∈ L, matching n = 0 |
| Is 0011 in L? | Yes: A ⇒ 0A1 ⇒ 00A11 ⇒ 0011 (n = 2) |
| Is 0101 in L? | No — every derivable string is 0ⁿ1ⁿ (all 0s before all 1s), and 0101 has a 0 after a 1 |

**Why the grammar is exact — two directions, as always**
- **Nothing extra.** Every intermediate string is 0ᵏA1ᵏ (final: 0ᵏ1ᵏ): the rule A → 0A1 creates its 0 and its 1 *in the same step*, so the counts can never disagree
- **Nothing missing.** To produce 0ⁿ1ⁿ: apply A → 0A1 exactly n times, then A → ε

> [!tip] Why a grammar succeeds where a DFA fails
> A finite automaton reads left to right and must *remember* how many 0s it has seen — unbounded memory, impossible ([[Non-regularity of 0n1n|Lecture 7]]). The grammar instead builds the string **from the middle outward**, pairing each 0 with its 1 at birth. No counting ever happens. The machine-side version of this idea is the stack in [[PDA for 0n1n]].

Variable names carry no meaning: Lecture 9 writes the same grammar as S → 0S1 | ε.
