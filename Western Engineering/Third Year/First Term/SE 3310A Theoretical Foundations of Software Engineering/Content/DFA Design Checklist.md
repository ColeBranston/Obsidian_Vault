A general strategy for turning an English-language (or set-builder) description of a language into a [[Deterministic Finite Automaton]]:

1. **Ask what the machine must remember.** It can't store the string, only which situation it's currently in. Each situation becomes a state — give it a name you could say out loud.
2. **Name the start state** — the situation before any symbol has been read.
3. **Name the accepting state(s)** — the situations in which the string read so far is in the language.
4. **Fill in every arrow.** One arrow per state per symbol, no blanks and no choices — use a [[Dead State]] for inputs that can never recover.
5. **Test it.** Pick two strings that should be accepted and two that shouldn't, and trace all four.
