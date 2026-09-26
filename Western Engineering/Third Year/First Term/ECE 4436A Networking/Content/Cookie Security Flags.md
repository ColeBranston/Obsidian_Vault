If the [[Cookie]] is the credential for a [[Session]], the attributes that make it harder to steal are part of the protocol.

`Set-Cookie: sid=…; Max-Age=1800; Secure; HttpOnly; SameSite=Lax; Domain=shop.example; Path=/`

| Flag | Does | Without it |
|---|---|---|
| **Secure** | sent over encrypted connections only | one plain request on café Wi-Fi hands your session away |
| **HttpOnly** | no script may read it | any script the page loads can exfiltrate it |
| **SameSite=Lax** | not sent when another site initiates | **cross-site request forgery**: another page spends your session |

- **Max-Age** is not a defense; it decides whether the cookie outlives the browser ("remember me").
- **Domain** and **Path** are scope; every extra place it's sent is another place it can leak.
