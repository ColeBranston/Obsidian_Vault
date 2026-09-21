If a DOM query returns more than one element, it is known as a **NodeList**.

Items in a NodeList are numbered and selected like an array:

```JavaScript
var elements;
elements = getElementsByClassName('hot'); //from previous example
var firstItem = elements[0];
```

**You can check if there are elements before using a NodeList:**

```JavaScript
if (elements.length >= 1) {
  var firstItem = elements[0];

}
```

