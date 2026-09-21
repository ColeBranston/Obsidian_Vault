- This technique involves solving a difficult problem by transforming it into a better-known problem for which we have (hopefully) asymptotically optimal algorithms. (eg. Find the value for sqrt(256))

	- Any recursive solution can be considered as an example of Reduction where, the base case is the known solution to the problem. Example: factorial of 1 is 1, which can be a base case for recursively solving for factorial n (n being an integer greater than 1).

	- In reduction algorithm, the goal is to find an algorithm whose complexity is not dominated by the resulting reduced algorithm.

	- For example, one selection algorithm for finding the median in an unsorted list involves first sorting the list (the expensive portion) and then pulling out the middle element from the sorted list (the cheap portion). This technique is also known as **transform and conquer**.

**Note:** **Induction** is a general case of reduction. Eg. for example: $1^3 + 2^3 +3^3 +...+n^3 = ({n(n+1)\over 2})^2$

