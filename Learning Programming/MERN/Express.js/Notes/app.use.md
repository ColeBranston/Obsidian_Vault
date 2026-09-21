This is a middleware function. 

It makes it easier to add middleware functions to any route. If we were to turn a function into a module, we can then require import it. Then, using app.use() we can pass the module. This will cause app.use() to invoke the module EVERYTIME we make an API call for a .get() method after the app.use() method. We can also set the path we want for the app.use() like so

``` javascript
app.use('/api', function)
```

This has the module run at any instance of a path starting with /api being accessed.