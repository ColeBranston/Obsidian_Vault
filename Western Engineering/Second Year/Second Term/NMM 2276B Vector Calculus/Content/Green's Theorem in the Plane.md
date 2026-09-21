- I like to proceed by just stating Green’s Theorem, and then we can pick apart the elements of it (and requirements on the component functions).

**Green's Theorem:** Let $C$ be a piecewise-smooth simple curve bounding a simply connected region $R$. If $P(x,y), Q(x,y), {\partial P \over \partial y} \text{ and }{\partial Q \over \partial x}$are continuous on $R$, then:
$$
\oint_{C_+} [P(x, y) \, dx + Q(x, y) \, dy] = \iint_{R} \left( \frac{\partial Q}{\partial x} - \frac{\partial P}{\partial y} \right) dA \quad (1)
$$

The left-hand side of this equation is a closed line integral, which we will start calling a “closed contour integral”. The form of that integral looks like the dot product of a vector function ⃗ F = Pˆ i+ Qˆ j with d⃗r = dxˆ i+ dyˆ j. We’ve integrated these before. 

There is a new notation on the left side closed line integral- we are writing C+. That is because the sign of a line integral depends on what direction you traverse the line. So for a closed line integral, the sign depends on whether you are going around the integral clock-wise or counter-clockwise. We say that the line integral is in the positive direction if we traverse it counter-clockwise (See Figure 1). The more correct statement is that a closed line integral is evaluated in the positive direction if the region R bounded by C is kept to the “left” while the integral is traversed. So just think about it as if you are walking along the contour, with your head along the positive z direction. If R (which is the “inside” of the closed curve C) is to your left as you walk around C, then you are moving in the positive direction. If you integrated the line integral in the opposite.

![[Pasted image 20250131142333.png]]**Figure 1: The positive direction of integration around a normal closed contour is counter clockwise, while the negative direction is clock-wise.**

direction, you just get the negative of what you would be if you went in the positive direction (just like changing the order of the limits of any definite integral). 

The right-hand-side of (1) is a double integral over R, where R is the region contained within C. So if you define C, you define R. We can compute the double integral in Cartesian coordinates or polar coordinates (or any other way). But however you do it, it will equal the contour integral. 

Notice- the partial derivatives within the RHS double integral are derivatives of the components of the vector function we are integrating for the line integral. So the two sides of the Green’s Theorem are highly related (obviously)

#### Example of Green's Theorem

- Okay, let’s do an initial example. We’ll consider a closed line integral of some vector function, and we’ll calculate it directly as a line integral, and then we’ll do it again using Green’s Theorem (as the double integral from (1)).

- Problem Statement (this particular example is an extended solution of Example 1 from Section 9.12\[1\]:

- **Evaluate**:

$$
\oint_{C_+} \vec{F} \cdot d\vec{r} \quad (2)
$$

$$
\text{for }\vec{F} = (x^2 - y^2) \hat{i} + (2y - x) \hat{j} \quad (3)
$$



- First thing, as always, is to visualize or sketch the contour and integration region. The contour is shown in Figure 2. We have the direction of integration in the clock-wise orientation.

![[Pasted image 20250131142548.png]]
**Figure 2: Contour and integration region for first example.**

Let's get the integral into a format matching Green's Theorem as stated. So \( P(x, y) = (x^2 + y^2) \), \( Q(x, y) = (2y - x) \), \( $\partial P / \partial y = 2y$), and \($\partial Q / \partial x = -1$):

$$
\oint_C \left[ (x^2 - y^2) \, dx + (2y - x) \, dy \right] = \iint_R (2y - 1) \, dA \quad (4)
$$

- Let’s calculate the line integral using Green’s Theorem first, and then we’ll go back and solve it the “old way” (directly as the sum of two line integrals). We’ll see that the double integral is much easier to calculate than the actual line integral. In future problems, we’ll consider cases where one of the two integrals (line integral or double integral) is essentially impossible (or at least very difficult) as compared to the other.

Proceeding with the double integral comprising the RHS of the Green’s Theorem expression in (4)

$$
\iint_R (2y - 1) \, dA = \int_0^1 \int_{x^3}^{x^2} (2y - 1) \, dy \, dx \quad (5)
$$

$$
= \int_0^1 (y^2 - y) \Big|_{x^3}^{x^2} \, dx \quad (6)
$$

$$
= \int_0^1 (x^4 - x^2 - x^6 + x^3) \, dx \quad (7)
$$

$$
= \left( \frac{x^5}{5} - \frac{x^3}{3} - \frac{x^7}{7} + \frac{x^4}{4} \right) \Big|_0^1 \quad (8)
$$

$$
= \frac{1}{5} - \frac{1}{3} - \frac{1}{7} + \frac{1}{4} \quad (9)
$$

$$
= -(\frac{7+3}{21})+(\frac{4+5}{20}) \tag{10}
$$

$$
= -\frac{10}{21} + \frac{9}{20} = \frac{-10 \cdot 20 + 9 \cdot 21}{20 \cdot 21} = \frac{-11}{420} \quad (11)
$$

So that was actually pretty easy.

Before we move on to calculate the line integral directly, let’s take this opportunity to recall something about contour integrals—remember the question/issue of the conservative field. If F⃗ defined in (3) is conservative everywhere within the region containing the contour, then the integral in (2) would have to be zero. Remember that the requirement for F⃗ being conservative is that ∇×F⃗ = 0:

$$
\nabla \times \vec{F} = \nabla \times \left( P \hat{i} + Q \hat{j} \right) \tag{12}
$$

$$
= \begin{vmatrix}
\hat{i} & \hat{j} & \hat{k} \\
\partial_x & \partial_y & \partial_z \\
P & Q & 0
\end{vmatrix} \tag{13}
$$

$$
= (0) \hat{i} - (0) \hat{j} + \left( \frac{\partial Q}{\partial x} - \frac{\partial P}{\partial y} \right) \hat{k} \tag{14}
$$


Look at (14) and compare it to the statement of Green’s theorem in (1). So Green’s theorem is consistent with our previous results regarding conservative vector fields, in that if the vector field we are wanting the closed contour integral of is conservative, Green’s theorem also tells us that the closed contour integral must be zero. Just a quick check for our example vector field in (3) - is it conservative? We actually already know it’s not, because we’ve shown that the closed contour integral is not zero (result shown in (11))! But let’s pretend we didn’t know that and we’ll check if it is.

**Conservative the usual way:**

$$
\left| \begin{array}{ccc}
\hat{i} & \hat{j} & \hat{k} \\
\frac{\partial}{\partial x} & \frac{\partial}{\partial y} & \frac{\partial}{\partial z} \\
(x^2 - y^2) & (2y - x) & 0
\end{array} \right| = 0 \hat{i} - 0 \hat{j} + (-1 + 2y) \hat{k} \neq \vec{0}
$$

So everything's consistent (as you would expect it to be)!

- Now let's calculate the line integral directly, as the sum of the line integration along each leg of the closed contour. Refer back to Figure 2 (I'll reproduce it here). We start.:

![[Pasted image 20250131145403.png]]
**Figure 3: Contour and integration region for first example (repeated).**

with the line integral along $C_1$

$$
I_1 = \int_{C_1} (x^2 - y^2) \, dx + (2y - x) \, dy \quad (16)
$$

$$
\text{The parameterization on } C_1 \text{ is:}
$$

$$
y = x^3, \quad dy = 3x^2 \, dx, \quad 0 \leq x \leq 1 \quad (17)
$$

Substituting the parameterization of (17) into the integral (16) yields:


$$
I_1 = \int_{0}^{1} (x^2 - x^6) \, dx + (2x^3 - x) \, (3x^2 \, dx) \quad (18)
$$

$$
= \int_{0}^{1} (x^2 - x^6 + 6x^5 - 3x^3) \, dx \quad (19)
$$

$$
= \left[ \frac{x^3}{3} - \frac{x^7}{7} + \frac{6x^6}{6} - \frac{3x^4}{4} \right]_{0}^{1} \quad (20)
$$

$$
= \frac{1}{3} - \frac{1}{7} + 1 - \frac{3}{4} = \frac{1}{3} - \frac{1}{7} + \frac{1}{4} \quad (21)
$$

$$
= \frac{7}{21} - \frac{1}{7} + \frac{12}{84} = \frac{49 - 12}{12 \cdot 7} = \frac{49 - 12}{12 \cdot 7} \quad (22)
$$

$$
= \frac{37}{84} \quad (23)
$$

Now we move on to the line integral along $C_2$
$$
I_2 = \int_{C_2} (x^2 - y^2) \, dx + (2y - x) \, dy \quad (24)
$$

$$
\text{On } C_2: y = x^2, \quad dy = 2x \, dx, \quad x \text{ goes from 1 to 0} \quad (25)
$$

Substituting the parameterization of (24) into the integral (23) yields:

$$
I_2 = \int_{1}^{0} (x^2 - x^4) \, dx + (2x^2 - x) \, (2x \, dx) \quad (26)
$$

$$
= \int_{1}^{0} (x^2 - x^4 + 4x^3 - 2x^2) \, dx \quad (27)
$$

$$
= \int_{1}^{0} (-x^2 - x^4 + 4x^3) \, dx \quad (28)
$$

$$
= \left[ -\frac{x^3}{3} - \frac{x^5}{5} + x^4 \right]_{1}^{0} \quad (29)
$$

$$
= \frac{1}{3} + \frac{1}{5} - 1 = \frac{1}{5} - \frac{2}{3} = \frac{3 - 10}{15} \quad (30)
$$

$$
= -\frac{7}{15} \quad (31)
$$
Then the final step is just to add the two definite integrals:

$$
\oint_{C_+} \left[ (x^2 - y^2) \, dx + (2y - x) \, dy \right] = I_1 + I_2 \quad (32)
$$

$$
= \frac{37}{84} - \frac{7}{15} \quad (33)
$$

$$
= \frac{37 \cdot 15 - 7 \cdot 84}{84 \cdot 15} = \frac{555 - 588}{1260} = \frac{-33}{1260} \quad (34)
$$

$$
= \frac{-11}{420} \quad (35)
$$
which is, of course, the same answer we obtained when applying Green’s Theorem and computing the double integral of the perpendicular component of the Curl of the vector field F⃗.

Wait—what did I say in that last sentence? I said “double integral of the Curl of F⃗\vec{F}”?

That’s not what Green’s Theorem (1) says. Or is it?

We had identified $\vec{F}= P \hat{i} + Q \hat{j}$.

Now look at (1) and (12-14):

$$
\oint_{C_+} [P(x, y) \, dx + Q(x, y) \, dy] = \iint_{R} \left( \frac{\partial Q}{\partial x} - \frac{\partial P}{\partial y} \right) dA \quad (36)
$$

$$
\vec{F} \cdot d\vec{r} = (P \hat{i} + Q \hat{j}) \cdot (dx \hat{i} + dy \hat{j}) = P \, dx + Q \, dy \quad (37)
$$

$$
\nabla \times \vec{F} = (0) \hat{i} - (0) \hat{j} + \left( \frac{\partial Q}{\partial x} - \frac{\partial P}{\partial y} \right) \hat{k} \quad (38)
$$

so that means we could write Green’s Theorem as:

$$
\oint_{C_+} \vec{F} \cdot d\vec{r} = \iint_{R} \left( \nabla \times \vec{F} \right)_k dA \quad (39)
$$

for some 2D vector field (i.e. a vector field “in the plane”)

$$\vec{F}=P\hat{i}+Q\hat{j}$$

*So Green’s Theorem is really saying that the closed 2D contour integral C (i.e., a contour that is completely on a 2D plane) of a 2D vector field over that same plane, is equal to the double integral of the perpendicular component of the Curl of that same vector field over the region R contained by C*

That’s a pretty amazing result. We’re going to show (or “realize” is probably a better way to say it) that Green’s Theorem in the plane is a special case of a more general result called “Stoke’s Theorem”. Before we get to Stoke’s theorem, we need to add 3D surface integration to our toolbox. That’s coming next!