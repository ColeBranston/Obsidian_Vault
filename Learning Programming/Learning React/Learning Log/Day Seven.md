Today onClick and event properties were introduced. 

1. A button looks like this in JSX code:
```jsx
<button>This is a button</button>
```

2. An onClick function looks like this in [[React]]:

```js
const handleClick= () => {
	console.log("Button was pressed")
}

const App = () => {
return(
	<h1>Title</h1>
	<p>This is some text</p>
	<button onClick={handleClick}></button> //Notice the button
)};

export default App
```

3. Within the dynamic value brackets **"{}"** you may only reference the function rather than invoke it or call it. **This makes things tricky when trying to pass in parameters!**

>This won't work!

Because we  are invoking or calling the function with "()" brackets rather than referencing the function

```JSX
const handleClick = (message) => {
	console.log(message)
};

const App = () => {
return(
	<button onClick={handleClick("No Work!")}>This button will not work</button>
)};
export default App
```

>So how do we pass in a parameter?

4. We can use an [[anonymous function]] (Demonstrated in this note)
5. The onClick function is an event function that, naturally, always uses the event parameter *e* which has a ton of different properties that may become useful:
```js
const App = () => {
	const handleClick = (e) => {
		console.log(e.target)
	}
	return(
	<h1>Title</h1>
	<button onClick = {(e) => handleClick(e)></button> //1. This event form is demonstrated in the [[anonymous function]] link 2. notice how the event function is taken in as a parater in the arrow function
	)};
export default App
```

