
- SortedSet is a sub-interface of Set, which guarantees that the elements in the set are sorted.

- TreeSet is a concrete class that implements the SortedSet interface. You can use an iterator to traverse the elements in the sorted order.

- **Note**: Set interface is defined in terms of the equals operation.

![[Pasted image 20240926234320.png]]

- One can add objects into a TreeSet if they can be compared with each other. There are two ways to compare objects:

	- Use the Comparable interface. Several classes such as String, Date, Calendar, and all the wrapper classes (for the primitive types) implement the Comparable interface (available in java.lang package). This is known as **natural order.** Since the objects added to the set are instances of Comparable, they can be compared using the compareTo() method.

	- If we are using a new class (e.g., Student), whose elements are not instances of Comparable we need to implement the Comparable Interface (that contains compareTo() method) or the Comparator Interface (that contains compare() method) for that class. The approach of using comparator method from Java Collection Framework (JCF), is referred to as order by comparator. See the example later.

### Using TreeSet to Sort Elements (Natural Order) In a Set - **1st Approach**

![[Pasted image 20240926234527.png]]
### Example: Using TreeSet to Sort Elements (Natural Order) in a Set – **2nd Approach**

![[Pasted image 20240926234614.png]]

- The Comparable interface imposes a total ordering on the objects of each class that implements it.

- This ordering is referred to as the class's natural ordering, and the class's compareTo() method is referred to as its natural comparison method.

- To do so, create a class that implements the java.lang.Comparable interface and then implement the comparTo() method in there

- The only method: int compareTo(T anyName)
	- Compares this object (anyName) with the specified object for order. Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. (Example Follow)

### Using TreeSet to Sort Elements (imposing natural ordering by Comparable) in a Set – **1st Approach**

![[Pasted image 20240926234839.png]]
### Example: Using TreeSet to Sort Elements (imposing natural ordering by Comparable) in a Set – **2nd Approach**

![[Pasted image 20240926234859.png]]