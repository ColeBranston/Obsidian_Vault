For unit testing its the easiest fix, just implement the line `@AutoConfigureMockMvc(addFilters = false)`

Ex.

```Java
//SurveyResource  
@WebMvcTest(controllers = SurveyResource.class)  
@AutoConfigureMockMvc(addFilters = false)  
public class SurveyResourceTest {  
  
    @MockBean  
    private SurveyService surveyService;  
  
    @Autowired  
    private MockMvc mockMVC;  
  
    //Mock -> surveyService.findSpecificQuestion(id, questionID);

...
...
...
```



### For Integration Testing...

You must add headers to the message using the `template.exchange()`method and the 
`Authorization` header.

 Ex.
 
```Java

HttpHeaders headers = createHTTPContentTypeandAuthHeaders();  
  
HttpEntity<String> httpEntity = new HttpEntity<String>(requestBody, headers);  
  
ResponseEntity<String> responseEntity = template.exchange(endpoint_URL, HttpMethod.POST, httpEntity, String.class);

...
...
...

public static HttpHeaders createHTTPContentTypeandAuthHeaders() {  
    HttpHeaders headers = new HttpHeaders();  
    headers.add("Content-Type", "application/json");  
    headers.add("Authorization", "Basic "+performBasicAuthEncoing("admin", "password"));  
    return headers;  
}  
  
public static String performBasicAuthEncoding(String user, String password) {  
    String combined = user +":" + password;  
    byte[] encodedBytes = Base64.getEncoder().encode(combined.getBytes());  
  
    return new String(encodedBytes);  
}
```

**Note:**

- In the line: `HttpEntity<String> httpEntity = new HttpEntity<String>(requestBody, headers);` if it was a get request, the requestBody field would be `null` 

1. In the `createHTTPContentTypeandAuthHeaders()` method a new `HttpHeaders` instance is created, following additions of the headers `"Content-Type"` and `Authorization`.

	- Also... `performBasicAuthEncoding()` is called with the expected form input, returning an encoded version of the user:password `String`.
	- The headers are then returned

2. The entity is then created through the line `HttpEntity<String> httpEntity = new HttpEntity<String>(requestBody, headers);`

3. Using the line `ResponseEntity<String> responseEntity = template.exchange(endpoint_URL, HttpMethod.POST, httpEntity, String.class);` the entity is sent, using the newly added headers to get the request through security. 

***Afterwards***...

Tests should success.