**Aggregation** represents a **"has-a"** or **"is-part-of"** [[Relationship Type]] between entity types, where one is the **whole** and the other is the **part**.

- UML notation: a **hollow diamond** on the *whole's* end of the line.
- The part **can exist without** the whole.
- The part **may be shared** by many wholes.
- A stronger form is [[Composition]].

*Branch as the whole in Has and Offers; Oversees is a plain association (slide 24)*

```mermaid
classDiagram
    class Staff {
        staffNo
    }
    class Branch {
        branchNo
    }
    class PropertyForRent {
        propertyNo
    }
    Branch "1..1" o-- "1..*" Staff : Has
    Branch "1..1" o-- "1..*" PropertyForRent : Offers
    Staff "0..1" -- "0..100" PropertyForRent : Oversees
```

- `Staff` is the part in **Has**; `PropertyForRent` is the part in **Offers**; `Branch` is the whole in both.
