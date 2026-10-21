---
source: SE3310A_Lecture08_Oct07_CFG.pdf
tags: [SE3310A, TheoreticalFoundations, ContextFreeGrammars]
---

# Lecture 8 — Context-free Grammars

Wednesday, October 7. Lectures 2–6 gave regular languages three equivalent descriptions (DFA, NFA, RE); Lecture 7 found the boundary — {0ⁿ1ⁿ} is not regular. Today: a new way to describe languages, the context-free grammar; three worked grammars (including one for {0ⁿ1ⁿ} itself); and proof that every regular language is context-free, with an explicit conversion.

> [!info]- Slide index — where each section comes from
> | Section of this note | Slides in the deck |
> |---|---|
> | *Review and outline* | 2 Review, and Today's Outline |
> | **Context-free Languages** | 3 *part divider* · 4 Non-regular languages · 5 Context-free Languages |
> | ⤷ `Chomsky Hierarchy` | 6 Chomsky Hierarchy 📊 · 7 Representing Languages · 8 Remark: Reading the Table |
> | **Grammars** | |
> | ⤷ `Context-free Grammar` | 9 Grammar · 10–11 Question: Using the Sentence Grammar · 14 Context-free Grammar (Definition 1) · 15–16 Question: The Four Components · 18 Context-free Grammar: The Idea |
> | ⤷ `Derivation` | 12 Grammar (building a sentence) · 13 Remark: Anatomy of a Derivation · 19 Remark: Generating versus Recognizing |
> | ⤷ `Context-free Language` | 5 Context-free Languages · 17 Context-free Language (Definition 2) |
> | **Three Worked Grammars** | |
> | ⤷ `CFG for 0n1n` | 20 Example 1 · 21–22 Exercise: Working with A → 0A1 \| ε · 23 Example 1 (deriving 000111) · 24 Remark: Why This Grammar Is Exact |
> | ⤷ `Balanced Parentheses Grammar` | 25 Example 2 · 26–27 Exercise: Balanced Parentheses · 28 Example 2 (deriving (()())) · 29 Remark: Why All Three Rules |
> | ⤷ `More 1s than 0s Grammar` | 30–32 Example 3 · 33–34 Exercise: More 1s than 0s · 35 Remark: The Two Claims, Made Precise |
> | **Regular Languages are Context-free** | |
> | ⤷ `Regular Languages are Context-free` | 36 Theorem 3 · 37 DFA → CFG conversion · 38 Remark: Why the Conversion Works · 39 Converting a DFA 📊 · 40–41 Exercise: Comparing the Run and the Derivation · 42–43 Additional Exercise: Strings Ending in 01 |
> | **Additional Exercises** | |
> | ⤷ `Palindrome Language` | 44–45 Additional Exercise: Palindromes |
> | *Review Questions* | 46–47 Review Questions |
> | **This Week, and the Break** | 48 This Week, and the Break |
> | *Summary and Next Steps* | 49 Summary and Next Steps |

## Context-free Languages

We proved {0ⁿ1ⁿ} is not regular — no DFA, NFA or RE describes it. So how *do* you describe it? Time to "graduate" to a broader class.

![[Chomsky Hierarchy]]

## Grammars

![[Context-free Grammar]]

![[Derivation]]

![[Context-free Language]]

## Three Worked Grammars

![[CFG for 0n1n]]

![[Balanced Parentheses Grammar]]

![[More 1s than 0s Grammar]]

## Regular Languages are Context-free

![[Regular Languages are Context-free]]

## Additional Exercises

![[Palindrome Language]]

> [!question] Review Questions
> 1. In a CFG (V, Σ, R, S), which symbols may still appear when a derivation stops?
> 2. What exactly does w ∈ L(G) mean — and what must you do to show w ∉ L(G)?
> 3. State the relationship between the regular and the context-free languages, and name the witness that makes it strict.
> 4. In the DFA-to-CFG conversion, which states contribute ε-rules, and why those?
>
> Answers — **1.** Only terminals: a derivation stops precisely when no variable remains. **2.** Some derivation from S produces w. For w ∉ L(G), failed attempts aren't enough — argue via an invariant that no derivation can produce w. **3.** REG ⊂ CFL strictly: {0ⁿ1ⁿ : n ≥ 0} is context-free (Example 1) but not regular (Lecture 7). **4.** The accepting states: a derivation may terminate (Q_f → ε) exactly where a run may accept.

## This Week, and the Break

| When | What |
|---|---|
| Fri Oct 9 | **Assignment 2 released** on Gradescope — NFA conversion, closure properties, regular expressions; that day's tutorial introduces it |
| Oct 10–18 | Reading week — no lectures, no tutorial |
| Mon Oct 19 | Lecture 9: pushdown automata — the machine counterpart of today's grammars |
| **Tue Oct 20** | **Assignment 2 due** |
| **Fri Oct 30** | **Midterm**, during the tutorial hour — details and scope in the course outline |

## Summary and Next Steps

Today: grammars generate strings; a language is context-free iff some CFG generates it, and REG ⊂ CFL in the Chomsky hierarchy. A CFG is (V, Σ, R, S); derivations rewrite one variable at a time until only terminals remain. Three exact grammars — {0ⁿ1ⁿ}, balanced parentheses, more 1s than 0s — show recursion doing what finite memory cannot. Every DFA converts to a CFG: the variable is the current state. **Next (Lecture 9, after reading week):** pushdown automata — a finite automaton plus a stack.

## Notes to Self

- To prove w ∉ L(G), find an **invariant every rule preserves** — never just list failed derivations
- Every "is this grammar exact?" answer needs **both** directions: nothing extra, nothing missing
- Practise the DFA → CFG conversion — it's mechanical and easy marks
