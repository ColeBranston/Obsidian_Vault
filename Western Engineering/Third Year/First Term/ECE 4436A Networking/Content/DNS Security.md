[[DNS]] answers unauthenticated queries over a connectionless transport, and everything depends on it. Two families of attack, one defense.

| Attack | Takes away | How | Outcome |
|---|---|---|---|
| **Flooding** (DDoS) | availability | flood of queries fills the server's queue | no answer; nothing forged. Against the root it fails: resolvers already cache TLD delegations, so **caching is the defense** |
| **Forgery** (cache poisoning) | integrity | attacker answers first with a matching ID (`gaia = 6.6.6.6, id 0x4a1f`); the real answer arrives later and is discarded | the lie is cached, and every client behind the resolver gets it; every layer above behaves correctly while you talk to the wrong machine |

**Defense: DNSSEC** (DNS Security Extensions). Records are signed by whoever is authoritative; resolvers check the signature, so a forged answer fails. It **authenticates** answers but does not hide them, and does nothing about flooding.
