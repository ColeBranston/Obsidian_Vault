A **network** is a set of **devices** joined by **links**, together with the **rules** they follow, such that any device can exchange data with any other.

All three parts are required:
- Devices with no link cannot reach each other
- A link with no agreed [[Protocol]] carries signals neither end can interpret

> [!tip] The definition is the whole test
> A laptop and a printer on one Ethernet cable speaking IP *are* a network — but not part of [[The Internet]], because nothing joins them to a second network.

```mermaid
flowchart LR
  subgraph net["One network — any device can reach any other"]
    L["laptop"] --- SW["switch"]
    P["phone"] --- SW
    D["desktop"] --- SW
  end
  SW --- R["router<br/>and one way out"]
```
*All three parts are required: devices with no link cannot reach each other, and a link with no agreed rules carries signals neither end can interpret.*
