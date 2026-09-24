Two constraints can apply to a [[Specialization and Generalization|specialization/generalization]]:

- **Participation constraint**: must every member of the superclass also be a member of a subclass?
  - **Mandatory**: yes, every superclass member belongs to at least one subclass.
  - **Optional**: no, some superclass members belong to no subclass.
- **Disjoint constraint**: can a superclass member belong to more than one subclass?
  - **Disjoint (Or)**: at most one subclass.
  - **Nondisjoint (And)**: can belong to several subclasses at once (overlapping).

Combining them gives four categories, written in braces next to the UML triangle:

| Notation | Participation | Disjoint | Meaning |
|---|---|---|---|
| **{Mandatory, Or}** | Mandatory | Disjoint | Every member is in *exactly one* subclass |
| **{Optional, Or}** | Optional | Disjoint | Every member is in *zero or one* subclass |
| **{Mandatory, And}** | Mandatory | Nondisjoint | Every member is in *one or more* subclasses |
| **{Optional, And}** | Optional | Nondisjoint | Every member is in *zero or more* subclasses |

DreamHome examples (slide 22):
- **Staff → Supervisor, Manager is {Optional, Or}.** Most staff are neither. A staff member can be a supervisor or a manager but not both.
- **Owner → PrivateOwner, BusinessOwner is {Mandatory, Or}.** Every owner must be one kind or the other, never both.
