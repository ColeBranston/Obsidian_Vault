
1.  *If n is an integer prove that $n^2 +3n +2$ is even*

**Proof by Cases**

An integer is either even or odd $$\forall x(\exists k(x = 2k) \lor \exists k (x = 2k+1))$$
$$Even \rightarrow n  \Leftrightarrow 2k$$
$$Odd \rightarrow n\Leftrightarrow 2k+1$$
$\therefore$ Prove case 1 where n is an Odd integer $\therefore n = 2k+1$

$$\therefore(2k+1)^2 +3(2k+1) + 2 \Leftrightarrow 2k$$
$$\therefore 4k^2+4k+1+6k+3+2 \Leftrightarrow 2k$$
$$\therefore 4k^2+10k+6 \Leftrightarrow 2k$$
$$\therefore2(2k^2 + 5k +3) \Leftrightarrow 2k \;\;\;\checkmark$$
$\therefore$ Prove case 2 where *n* is an Even Integer $\therefore n=2k$
$$\therefore (2k)^2+3(2k)+2 \Leftrightarrow 2k$$
$$\therefore4k^2 + 6k +2 \Leftrightarrow 2k$$
$$2(2k^2 + 3k +1) \Leftrightarrow 2k\;\;\checkmark$$

$\therefore$ If n is an integer (either even or odd) then the expression: $n^2 +3n + 2$ is even $\square$

2. Let *n* be an integer. Prove that if $3n+12$ is even, then *n* is even

**Proof by Contrapositive**

$\therefore$ 3n+12 is even $\rightarrow$ n is even 

becomes: n is odd $\rightarrow$ 3n+12 is odd

If n is odd $\therefore n \Leftrightarrow 2k+1$

$$\therefore 3(2k+1)+12 \Leftrightarrow 2k+1$$
$$\therefore 6k+3+12 \Leftrightarrow 2k+1$$
$$\therefore 6k+15 \Leftrightarrow 2k+1$$
$$\therefore6k+14 +1 \Leftrightarrow2k+1$$
$$\therefore2(3k+7)+1\Leftrightarrow 2k+1 \;\;\checkmark$$

$\therefore$ By contrapositive, if $3n+12$ is even, then *n* is even $\square$

3. Let A,B be sets. Prove that if $A^c$ ∪B = U (the universe). Then A ⊆ B. Hint: x ∈ U is always true.

**Proof by Contrapositive**

$\urcorner(A \subseteq B)$ implies that $\exists x(x \in A \land x \notin B)$

$\therefore$ some *x* exists in A, but not in B within the universe.

All values of *x* that satisfy this:
$$\{ x:x \in A \land x \notin B \}$$
$$\Rightarrow A \cap B^c = U$$

Complementing the statement...

$$(A\cap B^c)^c \neq U$$
$$\therefore A^c \cup B \neq U \;\;\checkmark$$


$\therefore$ By contrapositive, when $A^c$ ∪B = U (the universe), then A ⊆ B. $\square$

4. Let A,B be sets. Prove that if A ⊆ B, then A∩$B^c$ = ∅. Hint: Reason by contradiction.

$\therefore A\cap B \neq \emptyset \implies \exists x \{ x \in A \land x \notin B \}$

$$\therefore A \subseteq B, \forall x(x \in A  \rightarrow x \in B)$$
$$\implies \forall x (x \notin A \lor x \in B)$$
$$\implies \forall x(\urcorner(x \in A \land x \notin B))$$
$\therefore$ This is the negation for all *x*. 
$\therefore$ $\exists x \{x \in A \land x \notin B \}$ is not possible
$\therefore$ $x \in A \land x \notin B \implies A \cap B^c = \emptyset$

$\therefore$ By contradiction, $A \subseteq B \rightarrow (A \cap B^c = \emptyset)$ $\square$


