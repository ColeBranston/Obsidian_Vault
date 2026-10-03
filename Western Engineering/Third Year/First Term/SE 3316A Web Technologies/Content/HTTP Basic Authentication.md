**HTTP Basic authentication** is a challenge–response scheme built into HTTP: the server refuses with a `401` and a `WWW-Authenticate` header, and the browser retries with the credentials in an `Authorization` header as **base64 of `username:password`**.

- **Challenge:** `HTTP/1.1 401 Authorization Required` + `WWW-Authenticate: Basic realm="…"`
- **Response:** `Authorization: Basic emFjaGFyaWFzOmFwcGxlcGllCg==`

On the challenge, the browser shows a password dialog (displaying the realm, e.g. *"CEAB Database Admin"*). If the user enters credentials, it retries with them; if they press **Cancel**, it shows the HTML body that came with the 401.

*The Wikipedia example exchange, user "Aladdin", password "open sesame" (slides 29–30)*

```mermaid
sequenceDiagram
    participant B as Browser
    participant S as www.example.com
    B->>S: GET /private/index.html HTTP/1.0
    S-->>B: 401 Authorization Required<br>WWW-Authenticate: Basic realm="Secure"<br>+ HTML error page
    Note over B: Shows password dialog, user enters credentials
    B->>S: GET /private/index.html HTTP/1.0<br>Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==
    S-->>B: 200 OK + page (10476 bytes)
```

> [!tip] Base64 is encoding, not encryption
> Both strings on the slides decode instantly: `QWxhZGRpbjpvcGVuIHNlc2FtZQ==` → `Aladdin:open sesame`, and slide 28's `emFjaGFyaWFzOmFwcGxlcGllCg==` → `zacharias:applepie` (plus a stray trailing newline — someone ran `echo` without `-n`).

**Limitations:**
- Anyone who can **monitor HTTP traffic** can read the credentials — not recommended over plain HTTP
- **Acceptable over HTTPS** ([[SSL and TLS]]), which encrypts the header
- The browser **keeps the credentials until it's closed** — there's no real "log out"
