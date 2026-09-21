Today was a little peculiar; I learned todays information on Ethan's computer at 3 in the morning well after -feel bad about this one- he had fallen asleep.

>Today I applied many of the concepts previously discussed quite successfully might I add

1. A variable or constant **doesn't **need to be called in as a parameter if defined within a arrow/regular function. 
2. When taking in parameters, the first parameter of an event function will be the event properties, *e*:

```js
const App = () => {
	var num = 5
	return(
		<button onClick={(thisIse)=> num+=1}>This is a button</button> //The thisIse parameter renames the defualt e parameter as thisIse. Any subsequent parameter will be its own. That being said, e is always in the function even if not taken in through a parameter.
	)};
export default App
```

3. Check out [[The Difference Between a Var and Const]] data types.
4. When using several elements within a return statement of a component/template, you have to enclose your JSX in some form of encompassing tags:

Either:

```JSX
<div>
//Here is some more JSX code
</div>
```

And:

```JSX
<>
//Here is some more JSX code
</>
```
>I prefer this one

But also:

```JSX
<React.Fragment>
//Here is some more JSX code
</React.Fragment>
```

5. **We are able to perfectly update variables the way that I have previously discussed** or referenced: The simple process of defining a variable within a component, and manipulating it within JSX code whether that's through an onClick function or another way. However, the process is a little different and more complex if we are trying to display this variable apart of the template or to the user. I.e. a counter system that displays the count. 
>This introduces [[hooks]]
>In this example we use the useState hook

If we are wishing to display a constantly changing variable we do it this way (Primitive example):

```js
import {React, useState} from 'react'

const App () => {
	var [count, changeCount] = useState(0) //You need both the variable that is being displayed, and a function reference that's paremter alters the displayed variable. The function is defined here so it can be later referenced. Note that the "0" in the "()" brackets indicates what the displayed variable "count" is defined as!
	return(
		<h1>{count}</h1>
		<button onClick={()=> changeCount(count+=1)}></button //Here we call the function when a user clicks the button that, in turn, increases the count variable.
	)
};
export default App
```

6. useState links a function to a variable so that any parameter passed into the function becomes the variable. 
7. You may use if and else statements in JavaScript code before a component/template begins to return JSX and "?" method when doing if and else statements inline and determining whether to display whole [[components]] or not:
```JS
var yesNo = false

//This is traditonal method
const randomFunction = (num)=>{
	if (num) > 5 {
		yesNo = true
	};
	else{
		yesNo = false
	};
};
const App = ()=>{

return(
	<>
		<h1>Title</h1>
		<button onClick={()=>{randomFunction(7)}}></button> //Makes the yesNo variable true
		{(yesNo === 1)? <h1>yesNo is True</h1> : <h1>yesNo is False</h1>} //This is the "?" method
	</>
)};
export default App;
```