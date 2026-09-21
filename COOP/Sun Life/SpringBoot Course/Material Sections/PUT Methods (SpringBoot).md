
In Spring Boot, a PUT Request Endpoint is created by using the `@RequestMapping`annotation with a `value` endpoint and `method`variable specifying what type of request is used by calling on the `RequestMethod` class. The payload is then taken in similar to a @PathVariable with `@RequestBody`

```Java

@RequestMapping(value = "/surveys/{id}/questions/{questionID}", method = RequestMethod.PUT)  
public ResponseEntity<Object> updateSurveyQuestion(@PathVariable String id, @PathVariable String questionID, @RequestBody Question update){  
  
    String returnedID = surveyService.updateSurveyQuestion(id, questionID, update);  
  
    if (returnedID == null){  
        return ResponseEntity.notFound().build();  
    }  
  
    return ResponseEntity.status(200).build();  
  
}

```

- `@RequestMapping` is used with the value: "/surveys/{id}/questions/{questionID}"
- `method` is specified by calling on `RequestMethod` with the `.PUT` method.
- Payload is specified with `@RequestBody` with variable type Question called "update"

# With JPA

```Java
@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)  
public ResponseEntity<Object> updateUser(@RequestBody UserDetails user){  
    if(repository.existsByName(user.getName())){  
        UserDetails currentUser = repository.findByName(user.getName());  
  
        currentUser.setRole(user.getRole());  
  
        repository.save(currentUser);  
  
        return ResponseEntity.status(200).build();  
    }else{  
        return ResponseEntity.notFound().build();  
    }
```

***Note***:
- You have to get the current user (`currentUser`) and set its values according to the given user's info (`user`), in this case name and role. Lastly, you must save that same user back to the database using: `repository.save(currentUser);`

