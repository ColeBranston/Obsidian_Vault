- The sorting algorithms that we have discussed so far are simple and often useful, but they are inefficient to use on large arrays. 

- We have noticed that 
	- when an array is completely scrambled, an insertion sort takes a good amount of time. 
	- but when an array is almost sorted, an insertion sort is more efficient. 

- The Shell sort is a variation of the insertion sort that is faster than O(n 2 ). 

- It is done by sorting subarrays of equally spaced indices 

- Instead of moving to an adjacent location an element moves several locations away
	- Results in an almost sorted array 
	- This array is sorted efficiently with ordinary insertion sort

![[vQDGWb.gif]]

### Example

For example, this figure shows an array and the subarrays obtained by considering every sixth element.

![[Pasted image 20241016053454.png]]

- After we sort each of the six subarrays separately by using an insertion sort. The original array becomes a partially sorted array as shown below: 
- Notice that the "more sorted" than it was originally.

![[Pasted image 20241016053519.png]]

- Now we form new subarrays, but this time we reduce the separation between indices.

- Shell suggested that the initial separation between indices be n/2 and that you halve this value at each pass until it is 1. 

- We now reduce the separation to 3.

![[Pasted image 20241016053552.png]]

This figure shows the subarrays after they are sorted, and the array that contains them.

![[Pasted image 20241016053612.png]]

- Let us now examine the source code (copied from the Carrano’s Book) for **incrementalInsertionSort** and **shellSort**

### Shell-Sort Implementation

![[Pasted image 20241016053655.png]]

![[Pasted image 20241016053705.png]]

**Generally...**

![[Pasted image 20241016053748.png]]

### Efficiency of Shell Sort

Although we used an insertion sort several times instead of just once,

- the initial sorts are of arrays that are much smaller than the original one,
- the later sorts are on arrays that are partially sorted, and
- the final sort is on an array almost entirely sorted.

- Efficiency is O(n 2 ) for worst case 

- If n is a power of 2, average-case behavior is O(n 1.5) 

- If we avoid even values of space, to avoid elements in common, simply add 1 to space value whenever it is even.

	- From the previous example with even space value of 6 (last index/2) we take care of the indices: 0, 6, 12 etc. for the first subarray. To improve the performance, we make that even spacing ‘odd’, by adding 1 to that and in this case the subarray indices would be: 0, 7; 1, 8; 2; 9 etc.

- This simple change results that the worst-case behaviour of the Shell sort is then O($n^{1.5}$)