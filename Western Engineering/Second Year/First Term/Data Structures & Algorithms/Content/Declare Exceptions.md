### Declaring Checked exceptions

- Every method must state the types of **checked** (it is optional for unchecked exceptions) **exceptions** it might throw. This is known as *declaring exceptions.*

- It uses the keyword "**throws**" (not to be confused with an actual throw statement)

- Example:

```Java
public void myMethod() throws IOException
```

- When a method throws multiple exceptions, add a list of exceptions separated by commas. Example:

```java
public void myMethod() throws Exception1, Exception2, …………… ExceptionN
```

- Declaring [[Unchecked Exception]] is **optional**.

- FYI: If a **method does not declare an exception in the superclass, we cannot override it to declare exception** in the subclass.

### Checked Exceptions (Cont'd)

![[Checked Exceptions (Extra)]]

### Exceptions: Pros and consist

**Pros:** *[[Exception Handling]]* separates error-handling code from normal programming tasks, thus making programs *easier to read and to modify*.

**Cons**: [[Exception Handling]] usually requires more time and resources because it requires...
- instantiating a new exception object.
- rolling back the call stack, and
- propagating the errors to the calling methods.