
1. Prove that 16n +10n−1 is divisible by 25 for all n ≥ 1.

___

***Proof By Induction***

**Basis Step:** =>  n = 1 -> $16^{(1)} + 10(1) - 1 = 25$ => $\div$ 25    $\checkmark$

$\therefore 16^k + 10k - 1 = 25f$

$\therefore 16^k = 25f-10k -1$

$\therefore$ **Inductive Step** => Suppose $s(k) \rightarrow s(k+1)$

$$16^{k+1} + 10(k+1) - 1=25f$$
$$\therefore 16^k \cdot 16 + 10k +10-1 = 25f$$
$$\therefore 16(25f-10k-1)+10k-9=25f$$
$$16\cdot25f-160k-16+10k-9=25f$$
$$16\cdot 25f-150k-25=25f$$
$$\therefore 25(16f-6k-1)=25f \;\;\;\;\checkmark$$

$\therefore$ by induction, 16n +10n−1 is divisible by 25 for all n ≥ 1 $\square$

2. Prove the result known as De Moivre’s Theorem: for all integers n ≥ 1, $$(cos(\theta)+isin(\theta))^n=cos(n\theta)+isin(n\theta)$$
___



***Proof By Induction***

**Basis Step:** =>  n = 1 -> $(cos(\theta)+isin(\theta))^{(1)}=cos(1\cdot\theta)+isin(1\cdot\theta)$

-> $cos(\theta)+isin(\theta)=cos(\theta)+isin(\theta)\;\;\;\checkmark$ s(1) is valid

**Inductive Step:** suppose $s(k) \rightarrow s(k+1)$

$$\therefore (cos(\theta)+isin(\theta))^{k+1}=cos((k+1)\cdot\theta)+isin((k+1)\cdot\theta)$$
$$\therefore(cos(\theta)+isin(\theta))^k\cdot(cos(\theta)+isin(\theta)) = cos((k+1)\cdot\theta)+isin((k+1)\cdot\theta)$$
$$\therefore cos(k\theta)cos(\theta) + isin(\theta)cos(k\theta)+isin(k\theta)cos(\theta)-sin(k\theta)sin(\theta) = cos((k+1)\cdot\theta)+isin((k+1)\cdot\theta)$$$$\therefore (cos(k\theta)cos(\theta)-sin(k\theta)sin(\theta)) + (isin(\theta)cos(k\theta)+isin(k\theta)cos(\theta)) = cos((k+1)\cdot\theta)+isin((k+1)\cdot\theta)$$
$$\therefore cos(k\theta + \theta)+isin(k\theta + \theta) = cos((k+1)\cdot\theta)+isin((k+1)\cdot\theta)$$
$$\text{And Lastly... }cos((k+1)\cdot \theta)+isin((k+1)\cdot \theta) = cos((k+1)\cdot\theta)+isin((k+1)\cdot\theta)$$


$\therefore$  De Moivre’s Theorem holds true for all integer n $\geq$ 1 $\square$

3. Recall the sequence of Fibonacci numbers defined in class.
$$F_0 = 0, F_1=1,$$
$$F_n=F_{n-1}+F_{n-2}, n \geq 2.$$
Prove that for all $n \in \mathbb{N}$,
$$F_{n+2}=1+\sum^n_{i=0}F_i$$
___
n -> k
$\therefore$ prove $n=k+1$

Suppose... $$F_{k+2} = 1 + \sum ^{k}_{i=0}F_i\;\;\;\checkmark$$
$\therefore$ prove the following...

$$F_{k+3} = F_{k+2} + F_{k+1}$$
$$\therefore F_{k+3} = 1 + \sum ^{k}_{i=0}F_1 + F_{k+1} \rightarrow\text{Next... }\sum ^{k}_{i=0}F_1 + F_{k+1} = F_0 + F_1 +\;...\;+F_k+F_{k+1} = \sum^{k+1}_{i=0}F_i$$
$$\therefore F_{k+3} = 1 + \sum ^{k+1}_{i=0}F_i\;\;\;\checkmark$$


$\therefore$ for all $n \in \mathbb{N} \rightarrow F_{n+2} = 1+\sum^n_{i=0}F_i$    $\square$


4. Consider the following sequence defined by recursion.
$$a_1=5, a_2 = 10$$
$$a_n=2a_{n-1}+a_{n-2}, n \geq 3$$
Prove that $a_n \leq 3^n \textbf{ for all } n\geq 3.$

___

$\therefore$ Suppose...

$n=k$
$a_k = 2a_{k-1} + a_{k-2}$
$a_k \leq 3^k$

$\therefore$ prove $a_{k+1} \leq 3^{k+1}$...

$$a_{k+1}=2a_k+a_{k-1}$$
$$\therefore a_{k+1} \leq 2(3^k) + 3^{k-1}$$
$$\therefore a_{k+1} \leq 2(3^k)+{1\over 3}\cdot3^k$$
$$a_{k+1} \leq 3^k({7\over 3})$$
$$\textbf{Evidently... } ({7\over 3})3^k < (3)3^k$$
$\therefore a_{k+1} \leq 3^{k+1}$

$\therefore a_n \leq 3^n \textbf{ for all } n\geq 3.\;\;\square$
