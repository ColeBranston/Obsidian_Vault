**Pumping down** is choosing i = 0 in the [[Pumping Lemma]]: xy⁰z = xz, i.e. *deleting* y. It is a legal move — condition 1 covers every i ≥ 0 — and for "at least / more than" languages it is frequently the only move that works, because pumping *up* preserves the defining inequality.

**Example — more zeros than ones.** L = {0ᵐ1ⁿ : m > n ≥ 0} is [[Non-regular Language|not regular]].
- Choose s = 0ᵖ⁺¹1ᵖ ∈ L — the *smallest legal surplus*. By the [[Condition-3 Shortcut]], y = 0ᵏ with k ≥ 1
- **Pumping up goes nowhere:** i ≥ 2 only increases the surplus of zeros, so every such string stays in L. No contradiction there
- **Take i = 0:** xz = 0ᵖ⁺¹⁻ᵏ1ᵖ, and p + 1 − k ≤ p, so the surplus is gone: xz ∉ L. Contradiction
