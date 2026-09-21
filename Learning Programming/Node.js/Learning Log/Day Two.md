1. Learned to initialize a a [[package.json]]:
```
npm init -y
```
2. Learned to install necessary packages:
```
npm install express
npm install nodemon
```

3. Nodemon enables that when APIs are saved, they automatically re-deploy. In your package.json you must put this:
```
 "scripts": {

    "test": "echo \"Error: no test specified\" && exit 1",

    "start" : "nodemon API.js" //This is the part you add -Where API.js is the name of your progam

  },
```

4. Sample Of Code Common To Every API:

```JS
const express = require('express'); //Initialization

const app = express(); //Initialization

app.use((req, res, next) => { //Middleware Function called everytime a request occurs
  console.log('Time: ', Date.now());
  next(); //Required, directs the program to the next middleware function or to the rest of the code
});

app.get('/', (req, res) => {
  res.send('Successful response.'); //When a get request is made to this API it will send this
});

//Listening for when a user connects to the API
app.listen(3000, () => console.log('Example app is listening on port 3000.'));
```

5. When are requesting an API you do the following is react:
   ```JS
   const callAPI = async() => {
	   const response = await fetch(apiURL, {methods: "GET"})
	   console.log(response)
   }
```

Note: async allows a function to be performed asynchronously or at the same time as other functions in your program based on the performance and rather, if a part of the function is taking too long (these points are indicated by the "await" keywords)

6. Stupid nodemon can be used to run your JS file that calls the API, but it can't be used to update it when a save occurs reliably : (
7. When doing a post request, you may send variable through the url so that:

Client:

```JS
var x = 1
var y = 2
const callAPI = async()=>{
	const response = await fetch(`http://localhost:3000/${x}/${y}`, {method:"POST"}) //Make sure you use ticks `` for the inline variable usage with the dollar sign and curly brackets -in code this is more apparent
	console.log(response)
}
```

API:

```JS
const express = require('express')
const app = express()

app.post("/:var1/:var2", (req, res)){
	res.send(req.params.var1, req.params.var2) //We are able to address the parameters here
}
```

- Isn't this incredible!!!