The **business rules model** is the list of business constraints the system must apply — written statements (and, at detail, algorithms or regular expressions) capturing the organization's policies and procedures plus external rules such as legislation. It's the one [[CoreX]] model that **isn't visual**.

It cross-binds the [[Data Model]], [[Workflow Model]] and UI so that the **right people** do the **right activities** on the **right data** at the **right time**.

## Examples (slide 42)

- Loans of $100,000 or more must be approved by a senior officer.
- Customers with deposits under $10,000 cannot be offered fixed interest rates.
- Customers who repay a loan in under half the agreed period pay a fee of 1.5% of the original amount.
- A loan below $2,000,000 is automatically decisioned.
- An Olympic athlete can only play a sport for one country.

## Four categories of rules (reading)

| Category | Covers |
|---|---|
| Data and relationships | definition, derivation, validation; cardinality and other occurrence constraints |
| Workflows and tasks | sequence, and tasks triggered by conditions on data |
| Roles and permissions | which roles may perform which tasks on which data |
| Events and messages | system, UI and other application messages |

> [!tip] Why keep rules in one place
> Gathering nearly every rule here makes rule interactions visible, lets rules change at run time instead of being hard-coded in the database, and stops them hiding in UI code or deep in the codebase "never to be found — except when things go wrong."
