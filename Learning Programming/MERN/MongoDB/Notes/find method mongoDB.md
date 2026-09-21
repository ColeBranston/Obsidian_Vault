`db.collection.find({key:value})`
This basically finds you all objects with a specific value for a key. You can also do this with multiple key-value pairs using a comma to separate key-value pairs.

You can set a parameter of \_id to false in there to ONLY return specific parameters, as such:

`db.collection.find({_id:false, name:true, gpa:true})`
This will ONLY return to you the names and their gpas

