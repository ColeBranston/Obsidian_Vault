 Same as normal create a new test class with `SpringBootTest` (@ a random port) and use the `@Test` annotation to create a test. Also primarily will use the `TestRestTemplate` class for exchanging data.

Ex.

```Java

package com.in28mintues.springboot.first_rest_api.survey;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.test.context.SpringBootTest;  
import org.springframework.http.HttpEntity;  
import org.springframework.http.HttpHeaders;  
import org.springframework.http.HttpMethod;  
import org.springframework.http.ResponseEntity;  
import org.springframework.boot.test.web.client.TestRestTemplate;  
  
import static org.junit.jupiter.api.Assertions.assertEquals;  
import static org.junit.jupiter.api.Assertions.assertTrue;  
  
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)  
public class AddQuestionTest {  
  
  
    @Autowired  
    private TestRestTemplate template;  
  
    public static String endpoint_URL = "/surveys/survey1/questions";  
  
  
    @Test  
    public void addNewSurveyQuestionIT_basicScenario(){  
  
        String requestBody = """  
                {                    
                "description": "This is a test message",                    "options":["pass","fail","pass","fail"],
		            "correctAnswer": "pass?"                
                }
                """;  
  
  
        HttpHeaders headers = new HttpHeaders();  
        headers.add("Content-Type", "application/json");  
  
        HttpEntity<String> httpEntity = new HttpEntity<String>(requestBody, headers);  
  
        ResponseEntity<String> responseEntity = template.exchange(endpoint_URL, HttpMethod.POST, httpEntity, String.class);  
  
        System.out.println(responseEntity.getHeaders());  
  
        //[Location:"http://localhost:64899/surveys/survey1/questions/4221818852", Content-Length:"0", Date:"Fri, 23 Aug 2024 07:19:59 GMT", Keep-Alive:"timeout=60", Connection:"keep-alive"]  
  
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful()); //checks if the status code is 200  
        String locationHeader = responseEntity.getHeaders().get("Location").get(0);  
        assertTrue(locationHeader.contains("/surveys/survey1/questions/"));  
  
        template.delete(locationHeader);  
          
    }  
}

```

***NOTE:***

- `requestBody` variable is the payload that the test will send
- The `HttpHeaders` object: `headers` is created to add message headers to, in this case `"Content-Type: application/json"` 

Next...

- a `ResponseEntity` is created and uses the TestRestTemplate: `template` with the `.exchange` method to send the body
	- The `.exchange` method takes in the endpoint the message is sent to, the type of request, the message itself: `httpEntity`, and the expected response type, in this case: `String.class`

Lastly...

- The test checks the status code with the line: 

```Java
assertTrue(responseEntity.getStatusCode().is2xxSuccessful()); 
```

-  The test gets the location from the locationHeader of the message (shown how to return that in [[Creating Secure IDs & Response Locations]]) with this line:

```Java
String locationHeader = responseEntity.getHeaders().get("Location").get(0); 
```

- Then the test takes the location and uses assertTrue to determine if it contains the correct path.

### Very Important

→ The last step of this is to delete the added question (sent message) by using `TestRestTemplate` again with this line:

```Java
template.delete(locationHeader);  
```

