**Declaration Syntax:** datatype[] arrayRefVar = new datatype[size]

- Example 1: double[] myArray = new double[5];
- Example 2: char[] x, y; x = new char[4]; y = new char [12];

	- In this case both x and y are array references which can refer to two different arrays of same data type char.

- Since arrays are objects, which are stored in the heap, the elements of any array get same default values as the default **field-values** of a class.
- Revisiting the default values:
	- 0 for the numeric primitive data types,
	- '\u0000' (a blank space) for char type data,
	- false for Boolean type data and,
	- null for any class-type data
