JavaScript is fully object-oriented but has no classes per se — inheritance and polymorphism are achieved through [[Object Prototype|prototypes]] instead.

**Creating an object** — object-literal notation (preferred) or the constructed form:

```js
// object literal
let myObj = { name1: value1, name2: value2 };
// constructed form
let myObj = new Object();
myObj.name1 = value1;
```

**Properties** are accessed with dot (or bracket) notation: `myObj.name1` or `myObj["name1"]`. **Methods** are functions associated with an object instance, called the same way: `someObject.doSomething();` — a method can use the object's internal properties, so the same method call can behave differently per instance.

**Constructors** create new objects with `new`: `let someObject = new ObjectName(p1, …, pn);`. Some built-in types have shortcut constructors — `let greeting = "Good Morning";` is shorthand for `new String("Good Morning")`.

**Built into JavaScript:** Array, Boolean, Date, Math, String, and DOM objects.

- `Math` — static class of constants (`PI`, `E`, `SQRT2`) and functions (`max`, `min`, `pow`, `sqrt`, `random`, trig functions).
- `String` — `length`, `.concat()` (or `+`), `charAt()`, `indexOf()`, `split()`, `search()`, `match()`.
- `Date` — `new Date()` then `.toString()` for the current date/time.
- `Window` — corresponds to the browser itself; gives access to the current URL, history, and status bar. `alert()` is actually a method of `window`.
