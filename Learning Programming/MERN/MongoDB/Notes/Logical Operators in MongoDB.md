Logical operators return data based on expressions that evaluate to true or false.

There's four:
1. $and - Joins query clauses with a logical AND returns all documents that match the conditions of both clauses
`db.collection.find({$and:[{fullTime:true}, {age:{lte:27}}]})`
Returns anyone with a full time attribute of true and an age less than or equal to 27
2.  $not - Inverts the effect of a query expression and returns documents that do not match the query expression
`db.collection.find({age:{$not:gte:30}}})
This gives me anyone without an age greater than or equal to 30
3. $nor - Joins query clauses with a logical NOR returns all documents that fail to match both clauses
`db.collection.find({$nor:[{fullTime:true}, {age:{lte:27}}]})`
Returns anyone who is not full time or of age les than or equal to 27
4. $or - Joins query clauses with a logical OR returns all documents that match the conditions of either clause.
`db.collection.find({$or:[{fullTime:true}, {age:{lte:27}}]})`
Returns anyone with a full time attribute of true or an age less than or equal to 27

