A **relation schema** is a named relation defined by a set of attribute and [[Relational Model Terminology|domain]] name pairs. A **relational database schema** is a set of relation schemas, each with a distinct name.

- E.g. `Branch (branchNo: BranchNumbers, street: StreetNames, city: CityNames, postcode: Postcodes)`.
- The schema is the structure; the rows it holds at any moment are an *instance* of it.

## Writing out a relational schema

When documenting the logical model, each relation lists:
- the relation name with its **attributes**,
- the **primary key**,
- any **alternate key(s)**,
- any **foreign key(s)**, with the relation and key they reference.

See [[Relational Keys]] for what each key means.

> [!example] Format used in this course
> **Client** (clientNo, fName, lName, telNo, prefType, maxRent, staffNo)
> Primary Key clientNo
> Foreign Key staffNo references Staff(staffNo)
