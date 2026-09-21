1. Install react-router-dom
``` cmd
npm install react-router-dom
```

2. Make the right imports
``` jsx
import {BrowserRouter, Routes, Route} from 'react-router-dom';
```

3. Set up the routing

``` jsx
function App() {
	return (
	<BrowserRouter>
		<Routes>
			<Route path='/' element={<Home />}
			<Route path = '/employees' element={<Employees />}
		</Routes>
	</BrowserRouter>			
	);
}
```

4. Set up an import for where you want to make your links to the imports
``` jsx
import { NavLink } from 'react-router-dom';
```

5. Set up the actual links on the site
``` jsx
function Navigation() { 
	return ( 
		<nav> 
			<ul> 
				<li> 
					<NavLink to="/" exact activeClassName="active"> 
						Home 
					</NavLink> 
				</li> 
				<li> 
					<NavLink to="/employees" activeClassName="active"> 
						Employees 
					</NavLink> 
				</li> 
			</ul> 
		</nav> 
	); 
}
```

6. Set up a case for the user entering a page that does not exist by making one of the Routes have a path="\*" 


