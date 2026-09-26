**UDP** (User Datagram Protocol) is the minimal, best-effort transport: datagrams may be lost, duplicated, or reordered. No setup, no pacing, no reaction to congestion. It is a different service from [[TCP]], not a lesser grade of it.

**Why choose it (four structural reasons):**
1. **No connection to open.** A lookup is 2 messages over UDP vs 9 over TCP (handshake + teardown). Chosen when the exchange is shorter than the handshake.
2. **Nothing waits for a retransmission.** TCP holds later data until a lost piece is repaired; in live audio the repair arrives too late. Chosen when **late is worse than missing**.
3. **It doesn't reduce its rate** under congestion. Useful for apps that must hold a rate, and the reason too much of it harms everyone.
4. **Reliability is added only where needed.** An app on UDP adds just the parts it wants, e.g. QUIC ([[HTTP 2 and HTTP 3|HTTP/3]]) recovers each stream separately.

**Used by:** [[DNS]] · voice/video calls (RTP · SIP) · games (proprietary) · HTTP/3 over QUIC.

> [!note] Transport is a judgment, not a property
> The Web ran over TCP, then over UDP 25 years later. The choice reflects which of the [[Transport Service Requirements]] matters most, and it can be revisited.
