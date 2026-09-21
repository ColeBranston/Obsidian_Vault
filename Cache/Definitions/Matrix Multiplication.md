A. $m \times n$, B. $n \times p$

To be able to multiple two matrices, # of columns of the first matrix must equal the # of rows of the second matrix. 

How does it work? 

	$A * B \;\text{will be} \; m \times p$
	
	$(A*B)_{ij} = a_{i1} * a_{1j} + a_{iw} * a_{2j} + ... + a_{in} * a_{nj}$

**Ex.**
$$\text{2 * 3 \;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;\;3*4}$$
$$
\begin{array}{cc}
2 &0 &1 \;\;\;\;|\\
3 &4 &-2\;|\\
0 &0 &0\;\;\;\;|
\end{array} \;\;\;*\;\; 
\begin{array}{cc}
7 &1 &-1 &0 \;\;\;\;|\\
2 &0 &3 &4\;\;\;\;|\\
1 &0 &1 &-1\;|
\end{array}
$$
$$
\begin{array}{cc}
2 &-1 &-1 |\\
3 &7 &18\;|\\
\end{array} \;\;\;\;\; 
$$

**Properties**

1. $A * (B+C) = A * B + A * C$
2. $A * B \neq B*A$ → Order Matters!

**Ex.**

1. $$
\begin{array}{cc}
1 &0 |\\
4 &0 |\\
\end{array} \;\;\;*\;\; 
\begin{array}{cc}
0 &0 |\\
-3 &2 |\\
\end{array}
\;=\;
\begin{array}{cc}
0 &0 |\\
0 &0 |\\
\end{array}
$$
2. $$
\begin{array}{cc}
1 &-4 |\\
2 &7 |\\
\end{array} \;\;\;*\;\; 
\begin{array}{cc}
1 &0 |\\
0 &1 |\\
\end{array}
\;=\;
\begin{array}{cc}
1 &-4 |\\
2 &7 \;\;\;|\\
\end{array}
$$ $A * I = I*A = A$

$(A*B) * C = A* (B*C)$

$K(A*B) = (KA) *B= A(KB)$

$$
\begin{array}{cc}
2 &1 &-4 \;\;\;\;|\\
0 &2 &0\;\;\;\;\;\;|\\
1 &0 &1\;\;\;\;\;\;|
\end{array} \;\;\;*\;\; 
\begin{array}{cc}
7 |\\
2 |\\
\end{array}
=
\begin{array}{cc}
1 |\\
2 |\\
3 |
\end{array}
$$
If A is a square matrix $n \times n$

	$A*A = A^2$
	$A^2 *A = A^3$

$A*A \;\;\;...\;\;A = A^K$

![[Transpose Of A Matrix]]


