An **HTTP request** has three parts: a **request line** (method, path, version — methods in [[HTTP Verbs]]) · **header lines** of the form `field: value` · an optional **request body** (empty for a plain GET).

```http
GET /search?q=Web+Technologies HTTP/1.1
Host: www.google.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0
Accept: text/html,application/xhtml+xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip,deflate
Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.7
Connection: keep-alive
```

The `q=` values are **preference weights** (0–1) — e.g. the client prefers `en-US`, accepts other English at 0.5. A blank line ends the headers.

**Encoding rule (HTTP/1.1):** the request line and the header field names must be **US-ASCII**.

See also [[HTTP Request Message]] from ECE 4436A.
