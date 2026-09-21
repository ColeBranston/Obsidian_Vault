A variable declared anywhere in a function's body is conceptually moved ("hoisted") to the top of the function — but only the **declaration** is hoisted, not the initialization:

```js
function sum(a, b) {
  console.log(myString);      // => undefined (declaration hoisted, not the value)
  var myString = 'Hello World';
  console.log(myString);      // => 'Hello World'
  return a + b;
}
```

**Function declarations are hoisted whole** (the entire function, not just its name), so it can be called from code that appears above its definition. **But** a function *expression* assigned to a `var` only has the `var` declaration hoisted — the assignment stays exactly where it is, so calling it too early fails:

```mermaid
flowchart TB
    subgraph Decl["Function DECLARATION — fully hoisted"]
        D1["function calculateTax(subtotal) {...} is hoisted whole, to the top of its scope"]
        D2["calculateTotal() can call calculateTax() even though it's defined further down — works fine"]
        D1 --> D2
    end
    subgraph Expr["Function EXPRESSION assigned via var — only the declaration hoists"]
        E1["var calculateTax; ← hoisted, but empty (undefined)"]
        E2["...later in the file: calculateTax = function(subtotal) {...}; ← the assignment is NOT hoisted, stays in place"]
        E3["Calling calculateTax(...) from code that runs before that assignment line"]
        E4["Result: calculateTax is still undefined there — 'calculateTax is not a function'"]
        E1 --> E3 --> E4
        E2 -. "assignment happens too late to help" .-> E4
    end
```
