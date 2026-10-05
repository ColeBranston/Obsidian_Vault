The **copy language** is L = {ww : w ∈ {0, 1}\*} — each member is a string followed by an exact copy of itself. It is [[Non-regular Language|not regular]].

**Proof** — [[Pumping Lemma]] with the [[Condition-3 Shortcut]]. Take s = 0ᵖ1 0ᵖ1 ∈ L (here w = 0ᵖ1), so |s| ≥ p. By condition 3, y = 0ᵏ with k ≥ 1, inside the first run of zeros. Take i = 2:

xy²z = 0ᵖ⁺ᵏ1 0ᵖ1

- **k odd:** the length 2p + 2 + k is odd — no odd-length string is of the form ww
- **k even:** the first half of xy²z has length p + 1 + k/2 ≤ p + k, so it lies inside the leading zeros and is all zeros. Then ww would be all zeros — but the string contains two 1s

Contradiction either way.
