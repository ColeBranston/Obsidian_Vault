1. To make the first pull of a repository you the command:
   
```Git
C:Users/JackBranston> git clone <http repo address>
```

2. Then make a branch:

```Git
C:Users/JackBranston> git branch <BranchName>
```
- The purpose of branching is to one, maintain an unaltered copy of the working code without your changes and two, enable changes on your branch that when pushed to the master branch will give the owner of the repo to double check the changes in an additional and useful UI. 
3.  Adding files to the staging area:
```Git
C:Users/JackBranston> git add <fileName> #Add "." as fileName to make 
```

- The staging area is where added files can be committed
4. Committing changes for pushing the main branch:
```Git
C:Users/JackBranston> git commit
```
- Notes: This is git's save and exit. This way you can get back to the previous commits. Make sure to add your message. Type in here, hit "esc", then ":wq" (Like Visual Editor in Linux) to complete the commit
5. To push everything to the main repo use
```Git
C:Users/JackBranston> git push 
```

<h1>Other commands: </h1>

1. To check out past commits history
```Git
C:Users/JackBranston> git checkout <git commit ID>
```
- Note: The same thing can be done to checkout new branches instead of the commit id
2. To check the commit history and get ID:
```Git
C:Users/JackBranston> git log
```
3. To check the unstaged changes to be committed:
```Git
C:Users/JackBranston> git status
```
4. If you want to go back to the latest commit use
```Git
C:Users/JackBranston> git reset --hard
```