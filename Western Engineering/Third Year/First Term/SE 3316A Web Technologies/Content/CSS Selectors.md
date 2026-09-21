A **selector** says which elements a [[CSS]] rule applies to. In its simplest form it's a tag name:

```css
b {color: red; font-size: 12pt}
i {color: green}
```

Longer selectors add **context sensitivity** — `table b` and `form b` can differ.

| Selector | Matches |
|---|---|
| `E F` | any `F` that is a **descendant** of an `E` (at any depth) |
| `E > F` | any `F` that is a direct **child** of an `E` |
| `E.foo` | any `E` whose `class` attribute contains `foo` |
| `E#foo` | the `E` whose `id` equals `foo` |

Others include `*` (any element), `+` (adjacent sibling) and pseudo-classes such as `:hover`.

When several rules match the same element, the most specific one wins — see [[CSS Specificity]].
