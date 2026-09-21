**Client** and **server** are **roles in one exchange**, not kinds of machine. The side that asks is the client; the side that answers is the server.

The same [[Host]] plays both, often at the same time: A requests and B responds, then B requests and A responds — the roles have swapped and nothing else has.

```mermaid
sequenceDiagram
  participant A as Host A
  participant B as Host B
  Note over A,B: 1 · A asks, B answers — A is the client
  A->>B: request
  B->>A: response
  Note over A,B: 2 · now B asks, A answers — the roles have swapped
  B->>A: request
  A->>B: response
```
*Nothing about the machines changed between the two halves — only which side spoke first.*
