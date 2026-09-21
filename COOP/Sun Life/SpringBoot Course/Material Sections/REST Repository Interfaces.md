In Spring Boot, REST repository interfaces provide a convenient way to create RESTful web services that interact with a database. These interfaces are part of Spring Data REST, which automatically exposes JPA repositories as RESTful endpoints. 

Ex.

```Java
package com.in28mintues.springboot.first_rest_api.user;  
  
import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.data.repository.PagingAndSortingRepository;  
import org.springframework.data.rest.core.annotation.RepositoryRestResource;  
  
import java.util.List;  
  
public interface UserDetailsRestRepository extends PagingAndSortingRepository<UserDetails, Long> {  
     
}
```

**Notice:** Its identical to a normal repository interface but it extends from the PagingAndSortingRepository class.

→ This allows POST requests to send data directly to a database.

A code base in the backend that would send data to the database would look like as follows:

```Java
package com.in28mintues.springboot.first_rest_api.user;  
  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController  
public class UserController {  
  
    private final UserDetailsRepository userRepository;  
  
    public UserController(UserDetailsRepository userRepository) {  
        this.userRepository = userRepository;  
    }  
  
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)  
    public void addUser(@RequestBody UserDetails user){  
        userRepository.save(user);  
    }  
}
```

**Note:** The previous example takes in a user as a response body and saves it in the injected repository interface. This is allowed through the other interface `UserDetailsRestRepository`.

- The line `userRepository.save(user);` is what saves the payload (aka a User) to the database.