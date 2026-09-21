Mongoose is an ODM library for MongoDB and Node.js. It provides schema-based solutions for modeling data.

**Defining a Schema and Model:**
```javascript
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const userSchema = new Schema({
  name: String,
  age: Number,
  email: String
});

const User = mongoose.model('User', userSchema);
```