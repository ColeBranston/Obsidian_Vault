**IP** (Internet Protocol) moves **limited-size data packets** (**datagrams**) between machines. Delivery is **best-effort, not guaranteed** — reliability is left to [[Transmission Control Protocol|TCP]] above it. Machines are identified by **IP addresses** (e.g. `165.193.130.107`), and IP handles **routing** over whatever physical network sits underneath (e.g. Ethernet).

Every device on a network — PC, laptop, router, phone, server, printer — has its own IP address, which you can look up with `ipconfig` (Windows) or in a device's network settings. Some are public (`142.108.149.36`), others are from [[Private Address Space]] (`192.168.123.254`, `10.238.28.131`).

**Notation:**

| Version | Address size | Written as | Example |
|---|---|---|---|
| **IPv4** | 32 bits → 2³² addresses | four 8-bit components, decimal, `.`-separated | `192.168.123.254` |
| **IPv6** | 128 bits → 2¹²⁸ addresses | eight 16-bit components, hex, `:`-separated | `3fae:7a10:4545:9:291:e8ff:fe21:37ca` |

IPv6 **compressed form**: a run of zero groups collapses to `::` — `FF01:0:0:0:0:0:0:43` is written `FF01::43`.

See also [[IP Address]] from ECE 4436A.
