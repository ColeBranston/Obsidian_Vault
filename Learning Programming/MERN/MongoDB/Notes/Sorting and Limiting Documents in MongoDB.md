To return all documents sorted we can type

```mongosh
collection> db.collection.find().sort({name:1})
```
This sorts name by alphabetical order (-1 would sort by reverse alphabetical order)

You can method chain with .limit(number) with the number parameter being the number of documents you would like returned.

``` mongosh
collection> db.collection.find().sort({name:1}).limit(10)
```

