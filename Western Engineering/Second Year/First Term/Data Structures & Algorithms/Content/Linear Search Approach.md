---
aliases:
  - Linear Search
---
- the linear search approach compares the key [[Element]], **key**, **sequentially** with each element in the [[Array]] **list**. The method continues to do so until the key matches an element in the list, or the list is exhausted without a match being found.

	- The **[[algorithm]]** that is used in [[Searching]]: If a match is found, the linear search returns the index of the element in the array that matches the key. If no match is found, the search returns -1.

### Example - Linear Search

![[Pasted image 20240918182030.png]]


### No Boundary Checking During Compilation

- Java does not check array's boundary during compilation.

- But during **run-time**, accessing ‘out of range’ array location will generate an exception due to this **run time error.**

This error is known as: **ArrayIndexOutOfBoundsException**

![[Data Insertion]]

![[Data Removal]]

