JavaScript's quirks: everything is case-sensitive · `===` tests both equality *and* type · `null` and `undefined` are distinct states, and both differ from a truly undeclared variable (which throws a `ReferenceError`) · semicolons are encouraged but not required · there's no integer type, only `number`, so floating-point rounding errors show up even for values meant to be whole.

**Declaring variables:**

| Keyword | Scope | Recommended? |
|---|---|---|
| `var x = 42;` | global outside a function, local inside one — does **not** obey block scope | avoid |
| `x = 42;` (no keyword) | always global | avoid |
| `let x = 42;` | obeys block scope | **recommended** |

**Data types** — two basic kinds: **reference types** (objects) and **primitive types**. Six primitive types in ES6: Boolean, Number, String, Symbol, Undefined, Null.

**Comparison operators:**

| Operator | Meaning |
|---|---|
| `==` | equals (type-coerced) |
| `===` | equals, including type |
| `<` `>` `<=` `>=` | ordering |
| `!=` | not equal (type-coerced) |
| `!==` | not equal, including type |
