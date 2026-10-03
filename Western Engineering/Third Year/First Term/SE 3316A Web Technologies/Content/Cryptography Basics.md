The four cryptographic building blocks behind [[SSL and TLS]]:

- **Symmetric encryption** — a **single key** both encrypts and decrypts
- **Public-key (asymmetric) encryption** — a **key pair**: the public key is given to everyone, the private key is known only to its owner
  - **Confidentiality:** encrypt with the *public* key → only the private key can decrypt
  - **Digital signature:** encrypt with the *private* key → anyone with the public key can decrypt, proving who signed it
- **Hash function** — a **one-way function**: easy to compute a hash from a document, infeasible to create a document with a given hash
- **Certificate** — a **public key digitally signed by a trusted third party**

> [!note]
> The deck points to the separate *unit 4 – SSL* slides for the full details.
