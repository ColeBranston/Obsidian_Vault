1. Discussed and demonstrated the usage of [[components]]:

**In a file called navbar.js:**

```js
const navbar = () => {
return(
	<a href="/">This is a link to the homepage</a>
)};
export default navbar;
```

2. Demonstrated how to call these [[components]] into the root component or [[App.js]]

**In the App.js file:**

```js
import "./App.css";
import navbar from "./navbar.js";

const App = () => {
return(
	<h1>Title</h1>
	<p>Below I am calling the navbar</p>
	<navbar />
)};
export default App;
```

>Notice that when we import we use **"./f**ileName" **to address** the file in **our current directory**

>When we call these [[components]] after they have been imported using "**import navbar from "navbar.js""** w**e input them as a self-closing tag** such that the navbar appears as <navbar />. This is similar to how we do a break in JSX as <br /> rather than the \<br> counter part

3. [[CSS files]] may be completed per component or just an encompassing index.css file. It doesn't really matter which one. Regardless, importing these stylesheets must be done correctly.
4. I recommend checking out [[Consts Vs. Functions]]

