A language is **non-regular** if *no* DFA, NFA or regular expression describes it — it lies outside the [[Regular Language|regular languages]].

**The canonical example:** L = {0ⁿ1ⁿ : n ≥ 0} — a run of 0s followed by the *same number* of 1s. To check that the counts match, a machine would have to *remember* how many 0s it has seen. Tracking an unlimited number of possibilities needs an unlimited number of states, and DFAs and NFAs have only finitely many.

- **In:** ε (take n = 0) · 01 · 0011 · 000111 · 0⁴⁰1⁴⁰
- **Out:** 010 — the zeros must all precede the ones

> [!warning] Order is part of the definition
> {0ⁿ1ⁿ} is not "equally many 0s and 1s". The language L₄ = {s : s contains equally many 0s and 1s} contains 0110, which {0ⁿ1ⁿ} does not. (Neither contains 010 — that has two 0s and one 1.)

**Four candidates, by instinct** (over {0, 1}):

| Language | Regular? | Why |
|---|---|---|
| L₁ = {0ⁿ1ᵐ : n, m ≥ 0} — any zeros, then any ones | yes | it is exactly 0\*1\* |
| L₂ = {s : s has even length} | yes | (ΣΣ)\*, the two-state machine of Lecture 3 |
| L₃ = {0ⁿ1ⁿ : n ≥ 0} — equally many, zeros first | no | [[Non-regularity of 0n1n\|proved in full]] |
| L₄ = {s : s contains equally many 0s and 1s} | no | [[Proving Non-regularity by Closure\|proved two ways]] |

L₃ and L₄ require **counting without a bound**, and bounded memory can't do that. Correct — but instinct is not a proof.

**An asymmetry in the burden of proof**
- **Regular:** exhibit *one* machine or expression and verify it. One object settles the claim
- **Non-regular:** the claim is that *no* DFA, NFA or regular expression — out of infinitely many candidates — recognizes L. No number of failed attempts proves that: maybe the language is regular and we just haven't found the machine yet

Ruling out every possible machine at once requires a property that *every* regular language must have. The [[Pumping Lemma]] supplies exactly that.

> [!warning] The standard trap — bounded counting is regular
> {0ⁿ1ⁿ : 0 ≤ n ≤ 100} **is regular**: it is finite (101 strings), and every finite language is regular — take the union of the individual strings. The shape "0ⁿ1ⁿ" alone doesn't make a language non-regular; the *unbounded* matching does. Bounded counting fits in finitely many states.
