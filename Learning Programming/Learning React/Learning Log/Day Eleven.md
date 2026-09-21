1. Discussed [[props]]. They are a [[components]] specific innate object that are used when having to delegate information across component files.

**App.js:**

```JS
import Title from './title.js'
const App = () => {
return(
	<Title text="This title shows props" val={1}/>
)};
export default App;
```

**title.js:**

```JS
const Title = (props) => {
return(
	<h1>{props.text}<br />This is prop number {props.val}</h1>
)}
export default Title;
```

2. Additionally, instead of using the parameter "[[props]]" you may break apart the object by using the "{}" brackets:

**title.js:**

```JS
const Title = ({text, val}}) => {
return(
	<h1>{text}<br />This is prop number {val}</h1>
)}
export default Title;
```
