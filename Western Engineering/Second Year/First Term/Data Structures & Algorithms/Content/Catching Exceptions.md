- the general methodology for handling exceptions is a **try-catch** construct in which a guarded fragment of code that might throw an expectation is executed.

- if it **throws** an exception, then that exception is caught by having the flow of control jump to a predefined **catch** block (**exception handler**) that contains the code to apply an appropriate resolution.

- if no exception occurs in the guarded code, all **catch** blocks are ignored/skipped.

- **It is mandatory that a try block should contain at least one catch block**

## Example

![[Pasted image 20240918002402.png]]

![[Pasted image 20240918002414.png]]

![[Pasted image 20240918002431.png]]

![[Pasted image 20240918002443.png]]

