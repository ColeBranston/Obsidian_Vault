A repository interface is the second of the three classes required to interact with a database. The main characteristics of an entity's repository interface is that its an interface class that extends from the **JpaRepository** class.

```Java
    public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> 
    
}
	
```

**Note:** It also takes in the entity and a Long type integer representing the Class type of the ID field in the UserDetails Entity class.

**Purpose of the Entity Repository Interface**:

- Defines what interactions will be made between the backend and database.
	- While table creation is extremely easy with the CommandLineRunner → majority of interactions will be retrieving data.

Ex.

```Java
 public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {  
    List<UserDetails> findByRole(String role);  
    List<UserDetails> findByName(String name);  
}
```

The interface above created for the UserDetails Entity defines two clear methods, getting a list of the UserDetails Entity's in the database by their role and name.

