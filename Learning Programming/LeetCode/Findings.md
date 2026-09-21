
1. The Leetcode solution timer doesn't work the greatest. By spamming submit on the same solution you can get solutions in the 5th percentile while the same solution might warrant a 95th percentile time another submission. Analyzing time complexity is most accurate.
2. Many of the easy problems that have a simple description usually have a simple answer:
- The solution usually leverages a function such as abs, min, or max 
- Otherwise it can be solved using simple reasoning and trial and error
3. Sometimes solutions have a closing data set as in, based on a condition, you may inch along the data set. An example is leetcode 121, where the sell number is always larger than the buy, and you can search left to right for a profitable combo moving in this direction.
4. Some math based problems require a different perspective or outlook on a seemingly easy solution. Look at Leetcode 238. Here, you must use temporary arrays and multiply all the numbers to the left first and then all the numbers to the right. 
5. Anything that concerns bounds such as intervals, requires sorting first 
6. There's  a trick where you can make a new array and reference the -1 index while constantly adding to it so you don't have to iterate through it again a second time. Usually combined with sorting. 