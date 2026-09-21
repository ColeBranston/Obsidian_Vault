---
source: webtech-2025-01-intro-html.pdf
tags: [SE3316A, WebTechnologies, HTML, CSS]
---

# HTML and CSS

The through-line of this deck: the web works because structure, presentation and interaction were kept apart, and every place they leak into each other causes a problem later — invalid markup, unreadable stylesheets, spoofed domains, mojibake.

## Where HTML Came From

![[Hypertext]]

![[Markup Language]]

![[World Wide Web]]

![[HTML]]

### The History of HTML

| Year | Version | What happened |
|---|---|---|
| 1992 | HTML 1.0 | Tim Berners-Lee's original proposal |
| 1994 | HTML 2.0 | first standard, gathering the best features |
| 1996 | — | Netscape and Explorer ship competing features |
| 1996 | HTML 3.2 | the Browser Wars end |
| 1997 | HTML 4.0 | stylesheets introduced |
| 1999 | HTML 4.01 | we have a winner |
| 2000 | XHTML 1.0 | an XML version of 4.01 — the long detour that pushed browser makers to innovate alone |
| 2014 | HTML5 | published as a [[W3C]] Recommendation (5.1 in 2016, 5.2 in 2017) |
| 2019 | living standard | [[WHATWG]] takes over the specification |

## Addressing

![[URL]]

![[URI]]

![[URN]]

![[Internationalized Resource Identifier]]

## How the Pieces Talk

![[Data Flow Models]]

## Survivor's Guide to HTML

![[HTML Element]]

![[HTML Entities]]

### Hyperlinks

A link names a target document and, optionally, a fragment inside it:

```html
<a href="target.html#danger">Look here</a>.
```

The target document marks that position with a named anchor:

```html
<a name="danger"></a>
<h2>Chapter 17: Dangerous Shell Commands</h2>
```

### Common Structural Tags

| Tag | Purpose |
|---|---|
| `h1`–`h6` | headings, by level |
| `p` | paragraph |
| `ol` / `ul` + `li` | ordered / unordered list items |
| `pre` | preformatted text — whitespace preserved |
| `b` / `i` / `tt` | bold / italic / monospace (presentational — prefer [[CSS]]) |
| `table` + `tr` + `td` | table, row, cell |
| `br` / `hr` | line break, horizontal rule |

Tables were historically abused for **page alignment** (`<table width="100%">` with left- and right-aligned cells to place navigation icons). This works but is exactly the structure/presentation confusion [[CSS]] exists to fix.

### Fill-Out Forms

```html
<form method="get" action="http://www.google.com/search">
  <input type="text" name="q">
  <input type="submit" name="btnG" value="Google Search">
</form>
```

| Control | Markup |
|---|---|
| Text field | `<input name="foo" type="text" size="20">` |
| Radio buttons | `<input name="bar" type="radio" value="s">` — same `name`, one choice |
| Checkboxes | `<input name="baz" type="checkbox" value="c">` — same `name`, many choices |
| Dropdown | `<select name="bar"><option value="s">Small</option></select>` |
| Multi-select | `<select name="baz" multiple>` |
| Multi-line text | `<textarea name="foo" rows="5" cols="20">` |
| Password | `<input type="password">` |
| File upload | `<input type="file">` |
| Hidden value | `<input type="hidden" value="you can't see this">` |
| Image button | `<input type="image" src="Denmark.gif">` |
| Submit / reset | `<input type="submit">` · `<input type="reset">` |

> [!tip] Seeing what the form actually sent
> Point `action` at `http://httpbin.org/get` to echo back the GET variables, or `http://httpbin.org/put` for PUT. Usage instructions at `httpbin.org`.

## Presentation

![[Structure Versus Presentation]]

![[CSS]]

![[Applying a Style Sheet]]

![[CSS Selectors]]

![[CSS Specificity]]

## Interaction

![[JavaScript]]

## Validity

![[HTML Validity]]

### Limitations of HTML

The deck's worked example is a recipe page — ingredients in a `table`, method in `<i>`, nutrition in a `<p>`. It renders, and it's still wrong:

- HTML is designed for [[Hypertext]], not for recipes — nothing in the markup says "2 tablespoons" is a *quantity*
- Structure and presentation stay intertwined, because there are no tags for the actual domain
- HTML validation is much weaker than *recipe* validation would be — no check that an ingredient has an amount
- The standard itself has been undermined by forgiving browsers

Which is the argument for a special-purpose markup language — and the motivation for XML.

## Characters and Encoding

![[Unicode]]

![[Code Point]]

![[Glyph]]

![[Character Encoding]]

![[UTF-8]]

![[UTF-16]]

![[Byte Order]]

![[ISO-8859-1]]

![[Internationalization]]

## Who Runs the Standards

![[W3C]]

![[WHATWG]]

## Lab 1 — HTML and CSS

**Deadline: Friday, Sept 19, 5:00 pm.** Assignment under *Assessments → Assignments* on Owl; submission in the same place.

**Submit:** a zip of your code **plus** the saved output of `git log`. Use *Download ZIP* from the *Clone or Download* button. Grading is done on the last commit before the deadline.

| Portion | Worth | What it covers |
|---|---|---|
| HTML & CSS | 70% | the page itself |
| Deployment | 30% | AWS server setup, remote access, configuring and starting a web server, troubleshooting |

Know the difference between the **workspace URL** and the **public URL** — the AWS workspace preview is not the same thing as the site being reachable on the internet.

### The Intangibles

Lab 1 is as much about getting the workflow right as it is about HTML — see [[Git Workflow]].

- Be comfortable cloning a project on any workstation, developing, testing, committing, pushing
- **Each unit of work = coding + testing + a commit.** Never commit code that isn't working
- Keep at least **3 copies**: GitHub, laptop, server
- Plan for something going wrong just before the deadline — because it will
- TAs are in the lab during lab hours

## Notes to Self

- Do the **W3Schools HTML tutorial** — the deck calls it a great introduction, and Lab 1 assumes self-study
- Try `validator.w3.org` on the Lab 1 page before submitting
- Browse `csszengarden.com` for what one HTML file looks like under radically different stylesheets
- Question left open on slide 58: what does the UTF-8 BOM `EF BB BF` decode to, and why is it there when byte order is irrelevant for single-byte code units?

## Online Resources

`w3.org/TR/html5/` · `w3.org/Addressing/` · `w3.org/Style/CSS/` · `validator.w3.org` · `whatwg.org` · `webplatform.github.io`
