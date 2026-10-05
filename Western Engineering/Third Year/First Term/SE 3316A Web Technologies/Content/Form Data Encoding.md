**Form data encoding** (URL encoding) is how an HTML form's fields travel in an [[HTTP Request]]: each control's `name` and value become `name=value` pairs joined by `&` into a **query string**.

```html
<form method="get" action="http://httpbin.org/get">
  Text input: <input name="foo_text" type="text" size="20">
  <hr>Drop down menu:
  <select name="foo_sel">
    <option value="small">Small
    <option value="med">Medium
    <option value="large">Large
  </select>
  <hr>Password: <input name="foo_pwd" type="password">
  <input type="submit" value="Submit this form">
</form>
```

Filled in with `Pizza` · `Medium` · `tomato`, it encodes to:

`foo_text=Pizza&foo_sel=med&foo_pwd=tomato`

Note the dropdown sends its option's `value` (`med`), not the visible label (`Medium`).

**Where the query string goes depends on the method:**

| Method | Query string goes in | Request line for a pizza-size form (`pizza_size=s`) |
|---|---|---|
| `GET` | the **request URI** — `http://httpbin.org/get?foo_text=Pizza&…` | `GET /get?pizza_size=s HTTP/1.1` |
| `POST` | the **request body** | `POST /post HTTP/1.1` |

> [!warning] Password in the URL
> With `method="get"`, the password lands in the URL — visible in history, logs and bookmarks. One of the reasons to prefer POST for anything sensitive (see [[GET vs POST]]).

> [!note] Field-name mismatch on slide 23
> The form names the password field `foo_pwd`, but slide 23's table and GET URL call it `foo_passwd`. The browser always uses the form's `name`, so `foo_pwd` is what actually gets sent.
