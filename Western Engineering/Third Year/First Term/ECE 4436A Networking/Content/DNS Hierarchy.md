Three tiers of servers, plus the **local resolver** that does the asking (not itself a tier).

- **Root**: 13 *names*, not machines; each is hundreds of copies. Gives referrals, not answers.
- **Top-level domain (TLD)**: `.com` · `.org` · `.edu` · `.ca`; knows the authoritative server for every domain under it.
- **Authoritative**: every organization runs its own; holds the actual records.
- **Local resolver**: your provider's or your own machine; queries the hierarchy on your behalf.

*The DNS hierarchy (slide 46)*

```mermaid
flowchart TD
    res["local resolver<br>(your provider's, or your own machine)"] -. asks .-> root
    root["root DNS servers<br>referrals, not answers"] --> com[".com"]
    root --> org[".org"]
    root ==> edu[".edu"]
    root --> ca[".ca"]
    com --> amazon["amazon.com"]
    edu ==> umass["umass.edu"]
    ca --> uwo["uwo.ca"]
    umass ==> gaia["gaia.cs.umass.edu<br>128.119.245.12"]
    subgraph L1["Root"]
        root
    end
    subgraph L2["Top-level domain"]
        com
        org
        edu
        ca
    end
    subgraph L3["Authoritative"]
        amazon
        umass
        uwo
    end
```

Resolution walks this tree by [[Iterated DNS Query|iterated]] or [[Recursive DNS Query|recursive]] queries, cut short by [[DNS Caching]].
