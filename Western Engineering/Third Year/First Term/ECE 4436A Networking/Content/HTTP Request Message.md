An **HTTP request** is a request line, header lines, and an **empty line**, optionally followed by a body.

```
GET /index.html HTTP/1.1\r\n                  ← request line: method, path, version
Host: www-net.cs.umass.edu\r\n                ← mandatory since 1.1 (virtual hosting)
User-Agent: Mozilla/5.0 (...)\r\n              ← names the browser; used for fingerprinting
Accept: text/html,application/xhtml+xml\r\n   ← content negotiation
Accept-Language: en-us,en;q=0.5\r\n
Accept-Encoding: gzip,deflate\r\n
Connection: keep-alive\r\n                    ← ask for a persistent connection
\r\n                                           ← end of headers
```

**General form:** first line · `name: value` headers in any order · empty line · body (only if the method carries data, e.g. a form). A response has the same shape with a status line instead ([[HTTP Response Message]]).

**To parse:** split the first line on spaces; read lines until an empty one, splitting each on the first colon; everything after is body. One parser handles both message types.

**By hand:** `openssl s_client -quiet -connect example.com:443`, type the request, `Connection: close`, then press return twice.
