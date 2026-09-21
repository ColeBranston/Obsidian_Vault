
### A Searchable Collection

- A Map (also known as Dictionary) **Models a searchable collection of key-value entries**
- **Main operations:**
  - Searching
  - Inserting
  - Deleting items

- **Map Characteristic:**
  - Multiple entries with the same key are not allowed
- **Applications:**
  - Address book
  - Student-record database
### Map Methods

- **get(k):** If the map M has an entry with key k, return its associated value; else, return null

- **put(k, v):** Insert entry (k, v) into the map M; if key k is not already in M, then return null; else, return old value associated with k.

- **remove(k):** If the map M has an entry with key k, remove it from M and return its associated value; else, return null.

- **size(), isEmpty():** Same as other ADTs we discussed.

- **entrySet():** Return an iterable collection of the entries in M.

- **keySet():** Return an iterable collection of the keys in M.

- **values():** Return an iterator of the values in M.

#### Examples Of Methods

![[Pasted image 20241010180634.png]]

### The Map Interface

The Map interface maps keys to the data elements (values). The keys are like indices in a List, where the indices are integers. In Map, the keys can be any objects.

![[Pasted image 20241010180726.png]]

#### UML Diagram Example

![[Pasted image 20241010180812.png]]

#### The *Map.Entry* Interface UML Diagram

- entrySet() Method in Map Interface

- **Purpose:** Returns a set of objects that implement the \`Map.Entry<K,V>\` interface.

- **Description:** \`Entry\` is an inner (nested) interface for the \`Map\` interface.

- **Details:** Each object in the set is a specific key/value pair in the underlying 

##### Example Map.Entry
```Java
//Example: Inner/ nested interface - watch out for the class header with inner interface
public class AnyClass implements MyInterface, MyInterface.AnotherInterface{
    public static void main(String[] args) {
        //you could create a
        MyInterface k = new AnyClass();
        //instantiating an object using inner interface
        MyInterface.AnotherInterface m = new AnyClass(); //watch out!
        k.doNothing(); //Question: will m.doNothing() work; how can we use casting here?
        m.doSomething(); // k.doSomething() won’t work, but casting can make it work!
    }

    public void doNothing() {
        System.out.println("Hello!");
    }

    public void doSomething() {
        System.out.println("What a wonderful world!");
    }
}

//a nested interface
interface MyInterface{
    void doNothing();
    //inner interface
    interface AnotherInterface{
        void doSomething();
    }
}

```

### Concrete Map Classes

![[Pasted image 20241010181410.png]]

### Other Maps (HashMaps & TreeMaps)

- The `HashMap` and `TreeMap` classes are two concrete implementations of the `Map` interface.

- The `HashMap` class is efficient for locating, inserting, and deleting a mapping value.

- The `TreeMap` class, implementing `SortedMap`, is efficient for traversing the keys in a sorted order. It maintains the mapping in ascending order of keys.

  - Review: `TreeSet` elements are also sorted in ascending order.

#### LinkedHashMap

- **LinkedHashMap** extends **HashMap** with a linked list implementation.

- Entries in **HashMap** are unordered, while **LinkedHashMap** maintains insertion or access order.

- Use `LinkedHashMap(initialCapacity, loadFactor, true)` for access order.

- **Note**: 

	**Insertion order**: order of insertion. 
	**Access** **order:** order of access.

#### HashMap and TreeMap Example

![[Pasted image 20241010182112.png]]

**Output**

![[Pasted image 20241010182159.png]]

#### FYI Can TreeMap be used to Sort by Values

- No, because it defies the SortedMap specification, which is sorted by key. There is a way to do this using HashMap. See the example below.

![[Pasted image 20241010182312.png]]

##### FYI Example: Counting the Occurrences of Words in a Text

- This program (see the code in the following slide) counts the occurrences of words in a text and displays the words and their occurrences in ascending order of the words. 

- The program uses a tree map to store a pair consisting of a word (the key) and its count (the value) in ascending order. 

- For each word, check whether it is already a key in the map. If not, add the key (the word) and value (count) 1 to the map. Otherwise, increase the value (count) for the key (word) by 1 in the map.

![[Pasted image 20241010182518.png]]

##### Comments on the Code

![[Pasted image 20241010182551.png]]

### FYI: Regular Expressions

- A regular expression (abbreviated regex) is a string that describes a pattern for matching a set of strings.

- Regular expression is a powerful tool for string manipulations. 

- One can use regular expressions for matching, replacing, and splitting strings.

#### Matching Strings

```Java
System.out.println("Java".matches("java")); /*prints false*/ System.out.println("java".equals("java")); /* prints true*/ System.out.println("Java is fun".matches("Java.*")); /*prints true*/
```

#### Regular Expression Syntax


![[Pasted image 20241010182856.png]]

#### Replacing and Splitting Strings

![[Pasted image 20241010182952.png]]

##### Examples

```Java
String s1 = "Java Java Java".replaceAll("v\\w", "wi") ; System.out.println(s1); //prints Jawi Jawi Jawi System.out.println("Java Java Java".replaceFirst("v\\w", "wi")); //prints Jawi Java Java
```