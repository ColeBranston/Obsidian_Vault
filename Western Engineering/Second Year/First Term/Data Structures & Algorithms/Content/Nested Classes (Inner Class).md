
![[Pasted image 20240924174303.png]]

___
#### Important

- **No outer class can be declared as a static class.**

- Static class in Java is a nested class and it doesn't need the reference of the outer class (same as static method).

- Static class can access only the static members of its outer class.

- Static class cannot access the non-static member of the outer classes

- Non-static nested class (AKA. Inner classes) can access the static and the non-static members of the outer class.

- We can create an instance of the static nested class without creating an instance of the outer class (same as static method).

- The static keyword helps in memory management by avoiding the certation of the outer-class reference.

