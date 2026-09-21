A module is encapsulated code. 

The main point is to only share the bare minimum. 

You start of by making a new file, and everything you want to share, put in module.exports

for example

``` javascript
// Local
const credit_card = "credit card number";
// share
const name = "Hadi";
var age = 19;

module.exports = {name, age} 
```
This basically shows what we want to share in the file, which are the two variables name and age

You can also export a function like setCustomer using module.exports in the same way WITHOUT using a hashmap like so

``` javascript
const greet = (name, age) => {console.log(`Hello ${name} you are ${age} years old`)}

module.exports = greet;
```

You can then use both in tandem like so:

``` javascript
const info = require('./hadi_info');
const greet = require('./greet_function');

greet(info.name, info.age);
```