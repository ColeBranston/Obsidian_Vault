### Dependency

```xml
<dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-security</artifactId>  
</dependency>
```

### Example Code

```Java
package com.in28mintues.springboot.first_rest_api.security;  
  
import static org.springframework.security.config.Customizer.withDefaults;  
  
import java.util.function.Function;  
  
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetails;  
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;  
import org.springframework.security.crypto.password.PasswordEncoder;  
import org.springframework.security.provisioning.InMemoryUserDetailsManager;  
import org.springframework.security.web.SecurityFilterChain;  
  
@Configuration  
public class SpringSecurityConfiguration {  
    //LDAP or Database  
    //In Memory  
    //InMemoryUserDetailsManager    //InMemoryUserDetailsManager(UserDetails... users)  
    @Bean  
    public InMemoryUserDetailsManager createUserDetailsManager() {  
  
        UserDetails userDetails1 = createNewUser("admin", "password");  
        UserDetails userDetails2 = createNewUser("ranga", "dummydummy");  
  
        return new InMemoryUserDetailsManager(userDetails1, userDetails2);  
    }  
  
    private UserDetails createNewUser(String username, String password) {  
        Function<String, String> passwordEncoder  
                = input -> passwordEncoder().encode(input);  
  
        UserDetails userDetails = User.builder()  
                .passwordEncoder(passwordEncoder)  
                .username(username)  
                .password(password)  
                .roles("USER","ADMIN")  
                .build();  
        return userDetails;  
    }  
  
    @Bean  
    public PasswordEncoder passwordEncoder() {  
        return new BCryptPasswordEncoder();  
    }  
  
    //All URLs are protected  
    //A login form is shown for unauthorized requests    //CSRF disable    //Frames  
    @Bean  
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {  
  
        http.authorizeHttpRequests(  
                auth -> auth.anyRequest().authenticated());  
        http.httpBasic(withDefaults());  
  
        http.csrf(csrf -> csrf.disable()); //So that POST or PUT work  
        http.headers(headers -> headers.frameOptions(frameOptionsConfig-> frameOptionsConfig.disable())); //disabled for using h2 console (unnecessary for normal use)  
  
        return http.build();  
    }  
  
}
```

# Spring Security Configuration - Detailed Breakdown  

___

## Package and Imports  

```java package com.in28mintues.springboot.first_rest_api.security;`

- **package com.in28mintues.springboot.first_rest_api.security**: Specifies the package location of the class, organizing code into namespaces.

`import static org.springframework.security.config.Customizer.withDefaults;`

- **withDefaults**: Imports a static method for applying default configuration to `HttpSecurity` settings, simplifying the code.

```Java
import java.util.function.Function; import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration; import org.springframework.security.config.annotation.web.builders.HttpSecurity; import org.springframework.security.core.userdetails.User; import org.springframework.security.core.userdetails.UserDetails; import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.security.provisioning.InMemoryUserDetailsManager; import org.springframework.security.web.SecurityFilterChain;
```

- **Function**: Enables the use of functional programming constructs, e.g., for encoding passwords.
- **@Configuration**: Marks the class as a Spring configuration class, allowing Spring to manage its beans.
- **HttpSecurity**: Used to configure web-based security.
- **UserDetails/User**: Represents a user in Spring Security.
- **BCryptPasswordEncoder**: Password encoder that uses the BCrypt hashing algorithm.
- **InMemoryUserDetailsManager**: A class to store user details in memory for authentication.
- **SecurityFilterChain**: Defines the security filter chain that applies security rules to requests.

---

## Class Definition

`@Configuration public class SpringSecurityConfiguration {`

- **SpringSecurityConfiguration**: The main class defining the security configuration for the application.

---

## User Details Management

```Java 
@Bean public InMemoryUserDetailsManager createUserDetailsManager() {     

	UserDetails userDetails1 = createNewUser("admin", "password");     
	UserDetails userDetails2 = createNewUser("ranga", "dummydummy");      

	return new InMemoryUserDetailsManager(userDetails1, userDetails2); 
	
}
```

- **@Bean**: Marks this method as a Spring-managed bean, so the return value (InMemoryUserDetailsManager) is used for authentication.
- **InMemoryUserDetailsManager**: Stores user details in memory for simple authentication scenarios. It’s created with two users (`admin` and `ranga`).
___
### Helper Method for User Creation

```Java

private UserDetails createNewUser(String username, String password) {  

	Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

	UserDetails userDetails = User.builder()             
	.passwordEncoder(passwordEncoder)             
	.username(username)             
	.password(password)             
	.roles("USER","ADMIN")             
	.build();   

	return userDetails; 
}

```

- **createNewUser**: Helper method that creates a new user with encoded passwords.
- **passwordEncoder**: Encodes passwords using a custom function.
- **User.builder()**: Builds the user with the specified username, password, and roles (`USER` and `ADMIN`).
- **roles("USER","ADMIN")**: Assigns the roles to the user, granting them permissions based on their roles.

---

## Password Encoder Bean

```Java
@Bean public PasswordEncoder passwordEncoder() { 

	return new BCryptPasswordEncoder(); 
}

```

- **passwordEncoder()**: Defines a password encoder bean using `BCryptPasswordEncoder` for hashing passwords. This ensures passwords are securely stored.

---

## Security Configuration (HTTP)

```Java
@Bean public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	http.authorizeHttpRequests(
	
		auth -> auth.anyRequest().authenticated());     
		
		http.httpBasic(withDefaults());      
		http.csrf(csrf -> csrf.disable()); //So that POST or PUT work     
		http.headers(headers -> 
		
		headers.frameOptions(frameOptionsConfig -> 
		frameOptionsConfig.disable())); //disabled for using h2 console (unnecessary for normal use)      
		return http.build(); }
```

- **SecurityFilterChain filterChain(HttpSecurity http)**: Configures the HTTP security for the application.
    - **authorizeHttpRequests**: Ensures that every request is authenticated (no public routes).
    - **httpBasic(withDefaults())**: Enables HTTP Basic authentication with default settings.
    - **csrf(csrf -> csrf.disable())**: Disables CSRF protection to allow non-browser clients to interact with POST/PUT requests without issues. Generally required when interacting with APIs.
    - **headers(frameOptionsConfig -> frameOptionsConfig.disable())**: Disables frame options to allow embedding of pages, useful for running the H2 database console.
- **http.build()**: Builds the security filter chain, applying the defined security rules.