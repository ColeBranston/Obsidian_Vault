**Scope** governs where a declared variable or function is visible. In JavaScript, scope is determined **at design-time** (lexically, by how functions are nested in the source) rather than at runtime.

A variable declared inside a function is visible anywhere within that function (including nested functions inside it), but not from outside it. A variable declared outside any function is **global** and visible everywhere:

```mermaid
flowchart TB
    C["Global: var c = 0"]
    OuterCall["Global: outer()"]
    A["outer(): var a = 5"]
    InnerCall["outer(): inner()"]
    L1["inner(): console.log(a) → 5 ✓ allowed, a belongs to the containing outer()"]
    B["inner(): var b = 23 — local only to inner()"]
    L2["inner(): c = 37 ✓ allowed, c is global"]
    L3["outer(): console.log(c) → 37 ✓ allowed"]
    L4["outer(): console.log(b) → ✗ not allowed — b doesn't exist outside inner(), outputs undefined"]

    C --> OuterCall --> A --> InnerCall --> L1 --> B --> L2
    L2 --> L3 --> L4
```

When a name is used, JavaScript resolves it by walking outward through the scope chain:

```mermaid
flowchart LR
    Inner["① look first within the current function"] --> Middle["② then within the first containing function"]
    Middle --> Outer["③ then within the next containing function"]
    Outer --> Global["④ then finally within global scope"]
```

> [!tip] Remember
> Scope is determined at **design-time** — i.e. by where a variable is written in the source, not by which function happens to call which at runtime.

See also [[Variable Hoisting]] for how declarations (but not assignments) get moved to the top of their scope before this lookup even happens.
