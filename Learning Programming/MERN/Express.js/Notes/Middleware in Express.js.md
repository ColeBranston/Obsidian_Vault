Middleware, as the name implies, is between the request and the response. 

Let us say we have an app with the following code:

```javascript
const express = require('express')
const app = express()

app.get('/', (req, res) => {
	res.send('Home')
})
app.get('/about', (req, res) => { 
	res.send('About')
})

app.listen(5000, () => {
	console.log('Server is listening on port 5000...')
})
```

Now let us say we want the method, url, and time for every single route, and I were to have multiple routes, that would not be reasonable. I would start off by creating a function:

```javascript
const logger = (req, res, next) => {
	const method = req.method;
	const url = req.url;
	const time = new Date().getFullYear();
	console.log(method, url, time);
	next();	
}
```

You would then need to pass the logger method in each .get() as a parameter The next(); function allows the middleware to stop running and passes onto the next function in the app.get(), without it. Passing it through app.get; would be done as so

```javascript
app.get('/', logger, (req, res) => {
	res.send('Home')
})
```

[[app.use]] is the part 2 to this note
