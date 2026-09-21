
- This is really not very different from what we did in the above example, but I suppose the point here is if we have an integral already set-up for Cartesian double integration, but we have reason to think it could be more easily done in polar, there is a means to move from one to the other

The process is not much of a recipe though. Really what we do is discern the shape/extent of the integration region R from the limits of integration already set up. Then we essentially start the problem over again, now configuring the region as a polar coordinate integration. Let’s look at a relatively simple example

- Problem Statement (this particular example is Example 2 from Section 9.11\[1\]: Use polar coordinates to evaluate:

$$
I = \int_{0}^{2} \int_{x}^{\sqrt{8-x^2}} \frac{1}{5 + x^2 + y^2} \, dy \, dx \tag{23}
$$

Okay-so this integral is full of $(x^2+y^2)$ type of forms, so the polar coordinate approach certainly makes sense. The key is to figure out what R is based on the limits for x and y.

If we were to restate the limits of integration back into the curves that intersect to define the region, we would say that the region R is defined as the region bounded by:

$$
x = 0
$$

$$
x = 2
$$

$$
y = x
$$

$$
\text{circle of radius } \sqrt{8} \text{ centered at origin}
$$

As we’ll see in a moment, the bounding line x = 2 is not actually necessary. So let’s draw these and see what we have. See Figure below. We would probably draw the circle first, because that’s easy to understand. Then we would draw the line y = x which cuts the circle in two. Then we note that x = 0 is also a bounding line (vertical line- really the y-axis). So those three lines actually define the slice of the circle over which we are to integrate. So now, let’s just assume we are starting the problem over.

![[Pasted image 20250131132106.png]]
**Figure3: Integration region for example. (Figure taken from Section 9.11 of \[1\]).**

again, now seeing the region R, and wanting to use polar coordinates. We don’t even have to be told to use polar - it’s pretty obvious that’s the way to do this. So our integral now becomes (in polar coordinates

$$
I = \int_{\pi/4}^{\pi/2} \int_{0}^{\sqrt{8}} \frac{1}{5 + r^2} \, r \, dr \, d\theta \quad \tag{25}
$$

$$
= \int_{\pi/4}^{\pi/2} d\theta \cdot \int_{0}^{\sqrt{8}} \frac{r}{5 + r^2} \, dr \quad \tag{26}
$$

$$
= \left( \frac{\pi}{2} - \frac{\pi}{4} \right) \cdot \int_{r=0}^{r=\sqrt{8}} \frac{1}{2} \frac{1}{u} \, du \quad \tag{27}
$$

$$
= \left( \frac{\pi}{4} \right) \cdot \left. \frac{1}{2} \ln u \right|_{r=0}^{r=\sqrt{8}} \quad \tag{28}
$$

$$
= \left( \frac{\pi}{4} \right) \cdot \left. \frac{1}{2} \ln (5 + r^2) \right|_{0}^{\sqrt{8}} \quad \tag{29}
$$

$$
= \frac{\pi}{8} \left( \ln (5 + 8) - \ln 5 \right) \quad \tag{30}
$$

$$
= \frac{\pi}{8} \ln \left( \frac{13}{5} \right) \quad \tag{31}
$$

And we did a couple things in that integration. First, we pulled the entire θ\theta integration out front and executed it first (this is another example where the double integral reduces to a product of the two 1-D integrals).

Second, I ran the substitution method through the middle of the process (often I like to separately write and solve the anti-derivative and then substitute it back into the primary definite integral). When you do what I did above, it’s good practice to specifically note in the limits of integration that it is r=8r = \sqrt{8} for example. And don’t forget basic rules(!!) such as ln⁡A+ln⁡B=ln⁡(A⋅B)\ln A + \ln B = \ln (A \cdot B) and ln⁡(AB)=ln⁡A−ln⁡B