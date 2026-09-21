>[!Normal Approximation to the Binomial Distribution]
>If *X* is a binomial random variable with parameters *n* and *p*,
>$$Z={X-np \over \sqrt{np(1-p)}}$$
>is approximately a standard normal random variable. To approximate a binomial probability with a normal distribution, a **continuity correction** is applied as follows:
>$$P(X \leq x) = P(X \leq x + 0.5) \approx P(Z \leq {x+0.5 - np \over \sqrt{np(1-p)}})$$
>and
>$$P(x \leq X) = P(x-0.5 \leq X) \approx P({x-0.5-np \over \sqrt{np(1-p)}} \leq Z)$$
>The approximation is good for np > 5 and *n(1-p) > 5*

___
### Example 4.14

If 16 million bits are transmitted and the probability of one error is 10^(-5), what is the probability that at most 150 errors occur?

$$P(X \leq 150) = P(X \leq 150.5)$$
$$=P({X-160\over\sqrt{160(1-10^{-5})}} \leq {150.5 - 160 \over \sqrt{160(1-10^{-5})}})$$
$$\approx P(Z \leq -0.75) = 0.227$$

**Practical interpretation:**  Binomial probabilities that are difficult to compute exactly can be approximated with easy-to-compute probabilities based on the normal distribution.

>[!Normal Approximation to the Poisson Distribution]
>If *X* is a Poisson random variable  with $E(X) = \lambda\;and\;V(X) = \lambda$,
>$$Z = {X-\lambda \over \sqrt{\lambda}}$$
>is approximately a standard normal random variable. The same continuity correction used for the binomial distribution can also be applied. The approximation is good for 
>$$\lambda > 5$$

### Example

Assume that the number of asbestos particles in a squared meter of dust on a surface follows a Poisson distribution with a mean of 1000.

If a square meter of dust is analyzed, what is the probability that 950 or fewer particles are found?

$$P(X \leq 950) = \sum ^{950} _{x=0} {e^{-1000} 1000^x \over x!}$$

	The probability can be approximated as...

$$P(X \leq 950) = P(X \leq 950.5)$$
$$\approx P(Z \leq {950.5-1000\over \sqrt{1000}})$$
$$=P(Z\leq -1.57) = 0.058$$
