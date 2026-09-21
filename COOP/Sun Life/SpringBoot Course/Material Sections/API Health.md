Check on API Health using the Actuator dependency:

```maven
<dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-actuator</artifactId>  
</dependency>	
```

This dependency exposes an endpoint with the url "/actuator", providing active api health updates by saying "up" or "down".

Ex.

![[f1964435bafe2b5d083b86fca5f963fe.mp4]]

To add more Health information place the code line:

	management.endpoints.web.exposure.include=*

in your application.properties file. This line will reveal all endpoints in the actuator.

**Otherwise** configure enter certain endpoints you want to access. Ex:

	management.endpoints.web.exposure.include=beans,health, configprops,env,metrics

**Useful Endpoints:**

1. ***beans*** → Show all spring beans used in the backend application → Help determine if a bean is configured
2. **health*** → Tells you the current status of an application either "UP" or "DOWN"
3. ***configprops*** → shows all things you can configure from application.properties → shows configuration classes we've created and current values as well as their origin from where the field was picked up
4. **env*** → Displays the current environment → Spring Profile (DEV,PROD), Java version, Encoding, Class path
5. ***metrics*** → gives a list of metrics concerning certain values.
	- Such as value "http.server.requests" → search:
		localhost:<port>/actuator/metrics/http.server.requests

**Logging**

In order to enable logging, you must add this line to your application.properties

Ex.

```
spring.application.name=myfirstwebapp  
server.port=8080  
  
logging.level.org.springframework=debug
```
