Change streams allow applications to access real-time data changes. They provide a stream of change events for collections or databases.

**Watching a Collection:**
```javascript
const changeStream = db.collection.watch();
changeStream.on('change', (change) => {
  console.log(change);
});
```