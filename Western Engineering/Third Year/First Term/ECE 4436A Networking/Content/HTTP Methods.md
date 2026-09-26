The first word of the [[HTTP Request Message|request line]]. Eight exist in the core spec; four cover almost everything.

| Method | Meaning | Key property |
|---|---|---|
| **GET** | send me the thing at this path | changes nothing, so safe to repeat, bookmark, and cache; parameters go in the URL |
| **POST** | here's data, do something with it | data in the body; server state changes, so browsers warn before resending |
| **HEAD** | send the headers, skip the body | check whether something changed without downloading it |
| **PUT** | store this at exactly this path, replacing what's there | repeating it gives the same result as once (POST can't promise that) |
