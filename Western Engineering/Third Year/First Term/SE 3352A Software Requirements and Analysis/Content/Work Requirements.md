**Work requirements** (from [[CoreX]]) describe both **what** an application must do and **how** it must work to support people's jobs and improve productivity and other business outcomes. Contrast with traditional *software* requirements, which tend to be granular and functionality-focused without saying how people will actually use that functionality to get work done.

They come from **job analysis and design (JAD)**, an organizational-psychology technique that defines a job's:
- **KRAs** — key result areas
- **KPIs** — key performance indicators
- **KTs** — key tasks
- the competencies (knowledge, skills, abilities) needed to perform well

## How they cover the usual requirement types

| Usual type | Where it shows up in work requirements |
|---|---|
| [[Business Requirement]] | job KPIs and targets, aggregated up to the business case |
| [[Stakeholder Requirement]] (user) | the KRAs and KTs people need to do |
| [[Functional Requirement]] | KTs, modelled in detail to show exactly how each task is done |
| [[Non-Functional Requirement]] | mainly **usability**, specified through the UI model |

## The job as a scope boundary

- Requirements that map to the job → **in scope**; ones that don't → **out of scope**.
- Part of the job with no matching requirement → people can't do that part in the app.
- Changing a requirement → check whether the job changed; if yes, update the job description too; if not, leave the requirement alone.
- Descoping → people lose that part of their job in the app, so prefer descoping a whole KRA over leaving people half in the old system (or Excel).
