>[!Normal Distribution]
>A random variable *X* with probability density function
>$$f(x) = {1 \over \sqrt{2\pi}\sigma}e^{-(x-\mu)^2\over2\sigma^2}\;\;\;\;-\infty < x < \infty$$
>is a **normal random variable** with parameters $\mu$ where $-\infty < \mu < \infty\;and\;\sigma > 0$. Also,
>$$E(X) = \mu \;\;\;and\;\;\; V(X) = \sigma ^2$$
>and the notation $N(\mu, \sigma ^2)$ is used to denote the distribution.

___
### Empirical Rule

For any normal random variable, we have:

$$P(\mu-\sigma<X<\mu+\sigma) = 0.6827$$$$P(\mu-2\sigma<X < \mu +2\sigma) = 0.9545$$
$$P(\mu -3\sigma < X < \mu +3\sigma) = 0.9973$$

![[Pasted image 20240929192131.png]]

>[!Standard Normal Random Variable]
>A normal random variable with
>$$\mu = 0 \;\;and\;\; \sigma^2 = 1$$
>is called a **standard normal random variable** and is denoted as *Z*. The cumulative distribution function of a standard normal random variable is denoted as
>$$\Phi(z) = P(Z \leq z)$$

### Example 4.9 | Standard Normal Distribution

Assume Z is a standard normal random variable.

![[Pasted image 20240929192607.png]]

The column headings refer to the hundredths digit of the values of z.

>[!Standardizing a Normal Random Variable]
>If *X* is a normal random variable with $E(X) = \mu$ and $V(X) = \sigma ^2$, the random variable
>$$Z = {X-\mu \over \sigma}$$
>is a normal random variable with *E(Z) = 0* and *V(Z) = 1*. That is, *Z* is a standard normal random variable.

### Example 4.11 | Normally Distributed Current (a)

Suppose that the current measurements in a strip of wire follow a normal distribution with 
$$\mu = 10\;and\; \sigma ^2 = 4\;mA^2.$$
What is the probability that a measurement exceeds 13 mA?

![[Pasted image 20240929193033.png]]

>[!Standardizing to Calculate a Probability]
>Suppose that *X* is a normal random variable with mean $\mu$ and variance $\sigma^2$. Then,
>$$P(X\leq x) = P ({X-\mu \over \sigma}\leq{x-\mu \over \sigma}) = P(Z \leq z)$$
>where *Z* is a **standard normal random variable**, and $z={(x-\mu)\over \sigma}$ is the **$z$-value** obtained by **standardizing** *X*. The probability is obtained by using Appendix Table III with $z={(x-\mu)\over \sigma}$.

### Example 4.12a | Normally Distributed Current

...Continuing Example 4.11:

What is the probability that a measurement is between 9 and 11 mA?

$$P(9 < X <11) = P({9-10\over 2} < {X-10 \over 2} < {11-10 \over 2})$$
$$=P(-0.5 < Z < 0.5)$$
$$=P(Z < 0.5) - P(Z < -0.5)$$
$$=0.69146-0.30854 = 0.38292$$
### Example 4.12b | Normally Distributed Current

...Continuing Example 4.12: Determine the value *x* for which the probability that a current measurement is less than *x* is 0.98.

![[Pasted image 20240929193946.png]]