A **relationship type** is a set of meaningful associations among entity types. A **relationship occurrence** is a uniquely identifiable association that includes one occurrence from each participating entity type.

> [!note]- Mermaid — Semantic Net of Has Relationship Type (slide 8)
> Instance-level view: which staff occurrences belong to which branch occurrence via the *Has* relationship.
> ```mermaid
> flowchart LR
>     subgraph Branch
>         B003[B003]
>         B007[B007]
>     end
>     subgraph Staff
>         SG37[SG37]
>         SG14[SG14]
>         SA9[SA9]
>     end
>     B003 --> SG37
>     B003 --> SG14
>     B007 --> SA9
> ```

## Degree

The **degree** of a relationship is the number of participating entity types:

| Degree | Name | Example |
|---|---|---|
| 2 | Binary | Private owner **owns** property for rent |
| 3 | Ternary | Staff **registers** a client at a branch (*Registers*) |
| 4 | Quaternary | A solicitor **arranges** a bid on behalf of a buyer, supported by a financial institution (*Arranges*) |

## Recursive Relationships and Role Names

A **recursive relationship** is a relationship type where the *same* entity type participates more than once, in *different* roles — e.g. Staff (supervisor) **supervises** Staff (supervisee), via the *Supervises* relationship.

Relationships may be given **role names** to indicate the purpose each participating entity type plays.

> [!question] Are both needed?
> Two entities can end up connected by two distinct, named relationships that turn out to be inverses of each other — e.g. Manager **manages** Branch office, and separately Branch office **has** a member of staff. Worth asking whether both relationships are really needed, or whether one is just the mirror image of the other.
