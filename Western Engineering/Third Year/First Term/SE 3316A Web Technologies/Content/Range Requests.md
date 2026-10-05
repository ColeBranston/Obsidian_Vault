A **range request** asks for only **part of a resource**, using the `Range` header. To get bytes 100–200 and 387 to the end:

```http
Range: bytes=100-200,387-
```

The server replies with just those ranges and status **`206 Partial Content`** (see [[HTTP Status Code Classes]]). A server that doesn't support ranges simply **ignores** the header and sends the whole thing. A server advertises support with `Accept-Ranges: bytes` (as in the example [[HTTP Response]]).
