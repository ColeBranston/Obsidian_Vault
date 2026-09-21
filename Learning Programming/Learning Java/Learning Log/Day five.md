
<h1>User defined functions</h1>
```Java
public class fileName{
	public static void main(String[] args){
		doSomething("Yo mutha");
	}
	public void doSomething(String x){ //At the very least you need an access modifier, return type, and name for a function - not including abstract classes or interfaces
		System.out.println(x);
	}
	
}
```

<h1>Classes and Polymorphism</h1>
```Java
public class fileName{
	public static void main(String[] args){
		rectangle myRectangle = new Rectangle(); //Instantiates the myRectangle object with the rectangle class. To add parameters we would just add them in the brackets
		myRectangle.doSomething
	}
	
}
```

```Java
public class Rectangle extends shape{
	public int x = 0
	public rectangle(){
		super() //Calls the parent constructor with super(), it does this inherently with a construcor that takes in no parameters, but it doesn't with one with parameters
		x = 2
	}
	public void doSomething(){
		super.doSomething("Polymorphism"); //Calls the parent class with super
		System.out.println("Done something more");
	}
}
```

```Java
public class shape{
	public int y = 0
	public shape(){
		x = 2
	}
	public void doSomething(int word){
		System.out.println(word+"is cool!");
	}
}
```