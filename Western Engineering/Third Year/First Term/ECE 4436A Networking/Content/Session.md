A **session** is a sequence of related requests treated as one visit by one user, together with the state the server keeps for it and a lifetime after which that state is discarded. The [[Cookie]] is the identifier; the session is the state it stands for.

- The password crosses **once**, at login. After that, **the cookie is the credential**: whoever holds it is you until the session ends (hence [[Cookie Security Flags]]).

*Logging in creates a session (slide 36)*

```mermaid
sequenceDiagram
    participant B as Your browser
    participant S as The site
    B->>S: 1 POST /login (name + password)
    Note right of S: session created: sid 8f3ad14c… → user, signed in 14:02
    S-->>B: 2 Set-Cookie: sid=8f3a…
    B->>S: 3 GET /account with Cookie: sid=8f3a…
    S-->>B: 4 200 OK, your account
    Note right of S: row removed on logout or expiry
```

**Where the state lives:**

| | Server-side table | Signed token in the cookie |
|---|---|---|
| Cookie holds | a long random key only | the state + a signature nobody can forge |
| Buys | logout = delete one row; user never sees the state | any server verifies alone; nothing stored, so statelessness survives |
| Costs | server remembers again; every machine must reach the table | early logout is hard: token valid until it expires |
