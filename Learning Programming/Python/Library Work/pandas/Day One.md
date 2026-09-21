1. pandas is a python library that is great for data science and manipulating data. They can also be used to read and write to csv files (Excel files)
2. Imported by
```Python
import pandas
```
3. Data is organized into data frames conventionally abbreviated "df". They are just tables or schemas used in sql. 
4. How to initialize data frames:
```Python
import pandas 

#Instantiating data frames
df = pandas.DataFrame([{"Column1":dataOne, "Column2":dataTwo, "Column3":dataThree}]) #Takes in a dictionary containing all the values of the table, contained in a list. I know, why the list. Maybe we'll find out.
```
5. How to import a csv file into your code:
```python
import pandas

#Importing a premade CSV file (Comma separated values)
df = pandas.read_csv('csvDirectory', index_col=False) 
```
- Note: The index_col parameter along with a couple other ones prevent default presets to be loaded onto your data frame. Examples of default presets include unwanted row numbers and column numbers in addition to anything already in the csv file.
6. Appending a new line onto a data frame (Combining two data frames):
```Python
import pandas 

df_csv = pandas.read_csv('./myCSV.csv', index_col = False)
df_row = pandas.DataFrame([{"Hadi is cute": True, "Cole is straight": False}])

#Combining two data frames
df = pandas.concat([df_csv, df_row], ignore_index = True)

#The built-in function first takes the two tables in a list, and combines them together in descending order. 

```
- Note: "ignore_index" is added here to ensure that no new default presets are added to the combined tables. (Pandas likes to do this for some reason)
- 