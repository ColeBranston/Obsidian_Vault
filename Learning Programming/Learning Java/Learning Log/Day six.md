1. Initializing an array 
```Java
int[][] array = new int[<Length>][<Length>];
```
2. Outputting the length of an array

```Java
double[][] array = new double[<Length>][<Length>];
Stystem.out.println(array.length);
```
3. Indexing arrays
```Java
boolean[][] array = {{True, False, True}, {False, False, True}}; 
System.out.println(array[0][1]); //Outputs False to console
```

- Similar concepts for creating a list:

```Java
int[] newList = {1, 2, 3, 5} 
```

```Java
boolean[] newList = new boolean[5]
```

- You may print all the contents of an array using a for loop or you can use the the Arrays.toString() method from the “import java.util.Arrays” package
- Remember the System.arraycopy() method:

```Java
System.arraycopy(myArray, 1, new array, 0, newArray.length);
```