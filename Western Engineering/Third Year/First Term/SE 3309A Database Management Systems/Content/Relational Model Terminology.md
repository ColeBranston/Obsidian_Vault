The core vocabulary of the relational model. A **relation** is a table with columns and rows. The table picture describes only the *logical* structure of the database, not how data is physically stored.

| Term | Meaning | Table analogy |
|---|---|---|
| **Relation** | A table with columns and rows | Table |
| **Attribute** | A named column of a relation | Column |
| **Domain** | The set of allowable values for one or more attributes | Column's type and range |
| **Tuple** | A row of a relation | Row |
| **Degree** | The number of attributes in a relation | Number of columns |
| **Cardinality** | The number of tuples in a relation | Number of rows |
| **Relational database** | A collection of normalized relations, each with a distinct name | The whole set of tables |

> [!warning] Two meanings of "cardinality"
> Here, cardinality is the number of rows in a relation. In ER modeling ([[Multiplicity]]), it means the maximum number of relationship occurrences an entity can take part in. Same word, different idea.

*Instances of the Branch and Staff (part) relations (slide 8)*

**Branch**: degree 4, cardinality 5

| branchNo | street | city | postcode |
|---|---|---|---|
| B005 | 22 Deer Rd | London | SW1 4EH |
| B007 | 16 Argyll St | Aberdeen | AB2 3SU |
| B003 | 163 Main St | Glasgow | G11 9QX |
| B004 | 32 Manse Rd | Bristol | BS99 1NZ |
| B002 | 56 Clover Dr | London | NW10 6EU |

**Staff**: degree 8, cardinality 6

| staffNo | fName | lName | position | sex | DOB | salary | branchNo |
|---|---|---|---|---|---|---|---|
| SL21 | John | White | Manager | M | 1-Oct-45 | 30000 | B005 |
| SG37 | Ann | Beech | Assistant | F | 10-Nov-60 | 12000 | B003 |
| SG14 | David | Ford | Supervisor | M | 24-Mar-58 | 18000 | B003 |
| SA9 | Mary | Howe | Assistant | F | 19-Feb-70 | 9000 | B007 |
| SG5 | Susan | Brand | Manager | F | 3-Jun-40 | 24000 | B003 |
| SL41 | Julie | Lee | Assistant | F | 13-Jun-65 | 9000 | B005 |

*Examples of attribute domains (slide 9)*

| Attribute | Domain name | Meaning | Domain definition |
|---|---|---|---|
| branchNo | BranchNumbers | All possible branch numbers | character, size 4, range B001–B999 |
| street | StreetNames | All street names in Britain | character, size 25 |
| city | CityNames | All city names in Britain | character, size 15 |
| postcode | Postcodes | All postcodes in Britain | character, size 8 |
| sex | Sex | The sex of a person | character, size 1, value M or F |
| DOB | DatesOfBirth | Possible staff birth dates | date, range from 1-Jan-20, format dd-mmm-yy |
| salary | Salaries | Possible staff salaries | monetary, 7 digits, range 6000.00–40000.00 |
