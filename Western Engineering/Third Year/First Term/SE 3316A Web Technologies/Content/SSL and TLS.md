**SSL** (Secure Sockets Layer) and its newer version **TLS** (Transport Layer Security) form a layer **between HTTP and TCP** that provides **confidentiality, integrity and authenticity** (see [[Security Services]]). HTTP over TLS is what you get with `https://`. It's based on **public-key cryptography** — a private key, a public key, and a **certificate** (usually for server authentication only). See [[Cryptography Basics]].

| Service | How TLS provides it |
|---|---|
| **Confidentiality** | Data is encrypted with **symmetric encryption**. The keys are generated uniquely **for each connection** from a **shared secret** negotiated at the start, where client and server also agree on the encryption algorithm and keys. The shared secret stays **secure** even with a man-in-the-middle (**MITM**) listening, and **reliable** — any MITM tampering with the negotiation is detected. |
| **Integrity** | Each message carries a **message integrity check** using a **message authentication code (MAC)**, which a MITM attacker cannot forge. |
| **Authentication** | Identities are verified with digital **certificates** — a public key digitally signed by a **certificate authority (CA)**. Typically only the **server** proves itself: it presents its certificate, the browser verifies it, and the organization name is shown with special markup. Verifying the **client** to the server is also possible. |

Certificates come with their own weaknesses — see [[Certificate Trust Issues]].

See also [[TLS]] from ECE 4436A.
