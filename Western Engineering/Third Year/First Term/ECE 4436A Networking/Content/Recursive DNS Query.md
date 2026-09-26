In a **recursive query**, each server asks the next one on the asker's behalf, and the answer comes back down the same chain. Same five machines, same eight messages as an [[Iterated DNS Query]]; only who does the work changes. The **root** ends up doing the most work, which is why iterated is what's used.

*Recursive resolution of gaia.cs.umass.edu (slide 48)*

```mermaid
sequenceDiagram
    participant H as engineering.nyu.edu (host)
    participant R as dns.nyu.edu (local resolver)
    participant Root as root DNS server
    participant T as .edu TLD server
    participant A as dns.cs.umass.edu (authoritative)
    H->>R: 1 gaia.cs.umass.edu?
    R->>Root: 2 same question
    Root->>T: 3 you find out
    T->>A: 4 you find out
    A-->>T: 5 128.119.245.12
    T-->>Root: 6 128.119.245.12
    Root-->>R: 7 128.119.245.12
    R-->>H: 8 128.119.245.12
```
