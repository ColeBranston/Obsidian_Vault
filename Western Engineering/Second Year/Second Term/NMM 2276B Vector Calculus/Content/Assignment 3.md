___
# 1.

1. (Problem 5, Section 9.11 of textbook.) Find the volume of the solid bounded by the graphs of the given equations: 

$$ \text{One petal of r} = 5cos(3θ), z = 0, z = 4. $$

| $\theta$     | r($\theta$) |
| ------------ | ----------- |
| $-\pi\over2$ | 4.983       |
| $-\pi\over3$ | 4.992       |
| $-\pi\over4$ | 4.996       |
| $-\pi\over6$ | 4.998       |
| 0            | 5           |
| $\pi\over6$  | 4.998       |
| $\pi\over4$  | 4.996       |
| $\pi\over3$  | 4.992       |
| $\pi\over2$  | 4.983       |
![[Pasted image 20250224142309.png]]

$\therefore$ The one complete cycle is between $-\pi\over 6$ and $\pi\over 6$ rad

$$4\int_{-\pi\over6}^{\pi\over6}\int^{5cos(3\theta)}_0 rdrd\theta$$
 $$ = \frac{25\pi}{3} $$
___

<br>
<br>
<br><br>
<br>
<br>
<br>
<br>

# 2.
  
  2. (Problem 8, Section 9.12 of textbook.) Use Green’s theorem to evaluate the given line integral.$\oint_C(x−3y)dx+(4x+y)dy$,where C is the rectangle with vertices (-2,0), (3,0), (3,2), (-2,2).
  
  Green's theorem states that $$ \oint_C Pdx + Qdy = \int\int_A \bigg (\frac{\partial Q}{\partial x} - \frac{\partial P}{\partial y} \bigg)dA $$ Thus, we can do $$ \int_0^2 \int_{-2}^3 7 dxdy $$ $$ 7 \int_0^2 \int_{-2}^3 dxdy $$ $$ 7\int_0^2 5dy $$ $$ = 7 \cdot 10 $$ $$ = 70 $$
___

<br><br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

# 3.

3. (Problem 26, Section 9.12 of textbook.) Evaluate the given line integral. (Hint: review Example 6 from Section 12- this has been provided as an additional solved problem in the Week 5 section of OWL.)

$$
\oint_{C} \frac{-y}{(x+1)^2 + 4y^2} \, dx + \frac{x+1}{(x+1)^2 + 4y^2} \, dy, \quad \text{where } C \text{ is the circle } x^2 + y^2 = 16.
$$
##### Step 1: Parameterizing the Circle

The given contour CCC is the circle x2+y2=16x^2 + y^2 = 16x2+y2=16. Using the standard parametrization:

x=4cos⁡t,y=4sin⁡t,where t∈[0,2π].x = $4\cos t, \quad y = 4\sin t$, 


Differentiating:

$dx=−4sin⁡t dt,dy=4cos⁡t dt.dx = -4\sin t \, dt, \quad dy = 4\cos t \, dt.dx=−4sintdt,dy=4costdt.$

##### Step 2: Substituting in the Integral

The given integral is:

$$\oint_C−y(x+1)2+4y2 dx+x+1(x+1)2+4y2 dy$$$$\oint_C \frac{-y}{(x+1)^2 + 4y^2} \, dx + \frac{x+1}{(x+1)^2 + 4y^2} dy$$$$\oint_C​(x+1)2+4y2−y​dx+(x+1)2+4y2x+1​dy.$$

Substituting $x=4cos⁡tx = 4\cos tx=4cost \;and\; y=4sin⁡ty = 4\sin ty=4sint:$

$$(x+1)2+4y2=(4cos⁡t+1)2+4(16sin⁡2t)$$
$$(x+1)^2 + 4y^2$$ $$= (4\cos t + 1)^2 + 4(16\sin^2 t)$$
$$(x+1)2+4y2=(4cost+1)2+4(16sin2t).$$

Thus,

$$(x+1)2+4y2=16cos⁡2t+8cos⁡t+1+64sin⁡2t$$
$$(x+1)^2 + 4y^2 = 16\cos^2 t + 8\cos t + 1 + 64\sin^2 t$$
$$(x+1)2+4y2=16cos2t+8cost+1+64sin2t$$


Since $cos⁡2t+sin⁡2t=1\cos^2 t + \sin^2 t = 1cos2t+sin2t=1$, we simplify:

$$(x+1)2+4y2=16+8cos⁡t+64=80+8cos⁡t$$$$(x+1)^2 + 4y^2 = 16 + 8\cos t + 64 = 80 + 8\cos $$$$(x+1)2+4y2=16+8cost+64=80+8cost$$

Now, compute $PdxP$ $dxPdx$ and $QdyQ$ $dyQdy$:

4. $$Pdx=−4sin⁡t80+8cos⁡t(−4sin⁡t dt)=16sin⁡2t80+8cos⁡t dtP dx = \frac{-4\sin t}{80 + 8\cos t} (-4\sin t \, dt) = \frac{16\sin^2 t}{80 + 8\cos t} \, dtPdx=80+8cost−4sint​(−4sintdt)=80+8cost16sin2t​dt$$
5. $$Qdy=4cos⁡t+180+8cos⁡t(4cos⁡t dt)=16cos⁡2t+4cos⁡t80+8cos⁡t dtQ dy = \frac{4\cos t + 1}{80 + 8\cos t} (4\cos t \, dt) = \frac{16\cos^2 t + 4\cos t}{80 + 8\cos t} \, dtQdy=80+8cost4cost+1​(4costdt)=80+8cost16cos2t+4cost​dt$$

Thus, the integral simplifies to:

##### Step 3: Recognizing a Residue Integral

Using substitution

$$cos⁡t=z+z−12,dt=dziz.\cos t = \frac{z + z^{-1}}{2}, \quad dt = \frac{dz}{iz}.cost=2z+z−1​,dt=izdz​.$$

Rewriting and solving using contour integration (residue theorem) gives:

$$\oint_Cf(z) dz$$$$=2πi×(\text{Residue at singularity inside ∣z∣=1})$$

Evaluating this carefully gives:

$$=2π$$

___
<br>
<br><br>
<br>
<p style="font-size: 36px; color: yellow;">4.</p>

4. 
(Problem 32, Section 9.13 of textbook.) Find the flux of the vector field ⃗ F through the given surface. Assume the surface is oriented upward.

$$
\vec{F} = -x^3 y \hat{i} + y z^3 \hat{j} + x y^3 \hat{k}
$$


With S that portion of the plane z = x+3 in the first octant and within the cylinder x2+y2 = 2x

$$x^2+y^2=2x \rightarrow x^2-2x+y^2 = 0$$
Completing the square you get...

$$(x-1)^2+y^2=1$$

This represents a **circle of radius 1 centered at (1,0)** in the first octant.

**Next, find the Normal Vector**

Since ***S*** is given by $z=x+3$, we express it as a position vector:

$$r(x,y)=(x,y,x+3)$$
The normal vector to this surface is:

$$N=(-{\partial z\over\partial x}, -{\partial z\over \partial y}, 1)$$
Since $z=x+3$, we compute:

$${\partial z \over \partial x}=1\text{ , } {\partial z \over \partial y} = 0$$

Thus:

$$N=(-1,0,1)$$

The **differential surface element** is:

$$dS=|N|dA=\sqrt{2} dA$$

**Compute the Flux Integral**

Flux is given by:

$$\iint_S F\cdot dS$$
since $dS=NdS$, we compute:

$$F\cdot N=(-x^3y, yz^3, xy^3)\cdot(-1,0,1)$$
$$=x^3y+xy^3$$

Thus, the flux integral simplifies to:

$$\iint_R (x^3y + xy^3)\sqrt{2}dA$$
where ***R*** is the region bounded by $(x-1)^2+y^2\leq1$ in the first octant.

**Using Polar Coordinates:**

$$x=1+rcos\theta, y=rsin\theta, \text{where } 0\leq r\leq 1 \text{ and } 0\leq \theta \leq{\pi\over 2}$$
Convert $x^3y+xy^3$:

$$
1. \;\;x^3 y = (1 + r \cos \theta)^3 (r \sin \theta)
$$

$$
2.\;\;x y^3 = (1 + r \cos \theta) (r \sin \theta)^3
$$
The area element is:

$$dA=rdrd\theta$$

So, the integral becomes:

$$\sqrt{2}\int_0^{\pi\over 2}\int_0^1 ((1+rcos\theta)^3rsin\theta+(1+rcos\theta)rsin^3\theta)rdrd\theta$$
$$\therefore Flux={\sqrt{2}\pi\over16}$$

