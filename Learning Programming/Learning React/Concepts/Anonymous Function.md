**A function that is without a name.** It is a basic template for a function

In JavaScript it looks like this:

```js
() => {
//Function content
}

```

In application it looks like this:

```js
const App = () => {
	const clickHandle = (Name) = > {
		console.log("My name is" + Name)
	};

	return(
		<button onClick={() => { //Here is where this concept is applied
			clickHandle("Jack")
		}
		}>This is a button</button>
	)
};
export default App;
```

>Note: If just one line is used in an arrow function we may remove the "{}" and just put everything all in one line such that:

```JSX
<button onClick={() => clickHandle("Jack")}>This is a button</button>
```
