1. There are two ways to use MongoDB: Locally, or online using Atlas (A MongoDB service)
2. [[Non Relational Databases or No SQL Databases]]
3. Install MongoDB locally: https://www.mongodb.com/try/download/community
   
   1. The free community edition
   2. Select the newest version 
   3. Download and run the executable
   
4. Make sure to check the box for install as a service, along with Install MongoDB compass
5. Also install the MongoDB shell: https://www.mongodb.com/try/download/shell
6. MongoDB has a special objectID keyname so that you can have:
   
```json
{
   "title":"My first blog post",
   "author":{
	   "name":"Yoshi",
	   "email": "yoshi@gmail.com",
	   "role":"Game Reviewer"
   },
   "tags":["video games", "reviews"],
   "upvotes":20,
   "body":"Lorem ipsum...",
   "_id": ObjectID("ai5eg8H9Pk12") //Here
}
   
```