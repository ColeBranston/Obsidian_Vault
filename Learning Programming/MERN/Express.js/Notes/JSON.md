JavaScript Object Notation

### Overview

- JSON is a lightweight data interchange format that is easy for humans to read and write and easy for machines to parse and generate.
- It is primarily used to transmit data between a server and a web application as text.

### Syntax

- JSON data is represented as key/value pairs.
- The format uses:
    - Curly braces `{}` to hold objects.
    - Square brackets `[]` to hold arrays.

### Data Types

1. **String**: Text enclosed in double quotes.
    - Example: `"name": "John"`
2. **Number**: Numeric values.
    - Example: `"age": 30`
3. **Object**: A collection of key/value pairs enclosed in curly braces.
    - Example: `"address": { "city": "New York", "zip": "10001" }`
4. **Array**: An ordered list of values enclosed in square brackets.
    - Example: `"phoneNumbers": ["123-4567", "987-6543"]`
5. **Boolean**: `true` or `false`.
    - Example: `"isStudent": false`
6. **Null**: Empty value.
    - Example: `"middleName": null`

Example:
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "age": 25,
  "isStudent": false,
  "address": {
    "street": "123 Main St",
    "city": "Anytown",
    "state": "CA",
    "postalCode": "12345"
  },
  "phoneNumbers": [
    "123-456-7890",
    "987-654-3210"
  ]
}
```

### Rules

1. **Keys**:
    - Must be strings enclosed in double quotes.
    - Must be unique within an object.
2. **Values**:
    - Can be strings, numbers, objects, arrays, booleans, or null.
3. **Formatting**:
    - No trailing commas.
    - Key/value pairs are separated by a colon `:`.
    - Key/value pairs are separated by commas.

### Usage
- **JavaScript**: JSON data can be parsed into a JavaScript object using `JSON.parse()` and converted back to a JSON string using `JSON.stringify()`.

``` javascript
const jsonString = '{"name":"John", "age":30}'; 
const jsonObject = JSON.parse(jsonString); console.log(jsonObject.name); // John const newJsonString = JSON.stringify(jsonObject); console.log(newJsonString); // {"name":"John","age":30}
```

**APIs**: JSON is commonly used in REST APIs for data exchange.

```javascript
GET /users/1 HTTP/1.1
Host: example.com
Accept: application/json
```

Response:

```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

### Benefits

- **Human-Readable**: Easy to understand and write.
- **Language Independent**: Can be used with most programming languages.
- **Lightweight**: Efficient data transfer format.

### Drawbacks

- **Limited Data Types**: Only supports basic data types.
- **No Comments**: Cannot include comments in JSON files.