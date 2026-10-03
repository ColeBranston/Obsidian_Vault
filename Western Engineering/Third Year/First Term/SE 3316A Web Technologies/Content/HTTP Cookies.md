**Cookies** are an extension of HTTP that lets servers **store data on the client**; the browser sends it back on later requests, which is the usual basis for [[Session Management]]. The client **may disable** them.

**Limits** — the HTTP spec sets none, but every browser does. Safe limits for all browsers: **50 cookies per domain** · **4093 bytes per domain** total across all cookie strings, *including* options (expiry, max-age, etc.).

**Security and privacy issues:**

| Security | Privacy |
|---|---|
| Session hijacking | First-party vs third-party cookies |
| CSRF (cross-site request forgery) | DNT (Do Not Track) |
| | EU cookie directive |
| | Lifetime |

> [!tip] Required reading
> MDN's article on HTTP cookies — `developer.mozilla.org/en-US/docs/Web/HTTP/Cookies` — covers each of these.

See also [[Cookie]], [[Cookie Security Flags]] and [[Third-Party Cookie]] from ECE 4436A.
