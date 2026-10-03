**`Cache-Control`** is the HTTP header that tells caches what they may do with a response. Caches exist at every point along the path: in **clients** (the browser), **servers**, and the **network** (proxy servers, content delivery networks).

| Directive | Meaning |
|---|---|
| `no-store` | don't keep a copy anywhere |
| `no-cache` | may keep a copy, but must check with the server before each reuse |
| `public` | any cache, including shared proxies/CDNs, may store it |
| `private` | only the user's own browser cache may store it |
| `max-age=N` | the copy is fresh for N seconds |
| `must-revalidate` | once stale, must re-check with the server — never serve a stale copy |

> [!warning] `no-cache` ≠ "don't cache"
> The names are misleading: `no-store` is the one that forbids storing. `no-cache` just forces revalidation.

See also [[Web Cache]] and [[Conditional GET]] from ECE 4436A.
