1.  Changing directory using "cd"
```
C:Users/JackBranston> cd
```
- Changes the working directory. 
```Linux
C:Users/JackBranston> cd -
```
- Goes back to the last active directory
```Linux
C:Users/JackBranston> cd ..
```
- Goes back one directory
1. Identifying files within the active directory
```Linux
C:Users/JackBranston> ls
```
3. Identifying permissions of files within the active directory
```Linux
C:Users/JackBranston> ll
```
4. Displaying the contents of any file within the terminal
```Linux
C:Users/JackBranston> cat <fileName>
```
-  Note: Replace the "<>" too when you insert the file name with extension

5. Identifying the history of commands used in a working directory
```Linux
C:Users/JackBranston> history
```

6. Making a copy of a file
```Linux
C:Users/JackBranston> cp <fileName>
```
-  Note: Replace the "<>" too when you insert the file name with extension
7. Opening Visual Editor (VI) (Most important)
```Linux
C:Users/JackBranston> vi <fileName>
```

8. Finding files in a directory
```Linux
C:Users/JackBranston> find <fileName> 
```
- Will return the path of the file. Add "-r" to make it do it recursively which is better in some case
9. To look into the contents of a file
```Linux
C:Users/JackBranston> grep "text"
```
- Note: add "\*"  to the end of the command to search first in the current directory
- Note: add \<command> | to the beginning to filter through the contents of another command entered
10. Clearing the command line
```Linux
C:Users/JackBranston> clear
```
11. Making a program an executable script to be run in the terminal
```Linux
C:Users/JackBranston> chmod a+x <FileName>
```

- Note: A shell script or shell bash script is just a script that runs these commands autonomously using things like parameters defined as:
  
  $1 $2 $3 ... ect

It might look something like this:
```sh
#!/bin/bash

# Check if at least one command-line parameter is provided
if [ $# -eq 0 ]; then
    # Print usage instructions and exit with status code 1 (indicating an error)
    echo "Usage: $0 filename"
    exit 1
fi

# Get the filename from the first command-line parameter
FILE="$1"

# Check if the file exists
if [ -e "$FILE" ]; then
    # If the file exists, print a confirmation message
    echo "$FILE exists."

    # Check if the file is writable
    if [ -w "$FILE" ]; then
        # If the file is writable, print a confirmation message
        echo "$FILE is writable."
    elif [ ! -r "$FILE" ]; then
        # If the file is not writable and also not readable
        echo "$FILE is not writable and is not readable."
    else
        # If the file is not writable but is readable
        echo "$FILE is not writable but is readable."
    fi

    # Check if the file is empty
    if [ -s "$FILE" ]; then
        # If the file is not empty, print a confirmation message
        echo "$FILE is not empty."
    else
        # If the file is empty, print a confirmation message
        echo "$FILE is empty."
    fi
else
    # If the file does not exist, print a message indicating so
    echo "$FILE does not exist."
fi


```
