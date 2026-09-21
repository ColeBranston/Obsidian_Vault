---
source: derived from 01 - Computer Networks and the Internet
tags: [ECE4436A, Networking, EquationSheet]
---

# Chapter 1 — Equation Sheet

> Companion sheet for [[01 - Computer Networks and the Internet]]. Symbols: $L$ packet length (bits) · $R$ link rate (bits/s) · $d$ distance (m) · $s$ signal speed (m/s) · $N$ packets already queued · $a$ arrival rate (pkt/s).

## Delay at one hop

| Delay | Formula | Notes |
|---|---|---|
| Processing | — (given, µs) | Independent of $L$, $R$. Header check + lookup only |
| Queueing | $d_{queue} = N \times \dfrac{L}{R}$ | Only term that changes with load |
| Transmission | $d_{trans} = \dfrac{L}{R}$ | Independent of distance |
| Propagation | $d_{prop} = \dfrac{d}{s}$ | Independent of $L$, $R$. Fiber $s \approx 2\times10^8$ m/s ≈ 200 km/ms |
| **Nodal (total)** | $d_{nodal} = d_{proc}+d_{queue}+d_{trans}+d_{prop}$ | Sum of all four |

## End-to-end (multi-hop) delay

$$d_{\text{end-to-end}} = \sum d_{trans} + \sum d_{prop} \quad \big(+\, d_{proc},\, d_{queue}\ \text{per node}\big)$$

Store-and-forward ⇒ **transmission delay is paid once per link**, not once total.

## Traffic intensity

$$I = \frac{La}{R}$$

- $I < 1$: queue can drain · $I \to 1$: waits multiply · $I \ge 1$: queue never drains, excess is **lost**, not delayed further
- Max wait is bounded by buffer size (e.g. 20 slots × $L/R$)

## Throughput

- Average: $\text{throughput} = \dfrac{F}{T}$ ($F$ = file size in bits, $T$ = time)
- Path-limited by the **bottleneck link**:

$$\text{throughput} = \min\{R_1, R_2, \dots, R_n\}$$

## Multiplexing capacity (TDM/FDM)

$$\text{users supported} = \frac{\text{link rate}}{\text{slot/band rate}}$$

e.g. 1 Mb/s link ÷ 100 kb/s slots = 10 users (fixed at setup regardless of activity).

## Units

$$1\ s = 10^3\ \text{ms} = 10^6\ \mu s = 10^9\ \text{ns}$$

bits ÷ (bits/s) → seconds → ×1000 for ms.

## Quick worked-number reference (from the note's examples)

| Scenario | Result |
|---|---|
| 1,500 B pkt, 10 Mb/s, 600 km, N=3, 20 µs proc | $d_{nodal} = 7.82$ ms |
| 1,500 B pkt across 3 links (100/10/50 Mb/s, idle) | end-to-end = 9.56 ms |
| 4 MB file, server 2 Mb/s, access 1 Mb/s | $T = 32$ s (bottleneck = access link) |
| 1 Mb/s link, 100 kb/s TDM slots, 10% active users | 10 users, link busy ~10% of time |
