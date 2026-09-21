**Non-functional requirements (NFRs)** don't specify functionality directly — they describe how well the system must perform in its environment, and how it should respond to constraints on its behavior. Also called **service-level requirements (SLRs)**, **supplementary requirements**, or **quality requirements**.

NFRs translate into quality attributes / design goals that directly shape the architecture. Common attributes:

| Attribute | Meaning | Example |
|---|---|---|
| Scalability | Ability to grow to accommodate increased demand or scope | Accommodate 2× current volume while still meeting performance targets |
| Reliability | Level of resiliency of the system | Mean time between failures (MTBF) shall not exceed X |
| Availability | Ability to perform its function when required, incl. when/how it's accessed | System available 24/7 during year X |
| Recoverability | How quickly service is restored after an outage | Restore service within 1 hour of an outage |
| Capacity | Amount of data or services the solution can manage | Maintain 5 years of historical data; support 1,000 simultaneous users |
| Maintainability | Ease of being changed/repaired, and of adapting to new users/business units | Configurable for new business units without extra coding |
| Security | Confidentiality, integrity, and availability of assets/information/services | Authenticate all users via SSO |
| Data integrity | Consistency of data across the business | APIs follow architecture best practice for aligned data structures |
| Interoperability | Ease of use alongside other software systems | Compatible with system X |
| Usability | How effectively, efficiently, and satisfyingly intended users can use the solution | Prompt users to confirm financial transactions after entering details |

> [!tip]- You can coin your own
> Any "–ility" term defined this way works as a quality attribute.
