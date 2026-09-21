**UTF-16** is the [[Character Encoding]] whose code unit is **2 bytes**.

- [[Code Point]]s below 65,536 fit in a single code unit
- Higher ones subtract 65,536 and split the remaining 20 bits across a **surrogate pair**: `110110XXXXXXXXXX 110111XXXXXXXXXX`

This works because Unicode deliberately assigns **no code points** between 55,296 (`1101100000000000`) and 57,343 (`1101111111111111`) — that range is reserved so a surrogate half is never mistaken for a real character.

**Worked example:** `11111110 11111111 00110000 01010101` → the first unit is the [[Byte Order]] mark → `00110000 01010101` = 12,373 = HIRAGANA LETTER SA. On a little-endian machine the same text is `11111111 11111110 01010101 00110000`.

> [!warning] Java strings are code *units*
> Java represents characters as UTF-16 code units, not code points — a pragmatic choice to use only 16 bits. So `String.length()` is wrong for anything above 65,536 (use `String.codePointCount`), and a string holding half a surrogate pair is legal but meaningless.
