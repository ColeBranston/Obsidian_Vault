**Non-persistent HTTP** (HTTP/1.0) opens a fresh [[TCP]] connection for each object, then closes it.

**Cost per object = 2 × [[Round-Trip Time|RTT]] + transmission time**: one RTT to open the connection, one to request and receive.

*One object over a non-persistent connection (slide 23)*

```mermaid
sequenceDiagram
    participant B as Browser
    participant W as Web server
    B->>W: 1 open a connection
    W-->>B: 2 accepted
    Note right of W: RTT 1
    B->>W: 3 GET /home.index
    W-->>B: 4 the file, 12 kB
    Note right of W: RTT 2 + transmission time
    W--xB: 5 connection closed
```

The next object starts again from nothing and pays both round trips again. Compare [[Persistent HTTP]].
