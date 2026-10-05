A **persistent connection** carries **multiple request–response pairs over a single [[Transmission Control Protocol|TCP]] connection**, instead of opening a new one for every object.

| Header | Role |
|---|---|
| `Content-Length` | **now important!** — with the connection staying open, it's the only way to know where one response ends and the next begins |
| `Connection: close` | opt *out* — connections are **persistent by default in HTTP/1.1** |
| `Connection: keep-alive` | opt in (for compatibility with HTTP/1.0) |
| `Keep-Alive: 300` | control the idle timeout (compatibility) |

**Pipelining** goes one step further: send **multiple requests before receiving the responses**.
- Fewer TCP/IP packets
- Only for idempotent requests, e.g. GET or PUT (see [[Safe and Idempotent Methods]])
- Supported by newer browsers

> [!note] Since the slides
> In practice browsers ended up disabling HTTP/1.1 pipelining (responses still have to come back in order, so one slow response blocks the rest). [[HTTP 2 Features|HTTP/2's multiple streams]] solved the same problem properly.

See also [[Persistent HTTP]] from ECE 4436A.
