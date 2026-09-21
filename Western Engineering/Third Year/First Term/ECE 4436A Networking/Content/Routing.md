**Routing** is **global**: deciding what goes in every router's forwarding table. It runs rarely, on a timescale of **seconds to minutes**.

No single router chooses an end-to-end path. Each computes its own table, and together they agree — which is why breaking a link changes the path everywhere without anyone being in charge.

Same box, two jobs: [[Forwarding]] is local and per-packet; routing is global and rare.
