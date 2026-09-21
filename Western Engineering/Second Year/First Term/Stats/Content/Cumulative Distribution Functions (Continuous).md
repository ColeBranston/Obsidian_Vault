>[!Cumulative Distribution]
>The **cumulative distribution function** of a continuous random variable *X* is
>$$F(x) = P(X\leq x) = \int^{x}_{-\infty}f(u)du$$
>for $-\infty < x < \infty$

### Example 4.3 | Electric Current

For the copper wire current measurement in Example 4.1, the cdf of X is as follows:

![[Pasted image 20240927013524.png]]

>[!Probability Density Function from the Cumulative Distribution Function]
>Given *F*(x),
>$$f(x) = {{dF(x)}\over {dx}}$$
>as long as the derivative exists.

### Example 4.4 | Reaction Time

- The time until a chemical reaction is complete (in milliseconds) is approximated by this cumulative distribution function:

$$
F(x) = 
\begin{cases} 
0 & \text{for } x < 0 \\
1-e^{-0.01x} & \text{for } x \leq 0 
\end{cases}
$$

- What is the probability density function?

$$
f(x) = {dF(x)\over{dx}} = {d\over dx}
\begin{cases} 
0 &  \\
1-e^{-0.01x}  
\end{cases}
=
\begin{cases}
0 &\text{for } x <0\\
0.01e^{-0.01x} &\text{for } 0 \leq x
\end{cases}
$$

- What is the probability that a reaction completes within 200 ms?

$$P(X < 200) = F(200) = 1-e^{-2} = 0.8647$$

