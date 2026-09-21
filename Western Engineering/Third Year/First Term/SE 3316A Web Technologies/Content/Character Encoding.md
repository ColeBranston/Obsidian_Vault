A **character encoding** interprets a sequence of bytes as [[Code Point]]s.

The bytes are first parsed into **code units** — fixed-length chunks — and one *or more* code units make up a single code point. The code unit size is what names the encoding:

| Encoding | Code unit | Code units per code point |
|---|---|---|
| [[UTF-8]] | 1 byte | 1–4 |
| [[UTF-16]] | 2 bytes | 1 or 2 |
| UTF-32 | 4 bytes | always 1 |
| [[ISO-8859-1]] | 1 byte | always 1 (only 256 code points) |

The variable-length ones are why you cannot index into a string by byte offset and expect to land on a character.
