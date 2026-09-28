> [!note] Theorem 3 — Kleene's Theorem
> A language is [[Regular Language|regular]] if and only if some [[Regular Expression|regular expression]] describes it.

So regular expressions are **exactly as expressive** as the machines — three notations (English, machine, expression), one class of languages.

**The two directions**
- **Expression → machine.** Proved by this lecture's constructions: the three base cases (a, ε, ϕ) are one- and two-state NFAs, and ∪, concatenation and * are exactly the [[Closure Under Union|union]], [[Closure Under Concatenation|concatenation]] and [[Closure Under Kleene Star|star]] constructions. Every regular expression compiles to an NFA
- **Machine → expression.** Also true; the general algorithm (**state elimination**) is in Sipser §1.3 and isn't covered in lectures

> [!warning] What's examinable
> The machine → expression conversion *algorithm* won't be examined. What is: given a small machine, understand its language and write an RE for it — and given an RE, build or identify a machine.

> [!tip] Machine shapes mirror expression shapes
> A wait-loop at a machine's front is a Σ* prefix; an absorbing loop at its back is a Σ* suffix. Reading a small machine into an RE is mostly spotting these shapes.
