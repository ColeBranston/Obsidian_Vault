Five families; the **first digit** says who has the problem.

| Family | Meaning | Examples |
|---|---|---|
| **1xx** Informational | still working | 100 Continue (rare) |
| **2xx** Success | I did what you asked | 200 OK · 204 No Content |
| **3xx** Redirection | it's elsewhere; ask there | 301 Moved Permanently · 304 Not Modified ([[Conditional GET]]) |
| **4xx** Client error | you asked wrongly, I'm fine | 400 Bad Request · 403 Forbidden · 404 Not Found |
| **5xx** Server error | you asked correctly, I broke | 500 Internal Server Error · 503 Service Unavailable |

- Browsers follow 3xx silently, so one address may be 2 or 3 exchanges.
- A 5xx request may succeed unchanged a minute later.

> [!tip] Learn families, not codes
> Leading 4 → look at your request. Leading 5 → look at their server.
