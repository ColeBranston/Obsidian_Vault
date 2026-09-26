A **resource record (RR)** is the one kind of thing DNS stores: one line, five fields.

`NAME  TTL  CLASS  TYPE  VALUE` → `gaia.cs.umass.edu.  3600  IN  A  128.119.245.12`

(TTL = how long a cache may keep it, see [[DNS Caching]]; CLASS is always `IN`. The textbook's (name, value, type, ttl) is the same fields reordered.)

| Type | Example | Value is | Meaning |
|---|---|---|---|
| **A** | `gaia.cs.umass.edu. 3600 IN A 128.119.245.12` | an address | search ends here |
| **NS** | `umass.edu. 172800 IN NS dns.umass.edu.` | a name | server authoritative for this domain; ask it next |
| **CNAME** | `www.example.com. 300 IN CNAME srv-04.dc2.example.com.` | a name | canonical name; start again with it |
| **MX** | `example.com. 3600 IN MX 10 mail-in.example.net.` | a name | mail server; the 10 is a preference, lowest wins |

- A returns an address and stops; the other three return another name, which is why one lookup can take several steps.
- **AAAA** is A for IPv6 addresses.

**Registering a domain** (e.g. `networkutopia.com`):
1. A **registrar** checks it's free and takes payment (nothing technical yet).
2. The registrar writes **two records into the .com TLD server** and nowhere else: `networkutopia.com NS dns1.networkutopia.com` and `dns1.networkutopia.com A 212.212.212.1`.
3. You fill in your own zone on your now-authoritative server (`www… A 212.212.212.9`, `… MX mail.networkutopia.com`); nobody else needs telling.
