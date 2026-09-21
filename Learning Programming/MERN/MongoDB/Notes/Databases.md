To make a database, in the mongosh shell use the use command

``` mongosh
test> use school
switched to db school
```
This makes a database called school.

You can also create a database within the MongoDB Compass GUI
### Creating a Collection
Use the createCollection() method to create a collection of whatever topic you wish

``` mongosh
school> db.createCollection("Collection name")
```

### Dropping a Database
Use the dropDatabase() method

``` mongosh
school> db.dropDatabase()
{ ok: 1, dropped: 'school'}
```

