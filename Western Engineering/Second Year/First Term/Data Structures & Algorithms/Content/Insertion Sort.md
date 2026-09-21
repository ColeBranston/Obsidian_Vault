
- On each iteration, Insertion sort removes one element from the list, finds the best location and inserts it there.

- It repeats this process until no input elements remain to be checked for its correct order.

![[Insertion-sort-example.gif]]

### The Pseudocode and The Algorithm

![[Pasted image 20241016051026.png]]

### Analyzing (Worst-Case) Insertion Sort

![[Pasted image 20241016051046.png]]

### Characteristics of Insertion Sort

Insertion sort is generally the mostly used simple sorting algorithms for its plethora of strengths. Including, but not limited to:

- **Adaptive** — efficiently sorts data that is already generally sorted 
- **Stable** — does not change the order of ‘like’ elements in the array 
- **Online / dynamic** — can sort the array as it receives new items 
- **In-place** — requires a consistent, small amount of memory to run 
- **Simple Implementation** — not a lot of code needed for the algorithm 

For small lists (small is a relative term, but really anything less than or around 1,000 items) one cannot go wrong with insertion sort.

