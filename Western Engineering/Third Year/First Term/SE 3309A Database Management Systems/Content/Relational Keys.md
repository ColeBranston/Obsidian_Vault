**Relational keys** build on the [[Keys|candidate key]] idea from ER modeling:

- **Primary key**: the candidate key selected to identify tuples uniquely within a relation.
- **Alternate key**: any candidate key that wasn't selected as the primary key.
- **Foreign key**: an attribute, or set of attributes, in one relation that matches a candidate key of some relation. That can be the *same* relation, e.g. `supervisorStaffNo` in Staff references `Staff(staffNo)`.

## Relationships use the PK/FK mechanism

A relationship between two entities is represented by copying a primary key into another relation as a foreign key.
- The relation whose key gets copied is the **parent**.
- The relation that receives the copy (the foreign key) is the **child**.

Every mapping rule for relationships comes down to deciding which entity is the parent and which is the child. See [[Mapping One-to-Many Relationships]] and [[Mapping One-to-One Relationships]].
