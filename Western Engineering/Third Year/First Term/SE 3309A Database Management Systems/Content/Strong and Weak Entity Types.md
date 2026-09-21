A **strong entity type** is not existence-dependent on some other entity type. A **weak entity type** is existence-dependent on some other entity type — it can't exist without its "owner."

Example: **Client** is strong; **Preference** is weak — a client's rental preferences (`prefType`, `maxRent`) only exist in relation to a Client that *States* them.

> [!note]- Mermaid — Strong Entity Type called Client and Weak Entity Type called Preference (slide 23)
> ```mermaid
> classDiagram
>     class Client {
>         clientNo (PK)
>         name (fName, lName)
>         telNo
>     }
>     class Preference {
>         prefType
>         maxRent
>     }
>     Client "1..1" -- "1..1" Preference : States
> ```
