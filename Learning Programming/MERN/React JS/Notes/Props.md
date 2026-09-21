Used to pass information from a parent component to a child component.

In the definition of the child component, done through using the parameter "props", as shown below

``` jsx
function Child(props){
	return(
		<>
			<p>Name: {props.name}</p>
		</>
	)
}

export default Child;
```

And would be passed by the parent as so:

``` jsx
import Child from './children/child'

function Parent(){
	return(
		<>
			<Child name="Hadi" />
		</>
	)
}

export default Parent;
```
