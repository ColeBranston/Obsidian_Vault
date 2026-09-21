A machine allowed to follow several transition arrows at once, for the same symbol, is a **non-deterministic finite automaton (NFA)**. It accepts a string when *at least one* of the paths it could follow ends in an accepting state.

This breaks the [[Deterministic Finite Automaton]] rule that δ is a function from (state, symbol) to exactly one state — an NFA can have several arrows for one symbol from a state, or none at all.

> [!note] Coming up
> NFAs will be defined properly next lecture, along with the (surprising) proof that they recognize exactly the same languages as DFAs — non-determinism buys no extra power.
