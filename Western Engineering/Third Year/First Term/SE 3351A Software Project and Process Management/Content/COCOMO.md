**COCOMO** (Constructive Cost Model) is a software-specific [[Parametric Estimation|parametric]] model that estimates development effort from software size, traditionally measured in **KLOC** (thousands of lines of code).

The original **Basic COCOMO** model uses:

$$\text{Effort} = a \times (\text{KLOC})^{b}$$

$$\text{Duration} = c \times (\text{Effort})^{d}$$

| Quantity | Unit |
|---|---|
| KLOC | Thousands of delivered source-code lines |
| Effort | Person-months |
| Duration | Calendar months |

The coefficients come from the **project category**:

| Category | Description | Example projects | a | b | c | d |
|---|---|---|---|---|---|---|
| **Organic** | Relatively small, familiar projects · experienced teams · flexible requirements | Student management system · library management system · simple business application | 2.4 | 1.05 | 2.5 | 0.38 |
| **Semi-detached** | Medium-sized projects · mixed team experience · moderate technical complexity | Banking application · hospital management system · enterprise inventory system | 3.0 | 1.12 | 2.5 | 0.35 |
| **Embedded** | Complex projects · strict hardware, software, timing or operational constraints | Aircraft control system · automotive control software · real-time industrial control system | 3.6 | 1.20 | 2.5 | 0.32 |

> [!warning] Category is not the application domain
> The example projects are only illustrative. The actual category depends on the development environment and constraints, not simply on what kind of application it is.

> [!note] Which coefficients actually change?
> Slide 12 says *a*, *b* and *c* depend on the category, but in the slide 14 table it is *a*, *b* and *d* that vary; *c* is 2.5 for all three.
