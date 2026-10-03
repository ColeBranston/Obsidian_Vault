---
aliases: [Traceability]
---

**Traceability** is the ability to follow the links between artifacts (documents, models, requirements, test cases, …) — from where a requirement came from to everything that was built on it.

| Type | Starting from an artifact, you can find… |
|---|---|
| **Forward** | every artifact that depends on it |
| **Backward** | every artifact it depended on (its sources) |
| **Bidirectional** | both — what led to it *and* what was built on it |

## Traceability matrix

A simple way to record it is a spreadsheet (e.g. Excel). Example matrix from the slides:

| ID | A | Requirement | Business need / justification | Project objective | Requested by | Department | WBS element | Specification | Design | Test cases |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 1.1 | Login Page | Clients need a way to access protected content | Create Minimum Viable Program | Dmitriy N. | Content | 2 | Finished | Finished | 1001 |
| 1 | 1.2 | Forget Password Link | Greatly reduces workload of support team | Create Minimum Viable Program | Dmitriy N. | Content | 2.1 | Finished | Finished | 1002, 1003 |
| 1 | 1.2.1 | Landing Page | A must-have starting point for a client | Create Minimum Viable Program | Dmitriy N. | Content | 3 | Finished | In Progress | |
| 1 | 1.2.2 | Log Out Link | Security — users need to log out | Create Minimum Viable Program | Security Officer | Technical Control | 2.2 | Not Started | Not Started | |
| 2 | 2.1 | Welcome Email Sequence | Must-have initial info after purchase | Create Minimum Viable Program | Dmitriy N. | Content | 3 | Not Started | Not Started | |
| 2 | 2.2 | Unsubscribe Link | Required by anti-spam act | Create Minimum Viable Program | Email Service Provider | Control | 3.1 | Not Started | Not Started | |

Tools like **Confluence** and **Jira** let you attach metadata to items that can be used for traceability instead.

> [!warning] Don't force one giant document
> A single document holding all traceability information doesn't scale well — and may not be necessary.
