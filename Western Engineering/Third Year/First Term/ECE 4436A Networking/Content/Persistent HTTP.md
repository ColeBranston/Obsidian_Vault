**Persistent HTTP** (HTTP/1.1) keeps the connection open after an object is delivered and reuses it. It took one header (`Connection: keep-alive`) and a changed default: no new hardware, no new messages.

For a page of 11 objects (1 HTML + 10 images):

| | Non-persistent | Persistent |
|---|---|---|
| Connections opened | 11 | 1 |
| Server state | a record made and destroyed 11× | one record, held a little longer |
| RTTs before last byte | 22 | 12 |

**Load-time formulas** ($n$ referenced objects, $F$ total bits, $R$ link rate):

$$T_{tx} = \frac{F}{R} \qquad T_{np} = 2\,RTT\,(n+1) + T_{tx} \qquad T_p = RTT\,(n+2) + T_{tx}$$

$$T_{np} - T_p = n \cdot RTT$$

**Worked example:** 12 kB HTML + 10 × 60 kB images, 10 Mb/s, RTT 100 ms → $F$ = 4,896 kbit, $T_{tx}$ = 489.6 ms · $T_{np}$ = 2,689.6 ms · $T_p$ = 1,689.6 ms · saving 1.0 s. 82% of the slower time is connections, not content. Larger objects make the two converge; overhead matters most on pages of many small objects.
