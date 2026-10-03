**Certificate trust issues** — a certificate is only as trustworthy as whoever signed it, which undermines the authentication [[SSL and TLS]] relies on:

- **Anyone can issue a certificate** — a **self-signed** certificate vouches only for itself
- **Rogue certificate authorities** may issue certificates for domains that pass their verification tests. E.g. in 2015, **MCS Holdings** (Egypt) issued certificates for Microsoft and Google domains that were used in MITM attacks
- **Workarounds:** **certificate revocation lists (CRLs)** and **certificate pinning**

> [!question] To read
> Look up how self-signed certificates work and why browsers warn about them.
