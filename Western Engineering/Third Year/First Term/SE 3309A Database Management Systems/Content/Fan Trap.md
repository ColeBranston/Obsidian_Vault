> [!warning] Fan Trap
> Where a model represents a relationship between entity types, but the pathway between certain entity occurrences is **ambiguous**.

**Example.** Staff –*Has*– Division –*Operates*– Branch, both 1:\*. Given only this, the question "At which branch office does staff number SG37 work?" can't be answered — SG37 belongs to a Division, and that Division operates several branches, so it's ambiguous which one SG37 is actually at.

> [!note]- Mermaid — An Example of a Fan Trap (slide 41)
> ```mermaid
> classDiagram
>     class Staff
>     class Division
>     class Branch
>     Staff "1..*" -- "1..1" Division : Has
>     Division "1..1" -- "1..*" Branch : Operates
> ```

> [!note]- Mermaid — Semantic Net of ER Model with Fan Trap (slide 42)
> ```mermaid
> flowchart LR
>     subgraph Staff
>         SG37[SG37]
>         SA9[SA9]
>         SL21[SL21]
>     end
>     subgraph Division
>         D1[D1]
>         D2[D2]
>     end
>     subgraph Branch
>         B003[B003]
>         B007[B007]
>         B005[B005]
>     end
>     SG37 --> D1
>     SA9 --> D1
>     SL21 --> D2
>     D1 --> B003
>     D1 --> B007
>     D2 --> B005
> ```
> At which branch office does staff number SG37 work? — ambiguous: D1 operates both B003 and B007.

**Fix.** Restructure the relationships so the pathway is unambiguous — e.g. re-derive the chain as Division –*Operates*– Branch –*Has*– Staff, so each staff member links directly to their one branch (SG37 works at B003).

> [!note]- Mermaid — ER Model Restructured to Remove Fan Trap (slides 43–44)
> ```mermaid
> classDiagram
>     class Division
>     class Branch
>     class Staff
>     Division "1..1" -- "1..*" Branch : Operates
>     Branch "1..1" -- "1..*" Staff : Has
> ```
> ```mermaid
> flowchart LR
>     subgraph Division
>         D1r[D1]
>         D2r[D2]
>     end
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
>     D1r --> B003r
>     D1r --> B007r
>     D2r --> B005r
>     B003r --> SG37r
>     B007r --> SA9r
>     B005r --> SL21r
> ```
> SG37 works at branch B003 — unambiguous.
