Four identities for simplifying a [[Regular Expression]] — i.e. the language each denotes:

| Expression | Equals | Why |
|---|---|---|
| R ∪ ϕ | R | adding no strings changes nothing |
| Rϕ | ϕ | a concatenation needs a second half, and ϕ has none to offer — every candidate string dies |
| ϕ* | {ε} | k = 0 blocks is still allowed and yields ε; no other k is possible |
| R ∪ ε | R *only if* ε ∈ L(R) | in general it adds the empty string |

> [!warning] The standard traps
> ϕ **annihilates concatenation**, but its **star is not empty**. Rϕ = ϕ, yet ϕ* = {ε}.
