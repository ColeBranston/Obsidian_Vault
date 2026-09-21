A **string** is a **finite** sequence of symbols from a given [[Alphabet]] Σ. Two conditions, both load-bearing: every symbol must come from Σ, and the sequence must be finite.

Over Σ = {A, B, C … Z}: "PASSWORD" is a valid string; "PASSWORD1" is not, because 1 ∉ Σ.

Over Σ = {0, 1}: "0" is valid · twenty-eight zeros is valid · infinitely many zeros is **not** — a string is finite.

**The empty string ε** has |ε| = 0 and acts as the identity element under concatenation, the way 0 is for addition and 1 is for multiplication. So 0ε1 = 01 and ε0εεε1 = 01.

**Concatenation** writes one string after another, and is order-sensitive. With a = 00 and b = 11:

| Expression | Means | Result |
|---|---|---|
| ab | a then b | 0011 |
| (ab)² | ab written twice | 00110011 |
| a²b² | a twice, then b twice | 00001111 |

(ab)² ≠ a²b² — exactly the point.

The set of all strings over Σ is [[Kleene Star]], Σ*; a [[Formal Language]] is a subset of it.
