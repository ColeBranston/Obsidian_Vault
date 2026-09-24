A **superclass** is an entity type that includes one or more distinct subgroupings of its occurrences. A **subclass** is one of those distinct subgroupings. E.g. Staff is a superclass; Manager, SalesPersonnel, and Secretary are subclasses of it.

Rules of the superclass/subclass relationship:
- It is **one-to-one (1:1)**: one subclass occurrence is the same real-world thing as one superclass occurrence.
- Every member of a subclass is also a member of the superclass.
- Not every member of the superclass has to belong to a subclass.
- A superclass may have **overlapping** or **distinct** subclasses. See [[Constraints on Specialization and Generalization]].

Subclass members carry the superclass's attributes as well as their own. See [[Attribute Inheritance]].

## Why bother? The single-table problem

*AllStaff relation holding details of all staff in one table (slide 7)*

| staffNo | name | position | salary | mgrStartDate | bonus | salesArea | carAllowance | typingSpeed |
|---|---|---|---|---|---|---|---|---|
| SL21 | John White | Manager | 30000 | 01/02/95 | 2000 | | | |
| SG37 | Ann Beech | Assistant | 12000 | | | | | |
| SG66 | Mary Martinez | Sales Manager | 27000 | | | SA1A | 5000 | |
| SA9 | Mary Howe | Assistant | 9000 | | | | | |
| SL89 | Stuart Stern | Secretary | 8500 | | | | | 100 |
| SL31 | Robert Chin | Snr Sales Asst | 17000 | | | SA2B | 3700 | |
| SG5 | Susan Brand | Manager | 24000 | 01/06/91 | 2350 | | | |

The first four columns apply to **all staff**. mgrStartDate and bonus apply only to **branch managers**, salesArea and carAllowance only to **sales personnel**, and typingSpeed only to **secretarial staff**. The empty cells are nulls.

| Approach | Problem |
|---|---|
| **Only a single entity** (like the table above) | Lots of nulls for subclass-specific attributes, which are hard to work with · no way to model relationships that apply only to one subclass (e.g. only Managers manage a Branch) |
| **Only separate subclasses** (no shared superclass) | The same concepts (name, salary...) get described more than once · keeping those shared attributes consistent across subclasses becomes a problem |

The superclass/subclass structure avoids both problems: shared attributes live once in the superclass, and subclass-specific attributes and relationships live in the subclass.
