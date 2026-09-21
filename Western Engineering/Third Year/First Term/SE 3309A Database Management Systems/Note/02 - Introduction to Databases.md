---
source: SE3309aUnit2-DB_intro.pdf
tags: [SE3309A, DatabaseManagementSystems]
---

# Unit 2 — Introduction to Databases

> [!info]- Slide index — where each section comes from
> | Section of this note | Slides in the deck |
> |---|---|
> | *Intro and outline* | 2 Introduction to Databases *(outline)* |
> | **Basic Definitions** | 3 Basic Definitions · 4 Database System |
> | ⤷ `Database System` | 4 Database System |
> | **Use of Databases** | 5 Examples of Database Systems · 6 Databases are Everywhere · 7 Databases are Everywhere · 8 Databases are Everywhere · 9 Databases are Everywhere (Data Platforms Map) |
> | **File-Based Systems** | 10 File-Based Systems · 11 Case Study: DreamHome · 12 Limitations of File-Based Approach |
> | ⤷ `File-Based Systems` | 10 File-Based Systems · 11 Case Study: DreamHome · 12 Limitations of File-Based Approach |
> | **Main Characteristics of the Database Approach** | 13 Main Characteristics of the Database Approach · 14 Self-describing nature of a database system · 15 Insulation between programs and data · 16 Data Abstraction |
> | ⤷ `Database` *(updated)* | 13 Main Characteristics of the Database Approach |
> | ⤷ `System Catalog` | 14 Self-describing nature of a database system |
> | ⤷ `Program-Data Independence` | 15 Insulation between programs and data |
> | ⤷ `Data Abstraction` | 16 Data Abstraction |
> | **Database Management System (DBMS)** | 17 Database Management System (DBMS) · 18 DBMS facilities · 19 Controlled access to database · 20 DBMS diagram |
> | ⤷ `Database Management System` | 17 Database Management System (DBMS) · 18 DBMS facilities · 19 Controlled access to database |
> | **Views** | 21 Views · 22 Views diagram · 23 Views - Benefits |
> | ⤷ `Views` | 21 Views · 22 Views diagram · 23 Views - Benefits |
> | **Example: University Database** | 24 Example of a Database (entities) · 25 Example of a Database (relationships) · 26 Example of a Database (tables) · 27 How things are called |
> | **Components of the DBMS Environment** | 28 Components of DBMS Environment · 29 Hardware/Software/Data · 30 Procedures/People · 31 Roles in the Database Environment |
> | ⤷ `Components of a DBMS Environment` | 28 Components of DBMS Environment · 29 Hardware/Software/Data · 30 Procedures/People |
> | ⤷ `Roles in the Database Environment` | 31 Roles in the Database Environment |
> | **History of Database Systems** | 32 History of Database Systems |
> | ⤷ `History of Database Systems` | 32 History of Database Systems |
> | **Advantages and Disadvantages of DBMSs** | 33 Advantages of DBMSs · 34 Advantages of DBMSs · 35 Disadvantages of DBMSs |
> | ⤷ `Advantages and Disadvantages of DBMSs` | 33 Advantages of DBMSs · 34 Advantages of DBMSs · 35 Disadvantages of DBMSs |
> | **Database Architectures and the Web** | 36 Client-server · 37 Three tier/Four tier · 38 Distributed Database/DBMS · 39 Distributed processing · 40 Cloud databases |
> | ⤷ `Database Architectures` | 36 Client-server · 37 Three tier/Four tier · 39 Distributed processing · 40 Cloud databases |
> | ⤷ `Distributed Database` | 38 Distributed Database and DBMS |
> | ⤷ `Distributed DBMS` | 38 Distributed Database and DBMS |
> | *Next Steps* | 41 Next Steps |

## Basic Definitions

The deck poses four questions — what is a Database, a Database System, a Database Application, and a DBMS. Only *Database System* and *DBMS* get an explicit answer here; the rest are covered by the "Main Characteristics" and course-wide context.

![[Database System]]

## Use of Databases

- Everyday examples: purchases from the supermarket · purchases using your credit card · studying at university
- Databases are genuinely everywhere: finance · banking · insurance · brokerage · architecture · theatre · museums · book stores · restaurants · personnel · hospitals · grocery stores · city/state government · media (newspapers/magazines, social media) · broadcast media (TV, radio) · utilities · energy use data · billing · taxes · city planning · traffic management · law enforcement · medical records · emergency services · public transportation · professional licenses
- These databases **run 24×7**

## File-Based Systems

![[File-Based Systems]]

## Main Characteristics of the Database Approach

![[Database]]

![[System Catalog]]

![[Program-Data Independence]]

![[Data Abstraction]]

## Database Management System (DBMS)

![[Database Management System]]

## Views

![[Views]]

## Example: University Database

A worked example applying the conceptual model to a university:

- **Entities:** STUDENTs · COURSEs · SECTIONs (of COURSEs) · (academic) DEPARTMENTs · INSTRUCTORs
- **Relationships:** SECTIONs are of specific COURSEs · STUDENTs take SECTIONs · COURSEs have prerequisite COURSEs · INSTRUCTORs teach SECTIONs · COURSEs are offered by DEPARTMENTs · STUDENTs major in DEPARTMENTs
- For the table/relation, column/attribute, and row/tuple terminology used here, see [[Database]]

## Components of the DBMS Environment

![[Components of a DBMS Environment]]

![[Roles in the Database Environment]]

## History of Database Systems

![[History of Database Systems]]

## Advantages and Disadvantages of DBMSs

![[Advantages and Disadvantages of DBMSs]]

## Database Architectures and the Web

![[Database Architectures]]

![[Distributed Database]]

![[Distributed DBMS]]

## Notes to Self

- Enter group members + possible project topics — due **Sept 18 (Friday)**
- Lab sessions start the week of Sept 21st
- Discuss project topics with TAs and get their approval
