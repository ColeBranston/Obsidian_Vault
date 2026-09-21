There is a module named util which you get with the require method as such:
`const util = require('util');`

### `util.promisify(original)`

The `util.promisify` method in Node.js converts a callback-based function into a Promise-based one. It is a utility function in the built-in `util` module.

**Parameters:**

- `original` (`Function`): The original function that uses a callback convention where the last argument is a callback function following the `error-first` callback style (`(err, result) => {...}`).

**Returns:**

- A new function that returns a Promise. The Promise resolves with the same value or values as the original callback-based function would pass to its callback.

**Example:**

``` javascript
const util = require('util');
const fs = require('fs');

const readFileAsync = util.promisify(fs.readFile);

readFileAsync('example.txt', 'utf8')
  .then(data => {
    console.log(data);
  })
  .catch(err => {
    console.error('Error reading file:', err);
  });
```

In this example:

- `util.promisify` is used to convert `fs.readFile`, which reads a file asynchronously with a callback, into `readFileAsync`, a Promise-based function.
- `readFileAsync` returns a Promise that resolves with the contents of the file or rejects with an error.

**Notes:**

- The original function (`original`) must follow the Node.js callback convention (error-first).
- Promisified functions can be used with `async/await` syntax for cleaner asynchronous code.

**Compatibility:**

- Node.js v8.0.0 and later.

For more details, refer to the Node.js `util.promisify` documentation.
