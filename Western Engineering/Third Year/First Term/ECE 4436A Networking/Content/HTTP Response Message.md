An **HTTP response** has the same shape as a request, with a **status line** in place of the request line.

```
HTTP/1.1 200 OK                                 ← version, code, reason phrase
Date: Tue, 08 Sep 2026 00:53:20 GMT
Server: Apache/2.4.6 (CentOS)
Last-Modified: Tue, 01 Mar 2026 18:57:50 GMT    ← cache validation (see Conditional GET)
Content-Length: 2651                            ← framing: where the body ends
Content-Type: text/html; charset=UTF-8          ← how to interpret the bytes
                                                ← empty line
<!doctype html> … 2651 bytes …                  ← body: the object itself
```

`Last-Modified` feeds [[Conditional GET]]; codes are explained in [[HTTP Status Codes]].
