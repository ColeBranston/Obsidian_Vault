Pre-validating forms client-side (email format, number ranges, required fields) reduces incorrect submissions and server load. E.g. checking a checkbox is ticked:

```js
let inputField = document.getElementById("license");
if (inputField.type == "checkbox") {
  if (inputField.checked) { /* box is checked */ }
}
```

**Submitting a form from JavaScript** — get the form node, then call `.submit()`:

```js
let formExample = document.getElementById("loginForm");
formExample.submit();
```

Often paired with calling `preventDefault()` on the form's `onsubmit` event, so the script controls exactly when/whether the default submission happens.
