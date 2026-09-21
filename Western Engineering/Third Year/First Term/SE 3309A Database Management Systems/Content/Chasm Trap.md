> [!warning] Chasm Trap
> Where a model suggests the existence of a relationship between entity types, but the pathway does **not exist** between certain entity occurrences.

**Example.** Branch –*Has*– Staff (mandatory, 1..\*) –*Oversees*– PropertyForRent (optional, 0..\*). Because a property doesn't have to be overseen by any staff member, asking "At which branch office is property PA14 available?" can fail — PA14 might have no overseeing staff member, so there's no pathway back to a branch.

> [!note]- Mermaid — An Example of a Chasm Trap (slide 45)
> ```mermaid
> classDiagram
>     class Branch
>     class Staff
>     class PropertyForRent
>     Branch "1..1" -- "1..*" Staff : Has
>     Staff "0..1" -- "0..*" PropertyForRent : Oversees
> ```

> [!note]- Mermaid — Semantic Net of ER Model with Chasm Trap (slide 46)
> ```mermaid
> flowchart LR
>     subgraph Branch
>         B003[B003]
>         B007[B007]
>         B005[B005]
>     end
>     subgraph Staff
>         SG37[SG37]
>         SA9[SA9]
>         SL21[SL21]
>     end
>     subgraph PropertyForRent
>         PG36[PG36]
>         PA14[PA14]
>         PL94[PL94]
>     end
>     B003 --> SG37
>     B007 --> SA9
>     B005 --> SL21
>     SG37 --> PG36
>     SL21 --> PL94
> ```
> At which branch office is property PA14 available? — no pathway: PA14 has no overseeing staff member (SA9 oversees nothing).

**Fix.** Add the missing direct relationship — e.g. Branch –*Offers*– PropertyForRent — restoring a pathway that doesn't depend on the optional *Oversees* link.

> [!note]- Mermaid — ER Model Restructured to Remove Chasm Trap (slides 47–48)
> ```mermaid
> classDiagram
>     class Branch
>     class Staff
>     class PropertyForRent
>     Branch "1..1" -- "1..*" Staff : Has
>     Staff "0..1" -- "0..*" PropertyForRent : Oversees
>     Branch "1..1" -- "1..*" PropertyForRent : Offers
> ```
> ```mermaid
> flowchart LR
>     subgraph Branch
>         B003r[B003]
>         B007r[B007]
>         B005r[B005]
>     end
>     subgraph Staff
>         SG37r[SG37]
>         SA9r[SA9]
>         SL21r[SL21]
>     end
>     subgraph PropertyForRent
>         PG36r[PG36]
>         PA14r[PA14]
>         PL94r[PL94]
>     end
>     B003r --> SG37r
>     B007r --> SA9r
>     B005r --> SL21r
>     SG37r --> PG36r
>     SL21r --> PL94r
>     B003r -.Offers.-> PG36r
>     B007r -.Offers.-> PA14r
>     B005r -.Offers.-> PL94r
> ```
> PA14 is now reachable via the direct Offers relationship from B007.
