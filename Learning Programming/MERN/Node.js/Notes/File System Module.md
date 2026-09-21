#### Synchronously 
Set this up by using the following code:
``` javascript
const fs = require('fs');
```

use the readFileSync method to read a file:

``` javascript
const text = fs.readFileSync('./directory/text.txt', 'utf8');
```

Now the text constant will be a string version of the text file.

Using writeFileSync method to write to a file, like so:

``` javascript
fs.writeFileSync('./directory/write.txt', 'Hello World');
```

This writes to the file in the directory called write.txt the words "Hello World". If there is already text in that text file, it will be overwritten, unless you use the append version as so:

``` javascript
fs.writeFileSync('./directory/write.txt', 'Hello World',{flag:'a'});
```

#### Asynchronously 
It is still using the same require method as in synchronously. However, the two methods are now readFile and writeFile. 

``` javascript
const fs = require('fs');

fs.readFile('./directory/text.txt', 'utf8', (err, result) => {
	if (err) { 
		console.log(err)
		return
	}
	const text = result
	console.log(result)
})

fs.writeFile('./directory/write.txt', text, {flag:'a'})
```

#### Sync VS Async
Synchronous runs consecutively, the lines of code after the synchronous function will not run until that synchronous function fully executes. However, an Asynchronous function does not hold up the code, and rather offloads it until it is finished.

 