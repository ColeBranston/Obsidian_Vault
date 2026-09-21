
It is a generalization of a geometric distribution in which the random variable is the number of Bernoulli trials required to obtain r successes

>[!Negative Binomial Distribution]
>In a series of Bernoulli trials (independent trails with constant probability *p* of a success),
>the random variable *X* that equals the number of trials until *r* successes occur is a **negative binomial distribution** with parameters 0 < *p* < 1 and r = 1, 2 ,3, ... , and
>$$f(x) = {{x-1}\choose {r-1}}(1-p)^{x-r}p^r \;\;\; x = r,r+1,r+2,...$$

>[!Mean & Variance of Negative Binomial]
>If *X* is a negative binomial random variable with parameters *p* and *r*,
>$$\mu = E(X) = {r\over p}\;\;\; and \;\;\; \sigma^2 = V(X) = {r(1-p)\over p^2}$$

### Example 3.22 | Camera Flashes

- The probability that a camera passes a particular test is 0.8, and the cameras perform independently.

- What is the probability that the third failure is obtained in five or fewer tests?

![[Pasted image 20240927010035.png]]