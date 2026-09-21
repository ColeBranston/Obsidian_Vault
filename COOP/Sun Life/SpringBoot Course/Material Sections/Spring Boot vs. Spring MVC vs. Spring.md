____________

***Spring***

Spring framework: Dependency Injection
- @Component, @Autowired, Component Scan etc..
- Just Dependency injection is not sufficient (You need other frameworks to build apps)
	- Spring modules and Spring Projects: Extend Spring Eco System
		- Provide good integration with other frameworks (Hibernate/JPA, JUNIT & Mockito for Unit Testing)

***Spring MVC***

Simplify building web apps and REST API
- Building web application with Struts was very complex
- @Controller, @RestController, @RequestMapping("/courses")

***Spring Boot***

Build **PRODUCTION-READY** apps **QUICKLY**
- Starter Projects - Make it easy to build variety of applications
- Auto configuration - Eliminate configuration to setup Spring, Spring MVC, and other frameworks!
- Enable non functional requirements (NFRs):
	- Actuator: Enables Advanced Monitoring of applications
	- Embedded Server: No need for separate application servers!
	- Logging and Error handling
	- Profiles and ConfigurationProperties