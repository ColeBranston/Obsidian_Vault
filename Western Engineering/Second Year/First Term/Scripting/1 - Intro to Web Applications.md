**Desktop Applications**: The application needs to be installed on every desktop

## Web Applications:

___

- Only one installation is needed on a machine with server [[software]] Ex. Apache, Webserver
- This installation is accessible from any other device that has client [[software]] like the web browser, Ex. Edge, Chrome. 

→ Made popular due to their scalability and flexibility

![[Pasted image 20240906142935.png]]

***Next...***

**HTML:** stands for **Hypertext Markup Language**
- created to set standards that govern the communications between clients and servers

Ex.

![[Pasted image 20240906143016.png]]

___
## Role of the Client VS. Server

![[Pasted image 20240906143451.png]]

### The Client
___
1. Receives the requested URL from the user.  
2. Creates the HTTP request  
3. Sends the request to the server  
8. Receives the HTTP Response from the server  
9. Displays the content to the user
___
### The Server

___
4. Receives the HTTP request from the client  
5. Finds the requested resource (e.g., an HTML page)  
6. Creates the HTTP response containing the requested resource  
7. Sends the response to the client
___

## Types of Requests

___

**GET**: Asks to _get_ the thing (resource/file) at the requested URL.

→ The browser creates a GET request when a link or other type of URL is clicked

**POST**: Asks the server to _accept_ the body info attached to the request, and give it to the thing at the requested URL. It's like a fat GET... a GET with extra info sent with the request.

**HEAD**: Asks for only the _header_ part of whatever a GET would return. So it's just like GET, but with no body in the response. Gives you info about the requested URL without actually getting back the real _thing_.

**TRACE**: Asks for a loopback of the request message, so that the client can see what's being received on the other end, for testing or troubleshooting.

**PUT**: Says to _put_ the enclosed info (the body) at the requested URL.

**DELETE**: Says to _delete_ the thing (resource/file) at the requested URL.

**OPTIONS**: Asks for a list of the HTTP methods to which the thing at the requested URL can respond.

**CONNECT**: Says to _connect_ for the purposes of tunneling.

![[Pasted image 20240906173156.png]]

![[Pasted image 20240906173255.png]]

![[Pasted image 20240906173541.png]]

___
