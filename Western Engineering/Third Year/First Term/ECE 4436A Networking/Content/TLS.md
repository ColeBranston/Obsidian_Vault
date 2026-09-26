**TLS** (Transport Layer Security) is a layer the application adds on top of an ordinary reliable connection. It is a library your program calls, **not** a third transport protocol; the network knows nothing about it.

Neither [[TCP]] nor [[UDP]] provides confidentiality: a socket carries what you write, unchanged. Without TLS, a password crosses the café Wi-Fi, some router, and the bank as readable text; with TLS, the same machines still see the bytes, but they mean nothing.

Three guarantees: **Encryption** (nobody on the path can read it) · **Integrity** (nobody can change it unnoticed) · **Authentication** (you learn whether it really is the bank).
