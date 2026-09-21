If I have some API link (lets say i have /api/products/) we would want a different page for different products. We can do this based on something called "route parameters"

This will make the link dynamic by using a colon, such as so: /api/products/:productID

You then can get the route parameter WITHIN the get request from the request parameters as such:
`const {productID} = req.params;`

In total, it'll look like this:
``` javascript
app.get('/api/products/:productID', (req, res) => {
	const {productID} = req.params;
	const singleProduct = products.find((product) => product.id === Number(productID))
	if(!singleProduct){
		return res.status(404).send("Product Does Not Exist")
	}
	res.json(singleProduct)
})
```

