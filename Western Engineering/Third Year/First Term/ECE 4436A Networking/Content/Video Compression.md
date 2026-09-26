Uncompressed HD video: 1920 × 1080 pixels × 24 bits × 30 frames/s ≈ **1.5 Gb/s**, impossible to deliver to a million people. Compression (~100×) brings it to ~**15 Mb/s**; here compression is the medium, not an optimization.

- **Spatial redundancy** (inside a frame): neighboring pixels are usually the same color, so send each run once as color + count (e.g. 160 pixels → 16 tokens), lossless.
- **Temporal redundancy** (between frames): almost every pixel is unchanged, so send only the differences (e.g. 22 pixels); the receiver adds them to the frame it holds.

| Encoding | Behavior |
|---|---|
| **CBR** (constant bit rate) | same bits/s whatever's on screen: still scenes waste bits, busy ones lose detail |
| **VBR** (variable bit rate) | bits spent where needed: better quality at the same average, but a rate that changes minute to minute, which is why players buffer ([[Playout Buffer]]) |
