**TCP** (Transmission Control Protocol) is the reliable, connection-oriented transport service: every byte arrives, in order, or the connection fails loudly.

- **Setup:** a handshake before any data moves.
- **Pacing:** flow control, so a fast sender can't drown a slow receiver.
- **Congestion:** backs off when the network is overloaded.
- No timing guarantee, minimum throughput, or security (see [[TLS]]).

**Used by:** [[HTTP]] (the Web) · FTP · [[SMTP]] · [[IMAP]] / [[POP]] · [[DASH]] streaming (a buffer absorbs the delay, so reliability is affordable).
