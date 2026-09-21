
### Function Declaration Notation

```JavaScript
function square(x) {
	return x*x;
}
```

- Using the '**function**' keyword at the beginning of the line. 
- The name of the function follows the identifers rules.
- The list of comma separated paramters surrounded by round parentheses.
- The body of the function must be surrounded by curly brackets even if it was one statement.
- If we don't use the '**return**' keyword the function will return **undefined**

```JavaScript
console.log("The future says:", future());

function future() {
	return "You'll never have flying cars"
}
```

- Function declarations are not part of the regular top-to-bottom flow of control.

- They are conceptually moved to the top of their scope and can be used by all the code in that scope.

### Function Expressions & Bindings

```JavaScript
const square = function(x) {
	return x * x;
};

console.log(square(12));
// -> 144
```
***Note:*** 

1. `square = function(x) {return x * x;};`

→ This part by itself is called anonymous function expression which can be treated like any value.

2. `const square =` and then `square(12)` inside `console.log()`

→ When assigned to a binding, the name of the binding can be used as the function name. 

3. `;` 

→ This way of defining function in JS differs from the formal declaration notation in that:
- A semicolon is needed to mark the end of the statement
- The line order is important 

### Arrow Functions

```JavaScript
const power = (base, exponent) => {
	let result = 1;
	for (let count = 0; count < exponent; count++) {
		result *= base;
	}
	return result;
};
```
- Instead of the **function** keyword, we use an arrow (=>) made up of an equal sign and a greater-than character
- The arrow comes after the list of parameters and is followed by the function's body.

```JavaScript
const square1 = (x) => {return x * x;}
const square2 = x => x * x;
```
- When there is only one parameter name, you can omit the parentheses around the parameter list.
- If the body is a single expression in a return statement, we can omit the curly brackets and the return keyword.

### Optional Arguments

- When we define a function we can specify a list of parameters In JavaScript, the caller is not restricted by the number of parameters in this list. 

![[Pasted image 20240920113937.png]]

- If we give the parameter a default value, the parameter will be assigned that default value when omitted in the function call. 

![[Pasted image 20240920114327.png]]

### Functions as values

Can be:
- **re-assigned to different bindings**
- passed as parameters
- returned form functions

![[Pasted image 20240920114540.png]]

![[Pasted image 20240920114554.png]]