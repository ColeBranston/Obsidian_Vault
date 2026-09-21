Delete methods are similar to POST methods in that they require a value endpoint and a specified RequestMethod.

```Java
@RequestMapping(value = "/surveys/{id}/questions/{questionID}", method = RequestMethod.DELETE)  
public ResponseEntity<Object> deleteSurveyQuestion(@PathVariable String id, @PathVariable String questionID){  
  
    String returnedID = surveyService.deleteSurveyQuestion(id, questionID);  
  
    if (returnedID == null){  
        return ResponseEntity.notFound().build();  
    }  
  
    return ResponseEntity.status(200).build();  
  
}
```

**Note**: 
- Uses `RequestMapping`
- Endpoint specified as `value`
- specifies request type with `method = RequestMethod.DELETE`

**Additionally...**

- Response codes are returned from the method, but if a developer wanted to return another data type in addition to a specified response code they should refer to: [[Response Codes]]

# With JPA

```Java
@Transactional  
@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)  
public void deleteUser(@RequestBody UserDetails user){  
    repository.deleteByNameAndRole(user.getName(), user.getRole());  
}
```

***Note***:
- `@Transactional` is a semantic annotation used for DELETE requests
- `repository.deleteByNameAndRole(user.getName(), user.getRole());` will delete the user in the database as long as the user's name and role pair exist within the database.

*Alternatively*...

- You can use  `repository.deleteByName(user.getName());`, but instead it will delete all user's with that name.

**Regardless, the UserDetailsRepository will have these methods instantiated in them:**

```Java
void deleteByName(String name);  
void deleteByNameAndRole(String name, String role);
```

Note(I think you can also use the `@Transactional` on the methods in here to make code easier to read but I haven't checked)

