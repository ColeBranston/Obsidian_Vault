The event loop is what allows Node.js to perform non-blocking I/O operations - despite the fact that JavaScript is single-threaded - by offloading operations to the system kernel whenever possible. 

JavaScript tends to read everything line-by-line. When building browser javascript tasks, we can offload to the browser (such as using the setTimeout() method)

The event loop is mainly used with multiple users, and you have a user that requests a functionality that takes a while. Then the event loop registers the callback, otherwise everyone else would have to wait. We run our immediate code first, then when we have the time, we execute the asynchronous callback. 