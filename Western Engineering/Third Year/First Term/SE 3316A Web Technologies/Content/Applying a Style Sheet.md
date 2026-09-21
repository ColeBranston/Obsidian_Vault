Three ways to attach [[CSS]] to a document — good, bad and ugly.

**Good** — external file, linked from `head`:

```html
<link href="style.css" rel="stylesheet" type="text/css">
```

One file styles the whole site, it's cached by the browser, and designers edit it without touching markup.

**Bad** — embedded in a `style` tag, typically in `head` (so it's parsed before the body renders) but legal anywhere in the document. Scoped to one page, so it invites duplication:

```html
<style type="text/css">p {color: red; }</style>
```

**Ugly** — inline on the element itself. Applies to exactly one element, can't be reused, and wins over nearly everything else:

```html
<p style="color:red;">Caution!</p>
```

The same good/bad/ugly ladder applies to [[JavaScript]] — external file, inline `<script>`, event attribute — for the same reason each time.
