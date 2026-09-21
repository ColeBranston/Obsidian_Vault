This is a quick concept that has to do with storing sensitive information. In short, you don't want to store database addresses and API addresses in web browser code because the user can easily see this information by inspecting the pages elements. This is why you need a .env file or environmental variable file.

To put one in use these commands:
```js
npm install dotenv --save
```

and

```js
require('dotenv').config()
```

Then put you variables in the file and reference them in you code as:

```js
process.env.variableName
```
