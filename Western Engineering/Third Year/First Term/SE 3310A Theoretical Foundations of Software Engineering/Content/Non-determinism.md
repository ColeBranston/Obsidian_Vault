**Non-determinism** drops the requirement that a computation follows a single path. A [[Deterministic Finite Automaton]] is *deterministic*: given the current state and the next symbol, δ defines exactly one next state — graphically, exactly one arrow leaves every state for each letter of the alphabet. A non-deterministic machine may have several arrows for a symbol, or none, and follows all of them at once.

Think of it as parallel computation: every choice spawns a new "thread", and all threads run concurrently on the same input.

> [!important] The acceptance criterion
> The machine **accepts** if at least one thread reaches an accepting state. It **rejects** only when every thread fails.

- Computation paths may terminate early — a thread with no arrow to follow just dies, and a dead thread doesn't affect the outcome
- A single accepting path suffices, however many others fail. This asymmetry is what makes non-deterministic machines convenient to design

See [[Non-deterministic Finite Automaton]] for the formal machine, and [[Interpretations of Non-determinism]] for the two standard ways to think about it.
