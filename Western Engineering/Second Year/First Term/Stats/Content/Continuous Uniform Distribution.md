>[!Continuous Uniform Distribution]
>A continuous random variable *X* with probability density function
>$$f(x) = {1 \over {(b-a)}},\;\;\;\;\;\;\;a \leq x \leq b$$
>is a **continuous uniform random variable** 

![[Pasted image 20240929190409.png]]

>[!Mean and Variance]
>If *X* is a continuous uniform random variable over $a \leq x \leq b$,
>$$\mu = E(X) = {a+b \over 2}\;\;and\;\; \sigma ^2 = V(X) = {{b-a}^2\over 12}$$

$$E(X) = \int^{b}_{a} {x\over{b-a}}dx = {0.5x^2\over b-a}|^b _a = {(a+b)\over 2}$$
$$V(X) = \int^{b}_{a} {{(x - {a+b\over2})^2}\over b-a}dx = {{(x-{(a+b)\over2})^3}\over 3(b-a)} | ^b _a = {(b-a)^2\over 12}$$
### Example 4.7 | Uniform Current

The rv X has a continuous uniform distribution on  \[4.9, 5.1]. The probability density function of X is f(x) = 5 when 4.9 ≤ x ≤ 5.1. What is the probability that a measurement of current is between 4.95 and 5.0 mA?
$$P(4.95 < x < 5.0) = \int^{5.0}_{4.95}f(x)dx = 5(0.05) = 0.25$$

The mean and variance formulas can be applied with a = 4.9 and b = 5.1. Therefore,

$$\mu = E(X) = 5\;mA\;and\;V(X)={(0.2)^2\over 12}= 0.0033\;mA^2$$

