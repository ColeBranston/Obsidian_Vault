- We determine the efficiency of an algorithm by measuring its complexity (the algorithm requirements), where we measure

	- the **time complexity** (the time it takes to run/execute) 
	- the **space complexity** (the memory it needs to run/execute).

- The process of measuring the complexity of algorithms is called the **analysis of algorithms**
- It is not always easy to compute actual time for an algorithm
	- Therefore, we usually measure **worst-case time**

### Running/Execution Time of an Algorithm

- The running time of an algorithm typically grows with the size of the input dataset.

- Average case time is often difficult to determine.

- We focus on the **worst-case** running time.
	- Easier to Analyze
	- Crucial to applications such as games, finance and robotics

![[Pasted image 20241016035110.png]]

### Limitation of Experimental Study Using Implementation, And the Go-to Strategy

**Limitation:**
- Sometime, implementation is language dependent. 
- Results may not be indicative of the running time on the data items other than the experimental ones. 
- To compare two algorithms, the same hardware and software environments must be used.

Strategy that allows the analysis of an algorithm (independent of the hardware/software environment)
- Focus on the pseudo-code of the of the algorithm instead of an implementation
- Characterize running time as a function of the input size, *n*
- Consider all possible inputs

### Seven Important Functions in Algorithm Analysis and Growth Rate

![[Pasted image 20241016035324.png]]

### Measuring Algorithm Efficiency

![[Pasted image 20241016035407.png]]

### Review Before Analysis

![[Pasted image 20241016035442.png]]

