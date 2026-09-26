The four things an application may want from the network. No protocol provides all four.

| Requirement | Needs it | Doesn't | What you actually get |
|---|---|---|---|
| **Data integrity** (every bit arrives?) | file, bank transfer, web page | voice call | paid for by resending, which costs time |
| **Timing** (arrives soon?) | games, calls: tens of ms | mail | cannot be bought; no promise |
| **Throughput** (guaranteed rate?) | video at a chosen quality | **elastic** apps (downloads) | cannot be bought; you get what's left |
| **Security** (private?) | passwords, payments | a public page | neither transport offers it; app adds it ([[TLS]]) |

**Representative apps:** Email · file download · web page · text messaging must lose nothing and are elastic. Streaming video, video calls, and games can lose some; streaming tolerates seconds of delay, calls and games only tens of ms.

> [!tip] The row that justifies two transport protocols
> A video call can lose frames and can't wait, so resending a lost frame is worse than nothing: it arrives after its moment. See [[UDP]].
