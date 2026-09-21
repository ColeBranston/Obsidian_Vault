#### The Rule of Sum: 

if a task can be performed in *m* ways while a second task can be performed in *n* ways, and the two tasks cannot be per performed simultaneously, then performing either task can be accomplished in m+n different ways.

→ If there are more than 2 tasks the sum rule still applies as long as no two of the tasks can be performed at the same time. 

**Examples:** 

1. How many ways can one draw a card from a standard deck that is either red or space

	- Standard Card Deck $\therefore$ 4 suits, $\therefore$ 13 Kinds of cards
	- 26 red cards,13 spades

$\therefore$ 26 + 13 = 39 ways

2. My hand in a card game includes 3 gives, 4 jacks, 2 kings, and a queen. I have to play one card. How many options do I have?

	- 3+4+2+1 = 10 Options

$\therefore$ 10 options total

#### The Rule of Product

The total number of possible outcomes of a series of decisions is found by multiplying the number of choices for each decision. 

**Examples**

1. I want to order a black coffee at a coffee shop. They sell coffee from Brazil, Columbia, Vietnam, and Jamaica and the sizes that you can get are Tall, Grande, and Venti. How many options do I have for ordering my coffee?

	- 4 countries, 3 sizes

$\therefore$ 4 x 3 = 12 options total

2. A bit is a sequence of symbols chosen between the symbols 0 and 1. The length of a bit string is the number of symbols in the sequence. For example 01101 is a but string of length 5, How many but strings of length 4 are there? How many bit strings do not have consecutive 1's?

**Q1**
	- 4 placeholders, 2 bits for each, but each option is distinct in itself
	- means that after the first placeholder the same chose is given again and again

$\therefore 2 \cdot 2 \cdot 2 \cdot 2 = 16$ Possibilities

		
**Q2**

Hand count using tree diagram


→ 8 Possibilities

3. How many license plate are possible in Ontario if a plate consists of 4 letters followed by 3 numbers? What if numbers can't be repeated?
**Q1**
- 26 letters 4 times, 10 numbers 3 times

$\therefore 26\cdot26\cdot26\cdot26\cdot10\cdot10\cdot10\ = 26^4\cdot10^3$ possibilities

**Q2**
- 26 letters 4 times, 10 numbers then 9 numbers then 8 numbers

$\therefore$ $26^4 \cdot10\cdot9\cdot8 =$ # of possibilities

4. In how many way can we arrange the letters ABCDE

- 5 Letters, 5 spots, choice pool decreases each time.

$\therefore$ $5 \cdot 4 \cdot 3 \cdot 2 \cdot 1 = 120$ different possibilities

In the previous example we saw that the number of ways of arranging five different letters (without repetition) is $5 \cdot 4 \cdot 3 \cdot 2 \cdot 1$. In general, the number of ways of arranging *n* different symbols is *n*! is read as n factorial.

These words without repetition are called arrangements in the book,, meaning that the words DACE and CEAD are different, that is, the order in the arrangement of the symbols matters!. There will be situations where the order doesn't matter

**Permutations:** Given a collection of *n* objects, any order arrangement of some of the *n* objects is called a permutation If *r* is an integer with $1 \leq r \leq n$, the number of permutations of size *r* of the *n* objects can written as:

$$P(n,r)=n(n-1)(n-2)...(n-(r-1))=\frac{n!}{(n-r)!}$$

5. 10 Students enter a competition. How many different possible podiums are there? 

	- 3 positions, 10 students, after a student is chosen for a podium, the number of students to choose from decrease.

$\therefore 10 \cdot 9 \cdot 8 =$ # of possibilities

6. From a team of 10 students you have to pick a president a vice-president and a secretary. In how many ways can you do this?

- 3 positions, 10 students, after a student is chosen the chose pool decreases

$\therefore 10 \cdot 9 \cdot 8 =$ # of possibilities

>[!Overcounting]
>If, when counting the number of elements of a group, we overcount by counting each element *k* times, to get a total of *n*. Then, the number of elements of the group is $\frac{n}{k}$

- Ex. In how many ways can the letters in CAATV be arranged? If all letters were different, assume all letters are different.

	We can order the 5 different letters in 5! → **But we are overcounting**

	CAATV is being counted twice → $CA_1A_2TV$ and $CA_2A_1TV$. In fact, we are counting every word twice since we are counting every word twice. the number of words is:
	$\frac{5!}{2}$. Where the denominator is the number of distinct choices to the factorial. In this case, $A_1$ and $A_2$ are the distinct options, so you must divide by 2! to not overcount. 

	Say, for example, the letters were CAAATV, with distinct letters, then the possibilities would be $\frac{5!}{3!}$.

	Say, for example, the letters were CCCCAAATV, with distinct letters, then the possibilities would be $\frac{9!}{3!}$ to not overcount the A's, but to include the C's you'd divide the equation by the number of distinct C's. The resultant equation is:
	$$\therefore \frac{9!}{3! \cdot 4!}$$ **Examples:**

1. In how many ways can we arrange the letters in MISSISSAUGA

- There are 11 letters, decreasing of choice pool by a letter every time an arrangement is made, 2 I's, 4 S's 2'As.

$$\therefore \frac{11!}{2! \cdot 4! \cdot 2} \;possibilities$$

>[!Arrangements of Objects With Repetitions]
>In general, if there are *n* objects composed of $n_1$ indistinguishable objects, $n_2$ indistinguishable objects, ..., and $n_r$ indistinguishable objects where $n = n_1 + n_2+...+n_4$, then the number of possible arrangements of the *n* objects is $\frac{n!}{n_1! \cdot n_2! ...n_r!}$

 **Examples**
 
1. 5 people sear at a circular table with 5 seats, Suppose that two searing arrangements are equal if one can be obtained from the other by rotation. How many different seating arrangements are there?

$\therefore \frac{5!}{5} = 4!$

2. How many ways are there of drawing 4 cards out of a standard deck without replacement. 

- 4 choices → Order of selection matters

$\therefore \frac{52!}{(52-4)!}$ 

	b. Say order doesn't matter.

	$\therefore \frac{52!}{(52-4)!\cdot 4!}$

In general, we have the following:

>[!Combinations]
>Suppose we have *n* objects. The number of ways of selecting *r* objects out of the *n* objects, with no reference to the order of selection is *n* choose *r*, $(\frac{n}{r})$ where: $$(\frac{n}{r}) = C(n,r) = \frac{P(n,r)}{r!} = \frac{n!}{r!(n-r)!}$$ 
>An unordered selection of objects is also called a combination. So, ($\frac{n}{r}$) is the number of combinations of size *r* chosen from a group of *n* objects
>


**Examples:**

- In how many ways can a committed of 6 people be formed out of a group of 17 people?

$\therefore (\frac{17}{6})$ 

- What if the group must have a president?

$\therefore (16 \cdot\frac{16}{5})$

- What if the group must have a president, a secretary, and a president.

$\therefore (\frac{17}{3})\cdot14 \cdot 13 \cdot 12$

- Suppose that out of the 17 people, 8a are right wing and 9 are left wing. If the committee must have 3 left wing and 3 right wing people. How many different committees can be found?

$\therefore(\frac{9}{3}) \cdot (\frac{8}{3})$

- If the committee must have at least 3 left wing people, how many different committees can be formed?

$\therefore (\frac{9}{3}) \cdot (\frac{14}{3})$

Choose 3 Left Wing → 9/3
choose another 3 → 14/3


#### Binomial Theorem

![[Binomial Theorem]]

![[Multinomial Theorem]]

![[Pascal's Triangle]]