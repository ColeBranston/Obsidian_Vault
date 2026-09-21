**Throughput** is the rate at which bits are actually **delivered to the receiver**, measured across the whole path. It is not the rate of any one link: $R$ describes a single hop, throughput describes the journey.

Two quantities share the name:
- **Instantaneous** — the rate right now, in bits/s. It wanders, because arrivals are lumpy
- **Average** — $\dfrac{F}{T}$, a file of $F$ bits that took $T$ seconds. This is what a download reports, and what characterizes the path rather than any instant on it

What a path delivers is set by its [[Bottleneck Link]].

```mermaid
flowchart LR
  Y["you"] -->|"100 Mb/s"| A["·"]
  A -->|"1 Mb/s"| B["·"]
  B -->|"100 Mb/s"| S["server"]
```
*A path whose links run at 100, 1 and 100 Mb/s does not deliver 100 Mb/s. The **instantaneous** rate jags around as arrivals arrive lumpily; the **average** settles at 1.00 Mb/s, the rate of the narrowest link.*
