An **application-layer protocol** settles five decisions before any code is written, grouped by Chapter 1's definition of a [[Protocol]] (format, order, actions):

| | Decision | The Web's answer ([[HTTP]]) |
|---|---|---|
| Format | Message types | a request and a response |
| Format | Message syntax | `GET /index.html HTTP/1.1` |
| Order | Rules of exchange | one response per request, in order |
| Order | Opening and closing | client opens, either side may close |
| Actions | Message semantics | GET = send it · POST = take this |

- **Open** protocols are published in an RFC so strangers' programs interoperate: the Web · mail · name lookups.
- **Proprietary** protocols are known only inside one company, so nobody can write a second client: most video-call clients.
