In order to use this configuration class, you must also include the annotation `@Component` to include it in the Spring framework. This is imported from org.springframework.stereotype.Component. 

**Final Example (With Getter and Setter Methods):** 

```Java
import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  
  
@ConfigurationProperties(prefix = "currency-service")  
@Component //Notice the newly implemented @Component making it function 
public class CurrencyServiceConfiguration {  
  
    private String url;  
    private String username;  
    private String key;  
  
    public String getUrl(){  
        return url;  
    }  
    public void setUrl(String url){  
        this.url = url;  
    }  
    public String getUsername(){  
        return username;  
    }  
    public void setUsername(String username){  
        this.username = username;  
    }  
    public String getKey() {  
        return key;  
    }  
    public void setKey(String key){  
        this.key = key;  
    }  
  
}
```
