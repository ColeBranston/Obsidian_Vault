When more than one [[CSS]] rule matches an element, the **most specific selector** is the one applied — not the last one written.

Given this stylesheet:

```css
b       {color: red;}
b b     {color: blue;}
b.foo   {color: green;}
b b.foo {color: yellow;}
b.bar   {color: maroon;}
```

| Markup | Colour | Why |
|---|---|---|
| `<b class=foo>Hey!</b>` | green | `b.foo` beats bare `b` |
| `<b>Wow!` | red | only `b` matches |
| `<b>Amazing!</b>` nested in `b` | blue | `b b` is more specific than `b` |
| `<b class="foo">` nested in `b` | yellow | `b b.foo` beats `b.foo` |
| `<b class="bar">` nested in `b` | maroon | `b.bar` beats `b b` |
| `<i>Fantastic!</i>` | red | inherits from the enclosing `b` |

The last row is inheritance, not matching — no rule selects `i` at all.
