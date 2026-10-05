**HTTP/2** is designed to increase **server and network efficiency**. Per the IETF, it changes how HTTP is expressed **on the wire**, not what it means — it is not a ground-up rewrite, and methods, status codes and semantics stay the same as HTTP/1.1.

**Features:** **binary** protocol (not lines of text) · **one TCP connection, multiple streams** (many requests in flight at once, no head-of-line blocking at the HTTP level — cf. [[Persistent Connections|pipelining]]) · **header compression** · server **"push"**.

Reference: `http2.github.io`

See also [[HTTP 2 and HTTP 3]] from ECE 4436A.
