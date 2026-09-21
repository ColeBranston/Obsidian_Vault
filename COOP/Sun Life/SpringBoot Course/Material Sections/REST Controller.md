________

**Definition:** 

*The `@RestController` annotation in Spring is a convenient way to create RESTful web services. It’s a specialized version of the `@Controller` annotation that automatically includes `@ResponseBody`. This means that every request handling method in the controller class will automatically serialize return objects into the HttpResponse, typically in JSON or XML format*

Annotated command that reads:

_________

```Java
import org.springframework.web.bind.annotation.RestController;

@RestController  
```

Derived from import org.springframework.web.bind.annotation.RestController;

Allows you to expose an endpoint in a following class, automatically converting an endpoints response to JSON formatting. Ex.

```Java
package com.in28minutes.springboot.learn_spring_boot;  
  
  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController  
public class CourseController {  
  
    // /courses  
    // Course: id, name, author    
    
    }
    ```

Otherwise, a developer can use @Controller in the place of @RestController and add the extra line: @ResponseBody below the endpoint method annotation @RequestMapping("/url")

Ex.

```Java
package com.in28minutes.springboot.learn_spring_boot;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;
  
@Controller  
public class CourseController {  
  
    // /courses  
    // Course: id, name, author    
	Course AWS = new Course(AWS, "learnin28minutes",1);

	@RequestMapping("/course")
	@ResponseBody
	public Course returnAWS(){
		return AWS;
	}
}
    ```