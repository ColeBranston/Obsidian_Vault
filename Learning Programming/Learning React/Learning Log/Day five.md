1. JSX is converted to HTML through BABBLE
2. One big difference between JSX and HTML is that instead of using:
```html
<p class="This is a class"></p>
```

We use

```JSX
<p className="This is a class"></p>
```
3. Any **self-closing tags** in HTML5 such as \<br> can be **used in JSX by** adding a **space and "/"** after such that **\<br>** ----> **\<br />**
4. When we use variables when programming [[components]], we define them above the "return(" portion of the code; before the JSX, and reference them in "{}" brackets in our JSX code similarly to how we would do math
```JSX
function App = () => {
	const variable = "This is a variable";
	const sum = 9 + 9;
	return(
	<h1>This shows a variable:<br />{ variable }</h1>
	<h1>This shows a variable that does mathL<br />{ sum }</h1>
	);
}
```

5. [[React]] converts any data type into a string before it displays it to our screen