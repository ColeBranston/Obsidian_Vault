- The Set interface *extends* the [[Collection]] interface.

- It does not introduce new methods or constants, but it requires that an instance of Set contains **no duplicate elements.**

- The concrete classes that implement Set must ensure that no duplicate elements can be added to the set.
	- That is no two elements e1 and e2 can be in the set such that e1.equals(e2) is true.

### The Set Interface Hierarchy

![[Pasted image 20240926233848.png]]