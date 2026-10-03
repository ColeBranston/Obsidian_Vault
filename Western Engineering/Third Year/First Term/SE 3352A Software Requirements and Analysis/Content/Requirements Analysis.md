**Requirements analysis** (BABOK: *Specify and Model Requirements*) is the practice of analyzing elicitation results and creating representations — specifications and models — of those results. It's the step after [[Requirements Elicitation]] in the [[SDLC]].

*BABOK task 7.1 — inputs, output, and the tasks that use the output (slides 4–7)*

```mermaid
flowchart TD
    subgraph inp["Input"]
        er["4.2, 4.3<br>Elicitation Results<br>(any state)"]
    end
    sm["7.1<br>Specify and Model Requirements"]
    out["7.1<br>Requirements<br>(specified and modelled)"]
    subgraph uses["Tasks Using This Output"]
        ver["7.2<br>Verify Requirements"]
        val["7.3<br>Validate Requirements"]
    end
    er --> sm
    sm -- Output --> out
    out --> uses
```

- **Verify** → make sure the requirements meet the **stakeholders' needs**
- **Validate** → make sure the requirements satisfy the **business goals**

> [!tip] Build traceability in as you go
> Include the [[Requirements Traceability|traceability]] information *while* creating the models/artifacts, not afterwards.
