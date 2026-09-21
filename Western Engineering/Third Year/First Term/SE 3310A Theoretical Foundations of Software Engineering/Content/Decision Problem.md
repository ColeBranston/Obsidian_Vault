Intuitively you'd expect computation to be "ask a question, get an answer" — given y = x² and x = 3, put 3 in a box and get 9 out. That's how computation works in effect, but for studying computation we pose it as a **decision problem** instead: *yes or no, is the point (3, 9) on the curve?*

**Informally:** computation is modeled as answers to yes/no questions.

**Formally**, computation means:
- given the description of some [[Formal Language]] L
- given an input [[String]] s
- compute a yes/no answer to: **is s ∈ L?**

That is, does L accept s or not. Computation is the act of deciding whether s ∈ L.

**But not everything is a yes/no question** — sums, sorting. Each reduces:

| Kind | Rephrased as a decision |
|---|---|
| **Function** — compute f(x) | "Does f(x) = y?" Answer that and you can compute f(x) |
| **Optimization** — shortest path A→B | "Is P the shortest path between A and B?" |
| **Search** — is this name in the database | already a membership test; "is there a 2-letter surname here?" becomes membership tests across all possibilities |

**Why computer scientists work this way:**
- **Rigor** — sets are well-understood objects with precise definitions
- **Reducible** — any algorithm on any input reduces to "is x ∈ L?"
- **Apples-to-apples** — complexity theory depends on cleanly mapping one decision problem onto another
- **Fundamental** — Turing machines are easy to define and simply accept or reject. Show that no Turing machine always halts with the right answer for a problem, and you've shown no algorithm for it exists
