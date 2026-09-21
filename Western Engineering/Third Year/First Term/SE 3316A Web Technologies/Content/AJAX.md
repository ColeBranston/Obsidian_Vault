**JavaScript** was introduced by Netscape in 1996, an implementation of the standardized scripting language **ECMAScript** (latest: ECMAScript-262, 15th edition, June 2024). It became far more central to web development in the mid-2000s once it could interact with the [[Document Object Model]] and use **AJAX**.

**Without JavaScript**, every change to the page means a full HTTP round trip and a full page reload:

```mermaid
sequenceDiagram
    participant Browser
    participant Server as Web Server
    Browser->>Server: ① GET /form.php
    Server-->>Browser: ② Requested page is returned
    Note over Browser: ③ User selects country, then clicks Update
    Browser->>Server: ④ GET /form.php?country=canada
    Server-->>Browser: ⑤ Requested page (with updated form) is returned
    Note over Browser: ⑥ User continues with form, perhaps triggering other requests
```

**AJAX** — Asynchronous JavaScript And XML — is both an acronym and a general term for making **asynchronous data requests** from the browser: the page fetches data in the background instead of reloading the whole document, which is what lets a page update without a full page load.

```mermaid
sequenceDiagram
    participant Browser
    participant Server as Web Server
    Browser->>Server: ① Request
    Server-->>Browser: ② Response
    Note over Browser: ③ Browser blanks the window, then...
    Note over Browser: ④ ...renders the just-received HTML
    Note over Browser: ⑤ User clicks update button
    Browser->>Server: ⑥ Via JavaScript, async request for data
    Server-->>Browser: ⑦ Browser returns XML, JSON, or some other data
    Note over Browser: ⑧ Via JavaScript, dynamically updates the window — no reload
```
