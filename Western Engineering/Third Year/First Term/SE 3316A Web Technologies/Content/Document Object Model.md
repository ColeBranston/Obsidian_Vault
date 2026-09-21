The **Document Object Model (DOM)** is the programming interface (API) JavaScript uses to interact with the HTML document it's embedded in. Per the W3C, it's a platform- and language-neutral interface letting programs dynamically access and update a document's content, structure, and style.

```mermaid
graph TD
    doc["document (root)"] --> html["&lt;html&gt;"]
    html --> head["&lt;head&gt;"]
    html --> body["&lt;body&gt;"]
    head --> meta["&lt;meta&gt;"]
    head --> title["&lt;title&gt;"]
    body --> h1["&lt;h1&gt;"]
    body --> p1["&lt;p&gt;"]
    body --> img["&lt;img&gt;"]
    body --> h2["&lt;h2&gt;"]
    body --> div1["&lt;div id=latestComment&gt;"]
    body --> div2["&lt;div&gt;"]
    p1 --> a["&lt;a&gt;"]
    div1 --> dp1["&lt;p&gt;"]
    div1 --> dp2["&lt;p&gt;"]
    div2 --> dp3["&lt;p&gt;"]
    div2 --> dp4["&lt;p&gt;"]
    dp1 --> t1["&lt;time&gt;"]
    dp3 --> t2["&lt;time&gt;"]
```

**Nodes** — every element in the document is a node: element nodes, text nodes, and attribute nodes, all sharing a common set of properties (`attributes`, `childNodes`, `firstChild`, `lastChild`, `nextSibling`, `nodeName`, `nodeType`, `nodeValue`, `parentNode`, `previousSibling`):

```mermaid
graph TD
    P["&lt;p&gt; — element node"] --> Text1["'Photo of Conservatory Pond in' — text node"]
    P --> A["&lt;a&gt; — element node"]
    A --> Attr["href='http://www.centralpark.com/' — attribute node"]
    A --> Text2["'Central Park' — text node"]
```

Navigating between nodes uses these relationship properties directly:

```mermaid
flowchart LR
    Body["&lt;body&gt;"] -->|firstChild| P["&lt;p&gt;"]
    Body --> H1["&lt;h1&gt;Title goes here&lt;/h1&gt;"]
    Body --> P2["&lt;p&gt;subtitle&lt;/p&gt;"]
    Body -->|lastChild| Div["&lt;div&gt;"]
    P -->|nextSibling| H1
    H1 -->|previousSibling| P
    H1 -->|nextSibling| P2
    P2 -->|previousSibling| H1
    P2 -->|nextSibling| Div
    Div -->|previousSibling| P2
    P -.parentNode.-> Body
```

**The `document` object** is the root JS object for the whole page (e.g. `document.URL`, `document.inputEncoding`). Key methods: `createAttribute()`, `createElement()`, `createTextNode()`, `getElementById(id)`, `getElementsByTagName(name)`.

**Modern node access** — `querySelector()` / `querySelectorAll()` take a CSS selector, as specific as needed (`document.querySelector("div.user-panel input[name='login']")`); `querySelectorAll()` returns a *static* (not live) NodeList. `Element.querySelector()` scopes the search to within a given element.

**Element node properties:** `className`, `id`, `innerHTML` (everything inside the tags — the primary way to update a div from JS), `style`, `tagName`; plus tag-specific ones like `href` (`a`), `src` (`img`/`input`/`iframe`/`script`), `value` (`input`/`textarea`), `name` (form-related tags).

**Modifying an element** — `innerHTML` is fast but risks injecting unvalidated markup; for simple text, `innerText` is safer. The more rigorous (but verbose) route uses `createTextNode()`, `removeChild()`, and `appendChild()`:

```mermaid
flowchart LR
    A["① createTextNode('this is dynamic')"] --> B["② createElement('p')"]
    B --> C["③ p.appendChild(text)"]
    C --> D["④ first.appendChild(p)"]
    D --> E["&lt;div id=first&gt; ...existing content... &lt;p&gt;this is dynamic&lt;/p&gt; &lt;/div&gt;"]
```

Style/class changes go through the `style` or `className` property, or (HTML5) the `classList` API (`.add()`, `.remove()`, `.toggle()`) — `className` is usually the better choice since it keeps styling out of the code, where designers can reach it.
