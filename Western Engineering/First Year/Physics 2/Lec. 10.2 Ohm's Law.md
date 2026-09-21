# Microscopic Current

- We want to obtain a description of current in terms of microscopic properties, and from this build up macroscopic laws for currents. 
- We first consider how to express current in terms of the properties of the charge carriers (typically electrons).

# Temperature in a Solid

![[Pasted image 20240129105617.png]]

# Thermal Velocity
![[Thermal Velocity]]
# Drift Velocity

![[Drift Velocity]]

# A Microscopic Description

![[Pasted image 20240129111335.png]]

- Consider wire:
	- *n* charge carriers per unit volume, each with charge *q*.
	- They move through the wire with average velocity $v_d$
- How much charge ∆𝑄 passes through a cross-sectional area 𝐴 in a time interval ∆𝑡?
- In time ∆𝑡, charge moves a distance:
$$\Delta x = v_d \Delta t$$
- So all carriers in a volume: A ∆𝑥 will pass through 𝐴 in time ∆𝑡. 
- The number of charges in this volume is: 
$$\Delta N = (Av_d \Delta t)n$$
- where n is the number of charges per unit volume.
- With a charge q on each carrier, the total charge ΔQ passing through A is:

$$\Delta Q = q\Delta N$$
$$\Delta Q = q(v_d \Delta t A)n$$
- Thus, the current is:
$$I=\frac{\Delta Q}{\Delta t} = \frac{qnv_d A \Delta t}{\Delta t}$$
$$I=qnv_d A$$
# Current Revisited

$$I = qnv_d A$$

- Since $v_d$ is proportional to E: $v_d = \frac{qE}{m}\tau$, 
- we can write the current in terms of the electric field in the wire: $I = \frac{q^2 n \tau}{m} AE$
- Current depends on properties of the substance for a given temperature and this factor is called *the conductivity (𝜎)* of the material: I = 𝜎𝐴𝐸 
	- It depends on 𝑞, 𝑛 and the frequency of the electron’s collisions. 
	- Note: Do not confuse the conductivity with the surface charge density which also uses symbol 𝜎


# Ohm's Law

- This relationship between the current and the electric field is called Ohm’s Law:
$$I=\sigma AE$$
# Resistivity

![[Resistivity]]

# Resistance & Ohm's Law

![[Pasted image 20240129131256.png]]
- Consider a wire of length 𝑙 and cross-sectional area 𝐴. 
- Apply a potential difference between the two ends. 
- This generates a (uniform) electric field 𝐸 along the wire with magnitude:

$$E = \frac{\Delta V}{l}$$
- The total current I through the wire is then:

$$I = \sigma AE = \frac{\sigma A \Delta V}{l}$$
- Rearranging, we find:

$$\Delta V = I(\frac{l}{\sigma A})$$
- Recall that the resistivity $\rho=\frac{1}{\sigma}$, we then define the *resistance (R)* as:
$$R=\frac{l}{\sigma A} = \frac{\rho l}{A}$$
- So that the relationship between I and $\Delta V$ becomes:

$$\Delta V = IR$$

- The relationship between the applied voltage and the current 𝐼 is the more familiar form of Ohm’s Law:
$$\Delta V = IR\;\;\;\;I=\frac{\Delta V}{R}$$
- The quantities in this form are easier to measure, so it’s more directly useful. 
- Note that 𝐼 and Δ𝑉 are defined over fairly large regions – 𝐼 is averaged over the length of the wire – so this is the macroscopic version of Ohm’s Law.

# Water Flow Analogy

![[Pasted image 20240129132051.png]]

- Water pressure caused by the height of the water : Δ𝑉 
- Flow of water : 𝐼 
- The restriction of the water flow caused by the pipe : 𝑅 
	- Making the pipe longer (increasing 𝑙): makes water flow harder (increases 𝑅) 
	- Making the pipe wider (increasing 𝐴): makes water flow easier (decreases 𝑅) (Recall 𝑅 ∝ ௟ $\frac{1}{A}$)

![[Pasted image 20240129132109.png]]

# Ohm's Law: Two Versions

**Microscopic:** 

$$I = qnv_d = \sigma A E$$
**Macroscopic:**

$$V=IR$$

# Resistance & Ohm’s Law

![[Pasted image 20240129132313.png]]

- Ohm’s law: excellent description of conductors as long as electric field is not too strong and as long as 𝑅 remains constant. 
- Resistance in a metal: due to collisions between the conduction electrons and other electrons, lattice defects, etc. As temperature increases, these collisions become more frequent. Thus, the resistance of a metal increases as 𝑇 increases.
- Units of resistance are 𝑉/𝐴 or Ohms, indicated by Ω.

