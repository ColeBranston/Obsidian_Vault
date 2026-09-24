A **dead state** is a state that cannot ever lead to an accepting state, regardless of any future input.

For notational convenience, dead states (and any transitions leading to them) are often omitted from a diagram — but the dead state hasn't disappeared, only its drawing. δ must still give a next state for every state and symbol, so a missing arrow is read as "go to the dead state." When drawing a machine this way, say which convention you're using.

Not every DFA needs a dead state at all — a machine can be perfectly valid with none (e.g. the two-state parity machine in [[Deterministic Finite Automaton]]'s worked example). What the definition of a DFA demands is only that δ be *total* (defined for every state/symbol pair) — a dead state is just one way to satisfy that when some inputs genuinely can't be recovered from.

> [!note] In the subset construction
> For DFAs the dead state was introduced as a drawing convention; in the [[Subset Construction]] it arises on its own, as the empty subset **∅** — "no live states." Every computation path has terminated and no later input can revive one. Empty cells in a subset-construction table point to ∅, and by the usual convention it's left undrawn.
