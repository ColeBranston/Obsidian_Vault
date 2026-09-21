Three related but distinct kinds of software support, each abbreviated by its first letter, letter count, last letter:

| Term | Means |
|---|---|
| **l10n** — localization | translating a product into one or more languages |
| **m17n** — multilingualization | libraries for handling multiple languages at once |
| **i18n** — internationalization | adding the capability to handle languages at all |

**Input methods** let a user enter characters not on their input device — Chinese characters from a QWERTY keyboard, for instance.

**Making software i18n-ready:**
- the days of ASCII strings are over — represent all strings as [[Unicode]]
- decode character data when reading, encode when writing, and be explicit about the [[Character Encoding]] at both ends
- use Unicode-aware string functions — naive length, indexing, upper-casing and sorting all break (see the Java caveat in [[UTF-16]])
