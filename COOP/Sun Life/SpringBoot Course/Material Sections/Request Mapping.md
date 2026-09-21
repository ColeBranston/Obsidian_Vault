Request Mapping is a Java annotation that allows the programmer to map a URL to a specific method. Ex.

```Java
@RequestMapping("/courses")  
public List<Course> retrieveAllCourses(){  
    return Arrays.asList(  
            new Course (1, "Learn AWS", "in 28minutes"),  
            new Course (1, "Learn DevOPS", "in 28minutes")  
    );  
}
```

This Request Mapping annotation is used to map the method "retrieveAllCourses()" to the URL "/courses" of what ever domain you'd be using, in this instance localhost:8080

$\therefore$ localhost:8080/courses

return the previously mentioned method

Otherwise, if `@Controller` is used for SpringBoot Bean the developer can use `@ResponseBody` to properly convert any response to an endpoint in JSON format. 

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

