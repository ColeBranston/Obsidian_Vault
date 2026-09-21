The following is Pascal's triangle. Starting with the 1's in the two non-horizontal sides of the triangle once can get any other number by adding the numbers at its top left and top right.

![[Pasted image 20240919214705.png]]

$$\therefore$$
![[Pasted image 20240919214809.png]]

### Important Examples: Bars and Stars

- Warm up: how many words of length 9 can be made with the symbols ⋆ and | that have exactly four bars and 5 stars?

***Additionally...***

- Find the number of ways of distributing 5 bananas among 5 kids
- Each way of distributing can be codified by one of the words in the previous example. We have 5 stars correspoinding to the 5 bananas. We have 4 bars that separate the stars. For example, the expression

<center>⋆|| ⋆ ⋆| ⋆ ⋆</center>

- corresponds to the first kid gets 1 banana, 2nd kid=0 bananas, 3rd kid=2 bananas, 4th kid=2 bananas, 5th kid= 0 bananas :(.

>[!Bars and Stars]
>The number ${n-1+r \choose r}$ (corresponding to *n*-1 bars and *r* starts) counts each of the following:
>- The number of integer solutions of:
>$$x_1 + ... + x_n = r$$
>with $x_i \geq 0.$
>- The number of possible sections, with repetition, of size *r* out of *n* types of objects.
>- The number of ways *r* identical object can be distributed in *n* distinct containers.








