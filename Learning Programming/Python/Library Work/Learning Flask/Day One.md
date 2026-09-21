- Flask is very similar to next.js in that it can do it all including a frontend
- Here is a basic code snippet of something I implemented in my co-op at Scotiabank as a Software Engineering Intern:
```python
from flask import FLASK, jsonify, request, make_response, render_template
from waitress import serve
import pandas as pd
import datetime

def get_predefined_queries():
	queries = {}
	queries_folder = os.path.join(os.path.dirname(__file__), './staticQueries') #Contained a bunch of .sql files that consisted of individual queries
	for filename in os.listdir(queries_folder):
		if filename.endswith('.sql'):
			with open(os.path.join(queries_folder, filename), 'r') as file:
				queries[filename] = file.read()
	return queries #Returns a dictionary of attached queries read in from .sql files
	
@app.route('./queryOracleDB', methods=['GET'])
def run_query():
	
	predefined queries = get_predefined_queries()
	query = request.args.get('query', '') #Pulls the url parameter "query=" and if there is nothing provided it will return the second parameter ''
	run_busi_date = request.args.get('run_busi_date', '')
	prev_busi_day = request.args.get('run_busi_date', '')

	if query:
		if query and run_busi_date and pre_busi_date:
		#This part is not important, I'm just changing some date formats
			run_busi_date = datetime.datetime.strptime(run_busi_date, '%d-%B-%Y').strftime('%Y-%m-%d')
			pre_busi_date = datetime.datetime.strptime(run_busi_date, '%d-%B-%Y').strftime('%Y-%m-%d')
		#######################################
		else:
			new_query = query
		db_connection = ... ... ... #Shit about another inhouse package for configuring DB connection
		#Then with this inhouse framework, the database query was executed and the results were returned in a dataframe which looked like:
		
		with db_connection.acquire() as connection:
			with connection.cursor() as cursor:
				cursor.execute(new_query)
				rows = cursor.fetchall()
				output = pd.DataFrame(rows, coluns=[desc[0] for desc in cursor.description], dtype=object)
		response = make_response(output.to_csv(index=False, float_format='%.3f'))
		response.headers["Content-Type"] = "text/csv"
		response.headers["Content-Disposition"] = "attachment; filename=Restults.csv"
		return, response 200
	else:
		return render_template('index.html', predefined_queries=predefined_queries)
		
		
			

if __name__ == "__main__":
	server = str(os.environ.get(rl_var.FL_SERVER, '127.0.0.1'))
	port = int(os.environ.get(rl_var.FL_PORT, 5000))
	serve(app, host=server, port=port)
	
```

There is also boilerplate code for flasks frontend with the "render_template" functionality:
1. The html frontend can only be found once in a "templates" directory in the same active directory as the api
2. CSS must be contained within a "static" folder in the same active directory as the api and referenced in the html as:
   
```html
<link rel="stylesheet" href="{{ url_for('static', filename='styles.css') }}"> /* The styles.css can be named anything it just has to be inside the "static" folder   
```
3. Variables within the api should be identified with "name". Here is a sample of my frontend html:
   
```html
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset = "UTF-8">
	<meta name = "viewport" content = "width = device-width, initial-scale=1.0">
	<title>Query Oracle DB</title>
	<link rel="stylesheet" href="{{ url_for('static', filename='styles.css') }}">
</head>
<body>
	<h1>Query Oracle Database</h1>
	<form action="/queryOracleDB" method="get">
		<label for="query">SQL Query:</label><br>
		<textarea id="query" name="query" rows="4" cols="50"</textarea><br><br>
		
	<label for="predefined_query">Or select a predefined query:</label><br>
	<select id="predefined_query" name="predefined_query" onchange="document.getElementById('query').value = this.value;">
	{% for filename, query in predefined_queries.items() %}
		<option value="{{ query }}">{{ filename }}</option>
	{% end for %}
	</select><br><br>

	<label for="run_busi_date">Run Business Date (DD-Month-YYYY):</label><br>
	<input type="text" id="run_busi_date" name="run_busi_date" placeholder="14-july-2005"><br><br>

		<label for="prev_busi_date">Previous Business Date (DD-Month-YYYY):</label><br>
	<input type="text" id="prev_busi_date" name="prev_busi_date" placeholder="15-july-2005"><br><br>

	<input type="submit" value="Run Query">

	</form>
</body>
</html>

	
	
```