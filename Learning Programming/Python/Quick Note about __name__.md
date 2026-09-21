Many times you will see applications and programs using a line such as the following:


```Python
if __name__ == __main__:
	myFunction()
```

- "\___name\___" is a native variable to every python file that navigates where the python script is being used. 

<h2>Why or where is it used?</h2>
- Indicates what environment it is being run in. This means that when running it in a batch script or other file it can be called as so:
  
```Batch
python <fileName>.py
```
* This is also the same instance when run in the IDE

- Yet in a python file it must be imported as so:
  
```Python
import <fileName>
<fileName>.myFunction()
```

In scripting you can also pass in arguments as so:

You may also put an empty "\_\_init\_\_.py" to make it a package that can be imported as such:

```Python
import packdirectory.package
```

You may also import a config json file such that:

config.json:

```json
{
	"User" : {
		"Name" : "Jack"
	}

}
```

script.py:

```python
import json
with open('./config.json') as file:
	data = json.load(file)
```