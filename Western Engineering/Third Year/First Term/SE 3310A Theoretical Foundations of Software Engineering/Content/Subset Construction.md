The **subset construction** converts any [[Non-deterministic Finite Automaton|NFA]] N into an equivalent [[Deterministic Finite Automaton|DFA]] D by making each *set* of NFA states a single DFA state. It proves Theorem 2 of [[Equivalence of NFAs and DFAs]], and it formalizes the [[Set View of an NFA]]: at every moment, D's current state *is* N's set of live states.

**States.** An NFA's computation can be in a combination of states at once; a DFA is in exactly one. So each subset of Q<sub>N</sub> becomes one "amalgamated" DFA state: Q<sub>D</sub> ⊆ 𝒫(Q<sub>N</sub>), giving at most |𝒫(Q<sub>N</sub>)| = 2<sup>|Q<sub>N</sub>|</sup> states. For Q<sub>N</sub> = {q₀, q₁, q₂}: ∅ · {q₀} · {q₁} · {q₂} · {q₀, q₁} · {q₀, q₂} · {q₁, q₂} · {q₀, q₁, q₂}. The empty set ∅ is the [[Dead State|dead state]], usually left undrawn. This is every state the DFA *could* use — in practice many go unused.

> [!question] Counting the subset states
> An NFA has |Q<sub>N</sub>| = 3 states. 1. At most how many states can the DFA need? 2. Which earlier result gives this bound?
>
> Answers — **1.** 2³ = 8, one per subset of {q₀, q₁, q₂}, the empty set included. **2.** The power set count |𝒫(Q)| = 2<sup>|Q|</sup> ([[Set]]) — two choices per element, in or out. 2ᵏ is an upper bound, not the typical count: only subsets reachable from the start are ever built.

**Alphabet.** Unchanged: Σ<sub>D</sub> = Σ<sub>N</sub>.

**Start state.** E({q₀}) — the NFA's start state together with its full ε-reach ([[Epsilon-Closure]]).

**Accepting states.** Every subset that contains at least one NFA accepting state — the NFA accepts if *any* computation path does. E.g. F<sub>N</sub> = {q₁} gives F<sub>D</sub> = {{q₁}, {q₀, q₁}, {q₁, q₂}, {q₀, q₁, q₂}}.

**Transition function**, in two parts:
- *Part 1 — single-state rows.* A table with one row per NFA state and one column per symbol. Each entry is E(δ<sub>N</sub>(q, a)): follow the a-arrows, then keep following ε-arrows until nothing new appears
- *Part 2 — combined rows.* A set's row is the union of its members' rows: δ<sub>D</sub>({q₀, q₁}, a) = δ<sub>D</sub>({q₀}, a) ∪ δ<sub>D</sub>({q₁}, a)

**The algorithm, in five steps**
1. Start state: E({q₀})
2. Rows for single states: E(δ(q, a)) for each state q and symbol a
3. Rows for combined states: the union of their single-state rows
4. Accepting: every subset containing at least one NFA accepting state
5. Restrict: keep only subsets reachable from the start; empty cells denote the dead state ∅

> [!warning] The two closure mistakes
> - **Forgetting the closure on the start state** is the single most common conversion mistake — everything downstream inherits the error
> - **The closure applies after every step, not only at the start.** An a-arrow into a state that has an ε-arrow out of it lands you in *both* states

- The combined rows are purely mechanical; the substantive work is in the single-state rows and their closures
- An empty cell (∅) means every live computation path terminated on that symbol — nothing is live, and no later input can change that

**Why the language is preserved.** At every step the DFA's state equals the NFA's set of live states, so the two machines agree on every input — that invariant is the whole proof. The conversion *never* changes the language.

> [!tip] Size — guessing becomes remembering
> Usually far fewer than 2ᵏ subsets are reachable. But the blow-up isn't an artifact of the construction: for "third-to-last symbol is 1" (4 NFA states) the DFA genuinely needs 8 states, one per combination of the last three symbols, and no two can be merged. Determinization replaces *guessing* by *remembering*.
