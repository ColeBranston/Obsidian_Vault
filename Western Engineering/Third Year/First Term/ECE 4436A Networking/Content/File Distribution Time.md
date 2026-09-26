Minimum time to get a file of $F$ bits to $N$ peers (server upload $u_s$, peer uploads $u_i$, slowest download $d_{min}$):

$$D_{cs} \ge \max\left\{\frac{NF}{u_s},\ \frac{F}{d_{min}}\right\}$$

$$D_{p2p} \ge \max\left\{\frac{F}{u_s},\ \frac{F}{d_{min}},\ \frac{NF}{u_s + \sum u_i}\right\}$$

- **Client–server** grows **linearly** in $N$: the server pushes every copy through its own uplink.
- **P2P**: $N$ sits on top *and* underneath (every peer adds upload capacity), so the time **flattens toward $F/u$**. See [[Peer-to-Peer Architecture]].

**Slide example** ($u_s = 10u$, $F/u = 1$ h, $N = 30$): client–server $30/10 = 3.00$ h; P2P $30/(10+30) = 0.75$ h, so **4× longer** with one server.
