---
aliases: [Conceptual UI Design, User Interface Design (CoreX)]
---

The **conceptual user interface design** visualizes how the system would look if it were developed from the other four [[CoreX]] models. It's the fifth model, and the only one tied to a platform (GUI, touch, speech, IVR).

The reading compares it to an architect's **artist's impression**: enough to confirm the concept with decision-makers before detailed design starts. It usually consists of a few **key workbenches** (an overview of a person's past, present and future work) plus detailed screens for the key workflows, and it can be **usability-tested** to confirm the expected performance gains.

## Example — every model shows up in the UI (slide 44)

On the example screen of a business-registry app, each part of the interface traces back to a model:

| Model | Where it appears on the screen |
|---|---|
| [[Domain Model]] | the top navigation tabs (Managed businesses, Licenses and registrations, Agents, …) |
| [[Data Model]] | the tabs and tables of records (tasks, companies, directors, shareholders) |
| [[Workflow Model]] | the action controls — "Update" links and "Manage" buttons |
| [[Business Rules Model]] | constraints such as the running transaction total and which actions are allowed |

In GUI terms: nouns and adjectives become **tables and forms**, verbs and adverbs become **buttons, links and commands** (the noun–verb pattern; speech UIs flip it to verb–noun).

> [!note] Then comes detailed UI design
> Detailed UI design is a separate step (information architecture, UI flows, design system, specs). A strong dev team can also use the conceptual UI as a pattern and build the rest as they go.
