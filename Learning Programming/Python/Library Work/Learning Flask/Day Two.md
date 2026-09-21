I have an additional example I made when completing an application for Western Developer's Society

folder structure is as follows

1. static (Folder)
- styles.css
2. templates (Folder)
- index.html
3. app.py (API/Backend)



styles.css:
```css
/* General styles */

body {

    font-family: 'Arial', sans-serif;

    background-color: #f4f4f4;

    margin: 0;

    padding: 0;

    display: flex;

    justify-content: center;

    align-items: center;

    height: 100vh;

}

  

/* Container for the form */

.container {

    background-color: #fff;

    padding: 30px;

    border-radius: 8px;

    box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);

    text-align: center;

    width: 300px;

}

  

/* Form styling */

input[type="text"] {

    width: 100%;

    padding: 10px;

    margin: 10px 0;

    border: 1px solid #ddd;

    border-radius: 5px;

}

  

input[type="submit"] {

    width: 100%;

    padding: 10px;

    background-color: #4CAF50;

    color: white;

    border: none;

    border-radius: 5px;

    cursor: pointer;

    font-size: 16px;

}

  

input[type="submit"]:hover {

    background-color: #45a049;

}

  

/* Search result styling */

.result {

    margin-top: 20px;

    font-weight: bold;

    color: #333;

}
```


index.html:

```html
<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Inventory Search</title>

    <link rel="stylesheet" href="{{ url_for('static', filename='style.css') }}">

</head>

<body>

    <div class="container">

        <h1>Inventory Search</h1>

        <form action="/search" method="POST">

            <input

                type="text"

                name="item"

                placeholder="Enter item name"

                required

            />

            <input type="submit" value="Search">

        </form>

  

        {% if result %}

        <div class="result">

            <p>{{ result }}</p>

        </div>

        {% endif %}

    </div>

</body>

</html>
```

app.py

```python
from flask import Flask, request, render_template, jsonify

  

# Initialize the Flask app

app = Flask(__name__)

  

# Sample inventory data

inventory = ["apple", "banana", "orange", "grape", "pineapple", 10, 5, 3.23]

  

# Search function - O(n) time complexity and O(1) space complexity. Can be better optimized by implementing

def search_item(arr):

    item = str(request.form.get('item')) #Retrieves the item from the url parameter

    try: #Tries to typecast for its appropriate data type

        item = eval(item)

    except: #If it's unable to do so

        pass

    if item in arr: #Checking to see if what the user entered is in the arr

        return f"'{item}' is available in the inventory." #Outputting the corresponding message if its in there

    else:

        return f"'{item}' is not available in the inventory." #Outputting the corresponding message if its not in there

  

# Route to render the form

@app.route('/', methods=['GET'])

def home():

    return render_template('index.html') #Rendering the initial template without any additonal parameters for the html template

  

# Route to handle the search request

@app.route('/search', methods=['POST'])

def search():

    result = search_item(inventory)

    return render_template('index.html', result=result) #Adding the additonal changes

  

#Running the flask application

if __name__ == "__main__":

    app.run(debug=True, host='127.0.0.1', port=5000)
```

