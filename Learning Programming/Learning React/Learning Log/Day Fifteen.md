React router:

```Js
//Imports the neccesary dependency
import { BrowserRouter, Route, Routes} from 'react-router-dom';

//The main app function
function App() {
  return (

	//Makes all pages under the browser router function which intializes the rrouting
    <BrowserRouter>
        <Routes> //Declares the routes
        <Route path="/" element={<HomePage />} /> 
        <Route path="/teams" element={<TeamsPage />} /> //Initializing each route
        <Route path="/signin" element={<SignInPage />} />
        <Route path="/settings" element={<Settings />} />
        <Route path="/payment" element={<Payment />} />
        <Route path="/checkout" element={<CheckoutForm />} />
        <Route path="/completion" element={<CompletionPage />} />
        </Routes>
    </BrowserRouter>
  );
}

export default App;
```

It is used as such:

```js
import React, {useState} from 'react';
import {AiOutlineClose, AiOutlineMenu} from 'react-icons/ai';
import {Link} from 'react-router-dom';

const app = () => {
	<Link to='/teams' className ='flex p-4 border-b border-gray-600 text-white cursor-pointer'> Team </Link> 
	//This is the implementaiton of it with the unique "Link" tag
};

export default Navbar;
```

