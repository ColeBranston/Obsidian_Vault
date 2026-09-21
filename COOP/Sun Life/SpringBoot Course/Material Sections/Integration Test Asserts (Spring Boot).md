
Asserts are comparisons between the expected response and the response itself from an endpoint. 

Ex.

```Java
package com.in28mintues.springboot.first_rest_api.survey;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.test.context.SpringBootTest;  
import org.springframework.boot.test.web.client.TestRestTemplate;  
import org.springframework.http.ResponseEntity;  
  
import static org.junit.jupiter.api.Assertions.assertEquals;  
  
  
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)  
public class surveyResourceIT {  
  
    private static String SPECIFIC_QUESTION_URL = "/surveys/survey1/questions/question1";  
  
    @Autowired  
    private TestRestTemplate template;  
  
    @Test  
    void retrieveQuestion_basicScenario(){  
        ResponseEntity<String> responseEntity = template.getForEntity(SPECIFIC_QUESTION_URL, String.class);  
  
        String expectedResponse =  
            """  
            {"id":"question1","description":"Most Popular Cloud Platform Today","options":["AWS","Azure","Google Cloud","Oracle Cloud"],"correctAnswer":"AWS"}            """;  
        assertEquals(expectedResponse.trim(), responseEntity.getBody());  
        System.out.println(responseEntity.getBody());  
        System.out.println(responseEntity.getHeaders());  
    }  
}
```

***Notice:*** 
- I've created a new String called `expectedResponse` that uses text blocks to contain the expected json response. In this case, the response should be one straight line as follows: 
![[Pasted image 20240820020733.png]]
- This is required for the `assertEquals()` method imported from the `org.junit.jupiter.api.Assertions.assertEquals` static class; that compares an expected response, `expectedResponse` (in this case the white space is trimmed with the`.trim()`) to the actual `responseEntity`.
→ If the expected response matches the actual response (`responseEntity.getBody()`), the test will pass.

### That Being Said...

→ This is obviously not a good way of comparing responses since the expected String must be in one line and not like how normal JSON responses look with spaces and indents.

# The Holy Grail Solution (JSONAssert)

Are you looking for a method to compare an expected response to an actual response excluding all white space? What if there was an error would you want your unit test to tell you exactly what the differences in message were? JSONAssert comes prepared.

use `JSONAssert.assertEquals()` method to compare an expected response to an actual response body, excluding all white space or indents. JSONAssert's also give the exact difference in messages so a developer knows why their unit test has failed. 

Ex.

```Java
package com.in28mintues.springboot.first_rest_api.survey;  
  
import org.json.JSONException;  
import org.junit.jupiter.api.Test;  
import org.skyscreamer.jsonassert.JSONAssert;  
  
public class JSONAssertUnitTest {  
  
    @Test  
    void jsonAssert_learningbasics() throws JSONException {  
  
        String expectedResponse =  
                """  
                {"id":"question1","description":"Most Popular Cloud Platform Today","options":["AWS","Azure","Google Cloud","Oracle Cloud"],"correctAnswer":"AWS"}  
                """;  
  
        String actualResponse =  
                """  
                   {"id":"question1",                   "description":"Most Popular Cloud Platform Today",                   "options":["AWS","Azure","Google Cloud","Oracle Cloud"],                   "correctAnswer":"AWS"}                """;  
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);  
    }  
}
```

***Notice:***
- Any test class that uses JSONAssert must throw the exception: `JSONException` since when the comparison fails that's the type of error it throws, but its fine since we don't care about the error itself just that an error takes place and the test fails
- same as normal `assertEquals`, JSONAssert takes an expected response and an actual response ie. `responseEntity.getBody()`, but it also requires a Boolean to indicate how strict it can be with its comparison.
	- In this case, its `true`, meaning the response body must be identical to the expected response, otherwise if it were `false` the comparison would only be between the fields that were present in the expected response. → This is helpful when a response contains fields that don't change and fields that do, that way a developer can just test the fields that shouldn't change. 

Lastly, when an error takes place, the error log looks as follows:
![[Pasted image 20240820023733.png]]
## To Check Status Codes...

```Java
assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
```

***Note*:** This checks if the status code falls between 200 - 299, otherwise it will return false and break the test
## To Check Response Format Ex. JSON


```Java
assertEquals("application/json", responseEntity.getHeaders().get("Content-Type").get(0));
```

***Note:*** First parameter is the expected field, second is how the header is searched ie. in the responseEntity's headers with the field name "Content-Type" (Getting the first instance because there can be multiple headers with the same name).

