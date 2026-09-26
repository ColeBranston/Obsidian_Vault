An **IP address** (Internet Protocol) is handed out by the network you joined and is **meaningful everywhere**.

It is what a [[Router]] forwards on. Contrast [[MAC Address]], which is local to one network. A block of addresses is written like `10.0.9.0/24` — Chapter 4 does the details.

**Chapter 2 additions:** every message carries **two** IP addresses, destination and source. Routers forward on the destination alone; the reply finds its way back using the source.

- IPv4: 32 bits, four decimal bytes (`129.100.4.62`).
- IPv6: 128 bits, eight hex groups (`2606:4700:4700::1111`).

People remember names; routers forward on numbers. Bridging the two is [[DNS]].
