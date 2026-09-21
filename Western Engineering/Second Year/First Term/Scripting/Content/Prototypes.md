- In addition to their set of properties, most objects also have a prototype.
- A prototype is another object that is used as a fallback source of properties.
- When an object gets a request for a property that it does not have, its prototype will be searched for the property, then the prototype’s prototype, and so on.

![[Pasted image 20241123182336.png]]

The prototype relations of JavaScript objects form a tree-shaped structure, and at the root of this structure sits Object.prototype.

![[Pasted image 20241123182404.png]]

Many objects don’t directly have Object.prototype as their prototype but instead have another object that provides a different set of default properties.  
  
Functions derive from Function.prototype, and arrays derive from Array.prototype.

![[Pasted image 20241123182423.png]]

You can use Object.create() to create an object with a specific prototype.

![[Pasted image 20241123182441.png]]

### Prototypes and Classes

- JavaScript’s prototype system can be interpreted as a somewhat informal take on the object-oriented concept “classes”.
- A class defines the template of the objects (i.e. what methods and properties the object would have) Such an object is called an instance of the class

Towards a **constructor function**  
-> creates an object based on a prototype and initializes the values of its properties

![[Pasted image 20241123182537.png]]

**Examples:**

![[Pasted image 20241123182605.png]]

**Note:**  Multiple courses objects with similar structure

![[Pasted image 20241123182636.png]]

Create an object to be used as a prototype.

-> This approach would be useful if we want to set default values that don’t need to set in the different objects

When we try to read a property that doesn’t exist it will fall back to the properties of the prototype

But when we try to write to a property that doesn’t exist, the property will be added to the object

![[Pasted image 20241123182735.png]]

![[Pasted image 20241123182749.png]]

