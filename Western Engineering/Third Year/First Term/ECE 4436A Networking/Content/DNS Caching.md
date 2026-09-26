**DNS caching** keeps most queries away from the root: the resolver files every answer, so the next asker gets a **cache hit** (one round trip to the provider; nothing above is contacted or even learns you asked). Only a **miss** walks the [[DNS Hierarchy]].

How long a copy is kept is the record's **TTL (time to live)**, chosen by whoever published it:

| TTL | Typical use | Trade-off |
|---|---|---|
| 60 s | a service being moved this week | many more queries |
| 1 hour | an ordinary web address | balanced default |
| 48 hours | a delegation that never moves | a change takes two days to disappear |

- The directory is **loosely consistent on purpose**: after a change, part of the Internet holds the old answer and part the new, and nothing is broken.
- There is **no invalidation mechanism**; building one would need a list of everyone holding a copy.
- "24–48 h to propagate" is a myth: nothing propagates. Records are live instantly; what takes time is old cached copies **expiring**. So lower the TTL days before moving something, then raise it again.
