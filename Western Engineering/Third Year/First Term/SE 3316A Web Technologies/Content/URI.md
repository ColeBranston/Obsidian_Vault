A **Uniform Resource Identifier** is the general form that [[URL]] and [[URN]] are both subsets of. Syntax:

`scheme:scheme-specific-part`

Conventions on three characters, which is what makes URIs parseable without knowing the scheme:

| Char | Separates |
|---|---|
| `/` | levels of hierarchical structure |
| `?` | a query from a resource that can answer queries |
| `#` | the URI from a **fragment identifier** |

`http` is by far the most common scheme; others include `mailto`, `file` and `ftp`. The official registry of schemes is kept by **IANA**.

Syntax is restricted to US-ASCII — see [[Internationalized Resource Identifier]] for the workaround and its security cost.
