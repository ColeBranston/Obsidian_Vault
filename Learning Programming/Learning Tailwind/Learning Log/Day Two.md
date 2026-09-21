1. To use Vite with tailwindcss since we no longer can do it with npm follow these instructions:

Createt the project:
```CLI
npm create vite@latest . -- --template react
```

Run 1 by 1:

```CLI
npm install -D tailwindcss postcss autoprefixer
npx tailwindcss init
```

**Create the file** and put this inside the postcss.config.cjs file newly created:

```js
module.exports = {
  plugins: {
    tailwindcss: {},
    autoprefixer: {},
  }
}
```

Put this in the tailwind.config.js:

```js
/** @type {import('tailwindcss').Config} */

export default {

  content: [

    "./index.html",

    "./src/**/*.{js,ts,jsx,tsx}",

  ],

  theme: {

    extend: {},

  },

  plugins: [],

}```

Put this inside the index.css file:

```css
@tailwind base;
@tailwind components;
@tailwind utilities;
```

2. You should be good to go!