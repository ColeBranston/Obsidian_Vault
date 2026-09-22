The **set view** runs a [[Non-deterministic Finite Automaton]] by tracking, after each symbol, the *set of live states* — every state some thread is currently in — instead of drawing the whole tree of threads. It's the parallel-computation reading of [[Interpretations of Non-determinism|non-determinism]], done by hand.

1. Start from the start state plus its [[Epsilon-Closure|ε-closure]], E({q₀})
2. For each symbol, the next set is every state reachable from *any* live state on that symbol — then take the ε-closure again
3. At the end, **accept** iff the final set contains an accepting state

- States with no arrow for the symbol simply drop out; if the set ever becomes ∅, every thread has died
- **Only the final set decides.** Passing through a set that contains an accepting state mid-string means nothing — exactly as with DFAs

> [!tip] Where this goes
> Each step moves *deterministically* from one set to the next. Make each set a single state of a new machine and you get a DFA — the subset construction (Lecture 5).
