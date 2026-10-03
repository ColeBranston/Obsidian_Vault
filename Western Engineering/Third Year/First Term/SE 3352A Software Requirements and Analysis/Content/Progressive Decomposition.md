**Progressive decomposition** means building every model top-down, level by level, with a cap on how many elements each level may hold — so modelling starts simple and doesn't dive into detail too early.

- **Lecture rule of thumb:** decompose hierarchically up to **three levels**, with **4 or 5 elements** at each level.
- **[[CoreX]] reading:** Level 1 has roughly **3–8** concepts; each is decomposed into another 3–8 at Level 2; deeper levels can grow (e.g. 10–15) but not excessively.

Why it helps: the higher levels group concepts logically, so elements can be moved, added, or removed later without breaking the overall structure — and the conceptual design (≈ Level 2) can be signed off and usability-tested before the detail is done.

Used by the [[Domain Model]], [[Workflow Model]], and [[Data Model]].
