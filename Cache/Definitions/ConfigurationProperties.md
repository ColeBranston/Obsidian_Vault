Although a majority of the configs are done for you in Intellij ide, custom configs must be manually inputted yourself. Configs such as key values like passwords and usernames for a specific service must be created separately. 

The annotation `@ConfigurationProperties`, imported from org.springframework.boot.context.properties.ConfigurationProperties, allows programmers to set a class as a config class with a certain prefix. Ex.

```Java
@ConfigurationProperties(prefix = "currency-service")  
public class CurrencyServiceConfiguration {  
  
    private String url;  
    private String usernmae;  
    private String key;  
}
```

You can see how this applies to our application.properties file for all our configs:

```
spring.application.name=learn-spring-boot  
logging.level.org.springframework=debug  
  
currency-service.url=  
currency-service.username=  
currency-service.key=

```
