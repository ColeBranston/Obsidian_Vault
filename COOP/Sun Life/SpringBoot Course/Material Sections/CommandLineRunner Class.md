
The third of the three classes is the Entity Command Line Runner. In this class developers will call any of the methods required to interact with the database from the [[Repository Interface]] Class.

To create the Command Line Runner class, the name of it follows the syntax: <Entity_Name>CommandLineRunner.

Ex.

![[Pasted image 20240805172747.png]]

Where UserDetails is the Entity name. 

To create the Command Line Runner class in the codebase a develop will use the following structure: 

```Java
@Component  
public class UserDetailsCommandLineRunner implements CommandLineRunner {  
  
    public UserDetailsCommandLineRunner(UserDetailsRepository repository) {  
        super();  
        this.repository = repository;  
    }   
    
    private Logger logger = LoggerFactory.getLogger(getClass());  
  
    private UserDetailsRepository repository;  
	
    public void run(String...  args) throws Exception {  
        
    }  
}
```

**Notice:**

- every time a CommandLineRunner Class is created its started with the `@Component` annotation to initialize the class to be managed by Spring.
- CommandLineRunners also implement the `CommandLineRunner`to inherit the proper fields and values to function properly.
- also contains a Spring Injection constructor that takes in the concerned Entity [[Repository Interface]] as a repository class and assigns it the the inherited repository field.
- A logger class is created using the `private Logger logger = LoggerFactory.getLogger(getClass());` line
- `private UserDetailsRepository repository;` This private field holds the reference to the injected `UserDetailsRepository` instance. The class uses this field to call repository methods for performing database operations such as saving and querying user details.

**Lastly,**

all methods are called within the ...

```Java
public void run(String...  args) throws Exception {  
        
    }  
```

Block.

A final CommandLineRunner may look as follows: 

```Java
package com.in28mintues.springboot.first_rest_api.user;  
  
import org.apache.catalina.User;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.boot.CommandLineRunner;  
import org.springframework.stereotype.Component;  
  
import java.util.List;  
  
@Component  
public class UserDetailsCommandLineRunner implements CommandLineRunner {  
  
    public UserDetailsCommandLineRunner(UserDetailsRepository repository) {  
        super();  
        this.repository = repository;  
    }  
  
    private Logger logger = LoggerFactory.getLogger(getClass());  
  
    private UserDetailsRepository repository;  
  
  
    public void run(String...  args) throws Exception {  
        repository.save(new UserDetails("Ranga", "Admin"));  
        repository.save(new UserDetails("Cole", "Gooner"));  
        repository.save(new UserDetails("Jack", "Loser"));  
  
//        List<UserDetails> users = repository.findAll();  
  
        List<UserDetails> userRoles = repository.findByRole("Admin");  
        List<UserDetails> userNames = repository.findByName("Cole");  
  
  
        userRoles.forEach(user -> logger.info(user.toString()));  
        userNames.forEach(user -> logger.info(user.toString()));  
    }  
}
```

**Key Features (Very Important):**

- `repository.save(new UserDetails("Ranga", "Admin"));` 
→ Creates a new UserDetails Entity Entry in the database with the name "Ranga" and the role "Admin". Same for each line with the name and role differing.
- `List<UserDetails> userRoles = repository.findByRole("Admin");` 
→ Calls a method from the repository interface that finds all the data entries with the role as Admin. **Method defined in Interface**
- `userRoles.forEach(user -> logger.info(user.toString()));` 
→ Uses the logger class to log any live changes involved with assigned List variables.
→ For this to work the line: `spring.jpa.show-sql=true` must be added to the application.properties file. 

