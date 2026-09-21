**TDM** gives each user the **whole link, for a repeating slice of time** — the link is cut crosswise.

Where you meet it: digital telephone networks · T1/E1 carriers · 4G/5G scheduling.

Like [[Frequency-Division Multiplexing]], it reserves capacity in advance ([[Circuit Switching]]): a silent user's slot goes empty and cannot be lent out.

> [!question] Worked example
> A 1 Mb/s link divided into 100 kb/s slots admits $1{,}000{,}000 / 100{,}000 = 10$ users, and that division is fixed at setup. If each user is active only 10% of the time, the link carries data about **10% of the time** — nine tenths of it is reserved and idle. That waste is the whole case for [[Packet Switching]].

**Cut crosswise — everything, briefly.** A user owns a *column*:

| freq ↑ | t1 | t2 | t3 | t4 | t5 | t6 | t7 | t8 |
|---|---|---|---|---|---|---|---|---|
| **whole link** | 1 | 2 | 3 | 4 | 1 | 2 | — | 4 |

*Same four-by-eight grid as [[Frequency-Division Multiplexing]]; only the direction of the cut differs. Both hand you a quarter of the link, and neither can lend your quarter out while you are silent — user 3's empty slot at t7 is reserved and idle.*
