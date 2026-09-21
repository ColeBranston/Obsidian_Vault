A text file is *logically* a sequence of characters but *physically* a sequence of bytes, and a mapping is needed between them. Historical mappings include **ASCII** (`a` = 0x61 = 1100001) and **EBCDIC**; **Unicode** is the one that aims to cover every character in every written language, past or present.

A **character** is a symbol that appears in text — letters, pictograms like ©, accents. Unicode characters are abstract entities with formal names:

- LATIN CAPITAL LETTER A (A)
- LATIN CAPITAL LETTER A WITH RING ABOVE (Å)
- HIRAGANA LETTER SA (さ) · SINHALA LETTER SA (ස) · RUNIC LETTER THURISAZ THURS THORN (ᚦ)

**Scale:** a 32-bit namespace with a theoretical ~4 billion slots, of which only **1,114,112** are allowed. Version 15.1 (Sep 12, 2023) assigns 149,813 characters across 161 modern and historic scripts.

Three layers to keep distinct:

| Layer | What it is |
|---|---|
| Character → number | the [[Code Point]] |
| Number → picture | the [[Glyph]], handled by fonts |
| Number → bytes | the [[Character Encoding]] — [[UTF-8]], [[UTF-16]] |
