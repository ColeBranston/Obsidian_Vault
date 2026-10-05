**Function point estimation** measures software size by the functionality delivered to users rather than by the number of lines of code.

- **Five function types**, each counted and weighted by its complexity: external inputs · external outputs · external inquiries · internal logical files · external interface files
- The resulting function point (FP) count is converted into effort using historical productivity data.

$$\text{Effort} = \text{Function Points} \times \text{Hours per FP}$$

> [!example] 135 function points
> A project with 135 function points and a historical productivity of 12 hours per FP → 135 × 12 = **1,620 hours**.

**When to use:** early in development, when the functional requirements are known but the programming language or implementation details aren't finalized (unlike [[COCOMO]], which needs a lines-of-code size).
