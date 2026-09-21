#### Initialize as a variable
``` javascript
const os = require('os');
```

Now, when you want to use the functions or fields of the os module, you can use the dot operator. For example, you can get info on the current user by using the method called "userInfo()"

This can be done as so:

``` javascript
const user = os.userInfo();
```

Here is a method that returns the system uptime in seconds:

``` javascript
console.log(`The System uptime is ${os.uptime()} seconds`)
```

