A **glyph** is the graphical presentation of a character — the actual shape drawn on screen. Glyphs are handled by **fonts**, not by [[Unicode]] itself.

The mapping between characters and glyphs is not one-to-one in either direction. Take the glyph **Å**:

- it may represent **several different characters** — LATIN CAPITAL LETTER A WITH RING ABOVE, or ANGSTROM SIGN
- it may represent a **sequence** of characters — LATIN CAPITAL LETTER A followed by COMBINING RING ABOVE

And some single characters render as several glyphs.

This is why comparing strings by appearance is unsafe — two visually identical strings can be different [[Code Point]] sequences, which is exactly the hole exploited in the IDN homograph attack described in [[Internationalized Resource Identifier]].
