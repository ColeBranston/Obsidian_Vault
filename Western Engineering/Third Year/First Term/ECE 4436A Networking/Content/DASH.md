**DASH** (Dynamic Adaptive Streaming over HTTP): video is split into chunks, each encoded at several qualities, plus a **manifest** listing them all. The **client** decides, chunk by chunk.

**The rule:** take the highest rate that still fits under the bandwidth you're currently measuring (e.g. 5.0 Mb/s 1080p · 2.5 720p · 1.1 480p · 0.4 240p).

The client decides:
- **When to ask**: early enough the buffer never empties, late enough not to fetch video the viewer abandons.
- **Which quality**: from bandwidth measured on its own recent chunks.
- **Where from**: the manifest may list several servers; choosing one is already the [[Content Delivery Network]] problem.

The server does nothing clever: stored files, ordinary [[HTTP]] requests over [[TCP]]. So it passes through every firewall, proxy, and cache, which the 1990s specialized streaming protocols did not.
