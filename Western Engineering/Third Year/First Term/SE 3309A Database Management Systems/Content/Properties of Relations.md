The **properties of relations** are the rules a table has to satisfy to count as a relation:

- Its name is distinct from every other relation name in the relational database schema.
- Each attribute has a distinct name within the relation.
- Each cell holds exactly one **atomic** (single) value. No lists or repeating groups, which is why [[Mapping Multi-Valued Attributes|multi-valued attributes]] get their own relation.
- All values of an attribute come from the same [[Relational Model Terminology|domain]].
- Every tuple is distinct: there are no duplicate tuples.
- The order of attributes has no significance.
- The order of tuples has no significance, theoretically.
