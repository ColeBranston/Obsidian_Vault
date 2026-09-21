**Primitive** data types are passed **by value** — changing them inside a function has no effect outside it. **Objects** are passed **by reference** — modifying an object inside a function affects the original:

```js
function setType(v, t) { v.type = t; }
let car = { doors: 4, cyl: 6 };
setType(car, "TVR");
console.log(car.type); // "TVR" — car was modified in place
```
