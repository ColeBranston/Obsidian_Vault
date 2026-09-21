**UTF-8** is the [[Character Encoding]] whose code unit is a **single byte**. A [[Code Point]] translates into 1–4 code units, and the leading bits of the first byte announce how many follow:

| First byte | Code units used |
|---|---|
| `0XXXXXXX` | 1 — directly the ASCII code point (0–127) |
| `110XXXXX` | 2 |
| `1110XXXX` | 3 |
| `11110XXX` | 4 |

Every continuation byte looks like `10XXXXXX`, so any byte can be classified as a start or a continuation without scanning from the beginning of the file.

**Worked example:** `11100011 10000001 10010101` → leading `1110` means three units → strip the markers and concatenate → `11000001010101` = 12,373 = HIRAGANA LETTER SA.

A UTF-8 file may start with a **byte order mark (BOM)**, `EF BB BF` — meaningless for ordering here (the code unit is one byte), so it functions purely as an "this is UTF-8" flag. Compare [[UTF-16]], where the BOM does real work: [[Byte Order]].
