1. Creating the virtual environment
```Terminal 
C:Users/JackBranston> python -m venv .venv 
```

- Note: ".venv" can be any virtual environment name
2. Activating the environment (If name is ".venv")
```Terminal
C:Users/JackBranston> ./.venv/Scripts/Activate.ps1
```
3. Instantiating the requirements.txt (package file like [[package.json]])
```Terminal
C:Users/JackBranston> pip freeze > requirements.txt
```
- Note: Doesn't have to be named "requirments.txt" - convention
4. Installing the dependencies:

```Terminal
C:Users/JackBranston> pip install -r requirements.txt
```
- Note: Make sure the name of the dependencies are put in the requirements.txt file