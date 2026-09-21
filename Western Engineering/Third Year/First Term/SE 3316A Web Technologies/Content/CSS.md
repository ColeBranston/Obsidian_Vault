**Cascading Style Sheets** separate structure from presentation (see [[Structure Versus Presentation]]). A stylesheet associates **properties** with **selected tags**, so the styling lives in one place instead of being duplicated on every element.

The two essential concepts are [[CSS Selectors]] — which elements a rule applies to — and **properties** — what it does to them. CSS 2.1 defines 98 settable properties.

```css
h1 { color: #888; font: 50px/50px "Impact"; text-align: center; }
ul { list-style-type: square; }
em { font-style: italic; font-weight: bold; }
```

Some common properties and the shapes their values take:

| Property | Values |
|---|---|
| `color` | `red`, `yellow`, `RGB(212, 120, 20)` |
| `font-style` | `normal`, `italics`, `oblique` |
| `font-size` | `12pt`, `larger`, `150%`, `1.5em` |
| `text-align` | `left`, `right`, `center`, `justify` |
| `line-height` | `normal`, `1.2em`, `120%` |
| `display` | `block`, `inline`, `list-item`, `none` |

See [[Applying a Style Sheet]] for the three ways to attach one, and `csszengarden.com` for what the same HTML looks like under wildly different stylesheets.
