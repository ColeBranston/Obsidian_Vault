```Java
@Test  
void retrieveSurveyQuestion_basicScenario() throws Exception{  
    RequestBuilder requestBuilder =  
            MockMvcRequestBuilders.get(SPECIFIC_QUESTION_URL).accept(MediaType.APPLICATION_JSON);  
  
    Question question = new Question("question1",  
            "Most Popular Cloud Platform Today", Arrays.asList(  
            "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "AWS");  
  
    when(surveyService.findSpecificQuestion("survey1", "question1")).thenReturn(question);  
  
    MvcResult mvcResult = mockMVC.perform(requestBuilder).andReturn();  
  
    String expectedResponse = """  
           {"id":"question1",  
           "description":"Most Popular Cloud Platform Today",  
           "options":["AWS","Azure","Google Cloud","Oracle Cloud"],  
           "correctAnswer":"AWS"}  
           """;  
  
    JSONAssert.assertEquals(expectedResponse, mvcResult.getResponse().getContentAsString(), false);  
    assertEquals(200, mvcResult.getResponse().getStatus());
```

***Note:***

1. Similar to the 404 scenario, but contains both a Question instance and a simulation of the service's functionality using the line:
	- `when(surveyService.findSpecificQuestion("survey1", "question1")).thenReturn(question);`
→ Mockito's `when()` method is used to simulate what happens in the code and`.thenReturn` mocks the services functionality, $\therefore$ returning what would normally be returned if the whole app was running.

2. The endpoint returns the found question (previously returned from the mocked service) and is compared to an expected response using a JSONAssert. Additionally, the response code is checked through one last Assert as well. 