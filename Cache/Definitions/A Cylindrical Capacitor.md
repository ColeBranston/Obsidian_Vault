- Capacitors also exist in geometries other than parallel plates. 
- Consider a cylindrical capacitor of two concentric cylinders of length ℓ. 
- The inner cylinder has charge +Q 
- The outer cylinder has charge −Q

![[Pasted image 20240124003045.png]]

- To get the capacitance, we need to calculate the potential difference ∆𝑉 between the two cylinders.

# Derivation of Capacitance

The potential difference between the two cylinders is:

$$\Delta V = V_a - V_b = -\int ^a_b E \cdot ds = \int_a ^bE \cdot ds$$

- But what is E?
- To calculate the electric field we assume that: 
<br>
	- The cylinders are long enough that we can neglect end effects, i.e., ℓ ≫ 𝑎 and b.
	- The charge is uniformly distributed along the length of the cylinders 
<br>
- The electric field is then directed radially outwards from the axis of the cylinders, and its magnitude depends only on the distance from the axis.

![[Pasted image 20240124003424.png]]

- We already know enough to calculate the field between the cylinders! 
- The inner cylinder is just a line of charge, with linear charge density 
$$\lambda = \frac{Q}{l}$$
- The field due to this line charge points outward and has magnitude

$$E = \frac{2k\lambda}{r} = \frac{\lambda}{2\pi\epsilon_0 r}$$
- Now remember that the field inside a charged conductor is zero…
- … so if the inner conductor was not there, the field inside the outer cylinder would be zero.

The total field is the sum of the field due to the inner conductor and the field due to the outer conductor (which is zero). Adding these two contributions together, we find that the electric field between the two parallel cylinders is radially outwards with a magnitude:

$$E=\frac{2k\lambda}{r}$$

- The (absolute value of) the potential difference is then:

$$\Delta V = \int _a ^b E \cdot ds$$
- where we integrate along a radial path from the inner conductor to the outer conductor.
<br>
$$\Delta V = \int _a ^b E \cdot ds$$
$$=\int ^b _a Edr$$

$$\Delta V=\int_a ^b (\frac{2k\lambda}{r})dr$$
$$=2k\lambda \int_a ^b \frac{dr}{r}$$
$$=2k\lambda ln(\frac{b}{a})$$
$$=\frac{2kQ}{l}ln(\frac{b}{a})$$


# A Cylindrical Capacitor: Capacitance

- The potential difference between the two cylinders is given by;
$$\Delta V = \frac{2kQ}{l}ln(b+a)$$
- The capacitance of the two concentric cylinders is given by:
$$C = \frac{Q}{\Delta V}$$
$$=\frac{l}{2kln(\frac{b}{a})}$$

![[Pasted image 20240124004329.png]]