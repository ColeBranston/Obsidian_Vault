![[Pasted image 20240115094417.png]]
![[Pasted image 20240115094444.png]]![[Pasted image 20240115094457.png]]![[Pasted image 20240115094558.png]]
![[Pasted image 20240115094609.png]]![[Pasted image 20240115094627.png]]
![[Pasted image 20240115094646.png]]

**Field due to a plane of charge method 2: Integrating over concentric rings**

- The field on the axis of a ring of charge is $E_{ring} = \frac{kxQ}{(x^2 + a^2)^\frac{3}{2}} x$
- Now imagine our plane to be made up of an infinite number of rings of radius a and width da. $\sigma = \frac{Q}{2 \pi a(da)}$
- The surface charge density is so $Q = 2\pi \sigma ada$

![[Pasted image 20240115095603.png]]

- The field on the axis of a ring of charge is then
- We get the field due to the whole plane by integrating this expression over all rings of radius a, with *a* ranging from 0 to infinity.

$$E_{ring} = \frac{kx2 \pi \sigma ada}{(x^2 + a^2)^ \frac{3}{2}}$$
- We get the field due to the whole plane by integrating this expression over all rings of radius a, with a ranging from 0 to infinity.

$$E_{plane} = \int _0 ^\infty E_{ring} da$$
$$= \int _0 ^ \infty \frac{2 \pi \sigma kxa}{(x^2 + a^2)^\frac{3}{2}} da x$$
$$= 2\pi \sigma kx \int _0 ^\infty \frac{a}{(x^2 + a^2) ^\frac{3}{2}} dax$$
$$= 2\pi \sigma kx [\frac{-1}{\sqrt{x^2 + a^2}}] ^{a=\infty} _{a=0} x$$
$$=2\pi \sigma kx [0+\frac{1}{x}]$$
$$=2\pi k\sigma$$ ...Same result we got before.

![[Pasted image 20240115100703.png]]