---
~
---
- Array is a concrete data structure that represents a collection of the **same type of data items** which are stored in consecutive memory locations. (The **only concrete data structure** provided by a programming language by default)

- In Java, **arrays are objects**, which are stored **in the heap** with the help of **array reference-variables**.

![[Element]]

- Once the size/dimension of an array is chosen via a variable or constant, that size **can not** be altered for that array.

	- *To change the size of the array we need to do either of the two: Create a new array of the desired size and copy the contents from the original array to the new array, using java.lang.System.arraycopy(...). Use the java.util.ArrayList class, which does this for us when we need to make the array bigger*

![[Declaring Array Reference-Variables]]

![[Searching Arrays, and Linear Search]]