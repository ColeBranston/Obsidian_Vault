Elements can contain:  
  
- Text content  
- Element content  
- Attributes

![[Pasted image 20241123173642.png]]
![[Pasted image 20241123173651.png]]
![[Pasted image 20241123173722.png]]

### How to Access Their Content

![[Pasted image 20241123173757.png]]![[Pasted image 20241123173844.png]]
![[Pasted image 20241123173855.png]]

### Additional Methods

### 1. `createElement()`

- **Function**: Creates a new HTML element.
    
- **Usage**: You call this method on the document object and pass it the tag name of the element you want to create.
    
- **Example**:
    ```JavaScript
    let newDiv = document.createElement("div");
    ```
This creates a new `div` element that you can then add to the document.

### 2. `createTextNode()`

- **Function**: Creates a new text node.
    
- **Usage**: You call this method on the document object and pass it a string, which will become the text content of the node.
    
- **Example**:
```JavaScript
    let textNode = document.createTextNode("Hello, World!");
```

This creates a text node with the content "Hello, World!".

### 3. `appendChild()`

- **Function**: Adds a node as the last child of a specified parent node.
    
- **Usage**: You call this method on the parent node and pass it the node you want to append.
    
- **Example**:
    ``` JavaScript
    let parentElement = document.getElementById("parent");
    let childElement = document.createElement("p");
    parentElement.appendChild(childElement);
    ```

This appends the new `p` element as the last child of the element with the ID "parent".

### Putting It All Together

Here’s an example that combines these methods to create a new `div` with some text and append it to the body:

javascript

``` JavaScript
// Create a new div element
let newDiv = document.createElement("div");

// Create a new text node
let newText = document.createTextNode("Hello, World!");

// Append the text node to the div
newDiv.appendChild(newText);

// Append the div to the body
document.body.appendChild(newDiv);
```

In this example:

1. We create a new `div` element.
2. We create a new text node with the content "Hello, World!".
3. We append the text node to the newly created `div`.
4. We append the `div` to the document's body.

This is a fundamental way to dynamically manipulate the DOM and create interactive web pages. If you have more questions or need further examples, just let me know!