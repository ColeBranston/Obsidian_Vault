Aggregation operations process data records and return computed results. MongoDB's aggregation framework provides powerful data analysis capabilities.

**Example Aggregation Pipeline:**
``` javascript
db.collection.aggregate([
  {$match: {status: "A"}},
  {$group: {_id: "$cust_id", total: {$sum: "$amount"}}}
]);
```