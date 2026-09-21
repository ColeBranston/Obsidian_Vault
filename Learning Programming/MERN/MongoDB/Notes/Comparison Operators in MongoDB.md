Comparison Operators return data based on value comparisons. 

`db.collection.find({name:{$ne:"Hadi"}})`

This finds every document in the collection NOT with a name value equal to Hadi

`db.collection.find({age:{$lt:20}})`
This returns any document with an age field less than 20

Using lte would make it be less than OR equal to.

Using gt would be greater than.

gte would be greater than or equals.

`db.collection.find({name{$in:["Hadi","Jack","Cole"]}})`
This would return all documents with a name in the array presented above.

Using nin instead of in would return all names that are NOT in the array provided.

