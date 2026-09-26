**BitTorrent** is a P2P file-distribution protocol that cuts the file into **pieces** so peers have different things to trade.

- **Why pieces:** with one indivisible file, nobody can upload until they finish, so the swarm's upload capacity stays zero and the [[File Distribution Time]] formula fails. With pieces, a peer is useful ~30 s after arriving.
- **Tracker:** keeps a list of peers in the torrent and introduces an arriving peer to a subset. No content passes through it, so one modest machine can coordinate hundreds of thousands of peers.
- **Rarest piece first:** request the piece with the fewest copies in the swarm. Insurance, not politeness: a piece down to one holder vanishes when that peer leaves, and nobody can ever finish.
- Uploading is enforced by incentive via [[Tit-for-Tat]].
