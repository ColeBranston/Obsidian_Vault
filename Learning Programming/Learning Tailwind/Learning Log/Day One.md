1. Configuring tailwind:
```
npm install tailwindcss
```

Put this in your index.css file

```css
@tailwind base;
@tailwind components;
@tailwind utilities;

```

Use the command:

```js
npx tailwindcss init
```

And put the following code in the newly created "tailwind.config.css" file
```json
/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{js,jsx,ts,tsx}"],
  theme: {
    extend: {
      keyframes: {
  //You don't actually need these ones below, these are just illistrating animations in the following code
        flyFromLeft: {
          '0%': { transform: 'translateX(-100%)' },
          '100%': { transform: 'translateX(0%)' }
        },
        flyFromBottom: {
          '0%': { transform: 'translateY(100%)' },
          '100%': { transform: 'translateX(0%)' }
        },
        appear: {
          '0%': {opacity: 0},
          '100%': {opacity: 1}
        },
      },
  //You don't need this section either, I'm just illistrating how to make customer animations with tailwind
      animation: {
        flyFromLeft:'flyFromLeft', 
        appear:'appear',
        flyFromBottom: 'flyFromBottom'
      }
    },
  },
  plugins: [],
}
```

2. Now whenever you reference className="" in your JSX, the quotations will contain the css. This css has a different style though
3. Here's a demo that outlines the most key points:

app.js:

```js
const app = () =>{
return(
	<div className="flex sm w-1/4 h-full md w-[50%] h-full lg w-screen h-full">
	//The sm, md, lg with css following illistrate custom css per small, medium, and large screen sizing. w: width, h: height. Numbers that would normally be used in a css file are put in square brackets, []
	<button className="mx-auto my-auto hover:bg-black rounded-sm">click Me!</button> 
	//The containter being flexed, along with the  mx-auto or margin x automatic makes it centered. hover: -is on hover, bg: background, color codes go in square brackets []. You can round a button or container with rounded-sm, rounded-md, rounded-lg, rounded-xl
<div className="bg-white animate-spin">
	//Native animations include spin, ping, pulse, and bounce
	<p claasName="hover:animate-[flyFromBotton_1s]">Here is some text</p>
	//This custom animation I've added in the above tailwind configuration file shows that you may use custom animations but also by adding an underscore, "_", and #s after you can get an animation timeframe. 
</div>

	</div>
)
}
export default app;
```

Other Notes:

- justify-center is a good one to use as well
- flex-wrap is a good one, it basically does was flex does but only if it's permitted given the size of the involved objects, rather than just mashing the component together like flex could do in a cluster situation. 
- you can do m, ml, mr, mt, mb for margins
- you can do p, pl, pr, pt, pb for padding -though not recommended