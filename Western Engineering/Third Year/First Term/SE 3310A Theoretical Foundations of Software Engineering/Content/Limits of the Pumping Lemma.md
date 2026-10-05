The [[Pumping Lemma]] is a **one-directional tool**. It has the form *regular ⇒ pumpable*; the only direction of use is its contrapositive, **not pumpable ⇒ not regular**. There is no converse — "pumpable" does not imply "regular".

**What have I proved?**

| What you showed | What it proves |
|---|---|
| A string in L for which, under *every* possible split, pumping produces a string outside L | By contradiction, L is non-regular |
| A string in L that *can* be pumped for some — or even all — ways of splitting it | Nothing |

Successful pumping proves nothing, because it is consistent with three different situations:
1. L is regular, in which case all (long enough) strings are pumpable
2. L is non-regular and does have strings that cannot be pumped — you just haven't found one yet
3. Every string in L can be pumped, yet L is still non-regular. Such languages exist, and they need a different proof technique, e.g. the [Myhill–Nerode theorem](http://en.wikipedia.org/wiki/Myhill%E2%80%93Nerode_theorem) — outside the scope of this course

So the lemma can never *certify* regularity. To certify regularity, build a machine or an expression — Lecture 6's tools ([[Kleene's Theorem]]).

**Attempting the impossible — running the template on 0\*1\*.** L = 0\*1\* is regular. Take any s = 0ᵃ1ᵇ with a + b ≥ p:
- If a ≥ 1, the adversary offers x = ε, y = 0, z = the rest. Then xyⁱz = 0ᵃ⁻¹⁺ⁱ1ᵇ ∈ L for every i ≥ 0. (If a = 0, take y = 1 instead.)
- The adversary always has a safe split, so step 3 of the [[Pumping Lemma Proof Template|template]] can never be completed — exactly as it must be, since L is regular and the lemma is true of it

> [!warning] Failure to find a contradiction proves nothing either way
> Only a *completed* contradiction proves non-regularity.
