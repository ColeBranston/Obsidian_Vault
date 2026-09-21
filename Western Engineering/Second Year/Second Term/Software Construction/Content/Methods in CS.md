**Encapsulating Functionality**

- Methods encapsulate specific functionality within a class. They perform actions on the class's data.
- They are members of a type that execute a block of statements.
- They are functions that belong to a type.

**Examples:**

```C#
static void Main(string[] args) 
{ 
	Product a = new Product(); 
	a.Name = "Watch"; 
	a.Price = 9.99; 
	a.PrintDetails(); 
}

static void Main(string[] args) 
{ 
	var product = new Product("Laptop", 1500.00);
	product.PrintDetails(); 
}
```
### Getters and Setters in C\#

**Controlled Access:**
- Getters and setters provide controlled access to class properties. They act as gatekeepers, ensuring data integrity.

**Encapsulation**
- Getters and setters are a core principle of encapsulation. They allow you to control how properties are access and modified, protecting the internal state of the class.

```C#
static void Main(string[] args) { 
	var product = new Product(); 
	product.SetName("Laptop"); 
	product.SetPrice(1500.00); 
	product.PrintDetails();
}
```
**Properties**
- A member that provided a flexible mechanism to read, write, or compute the value of a data field.
- Appear as public data members, but they're implemented as special methods called accessors.

```C#
static void Main(string[] args) { 
var product = new Product(); 
product.Name = "Laptop";
product.Price = 1500.00; 
product.PrintDetails(); 

public class Product { 
	private string _name; 
	private double _price; 
	public string Name { 
		get { return _name; } 
		set { _name = value; } 
	} 
	public double Price { 
		get { return _price; } 
		set { if (value > 0) _price = value; } } 
	public void PrintDetails() { 
		Console.WriteLine($"Product Name: {Name}, Price: {Price}"); 
	} 
}
```
**Automatic Properties**
- The compiler generates a hidden backing field for the property.
- The compiler also implements the body of the get and set accessor.

![[Pasted image 20250123165932.png]]

![[Pasted image 20250123165943.png]]

### Optional Parameters in Methods

**Simplified Calls**
- Optional parameters allow you to provide default values, simplifying method calls or by making certain arguments optional. 

```C#
static void Main(string[] args) { 
	var product = new Product { Name = "Laptop", Price = 1500.00 }; product.ApplyDiscount(); 
	product.PrintDetails(); 
	public void ApplyDiscount(double percentage = 10) { Price -= Price * (percentage / 100); } 
		public void PrintDetails() { 
			Console.WriteLine($"Product Name: {Name}, Price: {Price}"); 
		} 
	} 
}
```

![[Pasted image 20250123170243.png]]

### Named Arguments vs. Positional Arguments

**Named Arguments:**
- Named arguments allow you to pass arguments to a method by method by specifying their names, making the code more readable and maintainable. 

**Positional Arguments:**
- Positional arguments are used when the order of the arguments is critical, as they are matched by their positions in the method definition.

![[Pasted image 20250123170506.png]]

### Introduction To Indexers

**Array-Like Access**
- Indexers provides a way to access elements of a class using array-like syntax. They enable objects to be treated like collections or collections or arrays.

**Purpose**
- Indexers are used to access elements of a class using a specific index specific index or key, allowing for more natural and intuitive interaction wit  the class's data.

![[Pasted image 20250123170927.png]]

### Defining and Using Indexers

```C#
public class EmployeeCollection 
{
	private Employee[] employees; 

	public Employee this[int index] 
	{ 
		get { return employees[index]; } 
		set { employees[index] = value; 
	} 
}
```
**Access Using Index**
- The indexer allows you to access elements of the `EmployeeCollection` using an integer index, just like accessing elements in an array.

### Practical Use Cases for Indexers

**Data Structures**
- Indexers are commonly used in custom data structures, such as lists, as lists, dictionaries, and stacks.

**Collections**
- Indexers simplify the way you interact with collections, providing a providing a familiar array-like syntax for accessing elements.