There are two equivalent ways of thinking about [[Non-determinism]] — they always give the same accept/reject answers:

| | **Parallel computation** | **Lucky guess** |
|---|---|---|
| Picture | the computation proceeds along *all* possible paths concurrently | the computation proceeds along *one* path, but always picks one that leads to an accepting state (if such a path exists) |
| Use it for | computing by hand — it's exactly the [[Set View of an NFA]] | writing proofs — "the machine guesses the split point" just means *there exists* an accepting path |

> [!warning] "Guessing" involves no randomness
> If a good path exists, the guess is *defined* to find it. Use whichever interpretation makes the argument shorter.
