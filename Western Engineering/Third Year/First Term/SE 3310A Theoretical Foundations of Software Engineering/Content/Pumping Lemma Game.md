A non-regularity proof with the [[Pumping Lemma]] is best organized as a **game against an adversary** who claims L is regular. Of the four objects in the lemma — p, s, the split xyz, and i — the adversary picks two and you pick two:

| Object | Chosen by | Consequence for your proof |
|---|---|---|
| p | adversary | treat it as an unknown constant |
| s | you | pick it in terms of p, inside L, with length ≥ p |
| split xyz | adversary | you must defeat *every* legal split |
| i | you | one good i per split suffices |

The roles follow the lemma's quantifiers: what the lemma says *exists* (p, the split) belongs to the adversary; what it asserts *for all* (s, i) is yours to choose.

> [!warning] Every pumping-lemma error on record is a violation of this table
> Choosing a concrete p, choosing a favourite split, or stopping after one split. Keep the table in view during any proof.
