
## What Do Engineers Do?

an engineer solves problems of interest with efficient applications of scientific principles by:

- **Refining** existing product or process  
- **Designing** new product or process

### The Engineering Method

![[Pasted image 20240906173906.png]]

### How Statistics Support

___

- the field of **statistics** deals with the collection, presentation, analysis, and use of data to:

	- Make Decisions
	- Solve problems
	- Design products and processes
	
- It is the **science of data**

___

## Variability

- Statistical methods are useful to describe and understand **variability**.
- **Variability** refers to the successive observations of a system or phenomenon not producing exactly the same result.
- **Statistical Thinking:** Incorporating variability into decision-making processes

### Example

___

Eight prototype units are produced and their pull-off forces are measured (in pounds):  
12.6, 12.9, 13.4, 12.3, 13.6, 13.5, 12.6, 13.1

- all of the prototypes do not have the same pull-off force. We can see the variability in the above measurements as they exhibit variability.

**Dot Diagram**: plot for displaying a small body of data

- allows you to see two features, the location or the middle, and the scatter or variability.

___

## Basic Method of Collection Data

- **Retrospective**: uses historical data
- **Observational**: presently collected data, by a passive observer
- **Designed Experiment**: collected data in response to process input changes.

### Hypothesis Tests

___

- a statement about some aspect of the system.
- compared to a claim about another process value.
- Data's gathered to check the claim.

#### One - sample hypothesis test

- Ex. mean strength = 12.75 VS. mean strength > 12.75

#### Two - sample hypothesis test

- Ex. $\frac{1}{8}$ in. mean strength - $\frac{3}{32}$ in. mean strength = 0 
	VS. $\frac{1}{8}$ in. mean strength - $\frac{3}{32}$ in. mean strength > 0
 
___

## Factorial Experiment

- an experiment design using every possible combination of the **factor levels** to form a basic experiment with ***k*** different settings for the process. 

**Factor Levels**: specified values of factors used in the experiment

→ Called a **Factorial Experiment**

### Example - Consider a Petroleum Distillation Column

___

**Context:**

- **Output** is acetone concentration
- **Inputs** (factors) are:

	1. Reboil temperature
	2. Condensate temperature
	3. Reflux rate

- Output changes based on the changes in input (as per each experiment)

**Example:**

- Each factor is set at 2 reasonable levels (−1 and +1)

- 8 $(2^3)$ runs are made, at every combination of factors, to observe acetone  
output. **Note:** value "2" is the # of levels, while value "3" is # of factors

- resultant data creates a mathematical model of the process showing **cause** and **effect**.

![[Pasted image 20240906184845.png]]

- Factorial Experiments can get too large. Ex. 8 factors will require $2^(8) = 256$ experiment runs.

- Certain combination of factor levels can be deleted

- The result is called a **fractional factorial experiment.**  

___

## An Experiment in Variation (over-control or tampering)

___

W. Edwards Deming, conducted an illustrative experiment on process over-control or tampering.

**Context**: Marbles were dropped from an aligned funnel onto a target with a hole in the center. Two experiments were performed → 1. Dropping marbles and not moving the funnel, 2. Dropping marbles and moving the funnel to compensate for any error that occurred.

Eg. 1. if Marble misses hole, no changes are made. 2. if Marble misses hole, funnel is moved opposite to counteract the error. 

**Observations**: Compared to experiment 1, experiment 2 had deviations twice as large as experiment 1. 

___

**Conclusion:** The deviations from the target is increased due to the adjustments to the  
funnel

- funnel adjustments don't decrease future error.
- instead, tend to move the funnel farther from the target.

___

*experiment proves* 

- **overcontrol or tampering:**  adjustments to an experiment based on random disturbances increase variability. 
- Experiment adjustments are made to return a corresponding output.

___

## How are Changes Detected?

___

**Control Chart:** Output values, plotted over time including limits of normal  
variation which help pinpoint when the process leaves normal values and  
should be adjusted.

- Characteristics: 

	1. Time-oriented horizontal axis, e.g., hours
	2. Variable-of-interest vertical axis, e.g., acetone concentration
	3. Long-term avg. plotted as center line.
	4. Long-term usual variability is plotted as upper and lower control limits around the long-term avg. (Limits typically located at 3 standard deviations away from center line)

sample size of *n* is taken and averages are plotted over time. Inside of control limits, points are normal, outside, adjust experiment.

**Center Line:** Avg. of the data points
  
**Limits:** the upper and lower control limits are located **3 Standard Deviations** above and below the **center line**

<center><strong><i>Standard Deviation</i></strong></center>
<math xmlns="http://www.w3.org/1998/Math/MathML" display="block"><semantics><mrow><mi>s</mi><mo>=</mo><msqrt><mfrac><mrow><mo>∑</mo><mo stretchy="false">(</mo><msub><mi>x</mi><mi>i</mi></msub><mo>−</mo><mover accent="true"><mi>x</mi><mo>ˉ</mo></mover><msup><mo stretchy="false">)</mo><mn>2</mn></msup></mrow><mrow><mi>n</mi><mo>−</mo><mn>1</mn></mrow></mfrac></msqrt></mrow><annotation encoding="application/x-tex">s = \sqrt{\frac{\sum (x_i - \bar{x})^2}{n - 1}}
</annotation></semantics></math>
### Use of Control Charts

1. Enumerative studies: Control chart of past production data. Helps determine if past batches have met standard.
2. Analytic studies: Real-time Monitoring.

___

## Mechanistic & Empirical Models

___
### Mechanistic Model 

___

built from our underlying knowledge of the basic physical mechanism that relates several variables.

Ex.

![[Pasted image 20240906193842.png]]

___

### Empirical Model 

built from our engineering and scientific knowledge of the phenomenon, but is not directly developed  from our theoretical or first-principles understanding of the underlying mechanism.

**Basically...** the form of the function is **not known** a priori.

Ex.

- In a semiconductor manufacturing plant, the finished semiconductor is wire-bonded to a frame. Variables recorded were:

	- Pull strength to break the bond (𝑦)  
	- Wire length ($x_1$) 
	- Die height ($x_2$)

![[Pasted image 20240906194842.png]]

$Pull\;Strength = \beta _0 + \beta _1 (wire\;length) + \beta _2 (die\;height) + \epsilon$

**In general,** this type of model is called a **regression model**

- The estimated regression equation is given by:

$$Pull\;\widehat{} Strength = 2.26 + 2.74 (wire\;length) + 0.0125 (die\;height) + \epsilon$$
**Notice:** the little hat: $\widehat{}$  meaning circumflex indicates that its an estimated or predicted value.

### Visualizing the Data
___
![[Pasted image 20240906195958.png]]
___
### Visualizing the Data (Regression Analysis)
___

![[Pasted image 20240906200025.png]]
___

## Models Can Also Reflect Uncertainty
___
- **Probability models** help quantify the risks involved with statistic inference, a.k.a reliability in inferences made or risks taken on in decisions made everyday.
- **Probability** provides the **framework** for the study and application of statistics.

___

