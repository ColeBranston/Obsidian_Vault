**ONLY so that you don't need to return a response code**

Within various services, many different methods take place and when there is an error its hard to know exactly what has gone wrong from the error logs. In this case a developer can specify to throw response codes. For example, if a search algorithm can't find an element in  a list of elements, the developer can choose to specify a certain response code to tell users that the element they are searching for can't be found.

Ex.

```Java
    public Survey retrieveSurvey(String id) {  
    Survey tempSurvey = null;  
    for (int i =0; i < surveys.size(); i++) {  
        if (surveys.get(i).getId().equals(id)) {  
            return surveys.get(i);  
        }  
    }  
    return null; 

	@RequestMapping("/surveys/{id}")  
	public Survey retrieveSurvey(@PathVariable String id){  
	    Survey survey = surveyService.retrieveSurvey(id);  
	  
	    if (survey == null){  
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND);  
	    }  
  
	    return survey;  
	}
	
```

Looks like... 

![[Pasted image 20240731172326.png]]

to throw a response code you use the line `throw new ResponseStatusException()` with a `HttpStatus` inside the parenthesis, in this case `.NOT_FOUND`

**Other Examples**

```Java
	throw new ResponseStatusException(HttpStatus.ACCEPTED);
	throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
	throw new ResponseStatusException(HttpStatus.NOT_MODIFIED);
    throw new ResponseStatusException(HttpStatus.CONFLICT);
```
