![[Sorting]]

### Stability of an Algorithm

- The question of "stability" in a sorting algorithm arises when we wish to sort the same data-set more than once according to different keys.

	- For example, students’ last names and grades could be two different keys in sorting students’ grade-book.

- The problem is, if we sort a data-set according to one key (last name), and then sort the same set according to a second key (grade), the second key may disturb the ordering achieved by the first sort, if there are some duplicate second keys (e.g., two or more students may get the same grade). But this will not happen if the second sorting algorithm is a stable sorting Algorithm. See the example on the following slide 

- A sorting algorithm is stable if it preserves the order of duplicate keys.

**Note:** Any sorting algorithm can be made stable by considering ‘index’ as a comparison parameter.

#### Example:

![[Pasted image 20241016045256.png]]

