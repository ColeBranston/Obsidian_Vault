Indexes support the efficient execution of queries in MongoDB. Without indexes, MongoDB must perform a collection scan (i.e. scan every document in a collection, to select those documents that match the query statement. If an appropriate index exists for a query, MongoDB can use the index to limit the number of documents it must inspect.)

To apply an index to a field, use the createIndex() method

`db.collection.createIndex({name: 1})`

Use the getIndexes method to see all your indices

`db.collection.getIndexes()`

To drop an index, use the dropIndex method

`db.collection.dropIndex("name of index")`

