The organizing principle behind [[HTML]] + [[CSS]]: say **what something is** separately from **how it looks**.

Take a page of phone numbers:

| Structure — what [[HTML]] says | Presentation — what [[CSS]] says |
|---|---|
| the page starts with a header | headers are centered, huge and grey |
| the entries are written in a list | lists have square bullets |
| the numbers are emphasized | emphasis is rendered in bold italics |

Keeping them apart is what lets one stylesheet restyle a whole site, and lets the same markup render sensibly on a screen reader or a phone. [[JavaScript]] adds a third axis — **interaction** — that stays separate from both.
