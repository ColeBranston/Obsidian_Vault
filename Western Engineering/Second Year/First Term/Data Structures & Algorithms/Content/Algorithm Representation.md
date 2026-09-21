- Representations of algorithms are generally grouped into three levels: 

- High-level description (Almost like natural language): 
	- It describes an algorithm, ignoring the implementation details. 

- Implementation description:
	- It defines the algorithm in a way the system inputs data, process the data and output data. At this level we do not give details of states or transition functionalities.
	
- Formal description: 
	- Most detailed description is provided in this level that include logical expressions and certain well-accepted rules. This is the lowest level in algorithm representation.

Note: In this course, from this point onward, formal description will be expected for algorithm representation

### How to Express Algorithms

![[Pasted image 20241011131213.png]]

![[Pasted image 20241011131306.png]]
#### Example

Write an algorithm to find the largest number in an unsorted list of numbers

- **High-level description:**
	- Assume that the first item is largest.
	- Look at each of the remaining items in the list and if it is larger than the largest item so far, make a note of it. 
	- The last noted item is the largest in the list when the process is complete.

![[Pasted image 20241011131411.png]]