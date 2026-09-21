How a [[Database Management System|DBMS]] is deployed relative to its users, roughly from simplest to most distributed:

- **Client-server** — multiple clients (desktop, laptop, mobile) talk directly to one database server
- **Three tier** — client (user interface) → application server (business/data-processing logic) → database server (data access)
- **Four tier** — adds a web server between the client and the application server
- **Distributed processing** — a single centralized database accessed over a network, as opposed to a genuine [[Distributed Database]] managed by a [[Distributed DBMS]]
- **Cloud databases** — hosted DBMS-as-a-service (Amazon RDS, Google Cloud SQL, Microsoft Azure, …), with multi-tenancy options ranging from separate servers per tenant, to a shared server with separate databases, to a shared database with separate schemas
