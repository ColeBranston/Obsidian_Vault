>[!Mean and Variance]
>Suppose that *X* is a continuous random variable with probability density function *f(x)*. The **mean** or **expected value** of *X*, denoted as $\mu$ or *E(X)*, is
>$$\mu = E(X) = \int^{\infty}_{-\infty}xf(x)dx$$
>The **variance** of *X*, denoted as V(X) or $\sigma ^2$, is
>$$\sigma ^2 = V(X) = \int^{\infty}_{-\infty}(x-\mu)^2f(x)dx = \int^{\infty}_{-\infty}x^2f(x)dx-\mu ^2$$
>The **standard deviation** of *X* is $\sigma = \sqrt{\sigma ^2}$

### Example 4.5 | Electric Current

For the cooper current measurement in Example 4.1, the mean of *X* is

$$E(X) = \int^{5.1}_{4.9}xf(x)dx = {5x^2 \over 2}|^{5.1}_{4.9} = 5$$

The variance of ***X*** is
$$E(X) = \int^{5.1}_{4.9}(x-5)^2f(x)dx ={{5(x-5)^3}\over {3}} |^{5.1}_{4.9} = 0.0033$$

>[!Expected Value of a Function of a Continuous Random Variable]
>If *X* is a continuous random variable with probability density function *f(x)*,
>$$E[h(X)] = \int^{\infty}_{-\infty}h(x)f(x)dx$$

### Example 4.6

X is the current measured in mA. What is the expected value of power when the resistance is 100 ohms? Use the result that power in watts P =10^(-6) RI2, where I is the current in milliamperes and R is the resistance in ohms. Now, h(X)= 10^(-6) 100 X2. Therefore,
$$E[h(X)] = 10^{-4}\int^{5.1}_{4.9}5x^2dx=0.0001{x^3\over 3}|^{5.1}_{4.9} = 0.0025\;watts$$
