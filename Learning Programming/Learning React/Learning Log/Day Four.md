1. The [[Package.json]] file is also useful because it allows us to install all of the dependencies in a [[React]] project. 
>[!Why is this useful?]
>In github repositories the [[node_modules]] folder may be too large to provide -due to the 100 Mb limit on repos. So, when excluding this file you may use the node script "install" that references the [[Package.json]] file in the project directory to install a new node_modules folder.

For example:

```typescript
npm install
```