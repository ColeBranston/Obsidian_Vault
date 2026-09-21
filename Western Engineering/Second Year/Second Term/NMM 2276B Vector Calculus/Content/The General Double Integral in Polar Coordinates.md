
- The general double integral is independent of coordinate system:

$$V=\iint_R FdA$$
When we choose a coordinate system in which to represent the integration process, we then explicitly write the functional dependence of F and we write dA in the coordinate system of choice. In the Cartesian coordinate system, dA = dxdy because the element over which we are defining a contribution to the integral is a small rectangle in (x,y). 

- Now we encounter the first major difference in higher dimensional integration in non Cartesian coordinate systems: the dA area element will in general be a more complicated function of the non-Cartesian variables:

$$
V = \iint_{R} F \, dA = \iint_{R} F(r, \theta) \, r \, dr \, d\theta
$$
$$\text{ie. }dA=rdrd\theta$$
- So what does it mean, or why is it, that dA is itself a function of r (as opposed to just being drdθ)? Consider Figure 2. Because the actual area of dA is dependent on r (the further dA is from the origin, the larger dA gets even for the same dr and dθ), we have to represent this as a linear dependence of dA on r.

![[Pasted image 20250131105218.png]]
**Figure 2: The area element dA in polar coordinates gets larger the larger the distance r from the origin**

- We can look at the integration process over a region R as represented in Figure 3. As we did in Cartesian double integrals, we have to remember: we are not “integrating R”, we are integrating some function defined “over R”. So R is the domain of integration (the region over which we are integrating) and the integrand (separate from R) is what is actually being summed. If we think of the integrand as lying over top of the region R, then the integral is interpreted as the volume under the integrand and over R.

![[Pasted image 20250131105248.png]]
**Figure 3: The area element dA in polar coordinates gets larger the larger the distance r from the origin.**

- Just as we had in the Cartesian case, we can differentiate two “flavours” of double integral in polar coordinates. There are cases where we’ll want to or have to integrate “over” r first, then θ, and there are other cases where we’ll want to do the opposite (integrate over θ first, then r). For a majority of integrals, the choice won’t matter, but one may be significantly easier to execute than the other. 

- Figures 4 and 5 depict the two different approaches. In the case of Figure 4, we would want to integrate with respect to r first, then θ. In the case depicted in Figure 5, we would want to integrate with respect to θ first, then r

![[Pasted image 20250131105322.png]]**Figure 4: The region over which we are integrating is defined by constant values of θ, and the r limits are some functions of θ. This is akin to the Type-1 region we briefly talked about in Cartesian double integration.**

In the situation depicted in Figure 4, the double integral would become:

$$
\iint_R f(r, \theta) \, dA = \int_\alpha^\beta \int_{g_1(\theta)}^{g_2(\theta)} f(r, \theta) \, r \, dr \, d\theta \tag{8}
$$

$$
= \int_\alpha^\beta \left( \int_{g_1(\theta)}^{g_2(\theta)} r f(r, \theta) \, dr \right) d\theta \tag{9}
$$

![[Pasted image 20250131105510.png]]**Figure 5: The region over which we are integrating is defined by constant values of r, and the θ limits are some functions of r. This is akin to the Type-2 region we briefly talked about in Cartesian double integration.**

	Eq. 11 is maybe a bit of a strange way to write this, but I’m trying to emphasize that it’s θ first, and r second (so I’ve pulled out as much explicit r dependency from the innermost integral). And remember also- these are definite integrals, so the final answer is not a function of either r or θ- it has to be a constant (at least a constant with respect to (r,θ)).

**Example:**

The simplest type of problem would be to use double integration to calculate the area within a polar curve. So in this case we think of the integrand as just one, and we integrate over the region to obtain the area.

- Problem statement:

	Use a double integral in polar coordinates to find the area of the region bounded by the graph(s) of the given equation(s):

$$r = 2+cos\theta$$
Okay- so the first thing is always to visualize (sketch or table or something) the region R over which we are integrating. In this case, we seek the area of this region R.

Now the polar curve in Eq. 12 is actually hard to sketch without a table. So here goes: 

![[Pasted image 20250131105723.png]]

![[Pasted image 20250131105732.png]]**Figure 6: Polar curve represented in Eq. 12 and the data in the above table.**

The sketch of this curve is shown in Figure 6. It's close to a circle, but it is actually not a circle (it is asymmetrically "compressed" horizontally, and more from the4 left side than the right side). I believe this curve is sometimes called a "cardioid". I know a true cardioid would have a form $r=a(1+sin\theta)$ (there are other variations, but for example the polar curve [1] section 9.11, problem 1 is a cardioid). I would refer you to section 8.5 of [2] for a more detailed discussion of various "common" polar curves.

After all that work though, the resulting integration plan is pretty straight forward.

$$
A = \iint_R r \, dr \, d\theta \tag{13}
$$

$$
= \int_{-\pi}^{\pi} \int_{0}^{2 + \cos \theta} r \, dr \, d\theta \tag{14}
$$

$$
= 2 \int_{0}^{\pi} \int_{0}^{2 + \cos \theta} r \, dr \, d\theta \tag{15}
$$

Where we have used the symmetry around  $\overset{+}{-}\theta$ for the final "outside" $\theta$ integral. Proceeding into the nitty gritty of it all now:

$$
A = 2 \int_{0}^{\pi} \left( \frac{r^2}{2} \right)^{1 + \cos \theta} d\theta 
$$

$$
= \int_{0}^{\pi} (2 + \cos \theta)^2 d\theta 
$$

$$
= \int_{0}^{\pi} (4 + 4 \cos \theta + \cos^2 \theta) d\theta 
$$

$$
= \int_{0}^{\pi} \left( 4 + 4 \cos \theta + \frac{1}{2} (1 + \cos 2\theta) \right) d\theta 
$$

$$
= \int_{0}^{\pi} \left( \frac{9}{2} + 4 \cos \theta + \frac{1}{2} \cos 2\theta \right) d\theta 
$$

$$
= \left( \frac{9}{2} \theta + 4 \sin \theta + \frac{1}{4} \sin 2\theta \right) \bigg|_{0}^{\pi} 
$$

$$
= \frac{9\pi}{2} + 4 \sin \pi + \frac{1}{4} \sin 2\pi 
$$

$$
= \frac{9\pi}{2}
$$

We can actually take a shot and see if this makes sense for the area of this curve. If we look at Figure 6, we can see that this curve is just a bit larger than a circle of radius 2 (extends +/- 2 along x, and a teeny bit more than that along y). The area of a circle of radius 2 would be 4π. Here we obtained 4.5π, so that makes a lot of sense.