1. You must use the Scanner package to ask for input in Java:
```Java
import java.util.Scanner;
public class fileName{
	public static void main(String[] args){
		//Scanner is a class so, you must define an object that can be used -with the class
		Scanner input = new Scanner(System.in) //input is just a variable, doesn't have to be called input


		System.out.print("Enter a number: "); //Prompting the user for input
		
		int num = input.nextInt(); //Taking in the value entered by the user

	}
}
```

Note: The input object or, more specifically, the Scanner class has several functions like .nextInt(); to take in different data types:

- int - input.nextInt();
- String - input.nextLine();
- char - input.nextLine()
- double - input.nextDouble();
There are a ton more, but it doesn't really make a difference

>[!Clearing the buffer]
> A phrase used when addressing taking in the input of strings. You must use input.nextLine() without a variable to move the cursor to the next line

Common Example:

```Java
import java.util.Scanner;
public class fileName{
	public static void main(Stringp[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		System.out.print("Enter your name: ");
		input.nextLine();
		String name = input.nextLine();
	}
}
```