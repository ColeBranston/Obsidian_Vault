A **port number** is a 16-bit number the OS uses to decide which [[Process]] an arriving message belongs to. The host's IP address gets a message to the right machine; the port gets it to the right program. **Address + port = one socket.**

- Well-known ports: 80 (HTTP) · 443 (HTTPS) · 53 ([[DNS]]) · 25 ([[SMTP]]).
- Numbers below 1024 are reserved for well-known services, so your own server must claim one above 1024.

> [!warning] Not Chapter 1's "output port"
> That was a physical interface on a router. This is a software identifier for a process.
