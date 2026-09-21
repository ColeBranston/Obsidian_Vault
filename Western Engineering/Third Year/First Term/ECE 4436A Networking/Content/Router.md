A **router** joins **DIFFERENT** [[Network]]s, forwarding by [[IP Address]] and choosing the path.

Forwarding decision: **IP**. It does two jobs on completely different timescales — [[Forwarding]] (local, per packet, microseconds) and [[Routing]] (global, rare).

> [!tip] The dividing question
> *Does it forward traffic for others, and if so, on which address?* Same home network → the [[Switch]] delivers it on MAC. Different network → the router does an IP lookup and picks a next hop.
