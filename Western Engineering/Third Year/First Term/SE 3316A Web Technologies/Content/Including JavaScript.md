JavaScript can be linked into an HTML page three ways:

| Way | Example | Notes |
|---|---|---|
| **Inline** | `<input type="button" onClick="alert('Hi!');" />` | code stuffed directly into an HTML attribute — a real maintenance nightmare |
| **Embedded** | `<script type="text/javascript">…</script>` | better — code lives in its own element |
| **External** | `<script src="greeting.js"></script>` | best — separates content from behaviour; convention is a `.js` extension |

**Libraries and frameworks:** libraries (jQuery, Three.js, Vue.js) make development faster and add a compatibility layer across browsers, at the cost of another dependency; frameworks (Angular, React, Dojo, Bootstrap) provide a library *plus* a programming model — "doing it their way" — with more dependencies to maintain. Include a library either by hosting a local copy (you control where it comes from) or from a CDN (edge caching, but must match your page's protocol — a protocol-relative URL like `//ajax.googleapis…` avoids the https mismatch).

**Debugging:** browsers largely ignore JavaScript errors rather than showing them to the user, so a broken script can silently appear to do nothing — use the browser's built-in developer tools (Chrome, Firefox) to see error messages and debug properly.
