- **O-notation**, known as the *order of an algorithm*, represents the worst-case time requirement of the Algorithm. In the table below

	- "Algorithm A has a worst-case time requirement **proportional to** n” which is O(n). In short, we say algorithm-A is O(n); we call it "Big Oh of n” or “order of at most n”
	- Algorithm B is O($n^2$) (proportional to $n^2$ : **quadratic time complexity O(n2 ) is encountered in the algorithms with nested loops**
	- Algorithm C is O(1)

- Algorithm analysis is focused on growth rate. **The multiplicative constants have no impact on growth rates.** The growth rate for n/2 or 100n is the same as n, i.e., O(n) = O(n/2) = O(100n). Review: Growth-rate is the slope of the line of the log-log chart.

![[Pasted image 20241016035657.png]]

### Big O and Constant Time

The Big Oh notation estimates the execution time of an algorithm in relation to the input size. If the time is not related to the input size, the algorithm is said to take **constant time** with the notation O(1)

For example, a method that retrieves an element at a given index in an array takes constant time, because it does not grow as the size of the array increases.

### Big O Notation and Non-Dominating Terms

Consider the algorithm for finding the maximum number in an array of n elements.
- If n is 2, it takes one comparison to find the maximum number. 
- If n is 3, it takes two comparisons to find the maximum number. 
- In general, it takes n-1 number of comparisons to find maximum number in a list of n elements. 
- Algorithm’s efficiency for large input size.
	- If the input size is small, there is no significance to estimate an algorithm’s efficiency. 
	- As n grows larger, the n part in the expression n-1 dominates the complexity. 
	- The Big O notation allows us to ignore the non-dominating part (e.g., -1 in the expression n-1) and highlight the important part (e.g., n in the expression n-1). So, the complexity of this algorithm is O(n). 

### Big O Notation: Formal Definition

Given functions f(n) and g(n), we say that f(n) is of order of at most g(n) – that is, f(n) is O(g(n)) if there exists a **positive real number** c and a **positive integer** $n_0$ such that

cg(n) $\geq$ f(n) for all n $\geq n_0$ 

- In this case cg(n) is an upper bound of f(n) when n is sufficiently large.
- Example: if g(n) = n and f(n) = 2n + 10 then, f(n) is O(g(n)), i.e., O(n).

- Proof: cg(n) $\geq$ f(n)
	-> cn $\geq$ 2n + 10
	-> (c - 2) n $\geq$ 10 -> n $\geq$ 10/(c - 2)
	-> n $\geq$ 10, when c = 3 ie., $n_0$ = 10

**Hence for a positive real number c = 3 and a positive integer $n_0$ = 10, f(n) is O(n)** 
##### Illustration

![[Pasted image 20241016040355.png]]

- The following identities hold for Big Oh notation (for a constant term k):

![[Pasted image 20241016040437.png]]

### Big O Notation: The Change in Growth-Rate

The multiplicative constants or the non-dominating parts in a function have no impact on growth rates. The growth rate for n/2 or 100n or 5n + 3 is the same as n, i.e., O(n) = O(n/2) = O(100n) = O(5n + 3).

![[Pasted image 20241016040517.png]]

![[Pasted image 20241016040533.png]]