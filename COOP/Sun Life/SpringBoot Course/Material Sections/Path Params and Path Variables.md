Used to create end points with variables in their urls.

Ex. 

```Java
    @RequestMapping("/hello-world-path-param/{name}")  
	public HelloWorldBean  hellowWorldPathParam(@PathVariable String name){  
    return new HelloWorldBean("Hello World,"+name);  
}
```

**Notice**: syntax for variables in endpoints use curly brackets { }. In this example, the variable in the endpoint is `{name}`

- In order to define what that path variable is you must define it as a parameter in the following method.
- Defined using the annotation `@PathVariable`

**Notice**: 

```Java
	public HelloWorldBean  hellowWorldPathParam(@PathVariable String name){  
```

**Additionally**, you can have multiple path variables in an endpoint.

Ex.

```Java
@RequestMapping("/hello-world-path-param/{name}/message/{message}")  
public HelloWorldBean hellowWorldMultiplePathParam(@PathVariable String name, @PathVariable String message){  

    return new HelloWorldBean("Hello World, "+name+","+message);  
    
}
```

