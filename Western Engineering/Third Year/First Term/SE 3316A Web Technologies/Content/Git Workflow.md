The session loop used for all labs in this course:

**Pull** (start of session) → **Develop / Test** locally → **Commit** → **Push** (end of session)

Three places the code lives:
- **Laptop or lab workstation** — local Git repository, where you develop and test
- **GitHub** — the online repository, the single source of truth between machines
- **AWS** — pulls from GitHub to deploy and test on a real server

Pulling at the start and pushing at the end is what makes the laptop/lab-workstation split work at all; skip it and the two local repos diverge.

**Conventions:**
- Keep your repositories **private**
- Use `.gitignore` so you only track files you actually edit
- Keep project assets (images, data, libraries) out of Git
- Commit steadily — the commit history is itself evidence of progress and is marked
