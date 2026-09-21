
# Energy Stored In a Capacitor

- Let’s move a small amount of charge dQ from one plate to the other, when the potential difference between the plates is V. Potential difference is [[Work]] per unit charge, so the work done is:

$$dW = VdQ$$
- Changing the charge on the plates changes the potential difference. Since *Q = CV*, 

$$dQ = CdV$$
- Then: $$dW = CVdV$$
- Let’s start with uncharged plates, so V = 0 initially. The work required to charge the plates to a potential difference is V is then:

$$W = \int dW = \int ^V_0 CVdV$$
$$=\frac{1}{2}CV^2$$

- This [[Work]] is stored in the capacitor as its potential energy *U*.

# Energy Density in a Capacitor

- When we charge a capacitor from 0 to V , we do $\frac{1}{2}CV^2$ worth of work.
- That work is stored as potential energy in the capacitor. 
- Where exactly is that energy? In the electric field. 
- To extract the energy we discharge the capacitor by reducing the charge on the plates. This decreases the electric field. 
- We get the energy out via an electric current, which we will discuss soon.

<br>
- Energy density of the electric field:

$$u = \frac{U}{\Omega}$$
- where Ω = 𝐴𝑑 is used to denote **volume** here (instead of V, which we now use for both potential (V ) and unit [volts]).
- For a parallel-plate capacitor of area A, distance d between plates:
$$u = \frac{U}{\Omega} = \frac{1}{2}\frac{CV^2}{Ad}$$
- but, $C = \epsilon_0 \frac{A}{d}$ and $V = Ed$, so...

$$u = \frac{U}{\Omega} = \frac{1}{2}\frac{\epsilon_0 \frac{A}{d}(Ed)^2}{Ad} = \frac{1}{2}\epsilon _0 E^2$$
![[Pasted image 20240124230240.png]]
# Energy Density in a Capacitor = Energy Density in General

$$u=\frac{U}{\Omega} = \frac{1}{2}\epsilon_0 E^2$$
- This formula is generally true for the energy density of an electric field, regardless of whether it is within a parallel plate capacitor.

# Capacitors: Dielectrics, Breakdown Field

![[Dielectrics]]

# Working Voltage of a Capacitor

- If the electric field between the capacitor plates is too high, the dielectric will break down. 
- It will discharge directly in the space between the [[Conductors]] via an electric arc. 
- A broken down (“bad”) capacitor can no longer be used to store energy: 
	- it acts as a short circuit

- **The “breakdown field” is the maximum sustainable electric field before the dielectric breaks down.** 
- This sets the “working [[Voltage]]” of the capacitor – maximum safe potential difference between the plates.

# If Dielectrics Reduce the Energy Density in a Capacitor, why used them?

- Stored energy decreases to: 
$$U = \frac{1}{2}CV^2 = \frac{1}{2}kC_0(\frac{V_0}{k})^2= \frac{U_0}{k}$$

- But let’s compare the maximum energy that can be stored in [[Capacitors]] of the same geometry, but one air-filled ($k_1 = 1.0, E_{1 max} =3 MV/m$), and the other filled with polystyrene ($k_2 = 2.6, E_{2max} = 25 MN/m$).

**If [[Dielectrics]] reduce the energy density in a capacitor, why used them?**

- Stored energy decreases to:
$$U = \frac{1}{2}CV^2 = \frac{1}{2}kC_0(\frac{V_0}{k})^2 = \frac{U_0}{k}$$
- But let’s compare the maximum energy that can be stored in capacitors of the same geometry, but one air-filled ($k_1 = 1.0, E_{1 max} =3 MV/m$), and the other filled with polystyrene ($k_2 = 2.6, E_{2max} = 25 MN/m$).

$$C = kC_0 = \frac{k\epsilon_0 A}{d} \text{ and } V_{max}=E_{max}d$$

$$\frac{U_1}{U_2} = \frac{C_1V_1^2}{C_2V_2^2} = \frac{\frac{k_1\epsilon_0A}{d}}{\frac{k_2\epsilon_0A}{d}}\frac{(E_{1max}d)^2}{(E_{2max}d)^2}=\frac{k_1}{k_2}\frac{E_{1max}^2}{E_{2max}^2} =\frac{1.0}{2.6}\frac{(3 MV/m)^2}{(25 MV/m)^2}=0.0055$$

# Dielectrics Allow Larger Energy Storage at the Same or Higher Voltage

→ **So, the dielectric-filled capacitor can store 1/0.0055 = 180 x more energy than an air-filled capacitor**
- Higher κ → higher C → more energy storage **at a given V**.


