---
aliases: [Entity Model]
---

The **data model** (CoreX: *entity model*) models the **structure** of the system. It's equivalent to a **logical data model**: it represents the **nouns** and their basic relationships with each other, with the **adjectives** as attributes (properties or states).

- A **simplified class diagram / ER diagram** is sufficient — just the class/entity names (with attributes if possible).
- A basic description of each relationship is enough at this level; details come later.
- Built with [[Progressive Decomposition]].
- **Groups:** at Level 2 and deeper, a group (a box drawn around entities) shows how a set of entities relates to the parent entity.

## Example — government regulator

*Level 1 (slide 39)*

```mermaid
flowchart TD
    pub["The public"] -- "Do business with" --> rp["Regulated parties"]
    rp -- Hold --> lic["Licences and registrations"]
    rp -- "Create / authorise" --> tx["Transactions"]
```

> [!warning] A box isn't necessarily a table
> At this level a box won't necessarily become an entity or a class at the technical level — it may become a **package** or a **component**.

*Level 2 — "Regulated parties" decomposed into a group (slide 40)*

```mermaid
flowchart TD
    pub2["The public"] -- "Do business with" --> grp
    subgraph grp["Regulated Parties"]
        np["Natural persons"] -- "Own/operate" --> ent["Entities"]
        ent -- "Engage with" --> tp["Third parties"]
    end
    grp -- Hold --> lic2["Licences and registrations"]
    grp -- "Create/authorise" --> tx2["Transactions"]
```

## CoreX rules for the entity model (reading)

- Relationships are limited to **association, composition, containment, and inheritance**.
- **All entities are plural and all relationships are many-to-many** — cardinality and other constraints go in the [[Business Rules Model]]. This keeps the model simple and the eventual database flexible.
- Entities can be added at lower levels and related to others even if they don't sit inside a parent.
- Decomposed until it turns into a classic ER diagram (see [[Enhanced Entity-Relationship Model]] from SE 3309A).
