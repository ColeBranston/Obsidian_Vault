The **bottom-of-stack marker** \$ is a stack symbol a [[Pushdown Automaton]] pushes first, so that it can later detect an otherwise-empty stack: **when \$ resurfaces on top, nothing else is left**.

**Why it's needed**
- The definition gives no "is the stack empty?" test — a transition can only name the symbol it expects on top
- So the machine manufactures its own test: push \$ first (ε, ε → \$); from then on, top = \$ means the stack is otherwise empty
- The test itself is **ε, \$ → ε**: "without consuming input, if the top is \$, pop it"
- It's a **convention, not a law**: a problem where emptiness never matters can skip the marker
- \$ is in Γ but never in Σ — it never occurs on input

> [!question] Exercise — elementary stack operations
> Start from an empty stack and apply: push \$, push 0, push 0, pop, push 1, pop, pop.
> 1. What is on the stack afterwards, and what is on top?
> 2. At which moments was the \$ visible?
>
> Answers — **1.** Bottom to top: \$ → \$0 → \$00 → \$0 → \$01 → \$0 → \$. The stack ends holding exactly \$, which is also the top. **2.** Only right after pushing it and at the very end. In between it sits buried, invisible until everything above it is popped — precisely the invisibility every PDA construction exploits.
