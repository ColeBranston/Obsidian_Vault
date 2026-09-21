
**Find the electric field from the potential**

- We know that:
$$\Delta V = \int E \cdot ds$$
- Consider the potential difference *dV* between two points on the x axis that are very close together (distance dx apart):

$$\therefore dv = -E_x dx \text{\;\;\; and\;\; } E_x = -\frac{dV}{dx}$$
- We can do the same for separations in the y and z directions.

$$E = -(\frac{dV}{dx},\frac{dV}{dy},\frac{dV}{dz}) = -(\frac{dV}{dx}i,\frac{dV}{dy}j,\frac{dV}{dz}k)$$

- That is the $E_x$ component of the electric field is given by the negative derivative of the potential *V* with respect to x, (so, $E_x - \frac{dV}{dx}$) and so on.

- We should really use partial derivatives, since V is a function of x, y and z

$$E = -(\frac{\partial V}{\partial x}i+\frac{\partial V}{\partial y}j+\frac{\partial V}{\partial z}k)$$

- The result is a vector 𝑬 that is perpendicular to the equipotential surface.
- We can write this concisely in terms of [[The Gradient Operator]] ∇:

$$E = -∇V$$
# The Gradient Operator ∇
![[The Gradient Operator]]

# Finding the Electric Field From the Potential: Summary
  
1. Have: V(x,y,x) or V(r, $\theta$, $\phi$): for Cartesian / Spherical coordinates, respectively.
2. Need: $E = E_xi+E_yj +E_zk$ or $E = E_rr+E_\theta \theta + E_\phi \phi$
3. Use $E = -∇V$, and calculate the partial derivatives along the unit vectors
	- In Cartesian coordinates: 
		- $E = -∇V = -(\frac{\partial V}{\partial x}i+\frac{\partial V}{\partial y}j+\frac{\partial V}{\partial z}k) = E_xi+E_yj +E_zk$
	- In Spherical coordinates:
		- $E = -∇V = -(\frac{\partial}{\partial r}r + \frac{1}{r}\frac{\partial}{\partial \theta}\theta + \frac{1}{rsin \theta}\frac{\partial}{\partial \phi}\phi ) = E_rr+E_\theta \theta + E_\phi \phi$

# From Electric Field of Electric Potential and Vice Versa: Summary

- We get the electric potential from the electric field by integration:
$$V_{ab} = -\int _a ^b E \cdot ds$$
- We get the electric field from the potential by differentiation: 
	- (shown here for Cartesian coordinates)

$$E = (-\frac{\partial V}{\partial x},-\frac{\partial V}{\partial y},-\frac{\partial V}{\partial z})$$
# Potential of a Charged Rod: Derivation

- We divide the rod into infinitely small segments dx. 
- We treat each small segment as a point charge *dq* and calculate the electric potential *dV* at P due to each segment. 
- To get the total potential V we integrate over all these small contributions.
![[Pasted image 20240121124552.png]]

- Let 𝜆 = 𝑄/𝑙 be the charge per unit length along the rod. Then 
$$𝑑𝑞 = 𝜆𝑑𝑥 $$
- The electric potential at point P due to the small segment dx is:

$$dV = k\frac{dq}{x}=k\lambda\frac{dx}{x}$$
- where x is the distance from P to the segment dx

- We obtain the potential V by integrating dV over the length of the rod

$$V = \int dV = l\lambda\int_{x=1} ^{x=a+l} \frac{dx}{x}$$
- **Note**:
$$\int ^ {l+a} _a \frac{dx}{x} = ln x|^{l+a} _a$$
$$=ln(l+a)-lna$$
$$=ln(\frac{l+a}{a})$$

- So, 

$$V = k\lambda(ln\frac{l+a}{a}) = \frac{kQ}{l} (ln\frac{l+a}{a})$$

**How to Get the Electric Field from the Potential?**

- $E = -∇V = -(\frac{\partial}{\partial r}r + \frac{1}{r}\frac{\partial}{\partial \theta}\theta + \frac{1}{rsin \theta}\frac{\partial}{\partial \phi}\phi )$
- Given the symmetry of the problem, we know that 𝐸 has a component only along the x axis.
- So, we need only $E_x = -\frac{\partial V}{\partial x}$
- The distance between the end of the rod and point P is 𝑎. The electric potential and field at P depend on that distance, and 𝜕𝑥 = −𝜕𝑎.
<br>
- In general $\frac{dlnt}{dt}=\frac{1}{t}$, so:

$E_x = \frac{kQ}{l} \frac{\partial}{\partial a}(ln\frac{l+a}{a}) = \frac{kQ}{l}\frac{\partial}{\partial a}(ln(l+a)-lna) = \frac{kQ}{l}(\frac{1}{l+1} - \frac{1}{a}) = \frac{kQ}{l} \frac{-l}{l(l+a)} = -\frac{kQ}{a(l+a)}$

- So,

$$E = \frac{kQ}{a(l+a)}l, \text{as we had already derived.}$$
