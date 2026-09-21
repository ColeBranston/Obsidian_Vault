```Java
@Test  
void addNewSurveyQuestion_basicSenario() throws Exception{  
  
    //status: 201  
    //location: http://localhost:50260/surveys/survey1/questions/1671112124  
    String ADD_QUESTION_URL = "http://localhost:5050/surveys/survey1/questions";  
  
    String requestBody = """  
           {"description": "This is a test message",
           "options": ["pass","fail","pass","fail"],
           "correctAnswer": "pass?"}            
           """;  
  
    when(surveyService.addNewSurveyQuestion(anyString(), any())).thenReturn("SOME_ID");  
  
    RequestBuilder requestBuilder = MockMvcRequestBuilders.post(ADD_QUESTION_URL)  
            .accept(MediaType.APPLICATION_JSON)  
            .content(requestBody)  
            .contentType(MediaType.APPLICATION_JSON);  
  
    MvcResult mvcResult = mockMVC.perform(requestBuilder).andReturn();  
  
    MockHttpServletResponse response = mvcResult.getResponse();  
    String locationHeader = response.getHeader("Location");  
  
    assertEquals(201, response.getStatus());  
    assertTrue(locationHeader.contains("/surveys/survey1/questions/SOME_ID"));  
}
```

***Note:***

- The `requestBody` was added using string blocks to send to the mocked service.
- Similar to previous the `when()` method is used, except it uses the `anyString()` and `any()` (meaning any object → assumes the Question class) and returns "SOME_ID" to mock what would normally be a randomly generated String.

***Next...***

- The `RequestBuilder` instance, `requestBuilder` is similar to last time, except uses the `.post` method to the endpoint. **Additionally,** it contains a `.content()` method that sends the `requestBody` String.  **Lastly,** it defines the `.contentType()` as `MediaType.APPLICATION_JSON`.

***Lastly...***

- Similar to the POST Integration Test you check the locationHeader with `response.getHeader("Location")` and then check it with `assertTrue()`
→ using the `.contains()` method to check for the path