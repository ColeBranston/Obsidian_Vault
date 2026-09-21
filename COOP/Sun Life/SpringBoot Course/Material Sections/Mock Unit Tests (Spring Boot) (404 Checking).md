```Java

package com.in28mintues.springboot.first_rest_api.survey;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;  
import org.springframework.boot.test.mock.mockito.MockBean;  
import org.springframework.http.MediaType;  
import org.springframework.test.web.servlet.MockMvc;  
import org.springframework.test.web.servlet.MvcResult;  
import org.springframework.test.web.servlet.RequestBuilder;  
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;  
  
//SurveyResource  
@WebMvcTest(controllers = SurveyResource.class)  
public class SurveyResourceTest {  
  
    @MockBean  
    private SurveyService surveyService;  
  
    @Autowired  
    private MockMvc mockMVC;  
  
    //Mock -> surveyService.findSpecificQuestion(id, questionID);  
  
    //fire a request    // localhost:5050/surveys/{id}/questions/{questionID} GET  
    private static String SPECIFIC_QUESTION_URL = "http://localhost:5050/surveys/survey1/questions/question1";  
    @Test  
    void retrieveSurveyQuestion_404Scenario() throws Exception{  
        RequestBuilder requestBuilder =  
                MockMvcRequestBuilders.get(SPECIFIC_QUESTION_URL).accept(MediaType.APPLICATION_JSON);  
  
        MvcResult mvcResult = mockMVC.perform(requestBuilder).andReturn();  
  
        System.out.println(mvcResult.getResponse().getContentAsString());    
    
	    assertEquals(404, mvcResult.getResponse().getStatus());
    }  
}

```

***Note*:**

- **`@WebMvcTest(controllers = SurveyResource.class)`** 
	- Specifies that this is a web MVC test focused on the `SurveyResource` controller.
	- Isolates the test to the controller layer, ignoring other components such as services or repositories.
	
- **`@MockBean private SurveyService surveyService;`** 
	- Mocks the `SurveyService` bean, allowing you to control its behavior during the test. 
	- Ensures that no real service methods are invoked, isolating the controller for testing.
	
- **`@Autowired private MockMvc mockMVC;`** 
	- Injects an instance of `MockMvc`, enabling the simulation of HTTP requests and responses in the test.

- **`RequestBuilder requestBuilder = MockMvcRequestBuilders.get(SPECIFIC_QUESTION_URL).accept(MediaType.APPLICATION_JSON);`** 
	- Constructs a GET request to the specified URL and sets the expected response format to JSON. - This line sets up the HTTP request to be sent during the test.

- **`MvcResult mvcResult = mockMVC.perform(requestBuilder).andReturn();`** 
	- Executes the request using `MockMvc` and captures the result in `MvcResult`. 
	- The `perform` method simulates sending the HTTP request, and `andReturn` stores the response.

***Additionally...***

→ The reason that this above test returns 404 is because the scenario only mocks the existence of a SurveyService class but rather not whats actually contained within the service.
$\therefore$ when the endpoint is called, the resource attempts to use the service, but instead returns null because its contents and functions haven't been mocked as well. → Additionally, the 404 error code is returned as apart of the code itself rather than anything built in.

***Lastly...***

`System.out.println(mvcResult.getResponse().getContentAsString());` is required to print the response, and finally the assert checks if the status is 404