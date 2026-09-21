[[Props]] are not to be changed in the child, however using State we can keep track of values without page refreshes.

The proper import is `import {useState} from 'react'`

and is used like so

``` jsx
import {useState} from 'react'

function App(){
	const [var, setVar] = useState('initial value') // Setting the variable we want to the initial value we want
	return(
	<>
		<input type='text' onChange={(e) => {
		setVar(e.target.value)
		}} // Setting the variable to whatever the user inputs
	</>
	)
}

export default App;
```

