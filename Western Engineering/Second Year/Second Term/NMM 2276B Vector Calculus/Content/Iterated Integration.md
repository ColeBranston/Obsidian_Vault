- Let’s write what we have been saying above, but using some actual mathematical notation (this may help to clarify this before we move into some examples). 
- If we set-up our double integral as Type-1 (“integrate y away first, then x”), we would write (the nomenclature refers to Figure 2)

$$
\int_{a}^{b} \int_{g_1(x)}^{g_2(x)} f(x, y) \, dy \, dx = \int_{a}^{b} \left( \int_{g_1(x)}^{g_2(x)} f(x, y) \, dy \right) dx
$$

The quantity in brackets, after we execute the integral, will end up being purely a function of x (no y variables will remain). So then we would end up with a final intregral which is just like what we studied last year (just a normal 1D integral over x). Because that final integral is also a definite integral, our final answer will be “just a number”. That’s true for all definite integrals, even in 2D or higher dimensions- when you’re done with a definite integral, you no longer have a function of the variables over which you integrated

If we set-up our double integral as Type-2 (“integrate x away first, then y”), we would write (nomenclature refers to Figure 2):

$$
\int_{c}^{d} \int_{h_1(y)}^{h_2(y)} f(x, y) \, dx \, dy = \int_{c}^{d} \left( \int_{h_1(y)}^{h_2(y)} f(x, y) \, dx \right) dy
$$

- The quantity in brackets, after we execute the integral, will end up being purely a function of y (no x variables will remain). So then we would end up with a final intregral which is just like what we studied last year (just a normal 1D integral over y). Because that final integral is also a definite integral, our final answer will be “just a number”.

- The order of integration cannot matter, so it doesn’t matter which way you set-up a double integral, you have to get the same answer. However, it’s often much easier to do it one way as compared to another. So this is one of those cases where “experience” is going to matter/help, and you just need to practice these. If you are doing a problem and it seems overly difficult right out of the gate, stop and see if maybe you can set it up in the opposite integration order. There are even some problems (Example 2, Section 9.10 of [1]) that cannot be done with one of the approaches and must be converted to the opposite type/order)

**Example:**

This will make way more sense once we run an example! Below is an example of how a typical problem could be stated

- **Evaluate:**

$$\int \int_R xe^{y^2} dA$$
over region R in first quadrant, bounded by y = x2, x = 0, and y = 4.

Figure thing is to try to visualize and sketch the region over which we are integrating. See Figure 4. Let’s first try to integrate out y and then proceed to x (i.e., a Type-1 integration1 In this case then we would have:

$$0 \leq x \leq 2$$
$$x^2 \leq y \leq4$$
And we set-up the double integral:

$$
\iint_R x e^{y^2} \, dA = \int_0^2 \int_{x^2}^4 x e^{y^2} \, dy \, dx
$$

$$
= \int_0^2 x \left( \int_{x^2}^4 e^{y^2} \, dy \right) dx
$$

![[Pasted image 20250127085301.png]]

- and immediately (well, more or less immediately) we run straight into a problem - there is no antiderivative for $e^{y^2}$. So we can't proceed.
- If we ran into this in "real math life" (it's easy to imagine having to do this integral on the spot in real life, right?), we would try to see if the other integration order will help is.
- So now we'll try to integrate away the $x$ variable first, and then proceed to a final $y$ integration.

$$0 \leq y \leq 4$$
$$0 \leq x \leq \sqrt{y}$$

And we set-up the double integral:

$$
\iint_R x e^{y^2} \, dA = \int_0^4 \int_0^{\sqrt{y}} x e^{y^2} \, dx \, dy
$$

$$
= \int_0^4 e^{y^2} \left[ \int_0^{\sqrt{y}} x \, dx \right] \, dy
$$

$$
= \int_0^4 e^{y^2} \left( \frac{x^2}{2} \right) \Bigg|_0^{\sqrt{y}} \, dy
$$

$$
= \int_0^4 e^{y^2} \left( \frac{y}{2} \right) \, dy
$$

$$
= \frac{1}{2} \int_0^4 y e^{y^2} \, dy
$$
Just look at the antiderivative alone for a moment, in order to solve it without the definite integral bounds:

$$I=\int ye^{y^2}dy.$$

Let $u=y^2$, then $du = 2ydy \rightarrow ydy = {1\over 2}du,$ so:

$$
I = \frac{1}{2} \int e^u \, du
$$

$$
= \frac{1}{2} e^u
$$

$$
= \frac{1}{2} e^{y^2}
$$
Therefore:

$$
\frac{1}{2} \int_{0}^{4} y e^{y^2} \, dy = \frac{1}{2} \left( \frac{1}{2} e^{y^2} \right) \Bigg|_{0}^{4} = \frac{1}{4} \left( e^{16} - 1 \right)
$$
So finally we have:

$$\iint_R xe^{y^2} dA = {1\over 4} (e^{16} -1)$$

- So, double integration is only "difficult" in the set-up (this is a recurring theme in this course). The line-by-line execution is all material and methods you have seen before. These problems can get a little long (and as you can image, triple integration is just that much longer, but same basic approach). So these take practice.