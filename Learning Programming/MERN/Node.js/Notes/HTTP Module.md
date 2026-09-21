Initialize it using the require method as so
``` javascript
const http = require('http');
```

Then to create a server, use the createServer method
``` javascript
const server = http.createServer((req,res)=>{
	res.write("Welcome to our home page")
	res.end()
})

server.listen(5000) // Setting the port that our server listens to
```

The *req* parameter represents an incoming request. That gives you the method, body and such of the http request. The *res* parameter is the response that we are sending back.

Here is how you handle different requests:

``` javascript
const http = require('http');

const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.end("Welcome to our home page");
        return; // End further processing for this request
    }
    if (req.url === '/about') {
        res.end('Here is our short history');
        return; // End further processing for this request
    }
    // If none of the above routes match, handle as 404
    res.end(`
    <h1>Oops!</h1>
    <p>We can't seem to find the page that you are looking for</p>
    <a href="/">back home</a>
    `);
});

server.listen(5000); // Setting the port that our server listens to
```

The writeHead method `http.writeHead(response code, content-type)` provides the metadata of the response. Here is an example

`res.writeHead(200, {'content-type':'text/html'})


