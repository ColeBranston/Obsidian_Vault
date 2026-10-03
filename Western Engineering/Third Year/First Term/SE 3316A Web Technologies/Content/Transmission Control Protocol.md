**TCP** (Transmission Control Protocol) is a layer on top of [[Internet Protocol|IP]] that turns unreliable datagrams into a **reliable, ordered stream** of data.

- **Reliability** — lost datagrams are retransmitted, out-of-order ones reordered
- **Connection-oriented** — establish a connection between client and server · stream data in **both directions** · close the connection
- **Socket** — one end point of a connection, identified by an **(IP address, port number)** pair (see [[Well-Known Ports]])

*How TCP gets a message across: sequence numbers, ACKs, and resending (slide 10)*

```mermaid
sequenceDiagram
    participant S as Sender
    participant R as Receiver
    Note over S: 1 Message broken into packets with a sequence number
    S->>R: [1] Thou map of woe,
    R-->>S: ACK 1
    Note over S,R: 2 For each packet sent, an ACK must be received back
    S->>R: [2] that thus dost
    S->>R: [3] talk in signs!
    R-->>S: ACK 3
    Note over S: 3 No ACK for packet 2 came back, so it is resent
    S->>R: [2] that thus dost
    R-->>S: ACK 2
    Note over R: 4 Message reassembled, ordered by sequence number
```

> [!note] What went wrong with packet 2
> The slide only shows that **ACK 2 never arrives** — it doesn't say whether packet 2 or its ACK was the one lost. Either way the sender's response is the same: resend.

See also [[TCP]] from ECE 4436A.
