use the .insertOne() method to insert into a database. Here is an example

``` mongosh
collection> db.collection.insertOne({key_one:value, key_2:value})
```

Then, to display the documents in the collection, use the find method

``` mongosh
collection> db.collection.find()
[
	{
		_id: ObjectId("XXXXX"),
		key_one: value
		key_two: value
	}
]
```

You can insert many documents at a time using the insertMany() function

```mongosh
collection> db.collection.insertMany([{key:value}, {key:value}, {key:value}])
```

You can do the same thing in Compass by going to the database, go to the collection, then click "Add Data" and press "insert document"

