The [[Regular Language|regular languages]] are closed under **complement**: if L is regular, so is L̄ = {s : s ∉ L}.

**Construction.** Take a [[Deterministic Finite Automaton|DFA]] for L and swap its accepting and non-accepting states. The result accepts exactly the strings the original rejected.

**Why it works.** A DFA has exactly one computation per string, ending in exactly one state — flipping that state's verdict flips the answer. Given [[Equivalence of NFAs and DFAs|Lecture 5]], that's the whole proof.

> [!warning] The swap only works on a DFA
> NFA acceptance is one-sided: a string is accepted if *some* path accepts, so it can have accepting paths under both the original and the swapped accepting sets. **To complement an NFA: determinize first ([[Subset Construction]]), then swap.**

> [!question] Why a DFA, and not an NFA?
> Take Lecture 4's ends-in-01 NFA and swap its accepting states, so q₀ and q₁ accept and q₂ doesn't. Does the new machine accept the complement of ends-in-01? Test it on `01`.
>
> Answer — **No.** On `01` the live set is {q₀, q₂}. The original accepts (q₂ is accepting) — and the swapped machine *also* accepts, because q₀ now is. `01` lies in both languages, so the swapped machine doesn't recognize the complement.
