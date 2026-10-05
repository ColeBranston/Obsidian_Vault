Two properties that classify [[HTTP Verbs]]:

**Safe methods** are meant only for **information retrieval** — they should not change server state (no side effects). `GET`, `HEAD`, `OPTIONS`, `TRACE` are safe. There is **no way to enforce** this; it's a promise the server developer keeps.

**Idempotent methods** — sending the same request **many times has the same effect as sending it once**.
- `PUT` and `DELETE` **must** be idempotent
- Safe methods should, in theory, also be idempotent (doing nothing twice is still nothing)
- `POST` and `PATCH` are **not** idempotent

| | Safe | Idempotent |
|---|---|---|
| GET · HEAD · OPTIONS · TRACE | ✅ | ✅ |
| PUT · DELETE | ❌ | ✅ |
| POST · PATCH | ❌ | ❌ |

> [!tip] Why it matters
> Idempotency is what lets a client (or [[Persistent Connections|pipelining]]) safely retry or batch a request — re-sending a `PUT` is harmless, re-sending a `POST` might place the order twice. See [[GET vs POST]].
