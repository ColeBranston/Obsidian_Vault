Functions are JavaScript's building block for modular code. Defined with the `function` keyword, a name, and optional parameters — since JS is dynamically typed, neither a return type nor parameter types are required:

```js
function power(x, y) {
  let pow = 1;
  for (let i = 0; i < y; i++) { pow = pow * x; }
  return pow;
}
power(2, 10); // invocation
```

A function can be **nested** inside another (e.g. a private `calculateTax()` helper defined inside `calculateTotal()`), scoped so only the outer function can call it.

**Four ways to declare a function:**

| Style | Example |
|---|---|
| Declaration | `function power(x,y){ … }` |
| Expression | `let pwr = function (x,y){ … };` |
| Immediately Invoked Function Expression (IIFE) | `(function() { statements })();` |
| Constructor | `new Function(x, y, "body")` — body given as a string; **avoid**, causes many problems |

**Arrow functions** are shorthand for anonymous function expressions, more intuitive to read: `let t = (p, qty) => { return p*qty; };` instead of `let total = function (p, qty) { return p*qty; };`. An arrow function does not have its own `this`, `super`, `new.target`, or `arguments`.

**Self-learning topics** (not covered in lecture, but expected background): **execution context** (the environment a bit of code runs in), **closure** (a function's execution context at the time it was created), and **scope chain** (the scope visible when calling a chain of functions).
