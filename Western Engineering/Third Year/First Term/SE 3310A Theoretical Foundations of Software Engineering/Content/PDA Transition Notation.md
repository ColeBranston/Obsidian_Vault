A [[Pushdown Automaton]] transition involves the current state, the current input symbol and the symbol on top of the stack, and yields a next state and a symbol to push. On a diagram edge it is written

> **a, b → c**

read as "reading **a** on input and **b** on top of the stack, replace b with c."

Each of the three slots is independently allowed to be ε:

| Slot | Meaning | If ε |
|---|---|---|
| **a** | the input symbol consumed | consume nothing (like an NFA ε-move) |
| **b** | the symbol that must be on top, and is popped | don't read or touch the top |
| **c** | the symbol then pushed | push nothing |

Examples: **1, 0 → ε** — "on input 1, with 0 on top: pop the 0, push nothing." **ε, ε → \$** — "without reading input or touching the stack, push \$."

**The four stack operations**

| Operation | Label | Meaning |
|---|---|---|
| Push | x, ε → y | read x on input, push y |
| Pop | x, y → ε | read x on input and y on top, pop it (push ε) |
| Replace | x, y → z | read x and y on top, replace y with z |
| Do nothing | x, ε → ε | read x, leave the stack alone |

**Bottom of the stack.** Technically the stack is a string, initialized to ε. Depending on the application you may push an explicit [[Bottom-of-Stack Marker]] when the automaton starts.

> [!question] Write the label for each move
> 1. On input 0, push a 0 (no condition on the stack)
> 2. On input 1, pop a 0
> 3. Without reading input, check that the top is \$ and pop it
> 4. On input 1, replace a 0 on top by a 1
>
> Answers — **1.** 0, ε → 0 (push) **2.** 1, 0 → ε (pop) **3.** ε, \$ → ε (test-and-pop the marker, consuming no input) **4.** 1, 0 → 1 (replace)

> [!warning] One symbol per push
> A single transition pushes **at most one** symbol. To push two, route through an intermediate state with an extra ε-move (see the {0ⁿ1²ⁿ} exercise in Lecture 9). Textbooks abbreviate this as one label pushing a two-symbol string.
