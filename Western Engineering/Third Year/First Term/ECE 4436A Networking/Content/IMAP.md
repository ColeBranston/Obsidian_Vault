**IMAP** (Internet Message Access Protocol) is a pull protocol for reading mail where the **master copy stays on the server** and each client keeps a synchronized copy.

- Folders, read marks, and deletions are **server-side state**, so every device shows the same mailbox.
- Clients keep a copy on disk, so a mail program works offline.
- Cost: more server work and more state to keep in step.

The last hop must be a pull because [[SMTP]] (push) needs an always-on receiver, and a laptop isn't one.

**Webmail** is a third option: the browser renders a view over [[HTTP]] and keeps no mailbox; lightest client, but nothing to read offline.
