1. You may use the integrated MongoDB compass tool and related terminal, or the mongsh terminal in any command prompt.
2. ![[MongoDB Commands]]
3. You may also use just "db" to show the current working database
4. To create a document use:

```js
use "dataBaseName"
db.<documentName>
db.<documentName>.insertOne({title:"The Color of Magic", "author: Terry Pratchett"})
```

- Note: When referencing a collection who's name is non existent it will create one for you. 