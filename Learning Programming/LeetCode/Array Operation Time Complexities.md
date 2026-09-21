![[Pasted image 20240831013454.png]]

For appending, "\*" means that this time complexity is amortized or that it is most of the time O(1) but sometimes can be O(n)

With Added String complexities for immutable strings 

![[Immutable]]
![[Mutable]]
![[Pasted image 20240831014052.png]]

As shown in Python:

```Python
# Append - Insert element at end of array - On average: O(1)
A.append(5)

print(A)

# Pop - Deleting element at end of array - O(1)
A.pop()

print(A)

# Insert (not at end of array) - O(n)
A.insert(2, 5)

print(A)

# Modify an element - O(1)
A[0] = 7

print(A)

# Accessing element given index i - O(1)
print(A[2])

# Checking if array has an element - O(n)
if 7 in A:
  print(True)

# Checking length - O(1)
print(len(A))

# Strings

# Append to end of string - O(n)
s = 'hello'

b = s + 'z'

print(b)

# Check if something is in string - O(n)
if 'f' in s:
  print(True)

# Access positions - O(1)
print(s[2])

# Check length of string - O(1)
len(s)
```