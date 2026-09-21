
>[!Generic Type]
>a **generic class** can be created to generate a family of classes
>- Syntax:
>	- Follow class name with any identifier enclosed in angle brackets: public class MyClass <"T">
>	- Here, **MyClass** is a *generic class*, and the identifier *T* is a class reference place-holder which will be filled out by any existing class reference. 
>		- Note: A generic class type reference (T) can not be replaced by any primitive data type (such as int, char, etc.) but can be replaced by wrapper class references (Integer, Double etc.)
>	- One can define a generic type method by placing the generic type identifer before the method's return-type. Eg.
>		- public \<T> void myMethod (T 01, int x)
>		- public \<T> myMethod (T o1, int x);
>		- public \<T> T myMethod (T o1, int x);

### Definition of a Generic Class

![[Pasted image 20240912152815.png]]
### Definition of a Regular Class (*Name*)

![[Pasted image 20240912153051.png]]

# Notes on Generic Types

- The key benefits of generics is to enable errors to be detected at a compile time rather than at runtime.

	- A generic class or method permits us to specify allowable types of objects that the class or method may work with. If we attempt to use the class or method with an incompatible [[object]], the [[compiler]] error will occur.

- Generics can avoid cumbersome castings
- Generics can make programs easy to read

- It is important to note that a generic class is shared by all its instances regardless of its actual generic type. 
	- `OrderedPair <String> fruit = new OrderedPair<String>();`
	- `OrderedPair<Name> anyname = new OrderedPair<Name>();`
- Although OrderedPair\<String> and OrderedPair\<Name> are two types, but there is only one class OrderedPair loaded into the JVM.

- Let's analyze **OrderedPair** loaded into the JVM.

## Invoking the methods of the OrderedPair generic class from the Driver method.

![[Pasted image 20240912154436.png]]

## Generic Methods

- Generic methods introduce their own type paramters
- This is like declaring a generic type, but the type parameter's scope is limited to the method where is it declared.

- Static and non-static generic methods are allowed, as well as generic class constructors.

- The syntax for a generic method includes *a list of type parameters, inside angle brackets* which appears before the *method's return type*. For static generic methods, the type parameter section must appear before the method's return type.

![[Pasted image 20240912160159.png]]

![[Pasted image 20240912160222.png]]

## Why Enhances for-loop/for-each loop?

- Use the enhanced-for / for-each loop with arrays whenever you can, because it cuts down on errors. 
- Just remember – this loop will traverse through all the elements of an array from index 0 to the end. 
- This type of loop can only be used with arrays and some other collections of items such as, ArrayLists, which we will see next.

### Limitation on Enhanced for-loop/ for-each loop

- Enhanced-for or for-each loop cannot be used in all situations. Only use for-each loops when you want to loop through all the values in an array.
- Do not use this loop structure if you need the index.
- Do not use this loop structure if you want to loop through only part of an array or in a different order.
- You can change the values of the array in-order.

![[Pasted image 20240912160501.png]]

## Bounded/Unbounded Generic Type

**Definition**: A generic type that can be specified as a subtype of another type is a bounded one.

Examples: 
	- \<T extends Circle> specifies that T is a generic subtype of Circle class 
	- \<? extends T> a bounded (upper-bounded) wildcard which specifies T or any subtype of T 
	- \<? super T> a lower-bounded wildcard which specifies T or any super-type of T 
-\<?> is an unbounded wild card same as \<? Extends Object>
-\<T>is an unbounded generic type same as \<T Extends Object>

## Restrictions on Generics

- Restriction 1: Cannot create an instance of a Generic Type (Ie. new T()).
- Restriction 2: Generic Array Creation (ie. new T[100]) is Not Allowed.
- Restriction 3: A Generic Type Parameter of a Class Is Not Allowed in a Static Context.

```Java
public static void doNothing(T k){ //illegal; get rid of    static modifier 

}//do not mix this with Generic type method (slide#9)
```

- Restriction 4: Exception Classes Cannot be Generic

#### Application of Generic Type

- ArrayList Class
- Generics in Interface


# The ArrayList class (java.util.ArrayList)

- **ArrayList** is a generic Class with header: `Class ArrayList<E>`
- Like an array, an ArrayList class allows object-storage; **not primitive-type** data storage.
- Unlike an array, an **ArrayList** does the following dynamically:
	- It automactically expands when a new time is added
	- It automatically shrinks when items are removed
- To be able to work with **ArrayList** class one must import it from **java.util** packackage. (import **java.util.ArrayList;**)

## Creating an ArrayList

- Create an array list of strings::
	- `ArrayList<String> anyNameList = new ArrayList<String>();`
	- **Cannot be made using [[primitive types]]** → Wrapper classes are used
- The default capacity of an ArrayList is 10 items (*capacity and size are not the same*).
	- But the capacity can be changed by using a parameterized constructor. The following statement changes the capacity to 100: `ArrayList<String> list = new ArrayList<String>(100);`

## Frequently used ArrayList methods

![[Pasted image 20240912164103.png]]

### Example

![[Pasted image 20240912164239.png]]

## Printing Items from ArrayList

- The three ways, one can print the items from an ArrayList Object using:
	- the regular for-loop (used in the previous example)
	- the enhanced for loop (see the example below) or
	- the toString() method (already implemented for us) of the ArrayList class (shown on the next slide)
- Example with enhanced for-loop:
	![[Pasted image 20240912164549.png]]
## Printing ArrayList items using toString() Method

![[Pasted image 20240912164653.png]]

![[Pasted image 20240912164710.png]]

# Generic Types Within an Interface

- Recall class **OrderedPair** from earlier
	- Note: the **setPair** method below.
- Consider an interface **Pairable** that declared this method.

![[Pasted image 20240912164841.png]]
# The Generic Interface: Comparable

- Supposed we want to design a **generic method** to find the larger of any two objects. The objects can be buildings, persons, or circles.
- Since different types of object need to be compared, we can define a **generic interface** with a method to determined the order of the two objects.
- Then we can tailor the method to compare buildings, persons, or circles.
- For example, one can use
	- **Surface Area** of a bilding as the key for comparing buildings,
	- **height** of a person as the key for comparing two persons, and 
	- **Radius** as the key for comparing circles, and
- In this case, we can define a generic *inteface* to define a method to compared different types of objects.
- Java already provided this interface called **Comparable** with the **compareTo** method, as shown on the following slide.

## Examples

![[Pasted image 20240912170303.png]]![[Pasted image 20240912170321.png]]

![[Pasted image 20240912170427.png]]

## Practice Problem

![[Pasted image 20240912170451.png]]

![[Pasted image 20240912170508.png]]

![[Pasted image 20240912170526.png]]

# Review 

1. To create a list to store integers which of the following statements can be used?

ANS: a) ArrayList list = new ArrayList();

2. To declare an interface named A with two generic types which of the following statements can be used?

ANS: c) public interface A

3. True or False: In the following inheritance-chain diagram, a method definition in Class_2 can access a public method of Class_1 directly by using the keyword super

ANS: a) True

4. True or False: An abstract class declaration may or may not have any abstract method.

ANS: a) True

5. True or False: In Java, if you define an abstract class called MyClass and extends that class to AnotherClass, you can use the following statement in [[the main() method]]

`MyClass [] foo = new MyClass[20];`

ANS: a) True

6. True or False: the following Interface declaration is NOT valid.

```
public interface MyInterface{ 
//Contains no data field or method 
}
```

...

