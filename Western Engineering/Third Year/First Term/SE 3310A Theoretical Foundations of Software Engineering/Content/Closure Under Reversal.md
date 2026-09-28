The [[Regular Language|regular languages]] are closed under **reversal**: Lᴿ = {s : reverse(s) ∈ L}.

**Construction.** Starting from a machine for L:
1. Reverse every arrow
2. Make the old start state the unique accepting state
3. Add a new start state with ε-transitions to all the old accepting states

Reversing a DFA directly (Lecture 3) creates multiple arrows per symbol, missing arrows, and several would-be start states — so the result isn't a DFA. **None of that is an obstacle for an [[Non-deterministic Finite Automaton|NFA]]**, and the new start with [[Epsilon-Transition|ε-transitions]] handles the several-starts problem.

*Example:* reversing the ends-in-01 NFA gives a machine for the strings **beginning with 10** — exactly (ends in 01)ᴿ.
