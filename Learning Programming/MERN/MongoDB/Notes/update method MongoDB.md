Syntax: `db.collection.updateOne({name:"Hadi"}, {$set:{fullTime:true}})`

This updates everyone with a name value of "Hadi" to have a fulltime attribute of "true". 

If you replace $set with $unset, it will actually REMOVE that field.

You can update many documents at once using the updateMany() command
`db.collection.updateMany({}, {$set:fullTime:false}})`

This updates every object's fullTime field to false.

`db.collection.updateMany({fullTime:{$exists:false}}, {$set:{fullTime:true}})`

This has every object without a fullTime key gain the key with it set to true.