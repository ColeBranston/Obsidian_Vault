The [[Regular Language|regular languages]] are closed under **intersection**: L₁ ∩ L₂ = {s : s ∈ L₁ and s ∈ L₂}.

**Proof — no new construction needed.** By De Morgan:

L₁ ∩ L₂ = complement of (L̄₁ ∪ L̄₂)

[[Closure Under Complement|Complement]] preserves regularity, and so does [[Closure Under Union|union]] — so the right-hand side is regular, hence so is L₁ ∩ L₂.

> [!tip] Combining closures
> This is the second proof technique from [[Closure Property]]: instead of building a machine, compose closures already proved. Both techniques appear on assignments and exams.
