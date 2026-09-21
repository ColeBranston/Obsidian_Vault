[[HTML]] has a formal syntax specification — around 800 lines of DTD notation — and a **validator** (`validator.w3.org`) reports syntax errors against it. Most documents on the web are invalid; most real websites have validation errors.

```html
<html>
  <body>
    <table><b>123</i></table>
  </body>
</html>
```

**Why so much invalid HTML:** ignorance of the standard · lack of testing · "optimized for the XYZ browser" / "best viewed in 1024×768" thinking · automatic tools that emit invalid output · and above all, **forgiving browsers** that try to interpret invalid input rather than refusing it.

> [!warning] Why it actually matters
> Every implementation — vendor, platform, version — must decide what invalid markup *means*, and there are many arbitrary choices to make. The result is that the standard gets undermined and a page renders differently for most clients.

**The fix:** standardize the error handling too. The **HTML Tidy** tool transforms invalid HTML into (almost) valid HTML; there are still arbitrary choices, but now everyone agrees on them. HTML5 takes the same approach — the spec at `html.spec.whatwg.org` defines parsing of broken markup, which is why it's maintained by [[WHATWG]] as a living standard.
