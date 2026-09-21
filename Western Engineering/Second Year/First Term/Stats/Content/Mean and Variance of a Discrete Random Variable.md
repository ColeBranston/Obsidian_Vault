- Used to summarize a [[Probability Distribution]]

![[Mean]]

![[Variance]]

### Example 3.7 | Digital Channel

- *X* is **the number of bits received in error in the next 4 transmitted**.
- The probabilities are shown in the table in the *f(x)* column.
- Use the table to calculate the [[Mean]] and [[Variance]].

![[Pasted image 20240917230435.png]]

**Answer:**

![[Pasted image 20240917230504.png]]

![[Pasted image 20240917230513.png]]

### Expected Value of a Function of a Discrete [[Random Variable]]

- If *X* is a discrete random variable with probability mass function *f(x)*

$$E[h(X)] = \sum _x h(x)f(x)$$
- The **variance** can be considered as an expected value of a specific function of *X*, namely, of the function:
$$h(X) = (X-\mu)^2$$

### Example 3.9 | Digital Channel

- *X* is **the number of bits received in error of the next 4 transmitted.**
- What is the expected value of the square of the number of bits in error?
- $h(x) = x^2$

$$E[h(x)]=0^2 \times0.6561 + 1^2 \times0.2916 + 2^2 \times 0.0486 +3^2 \times0.0036 +4^2 \times 0.0001 = 0.52$$
