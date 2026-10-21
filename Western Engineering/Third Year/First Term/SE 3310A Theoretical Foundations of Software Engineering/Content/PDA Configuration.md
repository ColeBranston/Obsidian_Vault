A **configuration** of a [[Pushdown Automaton]] is its full snapshot: **(current state, remaining input, stack contents)**. A trace table is a sequence of configurations.

- **Nondeterminism** means a configuration may have several successors, so a computation is a **tree of configurations** — as for an [[Non-deterministic Finite Automaton|NFA]], with the stack added to every node
- A branch **halts** when its configuration has no successor (the informal "poof"). It contributes nothing unless its input is exhausted in an accepting state
- **Accept** = some leaf of the tree has input exhausted and state in F

Acceptance is **existential**: if exactly one of many branches accepts, the machine accepts — however many others die. Note the stack plays no part in the acceptance condition itself; machines use the [[Bottom-of-Stack Marker]] to make reaching an accept state *depend* on the stack.
