A **socket** is the interface (API) between an application [[Process]] and the transport layer beneath it. The process writes messages into its socket and reads arriving ones out; everything past the socket is the operating system's problem.

- Above the socket you decide everything; below it you choose exactly one thing: which transport protocol ([[TCP]] or [[UDP]]).
- A socket is identified by an IP address + a [[Port Number]].

*Where the socket sits between two processes (slide 7)*

```mermaid
flowchart LR
    subgraph C["Client host"]
        direction TB
        cp["your client process<br>(code you wrote)"] --> ca["application"]
        ca --> cs(["socket"])
        cs --> ct["transport"] --> cn["network"] --> cl["link"] --> cph["physical"]
    end
    subgraph S["Server host"]
        direction TB
        sp["the server process<br>(code someone else wrote)"] --> sa["application"]
        sa --> ss(["socket"])
        ss --> st["transport"] --> sn["network"] --> sl["link"] --> sph["physical"]
    end
    net["the Internet<br>routers, links, queues (Ch. 1)"]
    cph ==>|"the only path that exists"| net
    net ==> sph
```
