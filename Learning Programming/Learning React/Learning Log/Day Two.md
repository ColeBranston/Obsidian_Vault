After watching an hour tutorial:

```jsx
const component = (props) => {
	return
	<>

	    <h1>Random html element {props.name}</h1>

	    <p>This shows operations can be done in the brackets {1 + 1}</p> 
	    //The 1 + 1 will display a 2!
	    
    </>
});

```
  
  
You may also change  the component object using [[Props]].

**So that when you call it somewhere else in your code (E.g.):**

```jsx
<component name={'This is a name'}/>

```


**Notice how this code would then directly effect that above, but just for that specific instance**

You may also perform **if statements** within the {}. By saying: 

*{variable ? (JSX code here) : (JSX code here)}* 

*"variable ?"* should be either **True or False**

>The "{}"  handles dynamic values (Dynamic value referring to a constantly changing value)