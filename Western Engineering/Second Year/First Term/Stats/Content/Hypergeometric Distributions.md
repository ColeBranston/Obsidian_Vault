
>[!Hypergeometric Distribution]
>A set of *N* objects contains
>	*K* objects classified as successes
>	*N* - *K* objects classified as failures
>A sample of size *n* objects is selected randomly (without replacement) from the *N* objects where $K \leq N \;\; and \;\; n \leq N.$
>	the random variable *X* that equals the number of successes in the sample is a **hypergeometric random variable** and 
>$$f(x) = {{{K \choose x}{{N-K}\choose {n-x}}}\over{N \choose n}} \;\;\;\;\;\; x = max \{ 0,n+K-N \}\;to\;min\; \{K,n\}$$

### Example 3.23 | Sampling Without Replacement

- A day’s production of 850 manufactured parts contains 50 parts that do not conform to customer requirements.

- Two parts are selected at random without replacement from the day’s production.

- What is the probability that both parts conform, one part does not conform, and both parts do not conform?

![[Pasted image 20240927010614.png]]

### Example 3.24 a | Parts from Suppliers

- A batch of parts contains 100 parts from a local supplier of circuit boards and 200 parts from a supplier in the next state. 

- If 4 parts are selected randomly, without replacement, what is the probability that they are all from the local supplier?

![[Pasted image 20240927010657.png]]
### Example 3.24 b | Parts From Suppliers

- What is the probability that two or more parts in the sample are from the local supplier?

![[Pasted image 20240927010746.png]]

### 3.24 c | Parts From Suppliers

- What is the probability that at least one part in the sample is from the local supplier?

![[Pasted image 20240927010822.png]]

>[!Hypergeometric Mean & Variance]
>If *X* is a hypergeometric random variable with parameters *N, K,* and *n*, then
>$$\mu = E(X) = np \;\;\;\;\;\; and \;\;\;\;\;\; \sigma ^2 = V(X) = np(1-p){{N-n}\choose {N-1}}$$
>$where\;p = {K\over N}$

