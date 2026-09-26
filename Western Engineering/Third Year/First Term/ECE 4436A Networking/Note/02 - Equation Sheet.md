---
source: derived from 02 - The Application Layer
tags: [ECE4436A, Networking, EquationSheet]
---

# Chapter 2 — Equation Sheet

> Companion sheet for [[02 - The Application Layer]]. Symbols: $RTT$ round-trip time · $n$ referenced objects (base HTML excluded) · $F$ bits to move · $R$ link rate · $h$ cache hit rate · $\lambda$ request rate (req/s) · $L$ object size (bits) · $N$ peers · $u_s$ server upload · $u_i$ peer upload · $d_{min}$ slowest peer download.

## Page load time (HTTP)

| Quantity | Formula | Notes |
|---|---|---|
| Transmission | $T_{tx} = \dfrac{F}{R}$ | only term that depends on object size |
| Non-persistent | $T_{np} = 2\,RTT\,(n+1) + T_{tx}$ | 2 RTTs per object: open + request |
| Persistent | $T_p = RTT\,(n+2) + T_{tx}$ | 1 setup, then 1 RTT per object |
| **Saving** | $T_{np} - T_p = n \cdot RTT$ | exactly the $n$ skipped setups |

Negligible transmission ⇒ non-persistent $= 2(n+1)\,RTT$, persistent $= (n+2)\,RTT$.

## Web cache and the access link

$$\rho = \frac{(1-h)\,\lambda L}{R}$$

$$\bar{T} = h \cdot T_{hit} + (1-h)\,\big(RTT_{origin} + T_{access}\big)$$

$\rho \to 1$: the wait explodes (see [[Traffic Intensity]]). A bigger link lowers $\rho$ but never removes $RTT_{origin}$; a cache removes it for every hit.

## File distribution time

$$D_{cs} \ge \max\left\{\frac{NF}{u_s},\ \frac{F}{d_{min}}\right\}$$

$$D_{p2p} \ge \max\left\{\frac{F}{u_s},\ \frac{F}{d_{min}},\ \frac{NF}{u_s + \sum u_i}\right\}$$

Client–server is linear in $N$; P2P flattens toward $F/u$. **Take the largest term.**

## Video and streaming

$$\text{raw rate} = \text{width} \times \text{height} \times \text{bits/pixel} \times \text{fps}$$

$$\text{buffered}(t) = R(t) - P(t) \quad \text{(received − played)}$$

## DNS TTL

$$\text{stale until} = t_{cached} + TTL \quad \text{(not } t_{changed} + TTL\text{)}$$

## Quick worked-number reference

| Scenario | Result |
|---|---|
| 12 kB HTML + 10 × 60 kB, 10 Mb/s, RTT 100 ms | $T_{np} = 2.69$ s · $T_p = 1.69$ s · saves 1.00 s |
| 1 HTML + 10 small objects, RTT 100 ms | 2.2 s → 1.2 s |
| 15 req/s × 100 kbit, 1.54 Mb/s link, no cache | $\rho = 97\%$, ~4.5 s |
| same, 154 Mb/s link | $\rho = 0.97\%$, 2.00 s |
| same, 1.54 Mb/s + cache $h = 0.4$ | $\rho = 58\%$, 1.30 s |
| same, cache $h = 0.6$ | $\rho = 39\%$, ≈0.85 s |
| $u_s = 10u$, $F/u = 1$ h, $N = 30$ | $D_{cs} = 3$ h · $D_{p2p} = 0.75$ h |
| same, $N = 5$ | $D_{p2p} = 20$ min |
| 1920×1080 × 24 bit × 30 fps | ≈1.5 Gb/s raw → ≈15 Mb/s compressed |
| TTL 24 h, cached 9 a.m., changed noon | old answer up to 21 h more |
