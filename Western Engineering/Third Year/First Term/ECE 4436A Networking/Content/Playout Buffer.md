A **playout buffer** reconciles uneven network delivery with steady playback: the client waits before starting and holds video in hand.

$$\text{buffered}(t) = R(t) - P(t) \quad \text{(received minus played)}$$

- The client's only lever is **when to start**. Waiting less buys a faster start and pays in stalls; waiting at least the worst network delay (slide example: delays 0.35–1.82 s, wait 1.8 s) never freezes.
- The buffer isn't equipment; it's that wait, turned into video.

The alternative to absorbing variation at a fixed quality is to change the quality: [[DASH]].
