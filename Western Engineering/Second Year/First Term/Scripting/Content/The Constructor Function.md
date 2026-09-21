- Any function in JS has the capacity to work as a constructor function.
	- i.e. to create new object and set their prototype.

- We activate this capacity by using the ‘new’ keyword when calling it.

- A function object in JS has two properties that refer to prototypes:
	- The property named ‘prototype’ is the prototype the function gives to the objects it creates. 
	- The property named \__proto__ (shown in the debugger as ‘\[\[prototype]]’) is the prototype it received when it was created.

$\therefore$ From the following example: 

![[Pasted image 20241123183140.png]]

1. A new object will be created
2. The prototype of the construction function would be set as its \__proto__
3. The code of the constructor function will be executed on/through that new object, that's why the function can access the object using the 'this' keyword.
4. The properties initialized inside the function would be added to the newly created object.
5. The object can then be accessible through the variable name due to the assignment.

**Note:** that these are still independent objects and not restricted to the template used in the constructor function, i.e.. we can still add or delete an properties without restrictions. 