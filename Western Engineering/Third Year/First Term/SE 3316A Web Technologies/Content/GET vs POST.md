**GET vs POST** — the two methods HTML forms can use, and the only ones allowed for them.

| | `GET` | `POST` |
|---|---|---|
| Use for | **retrieving** data | submitting things with consequences (e.g. an order to an online shop) |
| Responsibility | client shouldn't be held responsible for the consequences ([[Safe and Idempotent Methods|safe]]) | client is asking for an effect |
| Data lives in | the URL ([[Form Data Encoding]]) | the request body |
| Size limit | request URI length (~3000 characters) | none in practice |
| Encodings | URL encoding only | allows others (e.g. for **file upload**) |
| Bookmark / cache | ✅ | ❌ |

> [!question] Why can a GET be bookmarked and cached? (slide 26)
> Think about it before expanding.

> [!success]- One answer
> **Bookmarkable** because the whole request — path *and* form data — is in the URL, so saving the URL saves the request. **Cacheable** because GET is safe: replaying it has no side effects, so a cache can hand back a stored response instead of asking the server again. A POST's data is in the body and it may change server state, so neither works.
