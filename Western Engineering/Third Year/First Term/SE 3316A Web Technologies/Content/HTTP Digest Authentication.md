**HTTP Digest authentication** improves on [[HTTP Basic Authentication]] by sending an **MD5 hash of the username, password and a nonce** instead of the credentials themselves. The idea: an intercepted hash can't be reversed to recover the password, and the nonce stops it being replayed.

> [!warning] Avoid at all costs
> **MD5 is broken**, so Digest provides no real protection. The preferred approach is **Basic authentication over HTTPS** ([[SSL and TLS]]) — let TLS do the protecting.
