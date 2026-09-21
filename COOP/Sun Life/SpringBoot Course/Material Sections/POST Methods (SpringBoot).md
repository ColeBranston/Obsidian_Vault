**Note:** GET methods are basically just fetching the url with Request mapping, no value or method fields required. Basically, whatever we've been doing before this. 

Post methods are methods that take in a payload or body and use it for a programmed function such as adding to a database.

In Spring Boot, a Post Request Endpoint is created by using the `@RequestMapping`annotation with a `value` endpoint and `method`variable specifying what type of request is used by calling on the `RequestMethod` class. The payload is then taken in similar to a @PathVariable with `@RequestBody`

Ex.

```Java

@RequestMapping(value="/surveys/{id}/questions", method = RequestMethod.POST)  
public List<Question> addNewSurveyQuestion(@PathVariable String id, @RequestBody Question question){  
  
    surveyService.addNewSurveyQuestion(id, question);  
    Survey survey = surveyService.retrieveSurvey(id);  
  
    if (survey == null){  
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);  
    }  
  
    return survey.getQuestions();  
}

```

**Notice**:

- `@RequestMapping` is used with the value: "/surveys/{id}/questions"
- `method` is specified by calling on `RequestMethod` with the `.POST` method.
- Payload is specified with `@RequestBody` with variable type Question called "question"

# With JPA

```Java

@RequestMapping(value = "/addUser", method = RequestMethod.POST)  
public void addUser(@RequestBody UserDetails user){  
    repository.save(user);  
}

```

***Note***:
- `repository.save(user);` will automatically save the user instance to the connected database