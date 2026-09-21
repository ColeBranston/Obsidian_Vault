
The data type determined two things:
- The range & format of the values that can be represented

## Basic Data types

1. number
2. string 
3. Boolean

### Number

All the following examples are considers of the same type
- 13 (discrete)
- 45.7 (fractional)
- 2.998e8 (scientific = 2.998 * $10^8$)

##### Arithmetic Operators

apply on values of type "number"

1. Minus/Negation (-) \[unary operator, ie. applies on one value]
2. Multiplication (*) - Division (/) - Remainder (%)
3. Subtraction (-) - Addition (+)

- The list above ordered based on the precedence
- We can use parentheses to avoid operator precedence confusion

$(100 + 4) * 11 \;\;is\;not\;the\;same\; as \;\; 100+4*11$

##### Special Values

- Infinity
- -Infinity
- NaN (not a number)

5/0 = Infinity
Infinity -1 = Infinity
Infinity - Infinity = NaN
0 - Infinity = -Infinity

**NaN:** The result of any operation that has NaN as an operand is always NaN, so we have to be careful because a mistake that results in NaN can silently propagate through the entire program.

![[Pasted image 20240927115204.png]]
### String

- Any literals surrounded by matching

	- Double quotes "Lie on the ocean"
	- Single quotes 'Float on the ocean'
	- Backticks `Down on the sea`

There’s only one operator that applies on string values, which is , the concatenation operator(+)

"con" + 'cate'  + \`nate\` -> "concatenate"

![[Pasted image 20240927115526.png]]

Strings surrounded by backticks are a bit different

- They can contain  line breaks without breaking the string
- They can also contain expressions enclosed in ${…}

### Boolean

- Only two values are allowed
	- True or False

**Logical Operators** apply on values of type "boolean"

- Negation /Not (!) - Unary
- Logical AND (&&) , Logical OR (||) – Binary
- Conditional operator  - Ternary  

	(condition ? \<value when true> : \<value when false>)

**Additionally...**

The following operators produce Boolean values

Ex.

- >,<,\<=,\<=,\==,\!=
- \=== , \!==

##### Short-Circuiting of Logical Operators

![[Pasted image 20240927120117.png]]

![[Pasted image 20240927120104.png]]

### .

"Typeof" operator allows us to know the type of a given value.

typeof 4.5
-> number

type of "abc"
-> string

![[Pasted image 20240927120359.png]]

**Empty Values:** Both of these values indicate non-existent or meaningless values.

## Type Conversion

You can explicitly covert a data value from one type to another using on of the following functions:
- Number()
- String()
- Boolean()

![[Pasted image 20240927121028.png]]

![[Pasted image 20240927121124.png]]

![[Pasted image 20240927121312.png]]

-> **Notice**: '+' is always applied as concatenation

![[Pasted image 20240927121249.png]]

![[Pasted image 20240927121142.png]]

![[Pasted image 20240927121410.png]]
### Automatic Type Conversion

When an operation applies on values of different types, the JS engine will try to convert one of them in order to produce a value.

- Since arithmetic operations are supposed to be applied on numbers, JS will call Number() function on non-numeric values/

## Logical Operators

Since logical operators are supposed to apply on Boolean values, JS will call Boolean() function on non-Boolean values when it applies a logical operator

**Conversion Rules:**

- Null, zero, NaN empty string, and undefined are considered **false**
- Anything else is considered true

>[!The OR Operator]
>\(||) Can be used to create fallback mechanism for null values

The first operand is evaluated first:

- If the value of the first operand can be converted to true,
	- It will return as the value of the entire logical operation.
	- The second operand will never be evaluated

![[Pasted image 20240927153759.png]]

- If the value of the first operand can be converted to false
	- The second operand will be evaluated, and its value will return as the value of the entire logical expression.

![[Pasted image 20240927153909.png]]

>[!The AND Operator]

The first operand is evaluated
- If the value of the 1st operand can be converted to false,
	- It will return as the value of the logical expression
	- The second operand will never be evaluated

![[Pasted image 20240927154115.png]]

- If the value of the 1st operand can be converted to true.
	- The second operand will be evaluated, and its value will return as the value of the logical expression

![[Pasted image 20240927154217.png]]

## Comparison Operators

**Null value with comparison operators**

When used with comparison operators the null value is generally considered as zero except for the equality and inequality operators

![[Pasted image 20240927154337.png]]

![[Pasted image 20240927154355.png]]

-> Its good practice to apply fallback mechanism to replace null values to avoid problems

Ex.

![[Pasted image 20240927154441.png]]

***Strings* with comparison operators**

Generally when you compare a **string to another string**, the comparison happens between the corresponding Unicode values of the characters.

![[Pasted image 20240927154627.png]]

**Explanation:** The unicode values pertaining to "abc" are greater than those in "ABC", $\therefore$ "abc" < "ABC" -> **False**

- But when compared to numeric values JS will attempt to convert it to a number if possible.

![[Pasted image 20240927154813.png]]

-> The conversion can be avoided by using the three-character comparison operators (sometimes called the exact comparison operators)

#### Booleans With Comparison Operators

- **False** is converted to number zero
- **True** is converted to the number 1
- The conversion can be avoided using the three-character (exact) comparison operators.

![[Pasted image 20240927155019.png]]

## Bindings

```JavaScript
let caught = 5 * 5 ;
```
- This statement created a binding called "caught" and uses it to grab hold of the value produced by multiplying 5 by 5.

- After a binding has been defined, its name can be used as **as expression**.
	- The value of such an expression is the value the binding currently holds.

	`console.log(caught);`

- The assignment (=) operator can be used at any time on existing bindings to disconnect them from their current value and have them point a new one.

	- `caught = 10;`

A single (let) statement may define multiple bindings. The definitions must be separated by commas.

```JavaScript
let one = 1, two = 2;
console.log(one + two);
// -> 3
```
### Binding Using Var & Const

```JavaScript
var name = "Ayda";
const greeting = "Hello";
console.log(greeting + name);
// -> Hello Ayda
```
- **Var** stands for the variable, similar to **let** with some differences
	- Is the way bindings were declared in pre-2015 JavaScript.

- **Const** stands for constant, it defines bindings that cannot be changed

**JavaScript is a weakly (dynamically) typed language**

In a dynamically typed language, variables are not given a specific type.

## Binding Names (Identifiers)

- Binding names can be any word that is not a reserved keyword (eg. **let**)
- Digits can be part of binding names, but the name must not start with a digit.
- A binding name may include dollar signs ($) or underscores (_) but no other special characters

