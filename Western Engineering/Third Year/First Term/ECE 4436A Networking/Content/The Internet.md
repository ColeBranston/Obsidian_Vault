**The Internet** is a *network of networks*: many independently built and separately owned [[Network]]s, each connecting its own devices, joined at their boundaries by [[Router]]s, so that a device on any one of them can exchange data with a device on any other.

Four networks, four owners, none designed with the others in mind. Each puts one router on its boundary and those routers agree to carry each other's traffic — nothing inside any of them changes.

```mermaid
flowchart LR
  subgraph home["Home network"]
    HR["router"]
  end
  subgraph cell["Cellular network"]
    CR["router"]
  end
  subgraph campus["Campus network"]
    UR["router"]
  end
  subgraph dc["Data center"]
    DR["router"]
  end
  X1(("core"))
  X2(("core"))
  X3(("core"))
  HR --- X1
  CR --- X2
  X1 --- X3
  X2 --- X3
  X1 --- UR
  X3 --- UR
  X3 --- DR
  X2 --- DR
```
*That, and nothing else, is what makes it the Internet.*

**More than one route.** A phone on the home network requesting a page from a server in the data center has several paths available to it. Same sender, same receiver, same message, two different paths: nothing in the message names a route, and no single network chose it.

**Two ways to describe the same system:**

| | The equipment answer | The service answer |
|---|---|---|
| Question | What the Internet is **made of** | What the Internet **does for you** |
| Contents | Hosts, links, packet switches, providers, and the TCP/IP rules that make them interoperate | An infrastructure two programs build on: connect · send · recv |
| Who lives here | Engineers — most of this course | Applications: the web, email, streaming, video calls |

```mermaid
flowchart LR
  subgraph equip["The equipment answer — what it is made of"]
    H["host<br/>runs the app"] --- M["modem<br/>the line to the ISP"] --- R1["router<br/>access ISP"] --- R2["router<br/>backbone"] --- S["server<br/>runs the app"]
  end
  subgraph svc["The service answer — what it does for you"]
    P1["your program<br/>browser, app, game"] ---|"connect · send · recv"| P2["their program<br/>web server, API"]
  end
  equip -.->|"the same system"| svc
```
*Engineers work on the top; the applications that made the Internet worth building only ever see the bottom, and they only work because the top keeps its promise. TCP/IP is the set of rules every box in the top row shares.*
