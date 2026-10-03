**HTTP verbs** (methods) are the first word of the [[HTTP Request|request line]] and say what the client wants done to the target resource.

| Method | In short | Formal definition (RFC 7231, 2014) |
|---|---|---|
| `GET` | request a resource | transfer a current representation of the target resource |
| `HEAD` | only send headers | same as GET, but only the status line and header section |
| `POST` | submit data (in body) to be processed | resource-specific processing of the request payload |
| `PUT` | upload a resource | replace all current representations of the target with the payload |
| `DELETE` | delete a resource | remove all current representations of the target |
| `CONNECT` | convert request to a tunnel | establish a tunnel to the server identified by the target |
| `OPTIONS` | return supported methods for the URI | describe the communication options for the target |
| `TRACE` | echo back the request | message loop-back test along the path to the target |
| `PATCH` | partial update | apply partial modifications to a resource (RFC 5789, 2010) |

A server **must** implement `GET` and `HEAD`; `OPTIONS` is strongly suggested. For which verbs can be safely repeated, see [[Safe and Idempotent Methods]].

> [!note] Newer spec
> RFC 7231 was itself replaced by **RFC 9110** (2022), but the method definitions didn't change.

See also [[HTTP Methods]] from ECE 4436A.
