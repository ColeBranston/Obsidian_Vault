
- we are familiar with calling a method, but a method can also call itself.
- a method that calls itself is a *recursive method*

Ex.

```Java
public class EndlessRecursion {  
	public static void main(String[] args) {  
		message();  
	} 
	
	public static void message() {  
		System.out.println("Do Nothing!");  
		message();  
	}  
}
```

___
### Additionally...

see this Ex.

```Java
public class RecursionDemo {  
	public static void main(String[] args) {  
		int n = 3;  
		message(n);  
	}  
	
	public static void message(int n) {  
		if(n>0) {  
			System.out.println("This is a recursive method.");  
			message(n - 1);  
		}  
	}  
}
```

1. the example displays the string: "This is a recursive method." and then calls itself.
2. each time it calls itself the cycle is repeated
3. the loop will be infinite unless, there is a controlling variable, in this case, the integer `n` is the controlling variable

___
### Solving Problems With Recursion

- Can be a powerful tool for solving repetitive problems, although is **NEVER** absolutely required to solve a problem. 
- Any problem that can be solved recursively, can be solved with a loop as well.
- In many cases, recursive algos are less efficient than iterative algos.
- Generally Recursive algos use **Top-Down** approach while iterative algos use **Bottom-Up** approach.

→ **Top-Down** involves dividing the problem into sub-problems, then finding a solution.
→ **Bottom-Up** involves solving the problem for a simple case, then finding how to solve the bigger versions.

___
### Solving Problems With Recursion: The Overhead

- Recursive solutions (top-down) uses memory repetitively by...
→   allocating memory for parameters and local variables.
→ storing the address of where control returns after the method  
terminates.

**These actions are called *Overhead* and take place with each method call**

→ Overhead does not take place with itterative approaches (Bottom-Up), instead using a loop to table the result after each iteration.

___

**Ultimately...** Some repetitive problems are more easily solved with recursion  
than with iteration.  

$\therefore$ Iterative algorithms might execute faster; however,  
$\therefore$  a recursive algorithm might be designed faster.

___

### Content of a Recursive Method

1. **Base Cases:** values of input variables, for which we perform no recursive calls. (There should be at least one base case)

	- Every chain of recursive calls must eventually reach a base case.
	- There can be multiple base cases.
	
2. **Recursive Calls:** calls to the current method.

	- each recursive call should make progress to a base case.
	- **Depth of Recursion:** the # of times a method calls itself

___

### Iteration vs. Recursion

![[Iteration]]

![[Recursion]]

___
\
![[Pasted image 20240905231154.png]]

![[Pasted image 20240905231242.png]]

![[Pasted image 20240905231421.png]]

![[Pasted image 20240905231551.png]]

![[Pasted image 20240905231616.png]]

**Q13** What is the advantage of recursive approach than an iterative approach?

	b) Easy to implement if the base case is known, and Less  
	code, in general

