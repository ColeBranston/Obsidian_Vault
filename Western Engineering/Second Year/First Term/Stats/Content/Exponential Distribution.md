>[!Exponential Distribution]
>The random variable *X* that equals the distance between successive events from a Poisson process with mean number of events $\lambda > 0$ per unit interval is an **exponential random variable** with parameter $\lambda$. The probability density function of *X* is
>$$f(x) = \lambda e^{-\lambda x}\;\;\;for\;\;\;0 \leq x < \infty$$

>[!Mean and Variance]
>If the random variable *X* has an exponential distribution with parameter $\lambda$,
>$$\mu = E(X) = {1\over \lambda} \;\;\;and\;\;\; \sigma ^2 = V(X) = {1\over \lambda^2}$$

___
### Example 4.17a | Computer Usage

In a large corporate computer network, user log-ons to the system can be modeled as a Poisson process with a mean of 25 log-ons per hour.

What is the probability that there are no log-ons in the next 6 minutes (0.1 hour)?

Let X denote the time in hours from the start of the interval until the first log-on.

$$P(X > 0.1) \int^{\infty}_{0.1} 25e^{-25x}dx = e^{-25(0.1)} = 0.082$$

The cumulative distribution function also can be used to obtain the same result as follows

$$P(X > 0.1) = 1-F(0.1) = 0.082$$
### Example 4.17b | Computer Usage 

What is the probability that the time until the next log on is between 2 and 3 minutes ?

$$P(0.033 < X < 0.05) = \int^{0.05}_{0.033}25e^{-25x}dx$$
$$=-e^{-25x} |^{0.05} _{0.033} = 0.152$$

	An alternative solution is...

$$P(0.033 < X < 0.05) = F(0.05) - F(0.033) = 0.152$$

What is the interval of time such that the probability that no log-on occurs during the interval is 0.90?

$$P(X > x) = e^{-25x} = 0.9, -25x = ln(0.9)$$
$$x= {-0.10536 \over -25} = 0.00421\;hour = 0.25\;minute$$

What is the mean and standard deviation of the time until the next log-in?

$$\mu = {1\over \lambda} = {1\over 25} = 0.04\;hour = 2.4\;minutes$$
$$\sigma = {1\over \lambda} = {1\over 25} = 0.04\;hour = 2.4\;minutes$$

**Practical interpretation:** Organizations make wide use of probabilities for exponential random variables to evaluate resources and staffing levels to meet customer service needs.

>[!Lack of Memory Property]
>For an exponential random variable *X*,
>$$P(X < t_1 + t_2 | X> t_1) = P(X < t_2)$$

**Note:** The exponential distribution is the only continuous distribution with this property.

### Example 4.18 | Lack of Memory Property

Let X denote the time between detections of a particle with a Geiger counter. Assume X has an exponential distribution with E(X) = 1.4 minutes.

What is the probability that we detect a particle within 0.5 minute of starting the counter?

$$P(X < 0.5) = F(0.5) = 1-e^{-0.5\over 1.4} = 0.30$$

What is the probability that a particle is detected in the next 30 seconds after waiting 3 min?

$$P(X < 3.5 | X>3) = {P(3 < X < 3.5) \over P(X > 3)} = {F(3.5) - F(3) \over 1-F(3)} = {0.035\over 0.117} = 0.30$$

**Practical Interpretation:** After waiting for 3 minutes without a detection, the probability of a detection in the next 30 seconds is the same as the probability of a detection in the 30 seconds immediately after starting the counter. The fact that we have waited 3 minutes without a detection does not change the probability of a detection in the next 30 seconds.