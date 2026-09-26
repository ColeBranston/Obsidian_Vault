Each HTTP version since 1.0 finds a queue and removes it.

| Version | Year | Change | Remaining problem |
|---|---|---|---|
| HTTP/1.0 | 1996 | one connection per object | two RTTs per object; setups thrown away |
| HTTP/1.1 | 1997 | connection kept open ([[Persistent HTTP]]) | responses must return in order, so a slow one blocks those behind it (pipelining disabled in practice) |
| **HTTP/2** | 2015 | many independent **streams** share one connection; responses may interleave | underlying [[TCP]] is one ordered byte stream, so one lost packet stalls every stream |
| **HTTP/3** | 2022 | same streams over [[UDP]] via **QUIC**; ordering and retransmission done per stream | the app now implements reliability itself |

> [!note] Why the Web left TCP
> Not because it stopped wanting reliability, but because it wanted reliability per stream rather than for everything at once.
