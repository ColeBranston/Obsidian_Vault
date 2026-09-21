<h1>If statements</h1>
```Java
public class fileName{
	public static void main(String[] args){
		String name = "Sam";
		if (name == "Sam" || name == "Jack"){
			System.out.println("My name is Sam or Jack");
		}
		else if (name == "Cole" && name == "Jack")
			System.out.println("This condition will never be true!");
		else{
			System.out.println("If the name is neither Jack, Cole, or Sam");
		}
	}
	
}
```

<h1>Switch Statements</h1>
```Java
public class fileName{
	public static void main(String[] args){
		String name = "Sam";
		switch(name);
		case "Jack"
			System.out.println("My name is Jack");
			break
		case "Cole"
			System.out.println("My name is Cole");
			break //If you don't have the breaks and this case is true, it will autimatically call the next case as true. 
		default
			System.out.println("If the name is neither Jack, Cole, or Sam");
		}
	}
	
}
```

<h1>Loops</h1>
<h2>While Loops</h2>
- Exactly how they normally are

```Java
public class fileName{
	public static void main(String[] args){
		int i = 0;
		while (i > 0){
			System.out.println(i);
			i--;
		}
	}
}
```

<h2>For Loops</h2>
```Java
public class fileName{
	public static void main(String[] args){
		for (int i = 10; i > 0; i--){ //Parameters are var, repeat condition, increment or decrement
			System.out.println(i);
		}
	}
}
```

<h2>Do While Loops</h2>
```Java
public class fileName{
	public static void main(String[] args){
		do {
			System.out.println("Go!")
		} while(True); //Does the first statement and then check if it should repeat and do it again
	}
}

