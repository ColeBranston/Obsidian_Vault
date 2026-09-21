- We know that the difference in potential energies of a charge q between two points in an electric field is

$$U_B - U_A = \Delta U = - \int^B _A F \cdot ds= -q\int ^B _A E \cdot ds$$
- Since $F = qE$, and $\Delta U = q \Delta V$, then
$$V_B - V_A = \Delta V= - \int ^B _A E \cdot ds$$
- The potential difference between two points is obtained by integrating the electric field along a path between the two points. 
- Because the [[Electric Force]] is conservative, the choice of path does not matter

![[Pasted image 20240119130827.png]]

**Potential difference in an electric field example: parallel plates**

- Let’s look at the potential between two infinite parallel conducting plates separated by a distance ℓ. 
- By symmetry, the electric field of an infinite plate points perpendicularly out from the plate (if it is positively charged) or into it (if it is negatively charged). 
- We saw before that the field of an infinite plane of charge was constant
![[Pasted image 20240119130909.png]]

The potential difference between the plates can be calculated from: 

$$\Delta V = - \int ^{right} _{left} E \cdot ds$$
where 𝑑𝑠⃗ points along a path from the left plate to the right plate.

We choose a straight path perpendicular to the plates. Then the field 𝐸 is always parallel to the path 𝑑𝑠⃗ and:

$$\Delta V = - \int ^{right} _{left} E \cdot ds = E \int ^{right} _{left} ds = El$$

The potential difference between the two plates is:
$$\Delta V = El$$
Turning this around, the electric field strength is:
$$E = \frac{\Delta V}{l}$$
and the field points from the high potential plate to the low potential plate.

# Doing the inverse problem: finding the electric field from the potential

- We saw that to find the potential difference between two points we integrate the electric field along a path between the two points

$$(V_B - V_A) = -\int ^B _A E \cdot ds$$
- How do we go the other way? Suppose we know the potential and want to find the field. What do we do? 
- Since integration is the opposite of differentiation, we have to differentiate the potential. But we need an answer that is a vector
