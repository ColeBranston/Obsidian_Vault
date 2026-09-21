---
source: Week2_Lecture1_Sep14_Notation_and_DFA.pdf
tags: [SE3310A, TheoreticalFoundations, Automata]
---

# Notation, Formal Languages and Finite Automata

Monday, September 14. The lecture builds one chain and then walks it: **symbols → strings → sets of strings → a machine that decides membership**. Everything in the first half exists to make the definition at the end precise.

## Notation

Set-builder notation, used throughout: **{x | statement}** — "the set of all x for which *statement* is true". Some texts write `:` for `|`. The integers are **ℤ** = {…, −1, 0, 1, …}; the naturals **ℕ** = {1, 2, …}; and {x ∈ ℤ : x > 0} = ℕ.

![[Set]]

![[Tuple]]

![[Function]]

> [!question] Check yourself
> 1. True or false: {∅} = ∅
> 2. What is |{∅}|?
> 3. True or false: {x₁, x₃} ⊆ A, where A = {x₁, x₂, x₃, x₄}
>
> Answers — **1. False.** ∅ has no elements; {∅} has exactly one element, namely ∅ itself. **2. 1**, for the same reason. **3. True** — both x₁ and x₃ are elements of A.

## Alphabets, Strings and Languages

![[Alphabet]]

![[String]]

![[Kleene Star]]

![[Formal Language]]

## What is Computation?

![[Decision Problem]]

## Deterministic Finite Automata

![[Deterministic Finite Automaton]]

## Notes to Self

- The five components of a DFA map onto things defined earlier in this same lecture — Q and F are [[Set]]s, Σ is an [[Alphabet]], δ is a [[Function]] whose domain is a [[Tuple]] space. Nothing in the definition is new machinery
- **Next (Wednesday):** machines with output; regular languages; designing a DFA from a description
- **Friday, first tutorial:** Assignment 1 released; drawing automata with TikZ and Graphviz; Gradescope setup
