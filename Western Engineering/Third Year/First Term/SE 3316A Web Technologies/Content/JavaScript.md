**JavaScript** adds a third axis to the web: it separates **interaction** from the structure ([[HTML]]) and presentation ([[CSS]]) described in [[Structure Versus Presentation]].

What it buys you:
- code shipped as part of an HTML page
- code that runs **client-side** in response to events
- the ability to modify the **Document Object Model** — the live tree of the page
- asynchronous communication with the server (the third of the [[Data Flow Models]])

**Including it** — the same good/bad/ugly ladder as [[Applying a Style Sheet]]: an external file via `<script src="...">` · inline inside `<script>` tags in the header or body · inside HTML event attributes. Code doesn't run until it's attached to an **event**.

**Long-standing issues:** browsers interpret it differently, driving a pile of workarounds (jQuery became the de-facto compatibility layer) · the language lacked features and is still catching up · competitors compile down to it — **Dart** (Google), **TypeScript** (Microsoft), **CoffeeScript** (Ruby community).
