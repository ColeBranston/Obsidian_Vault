A **derivation** is a sequence of rewriting steps in a [[Context-free Grammar]] that starts at the start variable and ends at a string of terminals only. That final string is a member of the grammar's language L(G).

**Anatomy**
- Two kinds of symbols: **variables** (still to be rewritten) and **terminals** (final)
- Each step rewrites **exactly one** variable using **one** rule; everything else is copied unchanged
- The derivation stops when **no variables remain** — so a finished derivation contains nothing but terminals

**Notation.** The arrow → is reserved for *rules*; a derivation *step* is written ⇒, e.g. A ⇒ 0A1 ⇒ 0011.

*Example — building a sentence with the English grammar:*
sentence ⇒ noun-phrase verb-phrase ⇒ cmplx-noun verb-phrase ⇒ article noun verb-phrase ⇒ *a* noun verb-phrase ⇒ *a boy* verb-phrase ⇒ *a boy* cmplx-verb ⇒ *a boy* verb ⇒ *a boy sees*

### Generating versus recognizing

Automata and grammars approach the same object from opposite ends:
- A **DFA recognizes**: it is handed a string and answers accept or reject
- A **grammar generates**: it starts from S and produces strings; L(G) is everything it can produce

**Membership is an existence statement**: w ∈ L(G) iff *some* derivation of w exists — the same one-sided flavour as [[Non-deterministic Finite Automaton|NFA]] acceptance. Different derivations can produce the same string; membership only needs one.

| To show | You must |
|---|---|
| w ∈ L(G) | exhibit **one** derivation |
| w ∉ L(G) | argue **no** derivation exists — a property of all derivations, usually an **invariant that every rule preserves**. Exhibiting failed attempts is not enough |
