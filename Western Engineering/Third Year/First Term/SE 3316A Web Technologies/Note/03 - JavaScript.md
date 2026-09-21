---
source: webtech-2025-02-javascript.pdf
tags: [SE3316A, WebTechnologies, JavaScript]
---

# JavaScript

The through-line: JavaScript is the third leg of the client-side stool (alongside HTML and CSS) — it's a dynamically-typed, prototype-based language that lets the browser compute, talk to the [[Document Object Model]], and respond to events, instead of everything living on the server.

> [!info]- Slide index — where each section comes from
> | Section of this note | Slides in the deck |
> |---|---|
> | *What is JavaScript* | 2 What is JavaScript · 3 Class vs. Prototype |
> | ⤷ `Client-Side Scripting` | 2 What is JavaScript · 4 Client-Side Scripting · 5 Advantages of Client-Side Scripting · 6 Disadvantages of Client-Side Scripting · 7 Client-Side Flash · 8 Client-Side Java Applets · 22–23 Users Without Javascript |
> | ⤷ `The noscript Tag` | 24 The `<noscript>` tag |
> | ⤷ `AJAX` | 9 JavaScript History · 10 JavaScript in Modern Times · 11–12 HTTP request-response loop · 13 Asynchronous data requests |
> | ⤷ `Including JavaScript` | 14 JavaScript Libraries · 15 JavaScript Frameworks · 16 Including JavaScript Libraries · 17 Where does JavaScript go? · 18 Inline JavaScript · 19 Embedded JavaScript · 20 External JavaScript · 21 Debugging JavaScript |
> | **JavaScript Basics** | 25–65 (see below) |
> | ⤷ `Variables and Data Types (JavaScript)` | 25 JavaScript's Quirks · 26–28 Variables · 29 Variables and Data Types · 34 Comparison Operators |
> | ⤷ `Strict Mode` | 30–31 Strict Mode |
> | *JavaScript Output* | 32–33 JavaScript Output |
> | ⤷ `Truthy and Falsy` | 35 Logical Operators · 36–38 Conditionals · 39 Conditionals (Truthy-ness) |
> | *Loops and Arrays* | 40 Loops · 41 For Loops · 42–44 Arrays |
> | ⤷ `Function (JavaScript)` | 45–46 Objects (preview) · 47–48 Functions · 49 Nested Functions · 52 Objects and Functions Together · 57 Ways of Declaring Functions · 58 Self Learning Topics · 59 Arrow Functions |
> | ⤷ `Callback Function` | 50 Callback Functions · 51 Anonymous Function as Callback |
> | ⤷ `Scope in JavaScript` | 53–54 Scope in JavaScript |
> | ⤷ `Function Constructors` | 55 Function Constructors |
> | ⤷ `Passing Parameters to Functions` | 56 Passing Parameters to Functions |
> | ⤷ `Variable Hoisting` | 60 Variable Hoisting · 61 Function Hoisting |
> | *Alert and Errors* | 62 Alert · 63 Errors using try and catch · 64 Throw your own · 65 Tips |
> | **JavaScript Objects** | 66–82 (see below) |
> | ⤷ `JavaScript Object` | 66 *JAVASCRIPT OBJECTS (divider)* · 67–68 JavaScript Objects · 69 Constructors · 70 Properties · 71 Methods · 72 Objects Included in JavaScript · 78 Math · 79–80 String · 81 Date · 82 Window |
> | ⤷ `Object Prototype` | 73–75 Object Prototypes · 76 Extending Objects with Prototypes · 77 Advanced Prototype Usage |
> | **The Document Object Model** | 83–105 (see below) |
> | ⤷ `Document Object Model` | 83 *THE DOM (divider)* · 84–85 The DOM · 86–88 DOM Nodes · 89–90 Document Object · 91–93 Accessing nodes · 94–96 Element node Object, Navigating DOM Tree · 97–100 Modifying a DOM element · 101 Tools for Modifying DOM · 102–104 Changing an element's style, More Properties |
> | *Homework* | 105 Homework |
> | **JavaScript Events** | 106–122 (see below) |
> | ⤷ `JavaScript Event` | 106 *Section 7 of 8 (divider)* · 107–108 JavaScript Events · 109–110 Handling JavaScript Events · 111–112 Event Listener Approach · 113 Event Object · 114 Properties of Event Object · 115 Event Types · 116 Mouse events · 117–118 Keyboard events · 119–120 Form Events · 121–122 Frame Events |
> | **Forms** | 123–127 |
> | ⤷ `Form Validation (JavaScript)` | 123 *FORMS (divider)* · 124–126 Validating Forms · 127 Submitting Forms |
> | *Touch Events* | 128 Touch Events |
> | *Summary* | 129 Summary · 130 Essential Online Resources |

## What Is JavaScript

![[Client-Side Scripting]]

![[The noscript Tag]]

## History and AJAX

![[AJAX]]

## Including JavaScript in a Page

![[Including JavaScript]]

## JavaScript Basics

![[Variables and Data Types (JavaScript)]]

![[Strict Mode]]

### Output

Three ways to produce output: `alert()` (pop-up box) · `console.log()` (browser's JS console — the modern default) · `document.write()` (writes markup directly into the document — **avoid**, modify the DOM instead).

![[Truthy and Falsy]]

### Conditionals and Loops

`if`/`else if`/`else` and `switch` read almost identically to Java or C++. Loops use the same `()`/`{}` blocks: `while` initializes, tests, and increments a loop-control variable across three separate statements; `for` combines all three into one. Ternary-style conditional assignment is also available for one-line branches.

### Arrays

Two ways to define an array: object-literal notation (preferred — less typing, more readable, faster) or the `Array()` constructor. Arrays are zero-indexed, accessed with `[]`. Useful methods: `.length`, `.push()`, `.pop()`, `.concat()`, `.slice()`, `.join()`, `.reverse()`, `.shift()`, `.sort()`.

### Functions

![[Function (JavaScript)]]

![[Callback Function]]

![[Scope in JavaScript]]

![[Function Constructors]]

![[Passing Parameters to Functions]]

![[Variable Hoisting]]

### Alerts and Error Handling

`alert()` shows a pop-up; `console.log()` writes to the dev-tools console instead — more practical day to day. A `try`/`catch` block lets code recover from a thrown exception instead of the JS engine halting; `throw` lets your own code raise an exception the same way. Both are meant for genuinely exceptional cases — throwing interrupts sequential execution, so subsequent code doesn't run until the `catch` is reached.

## JavaScript Objects

![[JavaScript Object]]

![[Object Prototype]]

## The Document Object Model

![[Document Object Model]]

> [!tip] Homework
> Go through the W3Schools JavaScript DOM tutorial and cross-reference these slides against the code samples there.

## JavaScript Events

![[JavaScript Event]]

## Forms

![[Form Validation (JavaScript)]]

**Touch events** are a newer category for touch-screen devices (`touchstart`, `touchmove`, `touchend`), analogous to mouse events (`mousedown`, `mousemove`, `mouseup`); browser support was still limited as of 2017.

## Summary

Basic JavaScript syntax and semantics · JavaScript's role in separating content, presentation, and interaction · the DOM · event handling. Further reading: MDN, W3Schools, and the Owl Resources → Reading section.
