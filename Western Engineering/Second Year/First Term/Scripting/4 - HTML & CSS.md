HTML stands for **H**yper **T**ext **M**arkup **L**anguage

Used for... 

- text
- video
- lists
- links
- forms
- audio
- tables

**C**ascaded **S**tyle **S**heets -> Used for styling web applications

1. Presentation
2. Layout

### HTML Elements

`<p></p>` for text, stands for paragraph

**Note**: 
1. "<" and ">" symbols represent the opening and closing of a single tag
2. "p" is the content specifier to specify what type of content should be displayed
3. "\</>" is the required closing tag for all opening tags "\<>" with the content specified inside as per syntax.

**Attributes tell us more about elements**

![[Pasted image 20241123050610.png]]

```HTML
<html>  
	<head>  
		<title>This is the Title of...</title>  
	</head>  
	<body>  
		<h1>This is the Body of the Page</h1>  
		<p>Anything within the body of a web page is displayed in the main browser window.
		</p>  
	</body>  
</html>
```
![[Pasted image 20241123050918.png]]

### Links

`<a href="http://www.imdb.com">IMDB</a>`

![[Pasted image 20241123051046.png]]![[Pasted image 20241123051121.png]]

**You can also link to specific parts of the same page using IDs**

Ex.

![[Pasted image 20241123051236.png]]

### Forms

Purpose: to collect information from the user

##### Form Controls

![[Pasted image 20241123051419.png]]

##### How Forms Work

![[Pasted image 20241123051544.png]]

1. **User fills in form and presses button to submit info to server**
2. Name of each form control sent with value user entered to the server
3. Server processes information using programming language
4. Server creates new page to send back to the browser based on info received

##### Name & Value Pairs

`username=Ivy`
	^         ^
   Name     Value

#### Form Structure

![[Pasted image 20241123052136.png]]

**Input**

![[Pasted image 20241123053245.png]]

**Note**:
1. type -> specifies the type of field, ex. text, checkbox, etc.
2. name -> specifies the name of the inputted data for when the name, value pair is sent to the server for processing.
3. size -> specifies the size of the inputted text
4. max length -> specifies the max length of inputted characters

**Additionally...**

```HTML
<form 
	  action="http://example.com/join.php">  
Username:  
<input type="text" name="username" size="15" maxlength="30" />  
</form>
```
The tag: `<input type="text" name="username" size="15" maxlength="30" />` is in itself a closing tag because it is considered an empty element. Additionally, the text "Username: " will appear before the input field for user context. 

**Will appear as follows: **

![[Pasted image 20241123053930.png]]

```HTML
<p>Username:  
<input type="text" name="username"  
size="15" maxlength="30" />  
</p>  
<p>Password:  
<input type="password" name="password"  
size="15" maxlength="30" />  
</p>
```

**Note:**
1. The different type "password" causes the input field to function differently than a normal "text" field. 

**Will appear as follows: **

![[Pasted image 20241123054125.png]]

```HTML
<form action="http://eg.com/email.php">  
<p>Subscribe to our email list:</p>  
<input type="text" name="email" />  
<input type="submit"  
value="Subscribe" />  
</form>
```

**Note: **

1. Different input type "submit", which acts as a button 
2. "value" attribute which specifies what text is displayed inside the button.

**Because the method isn't specified, the default GET method is assumed which will send the data to the URI in a key-value format, although if POST was specified it would send the data attached to a more secure request body (used with sensitive information)**

