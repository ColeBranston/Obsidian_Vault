
- The Collections class contains various static methods for operating on collections and maps, for creating synchronized collection classes, and for creating read-only collection classes.

- A synchronized collection implies that the class is thread safe. 
	- Collection classes are not synchronized by default.
	- The collection object is mutable that means once an object is calling two threads at a time, but one thread is changing the value of the object then it can be affected by another object. So, it is not thread safe.
	- A thread, in the context of Java, is the path followed when executing a program.
	- A single-threaded application has only one thread and can handle only one task at a time. 
	- To handle multiple tasks in parallel, multi-threading is used: multiple threads are created, each performing a different task.

### The Collections Class UML Diagram

![[Pasted image 20241010183427.png]]

```Java
//Example: Collections class in use
public static void main(String[] a) { List smallArray = Arrays.asList(3, 7, 8, 2, 3); List anotherArray = Arrays.asList(4, 8, 3, 12, 1); Collections.sort(anotherArray, Collections.reverseOrder()); Collections.sort(smallArray); System.out.println(smallArray); /*binary search can only be applied to pre-sorted increasing list. If the key is not in the list, the binarySearch() method returns –(insertion point + 1) */ System.out.println(Collections.binarySearch(smallArray, 92)); Collections.reverse(smallArray); System.out.println(smallArray); //see the seed value (20) inside Random class. 

Collections.shuffle(smallArray, new Random(20)); System.out.println(smallArray); System.out.println(Collections.frequency(smallArray,2)); }
```
```Java
//Example: code performance of sets and list using Collection Class (Version A:1 of 2) 
public static void main(String[] args) { // Create a hash set, and test its performance 
Collection set1 = new HashSet(); System.out.println("Time for hash set is " + getTestTime(set1, 500000)+ " milliseconds"); // Create a linked hash set, and test its performance 
Collection set2 = new LinkedHashSet(); System.out.println("Time for linked hash set is " + getTestTime(set2, 500000) + " milliseconds"); // Create a tree set, and test its performance 
Collection set3 = new TreeSet(); System.out.println("Time for tree set is " + getTestTime(set3, 500000) + " milliseconds"); // Create an array list, and test its performance 
Collection list1 = new ArrayList(); System.out.println("Time for array list is " + getTestTime(list1, 60000) + " milliseconds"); // Create a linked list, and test its performance 
Collection list2 = new LinkedList(); System.out.println("Time for linked list is " + getTestTime(list2, 60000) + " milliseconds"); }//see getTestTime() method definition on the next slid
```

**getTestTime() method (Using System.currrentTimeMillis()) (Version A: 2 of 2)**

```Java
public static long getTestTime(Collection c, int size) { long startTime = System.currentTimeMillis(); // Add numbers 0, 1, 2, ..., size - 1 to the array list 
List list = new ArrayList(); for (int i = 0; i < size; i++) list.add(i); Collections.shuffle(list); // Shuffle the array list // Add the elements to the container 
for (int element : list) c.add(element); Collections.shuffle(list); // Shuffle the array list // Remove the element from the container for 
(int element : list) c.remove(element); long endTime = System.currentTimeMillis(); return endTime - startTime; // Return the execution time }
```

```Java
//Example code performance of sets and list ( Version B: 1 of 2) 
public static void main(String[] args) { // Create a hash set, and test its performance 
Collection set1 = new HashSet(); System.out.println("Time for hash set is " + getTestTime(set1, 500000)*1e-6 + " milliseconds"); // Create a linked hash set, and test its performance 
Collection set2 = new LinkedHashSet(); System.out.println("Time for linked hash set is " + getTestTime(set2, 500000)*1e-6 + " milliseconds"); // Create a tree set, and test its performance 
Collection set3 = new TreeSet(); System.out.println("Time for tree set is " + getTestTime(set3, 500000)*1e-6 + " milliseconds"); // Create an array list, and test its performance 
Collection list1 = new ArrayList(); System.out.println("Time for array list is " + getTestTime(list1, 60000)*1e-6 + " milliseconds"); // Create a linked list, and test its performance 
Collection list2 = new LinkedList(); System.out.println("Time for linked list is " + getTestTime(list2, 60000)*1e-6 + " milliseconds"); }//see getTestTime() method definition on the next slide
```

```Java
//getTestTime() method (Using System.nanoTime()) ( Version B: 2 of 2)
public static long getTestTime(Collection c, int size) { 
	long startTime = System.nanoTime(); // Add numbers 0, 1, 2, ..., size - 1 to the array list 
	List list = new ArrayList(); 
	for (int i = 0; i < size; i++) list.add(i);
		Collections.shuffle(list); // Shuffle the array list // Add the elements to the container 
	for (int element : list) c.add(element); Collections.shuffle(list); // Shuffle the array list // Remove the element from the container 
	for (int element : list) 
		c.remove(element); 
	
	long endTime = System.nanoTime(); 
	return endTime - startTime; // Return the execution time 
}
```