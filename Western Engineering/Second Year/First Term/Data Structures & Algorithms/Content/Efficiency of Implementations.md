## Case Study: Iterative Version of Fibonacci Numbers 

![[Pasted image 20241016042218.png]]

![[Pasted image 20241016042235.png]]

## Efficiency of Implementations of ADT List

- For array-based implementation 
	- Add to end of list (if do not need to resize the array): **O(1)** 
	- Add to list at a given position: **O(n)** 
	- Retrieving an entry from a specific index: **O(1)**
	- Retrieving an entry: **O(n)**

- For linked implementation
	- Add to end of list (tail reference is implemented): **O(1)** 
	- Add to list at a given position: **O(n)** 
	- Retrieving an entry: **O(n)**
	
## Efficiency of Implementations of ADT Set

- Hash Set:
	- Best case addition: **O(1)** 
	- Worst Case Addition: **O(n)** 
	- Retrieving an entry – Best case: **O(1)** 
	- Retrieving an entry – Worst case: **O(n)**

- Linked Hash Set:
	- Add/remove – best: **O(1)**, worst: **O(n)** (Collision)
	- Retrieval – best: **O(1)**, worst: **O(n)** (Collision)

- Tree Set (Sorted using heap-tree algorithm):
	- Retrieval: **O(log n)**
	- Remove, add: **O(log n)**. ***(Note: if the sorting is implemented in an array, remove and add will be O(n))***

## Efficiency of Implementations of ADT Map

![[Pasted image 20241016042640.png]]

![[Pasted image 20241016042707.png]]