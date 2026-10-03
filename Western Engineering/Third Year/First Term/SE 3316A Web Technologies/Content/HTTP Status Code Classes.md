Every [[HTTP Response]] carries a **status code** plus a human-readable **reason text** (any message the server likes). The first digit gives the **class**:

| Class | Meaning | Examples |
|---|---|---|
| `1xx` | Informational | |
| `2xx` | Success | `200 OK` |
| `3xx` | Redirection | `301 Moved Permanently` |
| `4xx` | Client error | `400 Bad Request` · `401 Unauthorized` · `403 Forbidden` · `404 Not Found` |
| `5xx` | Server error | `500 Internal Server Error` · `503 Service Unavailable` |

Some servers implement additional, non-standard codes. Others met in this lecture: `206 Partial Content` ([[Range Requests]]) and `401` as the challenge in [[HTTP Basic Authentication]].

See also [[HTTP Status Codes]] from ECE 4436A.
