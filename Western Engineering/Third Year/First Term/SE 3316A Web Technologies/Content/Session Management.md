**Session management** is how a server ties a series of requests to the same client, working around the fact that [[HyperText Transfer Protocol|HTTP]] is **stateless** and has no built-in way to track clients (e.g. whether a user is logged in).

*A session thread on the server spans several request–response pairs (slide 39)*

```mermaid
sequenceDiagram
    participant C as Client
    participant S as Server
    C->>S: (1) request
    activate S
    Note right of S: (2)
    S-->>C: (3) HTML page
    deactivate S
    Note right of S: session thread kept alive between requests
    C->>S: (4) request from that page
    activate S
    S-->>C: next page
    deactivate S
    C->>S: next request
    activate S
    S-->>C: ...
    deactivate S
```

> [!warning] Numbers unlabelled on the slide
> Slide 39 only numbers the steps (1)–(4) without saying what each is. Read as: (1) first request · (2) server handles it and starts the session · (3) page sent back · (4) the next request is recognised as part of the same session.

**Techniques:** URL rewriting · hidden form fields · [[HTTP Cookies|cookies]] · SSL sessions.

See also [[Session]] from ECE 4436A.
