**Private address space** is the set of [[Internet Protocol|IP]] address ranges reserved for use **inside a LAN** — these addresses must not be visible on the public Internet.

| Version | Range | Notes |
|---|---|---|
| IPv4 | `10.0.0.0` – `10.255.255.255` | |
| IPv4 | `172.16.0.0` – `172.31.255.255` | |
| IPv4 | `192.168.0.0` – `192.168.255.255` | most home routers |
| IPv4 | `169.254.1.0` – `169.254.254.255` | link-local |
| IPv6 | `fc00::0` – `fdff:ffff:ffff:ffff:ffff:ffff:ffff:ffff` | |
| IPv6 | `fe80::0` – `febf:ffff:ffff:ffff:ffff:ffff:ffff:ffff` | link-local |

Several more reserved ranges exist — see Wikipedia: *Reserved IP addresses*.

> [!warning] Typo on the slide
> Slide 8 writes the IPv4 link-local range as `169.251.x.x`. The actual link-local block is `169.254.0.0/16`, so the range above uses `169.254`. Worth knowing in case it shows up on a quiz exactly as the slide has it.
