
### Lexical Scoping

![[Pasted image 20241123164556.png]]

- **The Lexical Scope** of a binding is the extent or the range in which it can be seen.
- Scopes can be nested:
	- The outer scope is visible from the inner scope.
	- Bindings in the outer scope can be overshadowed by bindings of the same name in the inner scope.

Ex.

![[Pasted image 20241123164658.png]]

#### Types of Scopes

1. Global scope
2. Local scope
3. Closure scope
4. Block scope

##### Global Scope

- Whatever belongs to the globalThis object
- Accessible from anywhere

##### Local Scope

- Created by:
	- a **module** in NodeJS or a **script** in the browser
	- **a function definition**

##### Closure Scope

- Created by inner functions (functions defined inside other functions)
- Allows the scope of the outer function to be accessible from inside the inner function.

##### Block Scope

- Bindings created by **let** or **const** inside a block delimited by curly brackets or the round brackets of a for loop.
- Bindings created using **var** don't recognize this scope. 

#### Code Examples 

![[Pasted image 20241123165134.png]]

- Nested scopes shown listed in the debugging tool listed from bottom up
- Available scopes are listed under ‘Variables’ in VSCode and under ‘Scope’ in the Chrome’s DevTools

**Additionally...**

In node the binding defined using var was considered part of the local(module) scope

-> While `x` was added to the global object

![[Pasted image 20241123165457.png]]

- Variables: `a`, `b`, `c` are added to the local scope since they are created within the `print` function. 

![[Pasted image 20241123165745.png]]

-> Basically, because the bindings are made inside the outer scope they are accessible within the function and inner functions. The difference is simply that the state of closure scope variables is maintained within the function, while the state of the global scope variable is saved throughout the entire code base. 

**Additionally...** 

The outer scope here appears as a closure

That has to do with how the modules work, they are encapsulated as a functional expression (more on that later)

![[Pasted image 20241123170501.png]]![[Pasted image 20241123170521.png]]

![[Pasted image 20241123171105.png]]

-> Block refers to the scope of inside a block of code/closure such as inside an if-statement

![[Function Contexts and the Call Stack]]

![[Closures]]