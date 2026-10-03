An **HTTP server** is a process that listens for incoming [[Transmission Control Protocol|TCP]] connections on port 80, reads request lines until it hits a **blank line**, then sends back its response as a series of text lines.

**Document root** — each server has a configuration parameter mapping `/` (root) to a folder on disk. If root is `/www/web1/me`, a request for `/foo/bar.html` sends the file `/www/web1/me/foo/bar.html`.

**Directory requests** — if the path maps to a directory (e.g. `/foo`), the server looks for `index.html` (or `index.htm`) inside it.
