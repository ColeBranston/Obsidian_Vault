- A linked list is a [[Data Structure]] where the objects are arranged in a linear order.

- Unlike an [[Array]], however, in which the linear order is determined by the array indices, the order in a linked list is determined by a pointer in each [[object]].

- The linked list can generally be realized in two forms:
	- Singly linked list
	- Doubly linked list

![[Pasted image 20240924173659.png]]

![[Singly Linked Lists (SLL)]]

![[Nested Classes (Inner Class)]]

### A Nested [[Node]] [[Class]] in a SLL

![[Pasted image 20240924174542.png]]

### Accessor Methods for a SLL

![[Pasted image 20240924174617.png]]

### Inserting Data at the Head of a SLL

The steps ([[Algorithm]]):
- Allocate a new node
- Insert new element
- Have new [[Node]] point to old head
- update head to point to the new node

![[Pasted image 20240924175255.png]]

### Implementation of the Add-Methods for SLL

![[Pasted image 20240924175443.png]]

### Removing Data from the Head of a SLL

- Update head to point to next [[Node]] in the list.

- Allow garbage collector to reclaim the former first node.

![[Pasted image 20240924175548.png]]

### Implementation of the remove-Method for a SLL

![[Pasted image 20240924175616.png]]

### Removing Data from the Tail of a SLL

- Removing at the tail of a singly linked list is not efficient!
- There is no way to have a constant-time to update the tail to point to the previous node.

![[Pasted image 20240924175646.png]]

## Application of SLL

- It is used to implement **stacks** and **queues** in ADT.

- To prevent the collision between the data in the **hash map**, SLL is used.

- A casual notepad uses a singly linked list to perform undo or redo or deleting [[Functions]].

- A photo viewer uses SLL for displaying the photos continuously in a slide show

- Real life Application: In the Railway system, a train uses the idea of a singly linked list - a compartment can be added at the end or taken out from the end.

![[Doubly Linked List]]