- A queue is a collection of elements, inserted and removed according to the first-in, first-out (FIFO) principle.

- Unlike stacks, a queue is open on both ends. One end is used to insert data (add) and the other end is used to remove data (remove).

### Queue methods

![[Queue Methods]]

### Realizing a Queue Using an array

-  We can implement a queue using an array
- Here are the steps ([[Algorithm]]) with integer type data:

	- Create an [[Array]] of size c: c will be the capacity of the queue
	
	- Crate two variables front and rear. The front will hold the index of the first element of the array and the rear will hold the index of the last element, if they exist.
	
	- Assign zero to both variables front and rear. It means the queue is empty.
	
	- **Enqueue operation**: check whether the rear is equal to the capacity or not otherwise add an element in the array and increment rear
	
	- **Dequeue**: remove the item from the front index (0) and increment front

#### Solution

![[Pasted image 20240919171927.png]]

![[Pasted image 20240919171937.png]]
![[Pasted image 20240919171954.png]]
### Application of Queues

- Direct Applications
	- Waiting lists, bureaucracy
	- Access to shared resources (eg. printer)
	- Multiprogramming

- Indirect Applications
	- Auxiliary [[Data Structure]] for algorithms.
	- Component of other data structures.
