Transactions allow multiple operations to be executed in isolation, providing atomicity. Use transactions to ensure data consistency.

**Starting a Transaction:**
```javascript
const session = client.startSession();
session.startTransaction();

try {
  db.collection.insertOne({name: "Alice"}, {session});
  db.collection.updateOne({name: "Alice"}, {$set: {age: 26}}, {session});
  session.commitTransaction();
} catch (error) {
  session.abortTransaction();
} finally {
  session.endSession();
}
```

