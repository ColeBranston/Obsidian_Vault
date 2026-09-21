**JPA Dependency**

```maven
<dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-data-jpa</artifactId>  
</dependency>
```

**Spring Data Rest Dependency** (Database Interaction)

```maven
<dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-data-rest</artifactId>  
</dependency>
```

*For any database you need a specific dependency, for example postgresSQL:*

**PostgreSQL Dependency**

```maven
<dependency>  
    <groupId>org.postgresql</groupId>  
    <artifactId>postgresql</artifactId> 
    <scope>runtime</scope> 
</dependency>
```

This is the application.properties for db username password and other required semantics.

```
spring.datasource.url=jdbc:postgresql://localhost:8080/SpringBootSurveyTest  
spring.datasource.username=postgres  
spring.datasource.password=Sonic888 
spring.jpa.generate-ddl=true  
spring.jpa.hibernate.ddl-auto=create
```

**Notice:**

- My server name was SpringBootSurveyTest hosted on port 8080
- spring.datasource.username sets the username
- spring.datasource.password sets the password

**Also...** I'm not sure if spring.jpa.hibernate.ddl-auto=create is needed to say that you want to create tables, otherwise use `spring.jpa.hibernate.ddl-auto=update` to update and save the database for later time.

--------

In order to create an entity class such as a user, the developer should use the annotation `@Entity`. For more info on entities, see [[Entity]].

This annotation is imported through the `jakarta.persistance.Entity` library.

With JPA, we can also automatically generate Entity IDs by using the `@Id` and `@GeneratedValue` annotations.

You can also use the `@Table(name="")` annotation to set the name of the created table if you don't want the table name to be the same as your entity class name.

Ex.

```Java
@Entity  
public class UserDetails {  
  
    @Id  
    @GeneratedValue    
    private Long id;  
    private String name;  
    private String role;

	{...}
}
```

---------

In addition to an Entity you will need 2 other types of files along with it. 

1. A Repository Interface
2. An Entity Command Line Runner

Ex. 

![[Pasted image 20240805164914.png]]

**Note:** Make Sure the names match up.

![[Repository Interface]]

![[CommandLineRunner Class]]

