
- Selection sort works on the data set by selecting the smallest data item (for ascending order) from the list and start building a sorted list on the left end of the list. It repeats the same for the unsorted portion till the whole list is sorted.

- Example: rearrange books on shelf by height in ascending order from the left.

- Algorithmic approach: sorting the books on a book-shelf
	- Look at books, select the shortest book 
	- Swap with the first book on the left 
	- Look at remaining books, select the shortest one 
	- Swap with the second book 
	- Repeat till all the books are in order

![[Selection-Sort.gif]]

### The Algorithm

![[Pasted image 20241016051611.png]]

### Analyzing (Worst-Case) Selection Sort

- The selection sort algorithm finds the smallest (or largest) number in the list and places it at the beginning (or at the end) of the list. 
- It then finds the next smallest (or largest number) number from the remaining data items, and places it next to the first one (or before the last one), and so on until the list contains only a single number. 
- The number of comparisons is (n-1) for the first iteration, (n-2) for the second iteration, and so on. 
- Let T(n) denote the complexity for selection sort and c denote the total number of other operations such as assignments and additional comparisons in each iteration. So, in the worst case,

![[Pasted image 20241016051654.png]]

Ignoring constants and smaller terms, the complexity of the selection sort algorithm is O(n2 ).

**Question: What will be the best-case scenario? What is the space complexity?**

-> O($n^2$), O(1)

