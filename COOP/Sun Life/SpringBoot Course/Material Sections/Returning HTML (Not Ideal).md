In Spring Boot you can return HTML tags by using a StringBuffer instance.

Ex. 

```Java
    @RequestMapping("/say-hello-html")  
    public String sayHelloHtml(){  
  
        StringBuffer sb = new StringBuffer();  
  
        sb.append("<hmtl>");  
        sb.append("<head>");  
        sb.append("<title> My first HTML Page </title>");  
        sb.append("</head>");  
        sb.append("<body>");  
        sb.append("<p> My first html page with body </p>>");  
        sb.append("</body>");  
        sb.append("</hmtl>");  
  
        return sb.toString();  
    }  
}
```

The above HTML response looks like this at the endpoint. 

![[Pasted image 20240728215230.png]]

# Evidently, this isn't an ideal practice