## Overview

In Express, a router is a mini-instance of an Express application. Routers can be used to handle different routes and can be modularized to organize the codebase better.

## Basic Router Setup

### Creating a Router

To create a router, you use the `express.Router()` function:

```javascript
const express = require('express');
const router = express.Router();
```

### Defining Routes

You can define routes on the router instance just like you do on the main `app` instance:

```javascript
router.get('/path', (req, res) => {
  res.send('GET request to the specified path');
});

router.post('/path', (req, res) => {
  res.send('POST request to the specified path');
});
```
### Using the Router in an Application

To use the router in your main Express application, you need to import it and use it with `app.use()`:

```javascript
const express = require('express');
const app = express();
const myRouter = require('./myRouter'); // Assuming myRouter.js exports the router

app.use('/my-path', myRouter);

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
```

## Router Controllers

Router controllers help separate route definitions from the logic that handles the requests. This leads to cleaner, more maintainable code.

### Creating a Controller

A controller is just a module that exports functions. Each function corresponds to a handler for a specific route.

**controllers/myController.js**:

```javascript
exports.getItems = (req, res) => {
  // Logic to handle GET requests
  res.send('Items retrieved');
};

exports.createItem = (req, res) => {
  // Logic to handle POST requests
  res.send('Item created');
};

exports.updateItem = (req, res) => {
  // Logic to handle PUT requests
  res.send('Item updated');
};

exports.deleteItem = (req, res) => {
  // Logic to handle DELETE requests
  res.send('Item deleted');
};
```

### Using the Controller with a Router

You then import the controller into your router module and use the exported functions as route handlers.

**routes/myRouter.js**:

```javascript
const express = require('express');
const router = express.Router();
const myController = require('../controllers/myController');

router.get('/items', myController.getItems);
router.post('/items', myController.createItem);
router.put('/items/:id', myController.updateItem);
router.delete('/items/:id', myController.deleteItem);

module.exports = router;
```

### Integrating the Router with the Application

**app.js**:

```javascript
const express = require('express');
const app = express();
const myRouter = require('./routes/myRouter');

app.use('/api', myRouter);

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});

```

## Middleware in Routers

You can also use middleware specific to a router. This middleware will only apply to the routes defined in that router.

```javascript
const express = require('express');
const router = express.Router();

const myMiddleware = (req, res, next) => {
  console.log('Middleware executed');
  next();
};

router.use(myMiddleware);

router.get('/path', (req, res) => {
  res.send('GET request with middleware');
});

module.exports = router;
```

## Nested Routers

You can nest routers for more modular organization of routes.

**routes/adminRouter.js**:

```javascript
const express = require('express');
const adminRouter = express.Router();
const adminController = require('../controllers/adminController');

adminRouter.get('/dashboard', adminController.getDashboard);

module.exports = adminRouter;
```

**routes/mainRouter.js**:

```javascript
const express = require('express');
const router = express.Router();
const adminRouter = require('./adminRouter');

router.use('/admin', adminRouter);

module.exports = router;
```

**app.js**:

```javascript
const express = require('express');
const app = express();
const mainRouter = require('./routes/mainRouter');

app.use('/api', mainRouter);

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
```
## Summary

- **Router**: An isolated instance of middleware and routes.
- **Controller**: A module exporting functions to handle requests.
- **Middleware**: Functions that execute during the lifecycle of a request to a route.
- **Nested Routers**: Routers used within other routers for modular structure.

Using these components together helps to keep your code clean, organized, and maintainable.