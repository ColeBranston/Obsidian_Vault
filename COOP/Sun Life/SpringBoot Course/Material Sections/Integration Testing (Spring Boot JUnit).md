Up until this point, all code has been written in the directory src/main/java. Instead, all tests will be written in the src/test/java directory.

Here is an example of the starter test that is automatically created by Spring Initializer:

```Java
package com.in28mintues.springboot.first_rest_api;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.boot.test.context.SpringBootTest;  
  
@SpringBootTest  
class FirstRestApiApplicationTests {  
  
    @Test  
    void contextLoads() {  
    }  
  
}
```

**This is used similar to the SpringBoot Application class. It will run all tests created in the src/tests/java directory**

***Notice:*** 
- `@SpringBootTest` annotation is used before the test class is created to initialize it.
-  `@Test` is used to initialize a test. in this case the  `contextLoads()` method loads all unit tests, but normally the method name is the name of the test.

Ex.

```Java
package com.in28mintues.springboot.first_rest_api.survey;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.boot.test.context.SpringBootTest;  
  
@SpringBootTest  
public class surveyResourceIT {  
  
    @Test  
    void retrieveQuestion_basicScenario(){  
  
    }  
}
```

***Note:*** 

- Same thing with the `@SpringBootTest` annotation 

***TIP***: 

	you can use the """ block to put full JSON messages in.

For example:

```Java
String str = """  
        { "id": "question1",
		"description": "Most Popular Cloud Platform Today",
		"options": [ "AWS","Azure","Google Cloud","Oracle Cloud"],    "correctAnswer": "AWS"}        """;
```

# Final Basic Unit Test

```Java
package com.in28mintues.springboot.first_rest_api.survey;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.test.context.SpringBootTest;  
import org.springframework.boot.test.web.client.TestRestTemplate;  
import org.springframework.http.ResponseEntity;  
  
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)  
public class surveyResourceIT {  
  
    String str = """  
            {                "id": "question1",                "description": "Most Popular Cloud Platform Today",                "options": [                    "AWS",                    "Azure",                    "Google Cloud",                    "Oracle Cloud"                ],                "correctAnswer": "AWS"            }            """;  
  
    private static String SPECIFIC_QUESTION_URL = "/surveys/survey1/questions/question1";  
  
    @Autowired  
    private TestRestTemplate template;  
  
    @Test  
    void retrieveQuestion_basicScenario(){  
        ResponseEntity<String> responseEntity = template.getForEntity(SPECIFIC_QUESTION_URL, String.class);  
        System.out.println(responseEntity.getBody());  
        System.out.println(responseEntity.getHeaders());  
    }  
}
```

### Notice:

- `@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)` is used to configure the test to run on a random port.
	- `@Autowired` automatically injects the TestRestTemplate and configures the random port to the template.
-  `private static String SPECIFIC_QUESTION_URL = "/surveys/survey1/questions/question1";` is used to instantiate the endpoint to be tested
- `ResponseEntity<String> responseEntity = template.getForEntity(SPECIFIC_QUESTION_URL, String.class);` automatically gets the response using the url: `SPECIFIC_QUESTION_URL` and expected response: `String.class`.
- Printing out the `responseEntity.getBody()` and the `responseEntity.getHeaders()`

