Packets of $L$ bits arrive at an average rate of $a$ per second, so work arrives at $La$ bits per second; the link sends $R$ bits per second. **Traffic intensity** is the ratio:

$$I = \frac{La}{R}$$

0 on an idle link, 1 when arrivals exactly match what the link can send.

| $I$ | What happens |
|---|---|
| Well below 1 | Bursts are absorbed; queueing is negligible |
| Approaching 1 | Waits multiply — arrivals are irregular, so bursts build a backlog and raising $I$ removes the gaps it drained into |
| At / above 1 | The queue never drains; the wait stops growing and the surplus is **discarded** instead |

The wait is **bounded by the buffer**: 20 slots × 1.20 ms = 24 ms is the longest wait there is, no matter how overloaded the link gets. Past that you get [[Packet Loss]], not more [[Queueing Delay]].

> [!note] Design rule
> $I > 1$ is not a design you can fix with a bigger buffer — a bigger buffer only converts loss into latency.

**The shape of the curve**, for a link sending 833 pkt/s with a 20-packet buffer:

| $I = La/R$ | Regime | Queueing delay | Loss |
|---|---|---|---|
| 0 → ~0.5 | bursts absorbed | ≈ 0 | 0% |
| ~0.5 → 0.9 | waits multiplied | rises steeply — 10.8 ms at $I = 0.9$ | 0% |
| → 1.0 | at capacity | flattens at the buffer ceiling | starts |
| > 1.0 | past capacity | **bounded** at 20 × 1.20 ms = **24 ms** | climbs with $I$ |

*Arrivals are irregular, so bursts build a backlog that drains in the gaps behind them; raising $I$ removes the gaps. But a backlog cannot exceed the buffer, so **the wait stops growing and the loss starts** — past capacity the queue never drains and the surplus is discarded instead. See [[Packet Loss]].*
