**Round-trip time (RTT)** is the time for a small packet to travel from client to server and back: [[Propagation Delay|propagation]] both ways plus [[Queueing Delay|queueing]] and [[Processing Delay|processing]] on the path. It **excludes** the [[Transmission Delay|transmission time]] of the object itself (size ÷ link rate).

Almost all of the Web's delay is counted in RTTs.

| Path | RTT |
|---|---|
| Across campus (few hundred m of fiber) | 0.4 ms |
| Toronto → New York (800 km) | 12 ms |
| Toronto → Sydney (16,000 km) | 200 ms, and no equipment makes this smaller |
