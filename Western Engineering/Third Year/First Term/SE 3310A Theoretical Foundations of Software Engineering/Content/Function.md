A **function** f : A → B is a mapping between a set of inputs A and a set of outputs B.

| Term | Meaning |
|---|---|
| **Domain** | the set of possible inputs, A |
| **Codomain** | a set B into which all outputs fall |
| **Image** | the subset B′ ⊆ B that the domain actually maps onto |

Codomain and image are both loosely called the "range", which is why the two precise words are worth keeping straight: the codomain is *declared*, the image is *achieved*.

**Example.** Let f : ℤ → ℤ be f : x ↦ x², i.e. f(x) = x².
- the **codomain** is ℤ
- the **image** is {x² : x ∈ ℤ} = {0, 1, 4, 9, 16, …}, the perfect squares — a proper subset of the codomain

**Multiple variables** are handled by taking the domain to be a [[Tuple]] space: f : ℤ × ℤ → ℤ where f : x, y ↦ x² + y², i.e. f(x, y) = x² + y².

That last form is exactly the shape of a [[Deterministic Finite Automaton]]'s transition function, δ : Q × Σ → Q.
