Statements will be represented with lowercase letters *p,q,r,s,t,...* Given a statement (or a couple of statements) we can form more complex statements using logical connectives. The truth value of the new statement will depend only in the truth value of the old statements. This is usually captured suing truth tables. 

>[!Negation]
>$\urcorner p$: (read not *p*) is the negation of *p*. It is truce precisely when *p* is false.
>![[Pasted image 20240924085330.png]]

>[!Disjunction, inclusive or]
>$p\lor q$: (read *p* or *q*) is the disjunction of *p* and *q*. It is false precisely when *p* and *q* are false. Notice that this doesn't always agree with the use of or in the English language.
>![[Pasted image 20240924090052.png]]

>[!Conjunction]
>$p \land q$: (read *p* and *q*) is the conjucftion of *p* and *q*. It is true precisely when *p* and *q* are true.
>![[Pasted image 20240924090227.png]]
>

>[!Implication, Conditional]
>$p \implies q$: (read: if *p*, then *q*. *p* implies *q*. *p* is sufficient for *q*. *q* is necessary for *p*. *q* if *p*. *p* only if *q*) is the implication of *q* by *q*. It is false precisely when *p* = 1 and *q* = 0. Notice that if *p* = 0, then $p \implies q =1$ regardless of the truth value of *q*.
>![[Pasted image 20240924090536.png]]
>$q \implies p$ is called the converse of $p \implies q.$ $(\urcorner q) \implies (\urcorner p)$ is called the contrapositive of $p \implies q.$ $(\urcorner p) \implies (\urcorner q)$ is called the inverse of $p \implies q$

>[!Biconditional]
>$p \leftrightarrow q:$ (read: *p* if and only if *q*: *p* is equivalent to *q*) is the biconditional of *p* and *q*. It is true precisely when *p* and *q* take the same truth value.
>![[Pasted image 20240924091009.png]]

### Examples: New from Old

Translate the following sentences from English in to symbolic form if: *q* stands for I study for my midterm. *p* stands for I do my HW. *r* stands for I get a passing grade.

- I study for the midterm if I get a passing grade.
	- $r \implies q$
- I don't study for the midterm only if I get a passing grade.
	- $\urcorner q \implies r$
- Getting a passing grade is sufficient for not doing the homework.
	- $r \implies \urcorner p$
- Not studying for the midterm is equivalent to not doing the homework. 
	- $(\urcorner q) \leftrightarrow \urcorner p.$
- Studying for my midterm and doing my HW are neccessary for getting a passing grade.
	- $r \implies (p \land q)$

#### Truth Tables

Construct a truth table for $\urcorner (r \rightarrow (p \land q))$. How many rows do we need? You need a lot of practice. But watching me do more examples won't help you.

![[Pasted image 20240924104727.png]]
>[!Tautologies and Contradiction]
>A tautology is a compound statement such that for any truth assignment to its component statements (ie. any row in its truth table) it takes to value 1. A contradiction is a compound statement that always takes the value 0.

### Examples

There are lots of famous tautologies but here are some of them:
- $p \lor (\urcorner p)$ (Excluded middle or Excluded third).
- $p \rightarrow (p \lor q)$
- $( p \land q) \rightarrow p, (p \land q) \rightarrow q.$
- $p \rightarrow p$

Notice that *p* is a tautology if and only if $\urcorner p$ is a contradiction. So, every example of tautology gives an example of contradiction. The most important contradiction is:
- $p \lor (\urcorner p)$

#### Other Examples

- to show that something is a tautology or a contradiction one might use truth tables.
- another option is to reason. Is the statement $(p \land (\urcorner r)) \rightarrow q$ a tautology? Hint: suppose it takes the value, 0, what can you conclude about the truth values of *p*, *q*, and *r*? Answer: it is not a tautology because if *p* = 1, *q* = 0 and r = 0 the statement is 0.
- Show that $\urcorner(p \lor q) \land q$ is a contradiction. Again, we don't use a truth table but assume that the statement takes the value 1. Then we show that this is impossible. So, the formula has to be a contradiction.