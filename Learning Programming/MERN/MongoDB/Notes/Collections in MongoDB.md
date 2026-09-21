A database is a group of collections, a collection a group of documents.

`show collections` shows you all the collections in your databsae

to create a collection, use the createCollection method like so:

`db.createCollection("nameOfCollection", {capped:true, size:10000000, max:100}, {autoIndexId:false})`
This creates a collection with a maximum size of 10 MegaBytes and a maximum of 100 documents, and creates automatic indices.

To drop a collection, use the drop() method like so: `db.collection.drop()`

