The object that represents the JavaScript environment and encapsulate built-in objects, e.g. the console, the definition of the Array, … etc.

![[Pasted image 20241123155736.png]]

Any object that is not explicitly defined or is not part of any object is assumed to be part of the global object.

The object that represents the JavaScript environment and encapsulate built-in objects, e.g. the console, the definition of the Array, … etc.

**NodeJS:** in NodeJS it's called global
**Browser**: in the browser its called window

**Shared**:  `globalThis` property was added to unify the reference between both environments

**We have to be careful though, globalThis still refers to different environment objects**

**Examples:**

1. 'prompt' is specific to the browser

![[Pasted image 20241123160154.png]]

2. 'process' is specific to node

![[Pasted image 20241123160209.png]]

