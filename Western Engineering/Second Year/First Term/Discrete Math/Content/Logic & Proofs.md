![[Logic]]


![[New From Old]]

>[!Equivalence]
>Two statements *p* and *q* are *logically equivalent,* written $p \iff q$ if the statements take the same truth values under any given (row) truth assignment to the component statements of *p* and *q*.

- Notice that saying $p \iff q$ is the same as saying that $p \leftrightarrow q$ is a tautology.
- Notice that saying *p* is a tautology is the same as saying $p \iff 1$. Also, saying that *p* is a contradiction is the same as saying that $p \iff 0$.
- Logical equivalence is a sort of equality between statement. Two equivalent statements "mean the same" since they are truth exactly in the same instances. 

### Famous Equivalence

- $\urcorner \urcorner p \iff p.$ **Double Negation**
- $\urcorner(p\lor q) \iff \urcorner p \land \urcorner q.$** De Morgan Laws.**
- $p \lor q \iff q \lor p, \;and\; p\land q \iff q \land p.$ **Commutive Laws**
- $(p \lor q) \lor r \iff p \lor (q \lor r), \;and\;(p \land q) \land r \iff p \land (q\land r).$ **Associative Laws**

![[Pasted image 20240925131905.png]]

- $p \lor 1 \iff 1.$Excluded middle. $(p \land (\urcorner p)) \iff 0$ **Dominion Laws.**
- $p \lor (p \land q) \iff p$, and $p \land (p \lor q) \iff p$. **Absorption Laws**

#### Less Famous Equivalences and Example

- $p \rightarrow q \iff (\urcorner p) \lor q$. This says that we don't really need to use $\rightarrow$. You can write everything in terms of $\lor$ and $\urcorner$
- $p \leftrightarrow q \iff (p \rightarrow q) \land (q \rightarrow p)$
- $p \rightarrow q \iff (\urcorner q) \rightarrow (\urcorner p).$ The contrapositive is equivalent to the original implication.
- $\urcorner (p \rightarrow q) \iff p \land \urcorner q$. **Negation of Implication**
- $\urcorner (p \leftrightarrow q) \iff ((p\land \urcorner q)\lor (\urcorner p \land q)) \iff (\urcorner p \leftrightarrow q) \iff (p \leftrightarrow \urcorner q)$. **Negation of Biconditional**

- Show that $(p\land q) \rightarrow r \iff (p\rightarrow r) \lor (q \rightarrow r)$ via a chain of equivalences.

$(p \land q) \rightarrow r$
$\iff \urcorner (p \land q) \lor r)$ -> In terms of $\lor$
