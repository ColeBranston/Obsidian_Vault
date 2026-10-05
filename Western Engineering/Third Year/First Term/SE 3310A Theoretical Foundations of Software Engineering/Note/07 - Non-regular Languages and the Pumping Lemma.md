---
source: SE3310A_Lecture07_Oct05_Pumping_Lemma.pdf
tags: [SE3310A, TheoreticalFoundations, Automata, PumpingLemma]
---

# Lecture 7 — Non-regular Languages and the Pumping Lemma

Monday, October 5. Lectures 5–6 gave a regular language three interchangeable descriptions (DFA, NFA, regular expression) and closure under union, concatenation, star, complement and intersection. Today finds the boundary: languages that are *not* regular, and the pumping lemma — the tool that proves it. One fully worked proof, a reusable template, and the standard mistakes.

> [!info]- Slide index — where each section comes from
> | Section of this note | Slides in the deck |
> |---|---|
> | *Review and outline* | 2 Review, and Today's Outline |
> | **Non-regular Languages** | 3 *part divider* (Pumping Lemma for Regular Languages) |
> | ⤷ `Non-regular Language` | 4 Non-regular Languages · 5–6 Question: Four Candidates · 7 Non-regular Languages · 8–9 Exercise: Reading {0ⁿ1ⁿ : n ≥ 0} · 10 Proving a Regular Language is Regular · 11 Remark: An Asymmetry in the Burden of Proof · 12 Proving a Non-regular Language is Non-regular · 46 Exercise: Regular or Not? (the trap) |
> | **The Pumping Lemma** | |
> | ⤷ `Pumping Lemma` | 12 Proving a Non-regular Language is Non-regular · 13 The Pumping Lemma (Theorem 4) · 14 The Statement, Quantifier by Quantifier · 17 Pumping Lemma: The Idea · 18 Remark: Pumping Inside a Regular Language · 19 Pumping Lemma: The Idea · 20 Visualizing the Pumping Lemma 📊 · 21–22 Question: The Two Side Conditions · 42 Pumping Lemma Summary |
> | ⤷ `Pigeonhole Principle` | 17 Pumping Lemma: The Idea |
> | ⤷ `Pumping Lemma Game` | 14 The Statement, Quantifier by Quantifier · 15–16 Question: Who Chooses What? |
> | **Proving a Language Non-regular** | |
> | ⤷ `Pumping Lemma Proof Template` | 23 Strategy for Proving L Non-regular · 24 The Proof Template · 25–26 Question: Choosing the String s · 27 Showing a String Cannot Be Pumped |
> | ⤷ `Non-regularity of 0n1n` | 28 Pumping Lemma: An Example · 29–33 Show s cannot be pumped · 34 Remark: Condition 3 Collapses the Cases · 35–36 Pumping Lemma Example (Cont'd) · 37–38 Question: Where Was Each Condition Used? |
> | ⤷ `Condition-3 Shortcut` | 22 Question: The Two Side Conditions (note) · 26 Question: Choosing the String s (note) · 34 Remark: Condition 3 Collapses the Cases · 44 Exercise: Equally Many Zeros and Ones · 50 Additional Exercise: More Zeros Than Ones · 54 Additional Exercise: The Copy Language · 56 Review Questions |
> | **What the Lemma Does and Doesn't Prove** | |
> | ⤷ `Limits of the Pumping Lemma` | 39 Pumping Lemma FAQ · 40 Pumping Lemma FAQ Cont'd · 41 Remark: A One-Directional Tool · 51–52 Additional Exercise: Attempting the Impossible |
> | **Exercises** | |
> | ⤷ Exercise: Equally Many Zeros and Ones | 43–44 Exercise: Equally Many Zeros and Ones |
> | ⤷ `Proving Non-regularity by Closure` | 43–44 Exercise: Equally Many Zeros and Ones |
> | ⤷ Exercise: Regular or Not? | 45–46 Exercise: Regular or Not? |
> | ⤷ Exercise: Three Flawed Proofs | 47–48 Exercise: Three Flawed Proofs |
> | **Additional Exercises** | |
> | ⤷ `Pumping Down` | 49–50 Additional Exercise: More Zeros Than Ones |
> | ⤷ `Copy Language` | 53–54 Additional Exercise: The Copy Language |
> | *Review Questions* | 55–56 Review Questions |
> | **This Week, and the Break** | 57 This Week, and the Break |
> | *Summary and Next Steps* | 58 Summary and Next Steps |

## Non-regular Languages

Given a description of a language and the question "is it regular, or not?" — how would you decide, and how could you convince someone else?

![[Non-regular Language]]

## The Pumping Lemma

![[Pumping Lemma]]

![[Pigeonhole Principle]]

![[Pumping Lemma Game]]

## Proving a Language Non-regular

![[Pumping Lemma Proof Template]]

![[Non-regularity of 0n1n]]

![[Condition-3 Shortcut]]

## What the Lemma Does and Doesn't Prove

![[Limits of the Pumping Lemma]]

## Exercises

### Exercise: Equally Many Zeros and Ones

L₄ = {s : s contains equally many 0s and 1s}. Prove L₄ is not regular — twice.

**Method 1 — directly, with the condition-3 shortcut.** Choose s = 0ᵖ1ᵖ ∈ L₄. By condition 3, y = 0ᵏ with k ≥ 1; then xy²z has p + k zeros and p ones — unequal, so xy²z ∉ L₄. Contradiction.

**Method 2 — without pumping anything new:**

![[Proving Non-regularity by Closure]]

### Exercise: Regular or Not?

Classify each language; justify with one sentence.

| Language | Verdict | Justification |
|---|---|---|
| {0ⁿ1ᵐ : n, m ≥ 0} | regular | 0\*1\* — no matching between n and m is demanded |
| {0ⁿ1ⁿ : 0 ≤ n ≤ 100} | regular | finite — 101 strings |
| {s : s has even length} | regular | (ΣΣ)\* |
| {0ⁿ1ⁿ : n ≥ 0} | not regular | today's theorem |

The second one is the standard trap — see the warning at the end of [[Non-regular Language]].

### Exercise: Three Flawed Proofs

Each "proof" about L = {0ⁿ1ⁿ} contains one fatal error.

| "Proof" | Fatal error |
|---|---|
| "Let p = 5 and s = 0⁵1⁵. For every split … contradiction. Hence L is not regular." | **p is the adversary's number, not ours.** A proof for p = 5 says nothing about a machine with a million states; p must remain an unknown constant |
| "Let s = 0ᵖ1ᵖ and split it as x = ε, y = 0ᵖ, z = 1ᵖ. Pumping gives 0²ᵖ1ᵖ ∉ L. Hence L is not regular." | **Only one split was defeated.** The lemma promises *some* split works for the adversary — a proof must defeat every legal split (or use condition 3 to confine them) |
| "I took s = 0ᵖ1ᵖ in the regular language 0\*1\* and pumped it successfully for every split. Hence 0\*1\* is regular." | **The lemma runs in one direction only.** Successful pumping is consistent with regular *and* with non-regular; regularity is certified by exhibiting a machine or an expression, never by pumping |

The first two break the [[Pumping Lemma Game]] table; the third is [[Limits of the Pumping Lemma]].

## Additional Exercises

![[Pumping Down]]

![[Copy Language]]

*Attempting the Impossible* (running the template on 0\*1\*) is worked inside [[Limits of the Pumping Lemma]] above.

> [!question] Review Questions
> 1. In the game table: who chooses p, s, the split, and i?
> 2. What exactly does condition 3 (|xy| ≤ p) buy you when s begins with p identical symbols?
> 3. Why is i = 0 sometimes necessary rather than i = 2?
> 4. Can the pumping lemma ever prove a language regular?
>
> Answers — **1.** Adversary: p and the split. You: s and i (one i per split). **2.** It forces y to consist of that identical leading symbol only — the entire case analysis collapses to one case. **3.** When pumping up preserves the defining inequality (as in m > n), removing y is what breaks the string. **4.** Never. It is regular ⇒ pumpable; the useful direction is the contrapositive, and there is no converse.

## This Week, and the Break

| When | What |
|---|---|
| Wed Oct 7 | Lecture as usual — context-free grammars begin |
| Fri Oct 9 | **Assignment 2 released**; the tutorial that day introduces it |
| Oct 10–18 | Reading week — no lectures, no tutorial |
| **Tue Oct 20** | **Assignment 2 due** — NFA conversion, closure properties, regular expressions |
| **Fri Oct 30** | **Midterm**, during the tutorial hour — details and scope are in the course outline |

## Summary and Next Steps

Today: non-regular languages exist — instinct located them, the pumping lemma convicted them. The statement as a game: the adversary owns p and the split, you own s and i. One full proof for {0ⁿ1ⁿ}, the condition-3 shortcut, pumping down, and the closure-based alternative. **Next lecture (Wed Oct 7):** beyond regularity — context-free grammars, the formalism that *can* match 0ⁿ against 1ⁿ.

## Notes to Self

- On assignments and tests, write the **condition-3 shortcut** version of a pumping proof, not the full case analysis
- Keep the game table in view while writing any pumping proof — p stays unknown, every legal split must be defeated
- Both non-regularity techniques (pumping, and intersecting with a regular language) are examinable
- **A2** comes out Fri Oct 9 and is due **Tue Oct 20** — go to the Oct 9 tutorial, it introduces the assignment
- **Midterm Fri Oct 30** in the tutorial hour — check the course outline for scope
- Optional reading: the "I hate the Pumping Lemma" blog post linked in [[Pumping Lemma]]
