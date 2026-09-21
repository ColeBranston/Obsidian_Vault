
**Using HTTPClient** 

-> There are alternative methods, but HTTPClient supports Async calls to

Ex. 

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String fetchDataFromOtherApi() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://example.com/api/data"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}

```

**Notice:**

1. a new client object is made with the HTTPClient class
2. a new HttpRequest object is made and build with the following characteristics
	1. .uri() -> Including a new URI object containing the endpoint that the request is made to
	2. .GET() which is specified for the type of request made to the endpoint
	3. .build() to finalize the HttpRequest obect
3. Finally, the HttpResponse object is created by using the HTTPClient object, `client`, to send the HttpRequest object, `request`, as well as the HttpReponse.BodyHanders.ofString() method to handle the response and convert to a String. 
4. Lastly, the response body is returned.

### To Make POST request:

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String postDataToOtherApi(String jsonRequestBody) throws Exception {
        // Step 1: Create an HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Step 2: Build the HttpRequest with POST method and body
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://example.com/api/data")) // Replace with the actual endpoint
                .header("Content-Type", "application/json") // Set headers
                .POST(BodyPublishers.ofString(jsonRequestBody)) // Attach the request body
                .build();

        // Step 3: Send the request and receive the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Step 4: Return the response body
        return response.body();
    }
}

```

**Main Differences:**

1. in the request attributed instead of `.GET()`, `.POST()` is used/

-> Also notice inside the `.POST()` attribute is `BodyPublishers.ofString(jsonRequestBody)`, which sends payload `jsonRequestBody` which is initially taken in as a parameter.

**Reminder: Json Messages look as follows**: 

`String jsonRequestBody = "{\"name\":\"John\", \"age\":30}";
`
-> Traditionally, these jsonRequestBodies are sent as json.stringify() 'd objects in javascript, Not sure if there is a way to convert them from normal objects in Spring Boot.