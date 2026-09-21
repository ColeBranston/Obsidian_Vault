**Random Experiment**: a procedure that is carried out under controlled conditions. and executed to discover an unknown result. 

**Sample Spaces ($S$):** set of possible outcomes from a random experiment.

- $S$ is **discrete** if it consists of a finite set of outcomes.
- $S$ is **continuous** if it contains an interval (either finite or infinite) of real numbers.
### Example 1: Camera Flashes

___

- Randomly select a camera and record the recycle time of a flash. $S = R^+ = \{ x|x>0 \}$, the positive real numbers.
- Suppose it is known that all recycle times are between 1.5 and 5 seconds. Then $S = \{ x|1.5 < x <5 \}$ is continuous.
- It is known that the recycle time has only three values (low, medium or high). Then $S = \{low,medium,high \}$ is discrete.
- Does the camera conform to minimum recycle time specifications?
	- $S = \{ yes, no \}$ is discrete.

___

### Example 2: Message Delays

___

Message are classified as on-time or late within the time specified by the system design. → Use a **Tree Diagram** to represent the sample space of possible outcomes.

![[Pasted image 20240909104148.png]]

___


### Events

___

**Event:** a subset of the sample space of a random experiment

**Event Combinations:**

- the **union** of two events consists of all outcomes that are contained in either of the two events, denoted as $E_1 \cup E_2$ 
- the **intersection** of two events is the event that consists of all outcomes that are contained in both of the two events, denoted as $E_1 \cap E_2$ 
- the **complement** of an event in a sample space is the set of outcomes in the sample space that are not in the event. We denote the complement of the event $E$ as $E \prime$.

#### Example Camera Flashes

___

Suppose that the recycle times of two cameras are recorded. 

- Consider only whether or not the cameras conform to the manufacturing specifications. We abreviate *yes* and *no* as *y* and *n*. Consider the **sample space** $S = \{yy,yn,ny,nn \}$.
- Suppose that the subset of outcomes for which **at least one camera conforms** is denoted as $E_1$. Then, $E_1 = \{yy,yn,ny\}$.
- Suppose that the subset of outcomes for which **both camera do not conform**, denoted as $E_2$, contains only the single outcome, $E_2 = \{nn \}$.
- Other examples of events are $E_3  = \phi$, the null set, and $E_4 = S$, the sample space. 
- If $E_5 =\{yn,ny,nn\},E_1\cup E_5 = S, E_1 \cap E_5 = \{yn, ny \}, E \prime _1 = \{nn \}$ 

**Therefore**...

Camera recycle times might use the sample space $S = R^+$. Let $E_1 = \{x|10 \leq x \leq 12 \}$ and $E_2 \{ x|11 < x < 15 \}$ 
Then,
$E_1 \cup E_2 = \{ x|10 \leq x \leq 15 \}$ and $E_1 \cap E_2 = \{ x|11 < x < 12 \}$

Also

$$E \prime_1 = \{x|x< 10 \;or\; 12 \leq x\}$$
And 
$$E \prime _1 \cap E_2 =\{ x|12 \leq x < 15 \}$$

___

#### Venn Diagrams

___

We can use **Venn diagrams** to represent a sample space and events in a sample space. 

![[Pasted image 20240909111300.png]]

___

#### Mutually Exclusive Events

Two events, denoted as $E_1$ and $E_2$, such that:
$$E_1 \cap E_2 = \phi$$
are said to be **mutually exclusive**

![[Pasted image 20240909111500.png]]

##### Laws

___

- **Complement Law**
$$(E \prime)\prime = E$$ 
- **Distributive Law**
$$(A\cup B) \cap C = (A\cap C) \cup(B \cap C) \;and\; (A\cap B)\cup C = (A\cup C) \cap (B \cup C)$$

- **DeMorgan's Laws**

$$(A \cup B)\prime - A\prime \cap B \prime \;and\; (A \cap B) \prime = A\prime \cup B\prime$$

	- Also, remember that

$$A\cap B = B \cap A \; and\; A \cup B = B \cup A$$


___

#### Counting Techniques

- **Determining the outcomes** in the sample space (or an event) **can be difficult**.

- In these cases, **counts of the numbers of outcomes** in the sample space and various events are used to analyze the random experiments.

- These methods are referred to as **counting techniques**
	- Multiplication Rules
	- Permutations
	- Combinations

##### Multiplication Rule

___

Assume an operation can be described as a sequence of *k* steps, and...

- The number of ways to complete **step 1** is $n_1$.
- The number of ways to complete **step 2** is $n_2$, for each way to complete step 1.
- The number of ways to complete **step 3**, is $n_3$ for eahc way to complete step 2, and so on.

The **total number**of ways to complete the operation is $n_1 \times n_2 \times ... \times n_k$   

###### Example: Web Site Design

The design for a Website is to consist of **four colours**, **three fonts**, and **three positions** for an image.

From the multiplication rule, 4 x 4 x 3 = 36 **different designs** are possible.

##### Permutations

A **permutation** of the elements is an order sequence of the elements.

	Note: ordered means that, for example, (a,b) and (b,a) are different.

Example. Consider a set of elements, such as $S = \{ a,b,c \}$. abc, acb, bac, bca, cab, cba are all the permutations of the elements of *S*.

<center> The number of <strong> permutations </strong> of <i> n</i> different elements is  <i> n</i>! where </center>

$$n! = n\times (n-1)\times(n-2)\times ...
\times 2\times 1$$

###### Permutations of Subsets

- The number of permutation of subsets of *r* elements selected from a set of n **different** elements is

$$P ^n_r = n(n-1)(n_2)...(n-r+1)=\frac{n!}{(n-r)!}$$

**Example: Printed Circuit Board**

A printed circuit board has **eight different locations** in which a component can be placed. if **four different components** are to be placed on the board **how many different designs** are possible?

**ANSWER:** $$P^8 _4 = \frac{8!}{(8-4)!} = \frac{8\cdot7\cdot6\cdot5\cdot4!}{4!} = 8\cdot7\cdot6\cdot5 = 1680 \;different\;designs\;are\;possible$$
###### Permutations of Similar Objects

The number of permutations of $n=n_1 + n_2 + ... +n_r$ objects of which $n_1$ are of one type, $n_2$ are of a second type, ... , and $n_r$ are of an $r^{th}$ type is

$$\frac{n!}{n_1!n_2!\;...\;n_r!}$$

**Example: Hospital Schedule**

A hospital operating room needs to schedule **three knee surgeries** and **two hip surgeries** in one day. We denoted a knee surgery as *k*, and hip surgery as *h*. The **number of possible sequences** of three knee and two hip surgeries is

$$\frac{5!}{2!\cdot3!} = \frac{5\cdot 4\cdot 3!}{2 \cdot 1 \cdot 3!} = 10$$

The 10 sequences are easily summarized as 

{kkkhh, kkhkh, kkhhk, khkkh, khkhk, khhkk, hkkkh, hkkhk, hkhkk, hhkkk}


___

##### Combinations

The number of combinations, subets *r* elements that cna be selected from a set of *n* elements, is denoted as $(^n _r)$ or $C^n _r$ and

$$C^n _r = (^n _r) = \frac{n!}{r!(n-r)!}$$

- In combinations, order is not important.
- Example, (a,b) is equal to (b,a)

###### Example: Sampling without Replacement

- A bin of 50 parts contains 3 defectives and 47 non-defective parts. A sample of 6 parts is selected from the 50 without replacement. How many samples of size 6 contain 2 defective parts?

- We can select 2 defective from the total of 3 defective in

$$\frac{3!}{2! \cdot 1!} = 3\;different\;ways$$
- The number of different ways we can select the remaining 4 from the total of 47 non-defective in

$$\frac{47!}{4! \cdot 43!} = \frac{47\cdot46\cdot45\cdot44\cdot43!}{4\cdot3\cdot2\cdot1\cdot43!} =178,365 \;different \;ways$$

Therefore, from the **multiplication rule**, the number of subsets of size 6 that contain exactly 2 defective parts is

$$3 \cdot 178,365 = 535,095$$
Note. The total number of different subsets of size 6 is

$$(\frac{50}{6}) = \frac{50!}{6!44!}=15,890,700$$


##### Interpretations & Axioms of Probability

**Subjective Probability**: different individuals will no doubt assign different probabilities to the same outcomes. Ex. "The chance of rain today is 30%"

**Relative Frequency Probability**: Interpreted as the limiting value of the proportion of times the outcome occurs in *n* repetitions of the random experiment as *n* increases beyond all bounds.

	Ex. If we assign probability 0.2 to the outcome that there is a corrupted pulse in a digital signal, we might interpret this assignment as implying that, if we analyze many pulses, approx. 20% of them will be corrupted.

###### Equally Likely Outcomes

Whenever a sample space consists of N possible outcomes that are equally likely, the probability of each outcome is 1/N

Ex.

	suppose that we select 1 laser diode randomly from a batch of 100. Randomly implies that it is reasonable to assume that each diode in the batch has an equal chance of being selected. The probability model for this experiment assigns probability of 0.01 to each of the 100 outcomes, because each outcome in the sample space is equally likely

###### Probability of an Event: 

- For a discrete sample space, the probability of an event can be defined by the reasoning used in the preceding example.

For a discrete sample space, the *probability of an event E*, denoted as *P(E)*, equals the sum of the probabilities of the outcomes in *E* 

A random experiment can result in one of the outcomes {a, b, c, d} with probabilities 0.1, 0.3, 0.5, 0.1, respectively.

Let *A* denote the event {a, b} *B* the event {b, c, d} and *C* the event {d}

$$P(A) = 0.1 + 0.3 = 0.4$$
$$P(B) = 0.3+0.5+0.1 = 0.9$$
$$P(C) = 0.1$$
$$P(A\prime) = 0.6 \; and \; P(B\prime) = 0.1 \;and\; P(C\prime) = 0.9$$

Because $A \cap B = \{b\}, then P(A\cap B) = 0.3$
Because $A \cup B = \{a,b,c,d\},\;then\; P(A\cup B) = 1.0$
Because $A \cap C = \{null\}, \;then\; P(A \cap C) = 0$

###### Axioms of Probability

Probability is a number that is assigned to each member of a collection of events from a random experiment that satisfies the following properties:

1. $P(S) = 1$
2.  $0 \leq P(E) \leq 1$
3. For any two events $E_1$ and $E_2$ with $E_1 \cap E_2 = \phi$
				$P(E_1 \cup E_2) = P(E_1) + P(E_2)$

The axioms imply that:
- $P(\phi) = 0 \;and\; P(E\prime) = 1 - P(E)$
- If $E_1$ is contained in $E_2$, then $P(E_1) \leq P(E_2)$


###### Unions of Events & Additional Rules

Joint events are generated by applying basic set operations to individual events, specifically:

- **Unions** of events, $A \cup B$
- **Intersections** of events, $A \cap B$
- **Complements** of events, $A\prime$

Probabilities of joint events can often be determined from the probabilities of the individual events it comprises.

**Example: Semiconductor Wafers** (A)

A wafer is randomly selected from a batch of 940 wafers in a semiconductor manufacturing process.

- Let H denote the event that the wafer contains high levels of contamination.
	- Then $P(H) = 358/940$
- Let *C* denote the event of the wafer is in center of a sputtering tool.
	- Then $P(C) = 626/940$

![[Pasted image 20240909155349.png]]

**Example Semiconductor Wafers (B)** 

$P(H\cap C)$ is the probability that the wafer is from the center of the sputtering tool and contains high levels of contamination.

$$P(H \cap C) = 112/940$$

The event $(H \cup C)$ is the event that a wafer is from the center of the spluttering tool or contains high levels of contamination (or both)

$P(H \cup C) = P(H) + P(C) - P(H \cap C)$
$= (358 + 626 - 112)/940 = 872/940$

**Addition Rule**:

- **Probability of a Union**

$$P(A\cup B) = P(A)+P(B) - P(A \cap B)$$

	If *A* and *B* are mutually exclusive events,

$$P(A \cup B) = P(A) + P(B)$$

- **Three or More Events**

$$P(A\cup B \cup C) = P(A)+P(B)+P(C)-P(A \cap B)-P(A\cap C) - P(B\cap C) +P(A\cap B \cap C)$$

**Mutually Exclusive Events**

A collection of events, $E_1, E_2,...E_k,$ is said to be **mutually exclusive** if for all pairs,

$$E_i \cap E_j = \varnothing$$

For a collection of mutually exclusive events,

$$P(E_1 \cup E_2 \cup ... \cup E_k) = P(E_1) + P(E_2) + ... P(E_k)$$

**Conditional Probability**

- The probability of an event *B* under the knowledge that the outcome will be in event *A* is called the **conditional probability** of *B* given *A*, denoted as $P(B|A)$ 
- A digital communications channel has an error rate of 1 per 1000 bits transmitted. Errors are rare, occur in bursts. If a single bit is transmitted, we might model the probability of an error as 1/1000. However, if the previous but was in error because of the bursts, we might believe that the probability that the next but will be in error is greater than 1/1000.

	**Conditional Probability**: the conditional probability of an event *B* given an event *A*, denoted as $P(B|A)$, is

$$P(B|A) = \frac{P(A\cap B)}{P(A)}$$
	for $P(A) > 0$

This definition can be understood in a special case in which all outcomes of a random experiment are equally likely. If there are *N* total outcomes,

$P(A) = (numbers\;of\;outcomes\;in\;A)/N$
$P(A \cap B) = (numbers\;of\;outcomes\;in\;A\cap B)/N$
$P(A | B) = (numbers\;of\;outcomes\;in\;A\cap B)/(number\;of\;outcomes\;in\;A)$

**Example: Surface Flaws and Defectives**

![[Pasted image 20240909165014.png]]

###### Intersections of Events & Multiplication & Total Probability Rules

- The conditional probability definition can be rewritten to provide a formula known as the **multiplication rule** for probabilities.

**Multiplication Rule:**

$$P(A\cap B) = P(B|A)P(A) = P(A|B)P(B)$$

- This expression is obtained by interchanging *A* and *B* 

**Example: Machining Stages**

The probability that the $1^{st}$ stage of a numerically controlled machining operation meets specifications is 0.90. The probability that it meets specifications in the $2^{nd}$ stage, given that it met specifications in the first stage is 0.95.

What is the probability that both stages meet specifications?

- Let *A* and *B* denote the events that the $1^{st}$ and $2^{nd}$ stages meet specifications, respectively.

- $P(A\cap B) = P(B|A) \cdot P(A) = 0.95\cdot 0.90 = 0.855$

###### Total Probability Rule

- *A* and $A \prime$ are mutually exclusive.
- $A \cap B\;and\;A\prime \cap B$ are mutually exclusive
- $B = (A\cap B) \cup (A\prime \cap B)$

**Total Probability Rule (Two Events)**

For any two events *A* and *B*

$$P(B) = P(B \cap A) +P(B \cap A\prime) = P(B|A)P(A)+P(B|A\prime)P(A\prime)$$

**Example: Semiconductor Contamination**

Information about product failure based on chip manufacturing process contamination is given below. Find the probability of failure.

![[Pasted image 20240909171931.png]]

Let F denote the event that the product fails

Let H denote the event that the chip is exposed to high contamination. Then:

- $P(F|H) = 0.10\;and\;P(F|H\prime)=0.005$
- $P(H) = 0.20\;and\;P(H\prime) = 0.8$
- $P(F)=0.10(0.20) + 0.005(0.80)=0.024$

**Total Probability Rule (Multiple Events)**

Assume $E_1, E_2, ..., E_k$ are *k* mutually exclusive and exhaustive sets. Then:

$$P(B)=P(B\cap E_1) +P(B \cap E_2)+...+P(B\cap E_k)$$
$$=P(B|E_1)P(E_1)+P(B|E_2)P(E_2)+...+P(B|E_k)P(E_k)$$

###### Independence

Knowledge that the outcome of the experiment is in Event A does not affect the probability that the outcome is in event B.

**Independence (two events)**: two events are **independent** if any one of the following equivalent statements is true:

1. $P(A|B)=P(A)$
2. $P(B|A)=P(B)$
3. $P(A\cap B) = P(A)P(B)$

**Independence (multiple events)**

The events $E_1, E_2,...,E_n$ are independent if and only if for any subset of these events

$$P(E_{i_1}\cap E_{i_2} \cap ...\cap E_{i_k})=P(E_{i_1})\times P(E_{i_2})\times...\times P(E_{i_k})$$

###### Bayes' Theorem

- Bayes’ theorem states that,

$$P(A|B)=\frac{P(B|A)P(A)}{P(B)} \;for\; P(B) >0$$

The conditional probability that a high level of contamination was present when a failure occurred is to be determined.

The information is summarized here:

![[Pasted image 20240909174800.png]]

Bayes' Theorem

If $E_1, E_2,..., E_k$ are *k* mutually exclusive and exhaustive events and *B* is any event,

$$P(E_1|B) = \frac{P(B|E_1)P(E_1)}{P(B|E_1)P(E_1)+P(B|E_2)P(E_2)+...+P(B|E_k)P(E_k)}$$

**Note**: Numerator expression is always one of the terms in the sum of the denominator.


###### Random Variables

- The variable that associates a number with the outcome of a random experiment is referred to as a **random variable.**

	**Def:** a **random variable** is a function that assigns a real number to each outcome in the sample space of a random experiment.

- Notation is used to distinguish between a random variable and the real number.

	**Notation**: a random variable is denoted by an uppercase letter such as *X*. After an experiment is conducted, the measured value of the random variable is denoted by a lowercase letter such as $x = 70\;milliamperes$

###### Discrete & Continuous Random Variables

- A **discrete random variable** is a random variable with a finite (or countably infinite) range.
- a **continuous random variable** is a random variable with an interval (either finite or infinite) of real numbers for its range

	**Examples of Random Variables**

- **Continuous Random Variables:**
	- electrical current, length, pressure, temperature, time, voltage, weight
- **Discrete Random Variables:**
	- number of scratches on a surface, proportion of defective parts among 1000 tested, number of transmitted bits received in error. 

