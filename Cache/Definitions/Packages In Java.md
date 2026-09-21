- A Java package (keyword package) is a mechanism for organizing Java classes into a file/ folder. (The hierarchy: Java project → package → class)
- Every class in Java belongs to a package by default. One can explicitly name the package by providing a package statement in the beginning of the source file as:
	- package package_name; //e.g., package mypackage;
	- **Note**: In IntelliJ IDEA IDE right-click on src folder and add a new package, and then right-click on that package (folder) name and add a java class to write your code (your application).
	- In this case, the class is added to the package when it is compiled

**Pre-Existing Packages with Classes and Import Statements**

- The pre-existing classes in Java are organized into packages in the Java Application Program Interface (API) Library.
	-  E.g., the pre-existing Scanner class is available in the java.util package
- To use a pre-exiting class from a package, use import-statement at the beginning of the source-code by using either of the two following ways:
	- ![[Explicit Import]]
	- ![[Wildcard Import]]
**Automatically Imported Pre-Existing Package**
- The java.lang package is automatically imported into every Java program.
	- It contains :
		- general classes such as System, String and StringBuffer, Object, StringBuilder etc.
		- wrapper classes (Integer, Double, Character, Boolean, Float etc. ),
		- basic mathematical function related class called Math etc.
		- **Note:** The import statement simply tells the compiler where to locate the classes. The information for the classes in an imported package is NOT read at compile time or runtime unless the class is used in the program.

![[Pasted image 20240115175615.png]]