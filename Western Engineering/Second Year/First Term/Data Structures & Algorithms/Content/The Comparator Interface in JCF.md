- Sometimes we want to insert elements of different types into a [[Tree]] set.

	- The elements may not be instances of **Comparable** or those are not directly comparable.
	
	- Here, we can define the *compare()* method available in Comparator Interface to compare these elements (example follows).

- In this case, we create a [[class]] that implements the **java.util.Comparator\<T>** interface. The Comparator interface has many methods but two of those – **compare()** and **equals()** are the most widely used ones.

### Commonly Used Methods

`public int compare([[Object]] element1, Object element2)`

- Returns a negative value if element1 is less than element2, a positive value if element1 is greater than element2, and zero if they are equal.

`public boolean equals(Object element)`

- Returns true if the specified object is also a comparator type reference object, and it imposes the same ordering as this comparator.

**Note:** Object’s equals method, with the same header, a.k.a. `public boolean equals(Object element)`, indicates whether some other [[object]] is "equal to" this one ([[Element]]).

### Using the Comparator\<T> Interface.

![[Pasted image 20240926235544.png]]

![[Pasted image 20240926235601.png]]