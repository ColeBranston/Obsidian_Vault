- Whenever we consider a double integral of some function (integrand) over a region R, the result can be interpreted as the volume between the function and R. If we happen to make the function “unity” (i.e., 1), then we actually get the area of R instead of a volume, which is what we were doing in previous cases. Now let’s do some volume integration cases.
- So let’s consider the following classic type of problem. Problem Statement: Find the volume of the solid bounded by the graphs of:

$$x^2 + y^2 = 4 \tag{1}$$

$$z = \sqrt{9 - x^2 - y^2}\tag{2}$$

$$z = 0\tag{3}$$
So, how do we proceed? We start by trying to visualize the solid bounded by these graphs, and you start that by considering each one on its own. 

Firstly- what does Eqn. 1 represent? If we were just in R2, we would say Eqn. 2 defines a circle of radius 2 in the (x,y) plane. But we’re in R3 now, and so when we’re given Eqn. 2, we have to think about how it “varies” in z. Since it doesn’t depend on z, we realize this is a vertical cylinder of radius 2, centered at (x,y) = (0,0), extending up and down along the z-axis. 

Secondly- what does Eqn. 2 represent? Maybe you can see this right away- this is the upper hemisphere of a spherical shell of radius 3, centered at (x,y,z) = (0,0,0). If you can’t see that yet, let’s rework the expression a bit:

$$x^2 + y^2 = 4\tag{4}$$

$$z = \sqrt{9 - x^2 - y^2}\tag{5}$$

$$z = 0\tag{6}$$


And you can probably see this as a sphere (just the surface of the sphere) in R3 of radius 3 (centered at (0,0,0)). 

Finally, what does Eqn. 3 represent? Well, when we’re working in R3, a single variable equal to a constant is a plane, parallel to the other two variables. So z = 0 is the (x, y) plane, at z = 0. So in this case it is sort of a “floor” cutting through the vertical cylinder, and representing the bottom of the hemisphere. 

When we imagine putting all three graphs on top of each other and asking what region they define, we can see that we have a vertical cylinder (radius 2), bounded on the bottom by the plane z = 0, and “topped” by a spherical cap (just the portion of the hemisphere that intersects the cylinder. The volume is shown in Figures 1 and 2.

![[Pasted image 20250131124517.png]]
**Figure 1: Intersection of the three surfaces (Eqns 1- 3).**

-  Now we’re ready to set-up the integral. We are going to integrate over R in the (x,y)Z

![[Pasted image 20250131124611.png]]
**Figure 2: Final volume we need for this problem.**

plane, so the integrand is the spherical function $z = \sqrt{9-x^2-y^2}$

$$
\text{Volume:} \quad V = \iint_R \sqrt{9 - x^2 - y^2} \, dA
$$
At this point, we haven’t made any “decisions” yet as to whether we’re going to compute this integral in Cartesian or polar coordinates. The problem is circularly symmetric, and it is quite easy to represent the integration area R in polar coordinates. Finally, we’ll see very quickly here that the integrand itself is also amenable to polar coordinates. So we’ll convert the integrand to polar coordinates, and then express R and the associated limits of integration in polar coordinates as well.

Something you need to watch for are $x^2+y^2$ expressions in these integrals. Whenever you have those, you really have $r^2$:

$$
x^2 + y^2 = (r \cos \theta)^2 + (r \sin \theta)^2 = r^2 (\cos^2 \theta + \sin^2 \theta) = r^2
$$

You don’t need to derive it like this while doing problems- if you have x2 + y2, you just represent it as r2. So now return to the volume integral:

$$
V = \iint_R \sqrt{9 - x^2 - y^2} \, dA \tag{9}
$$

$$
= \iint_R \sqrt{9 - (x^2 + y^2)} \, dA \tag{10}
$$

$$
= \iint_R \sqrt{9 - r^2} \, dA \tag{11}
$$

$$
= \int_0^{2\pi} \int_0^2 \sqrt{9 - r^2} \, r \, dr \, d\theta \tag{12}
$$

and we have set the integration order such that we are integrating rr first, then θ. The area is a circle of radius 2 in the (x,y)(x,y) plane, so rr goes from 0 to 2. θ ranges all the way around the circle, from 0 to 2π.

If we let $u=9-r^2$, then $r dr = ({-1\over2})du$

$$
V = \int_{0}^{2\pi} \int_{0}^{2} \left( -\frac{1}{2} \right) \sqrt{u} \, du \, d\theta \tag{13}
$$

$$
= \int_{0}^{2\pi} \left( -\frac{1}{2} \cdot \frac{2}{3} u^{3/2} \right) \Bigg|_{0}^{2} \, d\theta \tag{14}
$$

$$
= \int_{0}^{2\pi} \left( -\frac{1}{3} (9 - r^2)^{3/2} \right) \Bigg|_{0}^{2} \, d\theta \tag{15}
$$

$$
= -\frac{1}{3} \int_{0}^{2\pi} \left( (9 - 4)^{3/2} - 9^{3/2} \right) \, d\theta \tag{16}
$$

$$
= \frac{1}{3} (27 - 5^{3/2}) \int_{0}^{2\pi} \, d\theta \tag{17}
$$

$$
= \frac{2\pi}{3} (27 - 5^{3/2}) \tag{18}
$$

So that was a relatively simple integral. If we had tried to do this in Cartesian coordinates, it would have been a much harder job to get to the same answer.

There something else we could have noticed (and maybe you noticed already). If we return to Eq. 12:

$$
V = \int_{0}^{2\pi} \int_{0}^{2} \sqrt{9 - r^2} \, r \, dr \, d\theta
$$

Notice that the limits of integration for both r and θ are constants. This means that we could have reorganized the integral right off the bat into the product of the r integral and the θ integral. This reorganization also requires that the integrand can be factored into the simple product of a function of r and a separate function of θ. Here the integrand doesn’t depend on θ at all, so we are certainly able to do this:

$$
V = \int_{0}^{2\pi} \int_{0}^{2} \sqrt{9 - r^2} \, r \, dr \, d\theta \tag{20}
$$

$$
= \int_{0}^{2\pi} d\theta \cdot \int_{0}^{2} \sqrt{9 - r^2} \, r \, dr \tag{21}
$$

$$
= 2\pi \int_{0}^{2} \sqrt{9 - r^2} \, r \, dr \tag{22}
$$

We probably should have done that - saves us carrying the θ integral along while we were working out the r integral. You can see that we arrive at the same answer of course.

This immediate separation of the integral into the product of two is also a consequence of “choosing the right coordinate system”. We noticed in Cartesian cases, if the region R was rectangular, we sometimes saw a separation of the double integral into the simple product of two ordinary integrals. Similarly here- a circle would be the polar coordinates equivalent to a square in Cartesian. So, whenever we’re seeing circles in our problems, we’re going to need to think polar coordinates