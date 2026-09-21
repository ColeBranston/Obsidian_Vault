---
source: SE3309aUnit1-course_intro.pdf
tags: [SE3309A, DatabaseManagementSystems]
---

# Unit 1 — Course Introduction

## Teaching Team

- **Instructor:** Dr. Katarina Grolinger — Office TEB 259 — kgroling@uwo.ca
- **Office hours:** by appointment
- **Experience:** long history teaching DB courses · industry experience managing 30+ databases · worked with developers on DB-focused projects
- **TAs:** Yohannis Kifle Telila (ytelila@uwo.ca) · Binchi Zhang (bzhan484@uwo.ca) · Haoran Wang (hwan783@uwo.ca)
- Project (4 assignments) is done in groups; each group gets one assigned TA

## Course Schedule

- **Lecture (001):** Tue 12:30–2:30 pm · Wed 5:30–6:30 pm
- **Labs/Tutorial:** Sec 002 Fri 9:30–11:30 am · Sec 003 Wed 9:30–11:30 am · Sec 004 Thu 8:30–10:30 am
- Labs start the week of **Sept 21**

## Textbook

*Database Systems – A Practical Approach to Design, Implementation, and Management*, 6th ed. (2015, Addison Wesley) — T. Connolly & C. Begg

## Grading

| Component | Weight |
|---|---|
| Project & Assignments | 35% |
| Midterm Test | 20% |
| Final Exam | 45% |

## Timeline (Tentative)

| Week of | Deadline / Activity |
|---|---|
| Sep 18 | Group members + project topics due |
| Sep 25 | Project approval from TA due |
| Oct 2 | Assignment 1 due |
| Oct 12 | Reading week |
| Oct 20 | Assignment 2 due |
| Oct 27 | Midterm (tentative, lecture hours) |
| Nov 20 | Assignment 3 due |
| Dec 1 | Assignment 4 due |
| Exam period | Final exam |

> [!tip] Heads up
> Start Assignment 4 before finishing Assignment 3 — the timeline has them overlapping.

## Key Rules

- Midterm requires supporting documentation for absence
- One mandatory lab per assignment — whole team attends and discusses choices with the TA; Assignments 2–4 also have mandatory demo sessions
- Late penalty: **10%/day**, up to 3 days
- Group extension for an undocumented absence only applies if **>40%** of the group is affected

## Database Overview

![[Database]]

![[Types of Data]]

## Why Databases Matter

- Underlies data analytics, business analytics, web search, data mining, scientific/medical databases, IoT
- Powers everyday tools: Google, Facebook, YouTube, Amazon/eBay — possibly even the retrieval behind tools like Claude/ChatGPT
- Also behind streaming recommendations (Netflix) and social gaming
- Scale: commonly **terabytes**, sometimes **petabytes/exabytes**
- Unique challenge: **concurrency control** — many simultaneous transactions must not interfere (e.g., two withdrawals from the same account must each debit correctly)

## Course Objective

Understand the fundamentals of modern database systems:
- How DB management differs from file processing
- Modeling data & building **relational** databases
- Query languages to access data
- Support for advanced applications (data mining, data warehousing, etc.)

## Project Pipeline

**E-R Model → Relational Tables (Normalization) → Load Data → SQL → Web Interface**

- Groups of **5**, ideally same lab section
- At least **5 relations** (7+ recommended): 2 with a few thousand tuples, 1 with hundreds, rest flexible
- Relations = real-world entities (nouns) — e.g., a car rental site: customers, cars, rentals, car type, location…
- TAs check project complexity at approval

## Next Steps

- Submit group members + topic via Google Form (UWO emails, one per group, main + alternate topic) — **due Sept 18**
- Sign up for your group number in OWL Brightspace (Communications → Groups)
- **Project approvals:** week of Sept 21
