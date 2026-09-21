- The HashSet [[class]] is a concrete class that implements Set.

- It can be used to store duplicate-free elements.

- For efficiency, objects added to a hash set need to implement the hashCode() method in a manner that properly *disperses* the hash code.

![[Pasted image 20240926234030.png]]

### Example: HashSet

![[Pasted image 20240926234100.png]]

### Example: LinkedHashSet

- There is no specific order for the elements in a hash set.

- To impose an order on them, we need to use the LinkedHashSet class; In this case first one will be the head, and the last one will be the tail. New item will be added at the tail of the set:

![[Pasted image 20240926234214.png]]

