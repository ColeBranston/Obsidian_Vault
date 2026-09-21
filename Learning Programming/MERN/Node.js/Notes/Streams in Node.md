Streams are used to read or write sequentially.

There are four different types of streams:
1. Writeable - Used to write data sequentially
2. Readable - Used to read data sequentially
3. Duplex - Used to read and write data sequentially
4. Transform - Data can be modified when writing or reading

We can use events on streams. 

The stream module can be imported using the require method


### Read File
Start by importing the fs module:
`const {createReadStream} = require('fs');`

Then set the read stream that you want based on the directory of the file you want to read:
`const stream = createReadStream('./text.txt');`

Then, use the "on" method (review [[Events Emitter]]).
```javascript
stream.on('data', (result) => {
	console.log(result)
})
```

The main benefit of this is that streams read data in chunks, allowing processing of bigger files to be much simpler. 