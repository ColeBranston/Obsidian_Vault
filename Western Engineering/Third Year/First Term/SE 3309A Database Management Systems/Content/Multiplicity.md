**Constraints** represent restrictions in the real world. The main type of constraint on relationships is **multiplicity** — the number or range of possible occurrences of an entity type that may relate to a single occurrence of an associated entity type through a particular relationship. Multiplicity represents policies (**business rules**) set by the user or company.

## Binary Relationships

The most common degree for relationships is binary, generally one of:

| Type | Example |
|---|---|
| **1:1** | A member of staff can manage zero or one branch; each branch is managed by one member of staff (*Manages*) |
| **1:\*** | Each member of staff oversees zero or more properties for rent; each property is overseen by zero or one member of staff (*Oversees*) |
| **\*:\*** | Each newspaper advertises one or more properties for rent; each property is advertised in zero or more newspapers (*Advertises*) |

> [!note]- Mermaid — Semantic Net of Staff Manages Branch, 1:1 (slide 26)
> ```mermaid
> flowchart LR
>     subgraph Staff
>         SG5[SG5]
>         SG37[SG37]
>         SL21[SL21]
>     end
>     subgraph Branch
>         B003[B003]
>         B005[B005]
>     end
>     SG5 -->|Manages| B003
>     SL21 -->|Manages| B005
> ```
> SG37 manages no branch (optional 0..1 on the staff side); every branch has exactly one manager.

> [!note]- Mermaid — Semantic Net of Staff Oversees PropertyForRent, 1:* (slide 28)
> ```mermaid
> flowchart LR
>     subgraph Staff
>         SG5b[SG5]
>         SG37b[SG37]
>         SL21b[SL21]
>     end
>     subgraph PropertyForRent
>         PG21[PG21]
>         PG36[PG36]
>         PA14[PA14]
>         PG4[PG4]
>     end
>     SG5b --> PG21
>     SG37b --> PG36
>     SL21b --> PA14
> ```
> PG4 currently has no overseeing staff member (optional 0..1 on the property side).

> [!note]- Mermaid — Semantic Net of Newspaper Advertises PropertyForRent, *:* (slide 30)
> Reconstructed from the slide's entity/occurrence layout (standard DreamHome example).
> ```mermaid
> flowchart LR
>     subgraph Newspaper
>         GD[Glasgow Daily]
>         WW[The West News]
>         AE[Aberdeen Express]
>     end
>     subgraph PropertyForRent
>         PG21b[PG21]
>         PG36b[PG36]
>         PA14b[PA14]
>         PG4b[PG4]
>     end
>     GD --> PG21b
>     GD --> PG36b
>     WW --> PG36b
>     AE --> PA14b
> ```
> PG4 is advertised in zero newspapers — the many-to-many relationship still allows an optional (zero) side for the property.

## Complex (n-ary) Relationships

For an n-ary relationship, multiplicity is the number (or range) of possible occurrences of one entity type when the other (n−1) values are fixed. E.g. in the ternary *Registers* relationship (Staff–Branch–Client), fixing a Staff/Branch pair still allows multiple Client occurrences.

> [!note]- Mermaid — Semantic Net of Ternary Registers Relationship with Values Fixed (slide 33)
> ```mermaid
> flowchart LR
>     subgraph "Staff/Branch"
>         SG37B003["SG37 / B003"]
>         SG5B003["SG5 / B003"]
>         SG14B003["SG14 / B003"]
>     end
>     subgraph Client
>         CR56[CR56]
>         CR74[CR74]
>         CR62[CR62]
>         CR84[CR84]
>         CR91[CR91]
>     end
>     SG37B003 --> CR56
>     SG37B003 --> CR74
>     SG14B003 --> CR62
>     SG14B003 --> CR84
>     SG14B003 --> CR91
> ```
> With Staff and Branch fixed, SG14/B003 still registers three different clients — multiple Client occurrences remain possible.

## Notation

| Notation | Meaning |
|---|---|
| 0..1 | zero or one entity occurrence |
| 1..1 (or just 1) | exactly one entity occurrence |
| 0..\* (or just \*) | zero or many entity occurrences |
| 1..\* | one or many entity occurrences |
| 5..10 | minimum of 5, up to a maximum of 10 |
| 0, 3, 6–8 | zero, or three, or six through eight |

## Cardinality and Participation

Multiplicity is made up of two restrictions:
- **Cardinality** — the maximum number of possible relationship occurrences for an entity participating in a given relationship type.
- **Participation** — whether *all* or only *some* entity occurrences participate in a relationship (mandatory vs. optional).

E.g. for Staff *Manages* Branch: cardinality says one branch is managed by one staff member, and one staff member manages (at most) one branch; participation says all branches are managed (mandatory for Branch) but not all staff manage a branch (optional for Staff). This is the same 1:1 *Manages* relationship diagrammed above (slide 26) — slides 37–38 just annotate that diagram with "cardinality" and "participation" callouts.
