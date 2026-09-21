`
`@Autowired` is a Java annotation that's used to "auto inject"/use an instance of a class in a REST controller class.  From what I've seen its used mostly used when only one instance of a class is needed such as with Configuration Classes. 

Ex.

```Java
package com.in28minutes.springboot.learn_spring_boot;  
  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
  
import java.util.Arrays;  
import java.util.List;  
  
@RestController  
public class CurrencyConfigurationController {  
  
    @Autowired  
    private CurrencyServiceConfiguration configuration;  
  
    @RequestMapping("/currency-configuration")  
    public CurrencyServiceConfiguration retrieveAllCourses(){  
        return configuration;  
    }  
  
}


```

**Notice:** In SpringBoot, you clarify that the auto injected class is a configuration so that it works. You do this by placing `configuration` after you initialize the class. 

