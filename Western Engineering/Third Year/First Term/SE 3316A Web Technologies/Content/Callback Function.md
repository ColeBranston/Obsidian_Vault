A **callback function** is a function passed into another function to be invoked later — often written **anonymously**, defined right at the call site instead of being named and declared separately. Common for responding to asynchronous work or events without cluttering the surrounding scope with a one-off named function.

```mermaid
flowchart TB
    Def1["var calculateTotal = function(price, quantity, tax) {...}"]
    Def2["var calcTax = function(subtotal) {...}"]
    Call["var temp = calculateTotal(50, 2, calcTax)"]
    Pass["① calcTax is passed in as the 'tax' parameter"]
    Ref["② inside calculateTotal, the local parameter 'tax' is a reference to calcTax"]
    Invoke["tax(subtotal) invokes calcTax — calcTax is acting as a callback function"]

    Def1 --> Call
    Def2 --> Call
    Call --> Pass --> Ref --> Invoke
```

The same thing works with an **anonymous function** defined inline instead of a separately-named one:

```mermaid
flowchart LR
    Call["var temp = calculateTotal(50, 2, function(subtotal) {...})"] -->|"passes the anonymous function directly as the callback parameter"| Body["function(subtotal) { var taxRate = 0.05; return subtotal * taxRate; }"]
```
