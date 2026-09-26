A DNS **query and reply share one format**: a 12-byte header (six 2-byte fields) and four sections. The reply is the query handed back with sections filled in and a flag flipped.

| Field | Query | Reply |
|---|---|---|
| identification | `0x4a1f` | `0x4a1f` (copied) |
| flags | query · recursion desired | reply · authoritative |
| questions count | 1 | 1 |
| answers / authority / additional counts | 0 | 1 each |
| **questions** | gaia.cs.umass.edu, type A | copied |
| **answers** | empty | 128.119.245.12, ttl 3600 |
| **authority** | empty | dns.cs.umass.edu is authoritative |
| **additional** | empty | dns.cs.umass.edu = 128.119.40.5 |

- **Identification**: with no connection underneath ([[UDP]]), this 2-byte tag is the only thing tying an answer to its question. An attacker who guesses it and answers first gets believed (see [[DNS Security]]).
- **Flags**: query/reply bit, recursion desired, authoritative answer, truncated.
- **Additional**: records you're about to need (usually the named server's address), saving a whole lookup.
