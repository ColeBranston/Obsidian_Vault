The events module can be acquired through the require() method
`const EventEmitter = require('events');`

This is an object, create a reference variable as such:

`const customEmitter = new EventEmitter();`

`customEmitter.on('response', ()=> {console.log('data received')} 
This snippet of code logs "data received" when the event "response" occurs

`customEmitter.emit('response')`
This TRIGGERS the event of the code snippet above.

