**JS is an Object-Based Language**

![[Object Based Language]]

-> There are mechanisms that allow mimicking object-orientated languages.

- Every value in JavaScript is an object (ie. no primitive values)

- An object encapsulates, properties and methods

- The methods and properties available to us depend on the value associated to the binding name.

![[Pasted image 20240927161732.png]]

**Some String Methods**

![[Pasted image 20240927161756.png]]

```JavaScript
let listOfNumbers = [2,3,5,7,11]
console.log(listOfNumbers[2])'
// -> 5
console.log(listOfNumbers[0]);
// -> 2
console.log(listOfNumbers[2-1]);
// -> 3
```
**Arrays:** 

- Arrays are datasets that contain a list of related
- The list of items are surrounded by square brackets
- The elements are accessed through their index

**Some Array Methods:**

![[Pasted image 20241123150905.png]]

**Note:**
1. `.push()` adds an element to the end of the array
2. `.pop()` returns the last element and removes it from the array

**JS Arrays are dynamic arrays (i.e.. not of fixed length)**

#### Looping Over The Array Elements

![[Pasted image 20241123151212.png]]

![[Pasted image 20241123151251.png]]

**That being said, the `of` keyword loops through the elements themselves, similar to Python** 

![[Pasted image 20241123151543.png]]

### The Three-dots Operator

When used before a function’s parameter it’d be called the “rest-parameter” .It collects any number of arguments sent to a function in an array. **Must be the last parameter in the list**.

![[Pasted image 20241123154234.png]]

```JavaScript
let words = ["never", "fully"];
console.log(["will", ...words, "understand"])
// -> ["will", "never", "fully", "understand"]
```

**In the example above...**

When used with an array it spreads out the elements of the array.

![[Pasted image 20241123154524.png]]

**Note the difference between using the three-dots with the parameter  in a function definition VS. using it with an argument in a function call.**

#### String-to-Array and Array-to-String transformation

![[Pasted image 20241123154733.png]]

### Custom Objects

Values of the type *object* are arbitrary collections of properties. One way to create an object is by using curly brackets as an expression.

![[Pasted image 20241123154901.png]]

The properties of an object are like bindings however they don’t have to follow the naming rules.

**Note**: The values of object properties can be of any type, including other *objects* and *arrays*.

#### 'delete' and 'in' operators

- "in" checks whether a property belongs to an object
- "delete" removes a property from an object

![[Pasted image 20241123155106.png]]

**Additionally...**

We can add properties to an object simply referring to and assigning values to them.

Ex.

![[Pasted image 20241123155212.png]]

