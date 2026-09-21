1. You may pass functions into components as props in the instance where that function is changing something outside of the component. Such that the function is defined in the file that contains the altered state, and rather the function is passed into the component:

App.js

```JS
import Button from "Button"
import {useState} from 'react'
const App = () => {
var [num, setNum] = useState(0);
const funFunction = () => {
 setNum(num+=1);
}
return(
	<>
		<h1>This is a title with the number {num}</h1>
		<Button funFunction = {funFunction}/>
	</>
)
};
export default App;
```

Button.js

```JS
const Button = (props) => {
return(
	<button onClick={props.funFunction}>+ 1</button>
)
};
export default Button;
```

>You may only reference functions that do not involve hooks. That's why in this example you have a function that does it for me

2. Using in-line styling is super useful for animations. It allows you to make a special CSS that uses code in you JS