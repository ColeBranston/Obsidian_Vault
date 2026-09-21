**`@Component`** is used to specify a Spring Class a.k.a. Spring Bean specifically for configuration

Ex.

```Java
@ConfigurationProperties(prefix = "currency-service")  
@Component  
public class CurrencyServiceConfiguration {  
  
    private String url;  
    private String username;  
    private String key;  
  
    public String getUrl() {  
        return url;  
    }  
  
    public void setUrl(String url) {  
        this.url = url;  
    }  
  
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getKey() {  
        return key;  
    }  
  
    public void setKey(String key) {  
        this.key = key;  
    }  
}
```

**`@Service`** is used to specify a Spring Service class that provides "Business/Development Logic" without exposing an endpoint

Ex.

```Java
@Service  
public class surveyService {  
  
    private static List<Survey> surveys = new ArrayList<>();  
  
    static {  
        Question question1 = new Question("Question1",  
                "Most Popular Cloud Platform Today", Arrays.asList(  
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "AWS");  
        Question question2 = new Question("Question2",  
                "Fastest Growing Cloud Platform", Arrays.asList(  
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "Google Cloud");  
        Question question3 = new Question("Question3",  
                "Most Popular DevOps Tool", Arrays.asList(  
                "Kubernetes", "Docker", "Terraform", "Azure DevOps"), "Kubernetes");  
  
        List<Question> questions = new ArrayList<>(Arrays.asList(question1,  
                question2, question3));  
  
        Survey survey = new Survey("Survey1", "My Favorite Survey",  
                "Description of the Survey", questions);  
  
        surveys.add(survey);  
    }  
  
}
```

**`@RestContoller`** is used to specify a Spring MVC REST API class that exposes an endpoint.

Ex.

```Java
@RestController  
public class SayHelloController {  

    @RequestMapping("/say-hello")  
    public String sayHello(){  
        return "Hello! What are you learning today?";  
    }  
    
}
```
