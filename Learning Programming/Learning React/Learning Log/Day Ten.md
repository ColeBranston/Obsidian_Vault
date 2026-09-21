1. The .map function is the JavaScript version of pythons for loop:

```JS
import {useState} from 'react'

const App = () =>{
	const [list, setList] = useState([1, 2, 3, 4, 5])
	return(
		<>
			<h1>This is JSX code</h1>
			<div className = "Item">
				{list.map((x, index) => ( //You may just do x, and figure out the key system using objects like in the tutorial video, but I recommend using the built in paramter with this function. Since it's relevant in the key system.
					<h1 key={index}>{x}</h1>
			
			
			));
			</div>
		</>
		
	
	)
};
export default App

```

2. [[Keys]] are really important and are shown above
3. It appears as though user defined functions use "{}" after a variable declaration whereas loops use "()".
4. Important:
>[!Important] useState And Lists
>While working on a project today, I stumbled upon this really weird and annoying concept. When using useState hook with lists, if the parameter with the corresponding function is equal to the variables name, or is the same variable it will not cause the variables JSX element to update. You must set a new variable equal to the list using the "..." (Spread) function and then change that list and send it through the parameter. This is modeled by the following code:



```JS
import './App.css';
import { useState } from 'react';
const App = () => {

  var [pos, setPos] = useState(0);
  var [list, setList] = useState([1, 2, 3, 4, 5]);
  return (

    <div>
      <div className="Numbers">
        {list.map((x, index)=>(
          (pos === index) ?
            <h1 key={index} className='target'>{x}</h1>
            :
            <h1 key={index}>{x}</h1>
          ))
        }
      </div>
      <div id="Buttons">

        <button onClick={()=> {if (pos>0) {setPos(pos-=1)}; console.log(pos)}}>Left</button>

        <button onClick={()=> {if (pos<4) {setPos(pos+=1)}; console.log(pos)}}>Right</button>

      </div>
      <div id="Buttons">

        <button onClick={()=>{const newList = [...list]; newList[pos] += 1; ;setList(newList);}}>+</button> //Here this concept is used

        <button onClick={()=> {const newList = [...list]; newList[pos] -= 1; ;setList(newList);}}>-</button> //Here this concept is used

      </div>
    </div>

  );}

export default App;
```

A copy of this whole file can be downloaded in the files section of the vault (Note: It can't be seen in the UI since it's a zip. You must navigate to it through the file explorer)
