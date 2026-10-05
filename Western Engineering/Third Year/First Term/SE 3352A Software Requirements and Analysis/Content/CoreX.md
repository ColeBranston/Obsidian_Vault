**CoreX** (Craig Errey) is a process and "blueprint" for designing software applications that comes from the **organizational psychology** point of view. It replaces ambiguous written requirements with a small set of visual models that, together, give enough understanding of the system to feed an agile, iterative process.

## The five models

| Model | Gives an overview of… |
|---|---|
| [[Domain Model]] | the domain as it relates to the solution being created |
| [[Workflow Model]] | the actions to be done on / through the system |
| [[Data Model]] (CoreX: *entity model*) | the data structures needed in the system |
| [[Business Rules Model]] | the business constraints that need to apply |
| [[Conceptual User Interface Design]] | how the system would look if developed from the previous models |

All of them are built with [[Progressive Decomposition]]. The first four are UI-independent; only the conceptual UI reflects the target platform (GUI, touch, speech, IVR).

## The three-step process (reading)

1. **Requirements gathering** — understand people, work and performance to *define the problem*. Main technique: **job analysis and design (JAD)**, which yields [[Work Requirements]].
2. **Visual requirements modelling** — define the *solution* through the app's design and behaviour (the five models).
3. **User interface design** — design the full UI to complete the blueprint.

*CoreX process overview (reading, §3)*

```mermaid
flowchart LR
    subgraph rg["Requirements gathering — define the problem"]
        direction TB
        mkt["Market, customers,<br>brand and experience"]
        prod["Products and services"]
        ppl["People, capabilities"]
        jt(("·"))
        si["Strategic intent, vision,<br>values, culture and KPIs"]
        hpm["High performance model"]
        jb(("·"))
        tech["Technology and applications"]
        pol["Policies, processes,<br>and procedures"]
        work["Work and activities"]
        mkt --- jt
        prod --- jt
        ppl --- jt
        jt --> si
        jt --> hpm
        si --> hpm
        tech --- jb
        pol --- jb
        work --- jb
        jb --> si
        jb --> hpm
    end
    subgraph vm["Visual requirements modelling — define the solution"]
        direction LR
        dm["Domain model"]
        wf["Workflow model"]
        br["Business rules model"]
        en["Entity model"]
        cui["Conceptual user<br>interface design"]
        dm --> wf
        dm --> br
        dm --> en
        wf <--> br
        br <--> en
        wf --> cui
        br --> cui
        en --> cui
    end
    subgraph ux["User interface design — complete the blueprint"]
        direction TB
        ia["Information architecture"]
        uif["User interface flow diagram"]
        dfw["Design framework, system,<br>standards and patterns"]
        uid["User interface design"]
        bvd["Brand and visual design"]
        uis["User interface specifications"]
        ia --> uif
        ia --> dfw
        uif --> uid
        dfw --> uid
        bvd --> dfw
        bvd --> uis
        uid --> uis
    end
    rg --> dm
    cui --> ux
```

> [!warning] Check against the reading
> The empty circles stand in for the shared bus lines in the original: the three top boxes and the three bottom boxes each feed *both* "Strategic intent…" and "High performance model".

## NAVAs — the building blocks

Models are built by extracting four word types from the written requirements, using a controlled vocabulary (see [[Requirements Glossary]]):

| Element | Meaning | Lands in | Shown in a GUI as | In code |
|---|---|---|---|---|
| **Nouns** | data, people, things | entity/[[Data Model]] | tables, single-record forms | database |
| **Adjectives** | attributes that tell instances apart | entity/data model | fields/columns | database |
| **Verbs** | actions on a noun | [[Workflow Model]] | buttons, links, commands | functionality |
| **Adverbs** | how / when / to what extent a verb is done | workflow model | options on commands | functionality |

The [[Business Rules Model]] acts like grammar: which verbs can operate on which nouns, by whom.

*How NAVAs flow from written requirements into the models and the UI (reading, §7)*

```mermaid
flowchart LR
    wr["Written requirements"]
    em["Entity model"]
    wm["Workflow model"]
    brm["Business rules model"]
    ui["Conceptual user interface design"]
    wr -- "nouns + adjectives" --> em
    wr -- "verbs + adverbs" --> wm
    wr -- "rules: must, IF…THEN" --> brm
    em -- "tables of data, forms" --> ui
    wm -- "buttons, links, command widgets" --> ui
    brm -- "who can do which task on which data" --> ui
```

## Key principles (reading)

1. **Define the problem before designing the solution** — the app is a means to solve a work-performance problem, inside a wider change program.
2. **Human-centred design ≠ giving people what they say they want** — JAD gives an agreed statement of what people *should* be doing.
3. **Start with the future state**, not the current state, to avoid legacy thinking.
4. **Convert non-functional requirements into functional ones** — KPIs, best-practice workflow, and UX become things the team is held accountable for (see [[Non-Functional Requirement]]).

## Key techniques (reading)

1. [[Progressive Decomposition]] with numerical constraints.
2. **Near-total separation of concerns** — each model does one thing; nearly all rules live in the business rules model, so entity and workflow models stay unconstrained.
3. **Co-design with preparation** — the analyst drafts models to ~Level 2 *before* a [[Facilitated Workshop]], then facilitates the group building them from scratch (domain → workflow → entity → UI), using the drafts only to restart a stalled session or compare.
4. **Two phases: conceptual, then detailed** — all five models to ~Level 2 first (4–8 weeks even for large apps), usability-test it, *then* decide buy vs. build and go deeper.

## Mapping to MVC (reading)

*CoreX models vs. Model–View–Controller (reading, §7)*

```mermaid
flowchart TB
    subgraph corex["CoreX models"]
        direction TB
        cui2["User interface"]
        brm2["Business rules model"]
        wfm2["Workflow model"]
        enm2["Entity model"]
        cui2 --- brm2
        cui2 --- wfm2
        brm2 --- wfm2
        brm2 --- enm2
        wfm2 --- enm2
    end
    subgraph mvc["MVC architecture"]
        direction TB
        view["(Interaction) View"]
        ctrl["Controller / Event manager"]
        model["Application model"]
        ctrl -- "View / data updates" --> view
        view -- "UI control change" --> ctrl
        model -- "Change notification" --> ctrl
        ctrl -- "State change" --> model
    end
    ev["Events"]
    ev -- "User interaction events" --> view
    ev -- "Application events" --> ctrl
    ev -- "System events" --> ctrl
    ev -- "Interapplication events / messaging" --> model
```

- **Model** ≈ entity model · **Controller** ≈ workflow model + business rules model · **View** ≈ user interface.

## Combining Agile and Waterfall (reading)

Do the conceptual design for the whole app in sprints 1–2, then split the app into self-contained areas (e.g. by job KRA) and pipeline each through detailed modelling → UI → dev → test → release.

*Staggered delivery after the conceptual design — axis numbers are months M1–M14 (reading, §10.3)*

```mermaid
gantt
    dateFormat YYYY-MM-DD
    axisFormat %d
    section Conceptual
    Conceptual design (sprints 1-2) :cd, 2000-01-01, 2d
    section Requirements modelling
    RM1 :2000-01-03, 1d
    RM2 :2000-01-04, 1d
    RM3 :2000-01-05, 1d
    RM4 :2000-01-06, 1d
    RM5 :2000-01-07, 1d
    RM6 :2000-01-08, 1d
    RM7 :2000-01-09, 1d
    RM8 :2000-01-10, 1d
    section UI design
    UI1 :2000-01-04, 1d
    UI2 :2000-01-05, 1d
    UI3 :2000-01-06, 1d
    UI4 :2000-01-07, 1d
    UI5 :2000-01-08, 1d
    UI6 :2000-01-09, 1d
    UI7 :2000-01-10, 1d
    UI8 :2000-01-11, 1d
    section Development
    D1 :2000-01-05, 1d
    D2 :2000-01-06, 1d
    D3 :2000-01-07, 1d
    D4 :2000-01-08, 1d
    D5 :2000-01-09, 1d
    D6 :2000-01-10, 1d
    D7 :2000-01-11, 1d
    D8 :2000-01-12, 1d
    section Testing
    T1 :2000-01-06, 1d
    T2 :2000-01-07, 1d
    T3 :2000-01-08, 1d
    T4 :2000-01-09, 1d
    T5 :2000-01-10, 1d
    T6 :2000-01-11, 1d
    T7 :2000-01-12, 1d
    T8 :2000-01-13, 1d
    section Release
    R1 :2000-01-07, 1d
    R2 :2000-01-08, 1d
    R3 :2000-01-09, 1d
    R4 :2000-01-10, 1d
    R5 :2000-01-11, 1d
    R6 :2000-01-12, 1d
    R7 :2000-01-13, 1d
    R8 :2000-01-14, 1d
```

> [!question] Who is it for?
> The reading admits CoreX won't appeal to Agile purists who believe you can't know requirements until you build something — it's pitched at BAs, business architects and UI designers who want precise, visual documentation everyone can sign off on.
