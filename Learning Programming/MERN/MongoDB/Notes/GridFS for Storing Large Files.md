GridFS is a specification for storing and retrieving large files in MongoDB. It splits files into chunks and stores each chunk as a separate document.

**Storing a File:**
```javascript
const bucket = new mongodb.GridFSBucket(db);
fs.createReadStream('file.txt').pipe(bucket.openUploadStream('file.txt'));
```

**Retrieving a File:**
```javascript
bucket.openDownloadStreamByName('file.txt').pipe(fs.createWriteStream('file.txt'));
```