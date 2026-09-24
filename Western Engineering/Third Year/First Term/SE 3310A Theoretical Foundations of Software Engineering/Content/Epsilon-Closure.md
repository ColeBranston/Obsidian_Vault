> [!note] Definition 4 — ε-closure
> For a set of states R, the **ε-closure E(R)** contains every state of R, plus every state reachable from R using [[Epsilon-Transition|ε-arrows]] only — following them again and again until nothing new appears.

- **Chains count:** if p →ε q →ε r, then E({p}) = {p, q, r} — one round is not enough
- **{q₀} ∪ δ(q₀, ε) is only the first round.** Lecture 5 first writes the [[Subset Construction]]'s start state this way; the full closure keeps going until no new state appears
- **The closure always contains the set itself.** If no ε-arrow leaves q, then E({q}) = {q}. A closure often adds nothing; that's expected
- **Rule of thumb:** apply E at the start, and after every symbol you read. That's why an NFA with ε-arrows out of its start state already has several live states before reading anything (see [[Set View of an NFA]]) — and exactly where the [[Subset Construction]] applies it

> [!question] Check yourself — the ING/ER machine in [[Epsilon-Transition]]
> 1. E({s}) = ?
> 2. E({a₂}) = ?
>
> Answers — **1.** {s, a₁, b₁} — both ε-arrows fire, which is why a trace of that machine starts with three live states. **2.** {a₂} — no ε-arrow leaves a₂, so the closure adds nothing.
