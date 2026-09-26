**Tit-for-tat** is [[BitTorrent]]'s answer to free riders: nothing obliges anyone to upload, and a design relying on goodwill collapses.

- Every **10 s**, each peer re-sorts neighbors by how fast they're sending to it and uploads only to its **top four** (unchoked).
- Every **30 s**, it also unchokes **one peer at random** (**optimistic unchoke**), regardless of what it has sent, including nothing.
  - Without it, a new peer holding nothing could never show it would upload, so it could never be chosen.
  - It's also the only way to find a better partner than the current four.

Nothing forbids selfishness; being selfish simply **gets you less**. A design where cooperating is the winning move survives contact with the public.
