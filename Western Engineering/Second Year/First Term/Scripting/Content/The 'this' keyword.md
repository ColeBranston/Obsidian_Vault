___

In **JavaScript** "this" is a variable that belongs to a **function** and *it points to whichever object it was called on*.

***This is different from Java where the 'this' keyword is a variable that belongs to the object and it holds a reference to its own location***.

___

**Note**: 'this' in JavaScript -> Only when it’s defined using the “function” keyword. Functions defined using the arrow (\=>) notation don’t have a variable called “this”

![[Pasted image 20241123162449.png]]

**Methods**: properties that hold function values.

Any function can be used as a method as long as there’s a property inside the object with the same name.

![[Pasted image 20241123163237.png]]

The method can access the properties of the caller object using its “this” variable

-> If the function is called on its own without any object its ‘this’ would be pointing at the global object

![[Pasted image 20241123163713.png]]

In fact, a method can be called from any object even if it was irrelevant

![[Pasted image 20241123164058.png]]

When there are nested functions, the local  “this” variable of the inner function will overshadow the “this” variable of the outer function unless the inner function is defined using the arrow (\=>) notation

![[Pasted image 20241123164131.png]]

