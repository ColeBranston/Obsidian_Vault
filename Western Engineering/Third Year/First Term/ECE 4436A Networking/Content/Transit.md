**Transit** is the paid service of carrying a customer's traffic onward to networks the provider does not own. It is charged per bit.

```mermaid
flowchart LR
  C["customers"] -->|"ACCESS — connecting you to its network"| ISP["your ISP<br/>its own links and routers"]
  ISP -->|"TRANSIT — carrying your traffic onward"| REST["every other network<br/>the rest of the Internet"]
  C -.->|"you pay your ISP"| ISP
  ISP -.->|"your ISP pays the network beyond it"| REST
```
*Access is the connection; transit is the onward carriage. Every ISP therefore stands in one of three relationships to any other — **customer**, **supplier** or **[[Peering|peer]]**.*

**Why not a full mesh instead?** Connecting every network to every other cannot scale: $N$ networks need $\dfrac{N(N-1)}{2}$ links.

```mermaid
flowchart TD
  N1((1)) --- N2((2))
  N1 --- N3((3))
  N1 --- N4((4))
  N1 --- N5((5))
  N2 --- N3
  N2 --- N4
  N2 --- N5
  N3 --- N4
  N3 --- N5
  N4 --- N5
```
*Five networks already need ten links, and every new one has to reach every existing one. A thousand networks would need half a million — nobody builds that and nobody could pay for it, so the hierarchy of [[Internet Service Provider|ISPs]] exists instead, with [[Peering]] as the local shortcut.*
