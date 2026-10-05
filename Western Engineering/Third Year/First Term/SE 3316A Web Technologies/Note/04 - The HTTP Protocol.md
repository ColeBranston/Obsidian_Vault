---
source: webtech-2025-03-http.pdf
tags: [SE3316A, WebTechnologies, HTTP]
---

# The HTTP Protocol

The through-line: HTTP is a simple, stateless, text-based request–response protocol riding on TCP/IP — and almost everything else in this deck (forms, authentication, caching, cookies, TLS) exists to work around what plain HTTP doesn't give you: state and security.

> [!info]- Slide index — where each section comes from
> ★ = starred in the deck · 📊 = diagram rebuilt in Mermaid
>
> | Section of this note | Slides in the deck |
> |---|---|
> | *Intro* | 2 Objectives |
> | **What HTTP Is** | |
> | ⤷ `HyperText Transfer Protocol` | 3 HTTP 📊 · 13 HTTP ★ · 38 Limitations of HTTP ★ |
> | **The Network Stack** | |
> | ⤷ `Network Layers` | 4 Network Layers 📊 |
> | ⤷ `Internet Protocol` | 5 IP · 6 IP addresses and the Internet · 7 IP Notation |
> | ⤷ `Private Address Space` | 8 Private Address Space ★ |
> | ⤷ `Transmission Control Protocol` | 9 TCP · 10 TCP Packets 📊 |
> | ⤷ `Well-Known Ports` | 11 Application Layer |
> | ⤷ `Domain Name` | 12 IP Addresses Vs Domain Names |
> | **HTTP Messages** | |
> | ⤷ `HTTP Server` | 14 HTTP Server ★ |
> | ⤷ `HTTP Request` | 15 HTTP Requests ★ · 17 Encoding in HTTP/1.1 ★ |
> | ⤷ `HTTP Response` | 16 HTTP Responses ★ · 17 Encoding in HTTP/1.1 ★ |
> | ⤷ `HTTP Verbs` | 18 HTTP 1.1 Methods (Verbs) ★ · 19 HTTP 1.1 Method Definitions from RFC 7231 |
> | ⤷ `Safe and Idempotent Methods` | 20 Safe and Idempotent Methods ★ |
> | ⤷ `HTTP Status Code Classes` | 21 Status Codes ★ |
> | **HTML Forms** | |
> | ⤷ `Form Data Encoding` | 22 HTML Forms · 23 Encoding of Form Data ★ · 24 HTML Form Example - GET · 25 HTML Form Example - POST |
> | ⤷ `GET vs POST` | 26 GET vs. POST? ★ |
> | **Authentication** | |
> | ⤷ `Authentication Techniques` | 27 Authentication ★ |
> | ⤷ `HTTP Basic Authentication` | 28 HTTP Basic Authentication · 29 *Client Request 1 / Server Response 1* · 30 *Client Request 2 / Server Response 2* · 31 Limitations of HTTP Basic Authentication |
> | ⤷ `HTTP Digest Authentication` | 32 HTTP Digest Authentication |
> | **Advanced Features** | 33 Advanced Features in HTTP |
> | ⤷ `Cache-Control` | 34 Cache Control |
> | ⤷ `Range Requests` | 35 Range Requests |
> | ⤷ `Persistent Connections` | 36 Persistent Connections |
> | ⤷ `HTTP 2 Features` | 37 HTTP/2 ★ |
> | **State: Sessions and Cookies** | 38 Limitations of HTTP ★ |
> | ⤷ `Session Management` | 39 Session Management ★ 📊 |
> | ⤷ `HTTP Cookies` | 40 Cookies ★ · 41 Privacy and Security Issues with Cookies ★ |
> | **Security** | |
> | ⤷ `Security Services` | 42 Security Services ★ |
> | ⤷ `SSL and TLS` | 43 SSL/TLS ★ · 45 Confidentiality in TLS ★ · 46 Integrity in TLS ★ · 47 Authentication in TLS ★ |
> | ⤷ `Cryptography Basics` | 44 Background on Cryptography |
> | ⤷ `Certificate Trust Issues` | 48 Trust Issues with Certificates ★ |
> | *Summary and resources* | 49 Summary · 50 Essential Online Resources |

## What HTTP Is

![[HyperText Transfer Protocol]]

## The Network Stack

![[Network Layers]]

![[Internet Protocol]]

![[Private Address Space]]

![[Transmission Control Protocol]]

![[Well-Known Ports]]

![[Domain Name]]

## HTTP Messages

![[HTTP Server]]

![[HTTP Request]]

![[HTTP Response]]

![[HTTP Verbs]]

![[Safe and Idempotent Methods]]

![[HTTP Status Code Classes]]

## HTML Forms

![[Form Data Encoding]]

![[GET vs POST]]

## Authentication

![[Authentication Techniques]]

![[HTTP Basic Authentication]]

![[HTTP Digest Authentication]]

## Advanced Features

Beyond basic request–response, HTTP/1.1 adds cache control, range requests, and persistent connections with pipelining — then HTTP/2 rethinks the wire format.

![[Cache-Control]]

![[Range Requests]]

![[Persistent Connections]]

![[HTTP 2 Features]]

## State: Sessions and Cookies

HTTP's two built-in limitations: it's **stateless** (no support for tracking clients, e.g. logged-in vs logged-out) and has **no security mechanisms**. This section handles the first; the next handles the second.

![[Session Management]]

![[HTTP Cookies]]

## Security

![[Security Services]]

![[SSL and TLS]]

![[Cryptography Basics]]

![[Certificate Trust Issues]]

## Summary

Communication protocols covered: IP · TCP · HTTP · SSL.

**Online resources:** HTTP/1.1 spec `w3.org/Protocols/rfc2616/rfc2616.html` · HTTP/2 `http2.github.io` · TCPMon (TCP monitoring tool) `ws.apache.org/commons/tcpmon` · cURL (command-line URL tool) `curl.haxx.se` (now `curl.se`)

> [!note] Spec versions
> RFC 2616 (linked above) is the original 1999 HTTP/1.1 spec. It was replaced by RFCs 7230–7235 in 2014 (slide 19 cites RFC 7231), which were in turn replaced by RFC 9110–9112 in 2022.

## Notes to Self

- **Required reading:** MDN on HTTP cookies — `developer.mozilla.org/en-US/docs/Web/HTTP/Cookies`
- Decode the Basic auth strings yourself at `base64decode.org` (answers in [[HTTP Basic Authentication]])
- Answer the slide 26 "why?" questions before peeking (in [[GET vs POST]])
- Read about **self-signed certificates**
- Unit 4 – SSL slides have the full cryptography details
- Try `curl -v` against `httpbin.org/get` to see real request/response headers
