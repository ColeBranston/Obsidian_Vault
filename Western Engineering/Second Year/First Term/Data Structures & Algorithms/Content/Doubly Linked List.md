- A doubly linked list can be traversed forward and backward

- Nodes store:
	- [[Element]]
	- link to the previous node
	- link to the next [[Node]]
- Special trailer and header nodes

![[Pasted image 20240924180044.png]]

![[Pasted image 20240924180055.png]]

### Insertion of a Node in between Two Nodes

- Insert a new node, q, between p and its successor.

![[Pasted image 20240924180140.png]]


### Deletion of a Node

- Remove a node, p, from a doubly linked list.

![[Pasted image 20240924180225.png]]

## Implementation of a DLL In [[Java]]

![[Pasted image 20240924180305.png]]

![[Pasted image 20240924180321.png]]

![[Pasted image 20240924180335.png]]

![[Pasted image 20240924180347.png]]

### Application of DLL

- It is used in the navigation systems where front and back navigation is required.

- It is used by the browser to implement backward and forward navigation of visited web pages that is a back and forward button.

- It is also used to represent a classic game deck of cards.

- It is also used by various applications to implement undo and redo functionality.

- Doubly Linked List is also used in constructing **MRU**/**LRU** (Most/least recently used) cache.

- Other data structures like **stacks**, **Hash Tables**, **Binary trees** can also be constructed or programmed using a doubly-linked list.

- Also in many operating systems, the **thread scheduler** (the thing that chooses what process needs to run at which time) maintains a doubly-linked list of all processes running at that time.