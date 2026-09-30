**Integrity constraints** are rules the data must follow so the database stays accurate and consistent.

- **Null**: stands for an attribute value that is currently *unknown* or *not applicable* to a tuple. It handles incomplete or exceptional data. Null is the absence of a value, so it is not the same as zero, spaces, or an empty string, which are all values.
- **Entity integrity**: in a base relation, no attribute of the [[Relational Keys|primary key]] can be null.
- **Referential integrity**: if a relation has a foreign key, each foreign key value must either match a candidate key value of some tuple in its home relation, or be wholly null.
- **General constraints**: any additional rules specified by users or database administrators.

E.g. in the Staff relation, `branchNo` must name a branch that actually exists in Branch (referential integrity), and `staffNo` can never be null (entity integrity).

> [!tip] "Wholly null"
> For a composite foreign key, either every part matches a real candidate key or every part is null. A half-filled foreign key isn't allowed.
