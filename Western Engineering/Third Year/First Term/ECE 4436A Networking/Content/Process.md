A **process** is a program actively running inside a host: the OS's unit of execution, with its own memory. Hosts don't communicate; **processes** do. A browser and a web server are two processes, and every conversation in this course runs between two of them.

- The same two machines can host several unrelated conversations at once (browser ↔ web server, mail client ↔ mail server).
- **Client** and **server** are roles, not hardware ([[Client and Server]]): the process that speaks first is the client; the one already waiting to be contacted is the server. It reaches the network through a [[Socket]].
- Application code only runs at the [[Network Edge|edge]]: routers in the core carry your messages but never run your code, which is why a new app (e.g. the Web) needs no permission from any network operator.
