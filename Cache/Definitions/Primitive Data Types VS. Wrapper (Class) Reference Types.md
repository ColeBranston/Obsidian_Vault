
- Some data structures and algorithms in Java libraries that are specifically designed to only work with [[reference type data]] instead of [[primitive types]]

→ To get around this obstacle, Java defines a wrapper class for  
each base type.

- Java provides additional support for implicitly converting between base types and their wrapper types through a process known as automatic boxing (primitive type to object-reference type) and unboxing (object-reference type to primitive type) .

![[Pasted image 20240905171413.png]]

- any two numerical wrapper classes cannot be assigned to each other except primitive data types ex. int, double, long
	– Integer a = 5;  
	– Double x = a; //Not valid  
	– Double y = 4; //Not valid; it must be Double y = 4.0  
	– double m = 2; Double n = m; //valid
