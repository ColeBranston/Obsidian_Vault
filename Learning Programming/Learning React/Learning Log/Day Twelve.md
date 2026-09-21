This lesson was very brief 
1. Covered the **.filter()** function. It's **very similar to the .map** function but returns an array that contains items that fulfills a unique condition. It's potential was shown through a search:

```Js
import "./App.css"
const App = () => {
	const blog = [
	{content:"This is some content", author:"Jack"},
	{content:"This is some content", author:"Cole"},
	{content:"This is some content", author:"Jack"}
	] 
	const newBlog = blog.filter((post)=>post.author == "Jack") //This is showing the new concept. Will return an array that contains objects that have an author of "Jack".
	return(
		<h1>{newBlog}</h1>
	)
};
export default App
```

>The call back function within the "()" must have a condition for the array item to be kept following the "=>". 

Note: The function .filter() only generates a new array and doesn't alter the one already present