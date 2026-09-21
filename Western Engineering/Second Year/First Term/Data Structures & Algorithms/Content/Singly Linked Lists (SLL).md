- A singly linked list is a concrete [[Data Structure]] consisting of a sequence of [[Node|Nodes]], starting from a head pointer.

![[Pasted image 20240924173836.png]]
![[Pasted image 20240924173901.png]]

**Note**: 

In above, node A is the head of the list and [[Node]] D is the tail of the list. Each node is connected in such a way that node A is pointing to node B which in turn pointing to node C. In the end, node D is pointing to null (no where) as it is the last node of the list.

### Realizing Generic SLL

- Create a generic [[class]] which has two attributes: head and tail.

- Create a nested generic class (inside the above class) ‘Node’ which should have two attributes: data and next. ‘Next’ is a pointer to the next node.

- Create methods for adding or removing nodes either at the head or tail.

- Create other methods to carryout the required operations with linked list.

- **Note**: Since we will just use the Node to Realize the list, Node is usually made as a nested [[class]]

