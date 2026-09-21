- `app.listen()` - Sets up the port (e.g. putting in 5000 has your server run on localhost:5000), and the second parameter is an arrow function for what you want to happen when the server is accessed.
EXAMPLE CODE:
``` javascript
app.listen(5000, () => {
	console.log("Server is listening!")
})
```
- `app.get()` - Request Read Data
EXAMPLE CODE:
``` javascript
app.get('/', (req, res)=>{
	res.send("Home Page")
})

app.get('/about', (req, res)=>{
	res.send("About Page")
})
```
- `app.post()` - Request Insert Data
- `app.put()` - Request Update Data
- `app.delete()` - Request Delete Data
- `app.all()` - Works with all of the HTTP method commands
EXAMPLE CODE:
``` javascript
app.get('/', (req, res)=>{
	res.status(200).send("Home Page")
})

app.get('/about', (req, res)=>{
	res.status(200).send("About Page")
})

// Here, app.all will activate if a not defined website is accessed, to which it will return a 404 error.
app.all('*',(req,res)=>{
	res.status(404).send(<h1>Resource not found</h1>)
}
```
- `app.use()` - Responsible for middleware
