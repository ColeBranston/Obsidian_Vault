A **conditional GET** lets a [[Web Cache]] check whether its copy is stale using one request header and one status code.

The cache sends `If-Modified-Since: <date>`, using the date from the server's original `Last-Modified` header ([[HTTP Response Message]]).

| Object | Reply | Size |
|---|---|---|
| unchanged | `304 Not Modified`, no body | ~312 bytes; cache serves its copy |
| changed | `200 OK` + whole object | ~246,000 bytes, the ordinary price |

> [!note] Saves bandwidth, not latency
> The round trip is paid either way. That's why browsers also keep objects *without* asking for a server-nominated period; the two mechanisms solve different halves of the problem.
