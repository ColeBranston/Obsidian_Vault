A **third-party cookie** is set by a server other than the site you're visiting, via an object that page references (often an invisible 1×1 pixel). It lets one ad network recognize you across every site that embeds it.

Two ordinary facts combine: a page may name objects on other servers, and fetching one is a request to that server, carrying *its own* cookie plus a `Referer` saying which page you were on.

*Tracking across sites with one pixel (slide 38)*

```mermaid
sequenceDiagram
    participant B as Your browser
    participant N as news.example.com
    participant A as adx.example-ads.com
    participant K as socks.example.net
    B->>N: 1 GET /
    N-->>B: 2 page with img src=adx…/ad.gif (1×1)
    B->>A: 3 GET /ad.gif, no cookie, Referer: news
    A-->>B: 200 OK, Set-Cookie: 7493
    Note right of A: files 7493 · news · Feb 15
    B->>K: 4 GET / (Feb 16, same pixel line)
    B->>A: 5 GET /ad.gif, Cookie: 7493, Referer: socks
    Note right of A: files 7493 · socks · Feb 16
    B->>N: 6 GET / again (Feb 17)
    B->>A: GET /ad.gif, Cookie: 7493
    A-->>B: ad for socks, chosen from the ledger
```

**First party** = the site in your address bar. **Third party** = a server you never asked for anything.

> [!note] Legal side (since 2018)
> An identifier that singles a person out is **personal data** even without a name. Collecting it needs consent, and the site must work if refused. That's the cookie banner: "necessary" = first-party; "advertising" = third-party.
