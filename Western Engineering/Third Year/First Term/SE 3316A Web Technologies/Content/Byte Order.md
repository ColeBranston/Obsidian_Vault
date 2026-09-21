When a value spans several bytes, the architecture decides which end goes first. For a 32-bit value stored across addresses 1000–1003 holding bytes b1–b4:

| Order | Layout (bit 31 → 0) |
|---|---|
| **Big endian** | b1 b2 b3 b4 — most significant byte at the lowest address |
| **Little endian** | b4 b3 b2 b1 — least significant byte at the lowest address |

**Network byte order is big endian**, which is why anything crossing a wire has to be explicit about this.

It matters for [[UTF-16]], whose code unit is two bytes. UTF-16 text therefore begins with a **byte order mark**: code point 65,279 (`0xFEFF`), nominally ZERO-WIDTH NON-BREAKING SPACE. Reading it back as `0xFFFE` (65,534) tells you the bytes are swapped — safe because 65,534 is a code point [[Unicode]] never assigns.

The variants **UTF-16LE** and **UTF-16BE** fix the order by name instead, avoiding the mark altogether.
