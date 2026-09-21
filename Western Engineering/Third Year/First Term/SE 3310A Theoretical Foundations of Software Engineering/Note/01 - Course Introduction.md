---
source: SE3310A_Lecture01_Sep08_Introduction.pdf
tags: [SE3310A, TheoreticalFoundations]
---

# Course Introduction

Dr. Pincan Zhao · Wednesday, September 9, 2026

An introduction to the theoretical foundations of software engineering — formal languages, automata theory, computability and computational complexity. The course addresses three questions:

1. What is computation?
2. Which problems can be solved by a computer at all?
3. Of those that can, which can be solved **efficiently**?

## Teaching Team

- **Instructor:** Dr. Pincan Zhao — pincan.zhao@uwo.ca — office hours directly after class, or by appointment
- **TA:** Marcus Tuen Muk — mtuenmuk@uwo.ca

## Schedule

| Session | Time | Room |
|---|---|---|
| Lecture | Mon 12:30–2:30 | SEB-2200 |
| Lecture | Wed 12:30–1:30 | SEB-2200 |
| Tutorial | Fri 12:30–2:30 | SEB-2200 |

- Tutorials **begin Friday, September 18** — there is none on September 11
- **No class Wednesday, September 30** (National Day for Truth and Reconciliation)
- **Fall reading week** — no classes October 12–16

## Course Materials

- **Required:** Michael Sipser, *Introduction to the Theory of Computation*, 3rd ed., Cengage 2012 (~\$72)
- **Optional:** Maheshwari & Smid, *Introduction to Theory of Computation*, 2012, free online — not a substitute for Sipser
- **OWL Brightspace** — lecture notes, announcements, course documents
- **Gradescope** — assignment submission and returned marks, `gradescope.ca`, entry code **9NY2RE**

> [!warning] Gradescope domain
> Use `gradescope.**ca**`, not the `.com` American site. Confirm access to both platforms before Friday.

## Evaluation

| Component | Weight |
|---|---|
| Five assignments, 5% each | 25% |
| Midterm test | 25% |
| Final examination | 50% |

Both exams are multiple-choice and short-answer, in person and closed book.

- **Midterm — Friday, October 30**, one hour, during the tutorial slot. Covers everything up to **and including context-free grammars**; **pushdown automata are not on it**. A missed midterm is not rescheduled — the weight moves to the final, with supporting documentation
- **Final** — two hours, scheduled by the Registrar between **December 11 and 22**. No notes, calculators or electronic devices

## Assignments

| # | Released | Due |
|---|---|---|
| 1 | Fri Sep 18 | Tue Sep 29 |
| 2 | Fri Oct 9 | Tue Oct 20 |
| 3 | Fri Oct 23 | Tue Nov 3 |
| 4 | Fri Nov 6 | Tue Nov 17 |
| 5 | Fri Nov 20 | Tue Dec 1 |

- Due **11:55 pm** on the listed date, through **Gradescope only** — email submissions are not accepted
- Illness or extenuating circumstances: up to **48 hours late without academic penalty**
- **The portal closes when the tutorial takes up the solutions.** After that, late work scores zero — the 48-hour grace does not survive the solutions being discussed
- Registered accommodations: contact the instructor **at least one week before** the deadline

![[Drawing Automata]]

## Tutorials

Weekly on Fridays, and part of the course. They introduce each assignment and discuss solution strategies, take up completed assignments, answer questions on lecture material, and host the midterm.

## Policies

**Academic integrity and generative AI** — the Faculty of Engineering policy applies. AI tools **may** be used on assignments provided their use is disclosed and referenced; they are **not permitted** in the midterm or final. Discussing problems with classmates is encouraged, but submitted work must be written independently and in your own words.

**Email** — include `[SE 3310]` in the subject (emails are filtered on it), a proper salutation and a sign-off with full name and student number. No slang, texting abbreviations or emoji.

| Not acceptable | Acceptable |
|---|---|
| SUBJECT: question | SUBJECT: [SE 3310] Assignment 1, Q1.2 |
| "hey prof, i dont get q2 on a1, can u explain? thx :)" | "Dear Dr. Zhao, I am a student in SE 3310A. I am stuck on Question 1.2 of Assignment 1. …Thank you, \<Full name\>, \<Student number\>" |

**Accommodation** — Accessible Education registrations should be raised early in the term; academic consideration goes through the Student Absence Portal. Raise problems early rather than late.

## Course Topics

| Unit | Topic | Weeks |
|---|---|---|
| 1 | Regular languages: finite automata and regular expressions | 1–4 |
| 2 | Context-free languages: grammars and pushdown automata | 5–6 |
| 3 | Turing machines | 7–8 |
| 4 | Decidability and computability | 8–9 |
| 5 | Complexity: P, NP, NP-complete, NP-hard, BPP, BQP | 10–12 |
| — | Review | 13 |

**Unit 1** — machines with small, fixed memory. A turnstile has two states: a coin unlocks it, a push locks it again, and it remembers nothing else — not how many coins, not how long ago. Regular expressions describe exactly what such machines can recognise; search patterns and form validation are built on this.

**Unit 2** — give the machine a **stack**, so it can hold a count with no upper limit. `(()())` matches, `(()` doesn't; checking requires remembering how many brackets are still open, and there's no bound on that number, so a fixed number of states cannot do it. This is how programming-language syntax is described, and why your editor spots a missing bracket.

**Units 3–4** — the most general machine there is, and what even it cannot do. `while x != 1: x = x - 2` halts for odd positive x and runs forever for even x — the answer depends on the input. The general question, *can a program read any other program and say whether it will ever stop?*, was answered **no** in 1936. Not "too slow" — no such program exists, proved in Week 9. This is why no compiler warns you about every infinite loop.

**Unit 5** — problems we can solve, but perhaps not quickly enough to matter. Assigning 40 courses to rooms and time slots so no student has a clash: checking a proposed timetable takes seconds, finding one has no known fast method. Does "easy to check" always mean "easy to find"? **P = NP?** — open since 1971, one of the seven Millennium Prize Problems.

## Where This Course Came From

> The computer was invented in order to prove that something is impossible.

| Year | Who | What |
|---|---|---|
| 1928 | **Hilbert** | asks the question |
| 1936 | **Turing** | answers it, and invents the computer |
| 1956 | **Chomsky** | sorts languages into levels |
| 1971 | **Cook** | finds the hardest problems |
| 1994 | **Shor** | changes the machine |

**1928–1936.** Hilbert asks for a mechanical procedure that takes any mathematical statement and decides whether it is true. In 1931 Gödel shows that in any system of arithmetic there are true statements unprovable inside it. In 1936 Church and Turing, working separately, prove Hilbert's procedure does not exist. To prove it, Turing first had to say what a *mechanical procedure* **is** — nobody had ever done that — so he described an imaginary machine: a tape, a head that reads and writes, a table of rules. Ninety years later that is still our definition of a computer. The question got a negative answer; the definition invented to answer it became the computer. → Units 3 and 4

**1956.** Chomsky, studying human language rather than computers, sorts grammars into levels by how much machinery is needed to generate them. The levels turn out to match the machines exactly — two people climbing the same ladder from opposite ends. You have already used one level: the notation defining a programming language's syntax. → Units 1 and 2

**1971.** Cook, at Toronto, shows that hundreds of apparently unrelated hard problems are one problem in disguise. Solve any one quickly and you solve them all. Nobody has. → Unit 5

**1994.** Shor finds an algorithm that breaks RSA on a computer that does not exist yet. If a large quantum computer is ever built, most encryption in use today stops working; NIST published the first replacement standards in 2024. → Unit 5

## Notes to Self

- **Before Friday:** confirm access to OWL Brightspace *and* Gradescope (code 9NY2RE, `.ca` domain)
- Buy or borrow Sipser 3rd ed.
- First tutorial Fri Sep 18: Assignment 1 released and introduced · TikZ and Graphviz demo · Gradescope setup · review of mathematical notation
- Set up an Overleaf account or bookmark the Graphviz editor before the first assignment is due
