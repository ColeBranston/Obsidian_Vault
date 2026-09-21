
# Capacitors in Electric Circuits

- In circuit diagrams, [[Capacitors]] are represented by one of these symbols:

![[Pasted image 20240127152543.png]]
# Capacitors vs. Batteries

- **Capacitors**: energy is stored directly in an electric field, released by allowing the charges to move. 
	- capable of high current, so high power 
	- rapid re-charging 
	- voltage decreases with discharging 
	- generally used in alternating current (AC) circuits
<br>
- **Batteries:** stored energy is accumulated via chemical reactions that produce a potential difference. 
	- large energy reservoir in a small volume 
	- constant [[Voltage]] over lifetime of discharging 
	- low currents 
	- used in direct-current (DC) circuits

# Combinations of Capacitors

When constructing an electric circuit, we often have to connect [[Capacitors]] together in different ways. The figure shows two capacitors connected across a battery in parallel. What is the equivalent capacitance of this system of two parallel capacitors.

![[Pasted image 20240127152749.png]]

# Combinations of Capacitors: In Parallel

We know that:

$$C_1 = \frac{Q_1}{\Delta V_2}$$
$$C_2 = \frac{Q_2}{\Delta V_2}$$
Since the [[Capacitors]] are connected in parallel, across the same voltage ∆𝑉 from the battery: $\Delta V_1 = \Delta V_2 = \Delta V$, so:


$$C_1 = \frac{Q_1}{\Delta V}$$
$$C_2 = \frac{Q_2}{\Delta V}$$

- The charge on $C_1$ is thus:
$$Q_1 = C_1 \Delta V$$
- and the charge on $C_2$ is:
$$Q_2 = C_2 \Delta V$$
- The total charge on the parallel combination of $C_1$ and $C_2$ $is$ then:

$$Q = Q_1 + Q_2$$
$$=\Delta V(C_1 + C_2)$$

- Total charge on $C_1$ and $C_2$ is:

$$Q = Q_1 + Q_2$$
$$=(C_1 + C_2) \Delta V$$
$$=C_{eq}\Delta V$$
- where $C_{eq}$ is the equivalent overall capacitance of the system.
- Two [[Capacitors]] in parallel are equivalent to a single capacitor with $C_{eq} = C_1 + C_2$

# Combinations of Capacitors: In Series

![[Pasted image 20240127153852.png]]


- For capacitors connected in series $Q_1 = Q_2 = Q$:
- The potential difference across C1 is then:
$$C_2 = \frac{Q_2}{\Delta V_2}$$
and the potential difference across $C_2$ is:

$$\Delta V_2 = \frac{Q}{C_2}$$

- The total potential difference across the combination of $C_1$ and $C_2$ is:

$$\Delta V = \Delta V_1 + \Delta V_2$$
$$ = \frac{Q}{C_1}+\frac{Q}{C_2} = Q(\frac{1}{C_1}+\frac{1}{C_2})$$
$$=\frac{Q}{C_{eq}}$$
where the equivalent capacitance is:
$$\frac{1}{C_{eq}} = (\frac{1}{C_1}+\frac{1}{C_2})$$

# Summary: Series Vs. Parallel

![[Pasted image 20240127154206.png]]

