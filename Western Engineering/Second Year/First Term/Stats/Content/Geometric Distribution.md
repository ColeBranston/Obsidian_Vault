Binomial distribution has:
- Fixed number of trials
- Random number of successes

Geometric distribution has reversed roles
- Random number of trials
- Fixed number of successes, in this case 1

>[!Geometric Distribution]
>In a series of Bernoulli trials (independant trials with constant probability *p* of a success), the random variable *X* that equals the number of trials until the first sucess is a **geometric random variable** with paramter 0 < *p* < 1 and 
>$$f(x) = (1-p)^{x-1}p\;\;\;\;\;x=1,2,...$$

### Example 3.18 | Wafer Contamination

-  The probability that a wafer contains a large particle of contamination  is 0.01. 

- Assume that the wafers are independent. 

- What is the probability that exactly 125 wafers  need to be analyzed before a particle is detected?

![[Pasted image 20240927004526.png]]

>[!Geometric Mean and Variance]
>If *X* is a geometric random variable with parameter *p*,
>$$\mu = E(X) = {{1}\over {p}} \;\;\; and \;\;\; \sigma ^2 = V(X) = {{(1-p)}\over {p^2}}$$

### Example 3.19 | Mean and Standard Deviation

- Consider the transmission of bits.

- The probability that a bit transmitted through a digital transmission channel is received in error is p=0.1.

- Assume that the transmissions are independent events.

- Let the random variable X denote the number of bits transmitted until the first error.

- Find the mean and standard deviation.

$\therefore$

Mean:
$$\mu = E(X) = {1\over p} = {1\over 0.1} = 10$$
Variance:
$$\sigma ^2 = V(X) = {(1-p)\over p^2} = {0.9\over 0.01}= 90$$
Standard Deviation:
$$\sqrt{90} = 9.49$$

![[Lack of Memory Property]]