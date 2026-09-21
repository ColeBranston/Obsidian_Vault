- The ArrayList [[class]] and the LinkedList class are concrete implementations of [[The List Interface]]

- Which of the two classes we need to use?
	- It depends on the specific need.
	- To support random access through an index without inserting or removing elements from any place of a preset sized [[List]], other than the end, ArrayList offers the most efficient [[Collection]].
	- If the application requires the insertion or deletion of elements at or from any place in the list, one should choose LinkedList.
	- A list (both classes) can grow or shrink dynamically.

**Note:** An [[Array]] is fixed once it is created. If your application does not require insertion or deletion of elements beyond its preset size, the most efficient [[Data Structure]] is the array.

### java.util.ArrayList

![[Pasted image 20240926235835.png]]

### java.util.LinkedList

![[Pasted image 20240926235859.png]]

### Example: ArrayList and LinkedList

![[Pasted image 20240926235922.png]]