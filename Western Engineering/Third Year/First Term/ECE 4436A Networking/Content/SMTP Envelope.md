Every message carries **two sets of addresses** that need not agree:

- **Envelope**: SMTP's `MAIL FROM` / `RCPT TO` commands. The *only* thing the receiving server uses to decide delivery.
- **Letter**: `From:` / `To:` / `Subject:` header lines *inside* the message. To [[SMTP]] this is all content; it delivers these lines, it doesn't read them.

| Consequence | How it works |
|---|---|
| **Mailing list** | envelope names you; the visible To: names the list |
| **Forwarding** | envelope rewritten to the new address, letter untouched, so it still shows the original recipient |
| **Forgery** | nothing in the protocol requires the sender to be entitled to the From: address; checks (authorization records, signatures) were added later and are optional |

All three run on the same mechanism: forbidding forgery would forbid forwarding and lists too.
