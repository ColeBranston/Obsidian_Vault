Think of it like a "side effect", something that happens when something else happens. 

useEffect allows us to execute some code after the page is loaded

**Import**

``` jsx
import { useEffect } from 'react';
```

**Arguments**
useEffect(callback function, dependencies array)

**The Callback Function**
This is the function that will occur on call of the useEffect function. 

**The Dependency Array**
This allows us to restrict what state we care about for useEffect to be triggered. If you have NO dependency array, the useEffect will be called for any state change.

If you pass an empty dependency array such as \[], then useEffect will only execute once (on the first state change or if the page is reloaded).

If you pass a dependency array with a state in it \[state], useEffect() will only be executed when "state" is updated.

If you pass a dependency array with multiple states in it \[state1, state2, state3], useEffect() will only be executed when any of the states inside the array are changed. 