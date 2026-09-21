
1. [[Case Study - Fibonacci Numbers]]
2. [[Efficiency of Implementations]]
3. [[Case Study - GCD Algorithm]]

### In-Class Review

1. The algorithm in finding the value from a particular index in a Fibonacci sequence is an example of the following design-concept-based Algorithm: 

	a) Divide and Conquer 
	b) Dynamic 
	c) Decrease and Conquer 
	d) Greedy 
	e) Reduction

**ANSWER:** **B) Dynamic Programming**

___

An ArrayList, or a dynamically resizing array, is a class in Java that allows you to have the benefits of an array while offering flexibility in size. You won't run out of space in the ArrayList since its capacity will grow as you insert elements. An ArrayList is implemented with an array. When the array hits capacity, the ArrayList class will create a new array with double the capacity and copy all the elements over to the new array. 

___

4. How do you describe the runtime of insertion?

**ANSWER:** 
When it comes to ArrayList in Java, the average runtime for inserting an element is O(1), than to the dynamic array resizing. But if the array needs to be resized (which happens occasionally as the capacity is exceeded), the operation can take O(n) time, since every element in the array needs to be copied over to the new, larger array. So, on the whole, insertion is amortized O(1).

5. What would be the time-complexity of the following if-else statement? 

	if (condition) 
		{Block 1} 
	else 
		{Block 2}

**Answer**: The time complexity would be the worse of the two of them. For example, if **block 1** was O(n) and **block 2** was O($n^2$), then the overall time complexity of the if-else statement would be O($n^2$). Otherwise if both blocks had a time complexity of O(n), the time complexity of the if-else statement would be O(n).