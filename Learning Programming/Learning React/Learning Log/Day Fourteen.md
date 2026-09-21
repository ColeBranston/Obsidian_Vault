1. Today I learned about the useEffect hook. The useEffect hook is best used for APIs given that it runs an arrow function between its "()" brackets whenever the DOM is first rendered, when there is a state change within the file, or when a specific state change occurs in a file. Usage looks something like this:
```JS
import {useState, useEffect} from 'react'
const App = () => {
useEffect(()=>{
	console.log("The DOM has loaded")

}, []); //Any varibale that changes is put inside the square brackets for the useEffect to invoke the function when it changes. Put nothing in the brackets for it to fire one time once the DOM loads, or exclude this parameter to invoke the function once the DOM is loaded or whenever there is a state change.
return(
	<h1>Hey this is a Title</h1>

)
};
export default App;
```

2. How to get the [[scroll in the y-axis]]
