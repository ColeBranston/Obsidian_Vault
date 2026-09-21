### Fetching Using Vanilla JavaScript
params: fetch(api, options)

The api parameter is a STRING of the api link that you are fetching from.

You then use the .then() method to define the response like so:

``` javascript
	fetch('https://reqres.in/api/users', {
		method: "POST",
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify({
			name: 'User 1'
		})
	}).then(res => {
			return res.json()
		}
	.catch(error => console.log('ERROR'))
```

### Fetching Data using Axios
1. Install dependencies
``` cmd
npm install axios --save
```
2. Import axios
``` jsx
import axios from 'axios'
```
3. Define whatever API call you want
``` javascript
const handleClick = () => {
	axios.get('api')
	.then(res => {
		return res.content 
	}).catch(err => {
		console.log(err)
	})
}
```
4. Set credentials to true
Using fetch:
``` javascript
const response = await fetch('http://localhost:3000/login', {
	method: "POST",
	headers: {
		'Content-Type': 'application/json'
	},
	body: JSON.stringify({
		username: username,
		password: password
	}),
	credentials: 'include'
});
```
Using axios:
``` javascript
axios.defaults.withCredentials = true;
// Axios request goes here
```