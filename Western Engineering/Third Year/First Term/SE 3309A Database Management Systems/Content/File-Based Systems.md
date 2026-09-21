A **file-based system** is a collection of application programs that perform services for end users (e.g. producing reports). Data is stored in files and directories, and **each program defines and manages its own data** — there's no central data definition.

**Limitations:**
- Data definitions are embedded in application programs rather than stored separately and independently
- No control over access/manipulation of data beyond what each program enforces
- Limited data integrity — no central control over data, which often leads to inconsistencies
- Data retrieval and manipulation require custom programming

> [!note] Case study — DreamHome
> A property management company with separate *Sales* and *Contracts* application programs, each with its own files. Both sets of files duplicate overlapping data (`PropertyForRent`, `Client`) — a textbook example of the redundancy this approach causes.

These limitations motivated the shift to the [[Database]] and [[Database Management System]] approach.
