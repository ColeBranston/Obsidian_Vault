  
# CORS Support Configuration 

- Spring Security  CORS (Cross-Origin Resource Sharing) allows a web application running at one domain to make requests to another domain. In Spring Boot, CORS can be configured globally or for specific endpoints.  

## Global CORS Configuration Example  

```java 

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.web.servlet.config.annotation.CorsRegistry; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;  

@Configuration 
public class WebConfig implements WebMvcConfigurer {      

	@Override     
	public void addCorsMappings(CorsRegistry registry) {   
	
		registry.addMapping("/**") // Allow CORS on all paths                 
		.allowedOrigins("http://localhost:3000", "http://example.com") // Specify allowed origins (use * for all)                 
		.allowedMethods("GET", "POST", "PUT", "DELETE") // Specify allowed HTTP methods                 .allowedHeaders("*") // Allow any headers        
		.allowCredentials(true); // Allow credentials (e.g., cookies, authorization headers)     
	} 
}

```

### Explanation:

- **@Configuration**: Marks this class as a Spring configuration component.
- **WebMvcConfigurer**: Implements Spring’s `WebMvcConfigurer` interface to customize Spring MVC's CORS settings.
- **addCorsMappings(CorsRegistry registry)**: The method used to configure CORS globally.
    - **registry.addMapping("/**")**: Applies CORS configuration to all endpoints in the application.
    - **allowedOrigins("http://localhost:3000", "[http://example.com](http://example.com)")**: Specifies the allowed domains that can send cross-origin requests. Replace with your actual frontend URL(s). You can use `*` for all origins, but it’s generally discouraged for security reasons.
    - **allowedMethods("GET", "POST", "PUT", "DELETE")**: Specifies which HTTP methods are allowed for CORS requests.
    - **allowedHeaders("*")**: Allows all headers in CORS requests.
    - **allowCredentials(true)**: Allows credentials like cookies or authorization headers to be sent with CORS requests.

---

## CORS Configuration for Security Filter Chain

If you want to configure CORS in your `SecurityFilterChain`, you can do it like this:

```Java
import org.springframework.security.config.annotation.web.builders.HttpSecurity; 
import org.springframework.security.web.SecurityFilterChain; 
import org.springframework.context.annotation.Bean; 
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration 
@EnableWebSecurity 
public class SecurityConfig {  

	@Bean    
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {          
	
	http.cors(withDefaults()) // Enables CORS support             
	.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())             .httpBasic(withDefaults())
	.csrf(csrf -> csrf.disable()); // Disable CSRF for APIs         
	
	return http.build();   
	  
	} 
}
```

### Explanation:

- **http.cors(withDefaults())**: Enables CORS support using a global configuration (`WebConfig` defined above) or defaults.
- **withDefaults()**: Applies default CORS behavior unless overridden by other configurations.

This setup allows you to fine-tune CORS behavior depending on where it’s needed in your application.
