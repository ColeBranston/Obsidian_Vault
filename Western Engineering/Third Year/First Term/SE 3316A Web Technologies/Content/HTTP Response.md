An **HTTP response** mirrors the [[HTTP Request|request]]: a **status line** (version, code, reason phrase — see [[HTTP Status Code Classes]]) · **header lines** · a blank line · the **response body**.

```http
HTTP/1.1 200 OK
Server: nginx/1.18.0
Date: Sun, 27 Sep 2020 01:22:18 GMT
Last-Modified: Tue, 15 Sep 2020 01:29:04 GMT
ETag: "ec002-afa-fd67ba80"
Accept-Ranges: bytes
Content-Length: 328
Content-Type: text/html

<!DOCTYPE html>
<html>
<head> <meta charset="utf-8"> <title>SE 3316 Lab 1</title> …
```

**Encoding rule (HTTP/1.1):** the status line and the header field names must be **US-ASCII** — *except* the reason phrase (`OK`), which is free text.

See also [[HTTP Response Message]] from ECE 4436A.
