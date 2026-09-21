A **prototype** is JavaScript's mechanism for sharing behaviour across objects without classes — it's what makes JS behave more like an object-oriented language despite being **prototype-based** rather than class-based (C++, Java). Where a class defines all of an instance's properties up front and can't add properties dynamically at run time, a prototype-based object can add or remove properties dynamically, and a whole hierarchy is built by assigning an object as another's prototype rather than subclassing.

**Why prototypes matter** — defining a method inside a constructor function duplicates that method on every instance:

```js
function Die(color) {
  this.color = color;
  this.faces = [1,2,3,4,5,6];
  this.randomRoll = function () {…};   // duplicated per instance
}
```

```mermaid
flowchart TB
    subgraph Without["Without a prototype — randomRoll duplicated on every instance"]
        X1["x1: Die — color='red', faces=[1..6], own randomRoll()"]
        X2["x2: Die — color='green', faces=[1..6], own randomRoll()"]
        X100["x100: Die — color='ecru', faces=[1..6], own randomRoll()"]
    end
```

Attaching it to the constructor's `.prototype` instead shares one copy across every instance:

```js
function Die(color) {
  this.color = color;
  this.faces = [1,2,3,4,5,6];
}
Die.prototype.randomRoll = function () {…};
```

```mermaid
flowchart TB
    subgraph With["With Die.prototype.randomRoll — one shared copy"]
        Y1["x1: Die — color='red', faces=[1..6]"]
        Y2["x2: Die — color='green', faces=[1..6]"]
        Y100["x100: Die — color='ecru', faces=[1..6]"]
        P["Die.prototype.randomRoll() — single shared function"]
        Y1 -.-> P
        Y2 -.-> P
        Y100 -.-> P
    end
```

Existing built-in types can be extended the same way, e.g. adding a `countChars()` method to every string via `String.prototype.countChars = function (c) {…}`. `Object.create(parentObj)` creates a new object whose prototype is `parentObj`, for building a prototype chain directly.
