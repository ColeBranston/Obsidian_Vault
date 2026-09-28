> [!note] Definition 2 — Regular Expression
> R is a **regular expression** if R is:
> 1. a ∈ Σ (a symbol)
> 2. ε (the empty string)
> 3. ϕ (the empty set)
> 4. R₁ ∪ R₂ (the union of two REs)
> 5. R₁R₂ (the concatenation of two REs)
> 6. R₁* (an RE repeated 0 or more times)

**Reading the definition**
- **Inductive:** three base cases (a, ε, ϕ) and three ways to combine (∪, concatenation, *) — every RE is built in finitely many such steps. The combiners are exactly the operations proved closed in [[Closure Under Union]], [[Closure Under Concatenation]] and [[Closure Under Kleene Star]]
- **Precedence**, as in arithmetic: star binds tightest, then concatenation, then union. ab* ∪ c reads as (a(b*)) ∪ c. Parentheses override
- ϕ denotes the empty language ∅ — the slides write ϕ, Sipser writes ∅; same object

**What the base cases denote**

| Expression | Language | Members |
|---|---|---|
| a | {a} | one string, one symbol |
| ε | {ε} | one string, of length zero |
| ϕ | ∅ | no strings at all |

> [!warning] ε vs ϕ
> {ε} has exactly one member; ∅ has none. A machine for {ε} accepts the empty input; a machine for ∅ accepts nothing. Confusing the two is a classic exam error.

**Shorthand**
- **R⁺** = RR* — R repeated *one* or more times
- **Σ** (following Sipser, somewhat laxly) = any single symbol, i.e. (0 ∪ 1) over {0, 1}

**Examples, unpacked**
- **0\*10\*** — exactly one 1: the single 1 sits in the middle, zeros free on both sides
- **1\*(01⁺)\*** — every 0 is followed by at least one 1: each 0 enters only through the block 01⁺. So no string ends in 0, and 00 never occurs
- **(ΣΣ)\*** — even length: symbols consumed two at a time. Exactly the language of Lecture 3's two-state machine

A language can be given in three notations — English, a machine, or a regular expression — and [[Kleene's Theorem]] says REs and machines describe the same class. See also [[Regular Expression Identities]].
