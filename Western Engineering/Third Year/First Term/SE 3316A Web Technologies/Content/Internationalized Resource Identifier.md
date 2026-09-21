[[URI]] syntax is restricted to US-ASCII. The **IRI** extends it to allow international characters, via a mapping back down to ASCII that is fairly complex.

`http://www.blåbærgrød.dk/blåbærgrød.html`

maps to

`http://www.xn--blbrgrd-fxak7p.dk/bl%E5b%E6rgr%F8d.html`

The host part uses **punycode** (the `xn--` prefix); the path uses percent-encoding.

> [!warning] IDN homograph attacks
> Many non-ASCII letters are visually identical to ASCII ones. Replacing the `a` in `apple` with a Cyrillic `а` yields a domain that renders as `www.apple.com` in the address bar — padlock and all — while the real URL is `https://www.xn--80ak6aa92e.com/`. A valid TLS certificate proves you're talking to *that* domain, not to the one you think you're reading.
