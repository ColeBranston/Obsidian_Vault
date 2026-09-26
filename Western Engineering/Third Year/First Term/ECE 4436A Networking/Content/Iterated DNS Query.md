In an **iterated query**, each server the resolver contacts answers with a **referral** (the name of a server that knows more), not the address. The local resolver does all the asking. This is the one used in practice.

*Iterated resolution of gaia.cs.umass.edu (slide 47)*

```mermaid
sequenceDiagram
    participant H as engineering.nyu.edu (host)
    participant R as dns.nyu.edu (local resolver)
    participant Root as root DNS server
    participant T as .edu TLD server
    participant A as dns.cs.umass.edu (authoritative)
    H->>R: 1 gaia.cs.umass.edu?
    R->>Root: 2 same question
    Root-->>R: 3 ask the .edu server
    R->>T: 4 same question
    T-->>R: 5 ask dns.cs.umass.edu
    R->>A: 6 same question
    A-->>R: 7 128.119.245.12
    R-->>H: 8 128.119.245.12
```

Every server above the resolver answered once from what it already knew, and forgot the question. Contrast [[Recursive DNS Query]].
