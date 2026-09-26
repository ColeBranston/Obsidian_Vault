The **Domain Name System (DNS)** is a distributed, hierarchical database mapping host names to [[IP Address|addresses]], plus the application-layer protocol that queries it. Runs at the edge, over [[UDP]], on port 53.

**Why not one central database?** Four failures:
1. every query on Earth at one door
2. single point of failure
3. one place to make every change
4. everyone on Earth is far from it

Hence the [[DNS Hierarchy]]: no server knows every name, and every server knows who to ask next.

**Four uses of one lookup:**

| Purpose | Name | Returns |
|---|---|---|
| Name → address | `gaia.cs.umass.edu` | `128.119.245.12` |
| Host aliasing | `www.example.com` | `srv-04.dc2.example.com` (real machine can change behind the public name) |
| Mail aliasing | `example.com` | `mail-in.example.net` |
| Load distribution | `www.example.com` | different address depending on who asks (Toronto / London / Sydney) |

Answering differently per asker is a **steering mechanism**, which is exactly how a [[Content Delivery Network]] works.
