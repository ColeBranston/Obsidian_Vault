Three ways data moves between server and browser on the web. All of them use HTTP — what changes is *where the work happens*.

| Model | Flow | Where computation lives |
|---|---|---|
| **Static pages** | server → browser | nowhere; files are served as-is |
| **Server-side processing** | browser ↔ server | on the server, per request |
| **Server + client-side processing** | browser ↔ server, plus asynchronous calls from a [[JavaScript]] engine in the browser | split between both |

The third model is what makes a page update without reloading: the JavaScript engine talks to the server **asynchronously** in the background and rewrites the page in place.
