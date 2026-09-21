### What is an Event?

An event is an occasion that is of importance

**Event-Driven** system involve having mechanisms for
- “event detection”, that’s a way to know that the event happen
- “notification”, that’s notifying whoever is interested that it happen
- “event handling”, that’s to allow some code to be executed in response

**Events are the browser’s way of saying, “Hey, this just happened.”** **When an event fires, your script can then react by running code (e.g. a function).**

**By running code when an event fires, your website responds to the user’s actions.** **It becomes *interactive*.**

### Different Event Types

![[Pasted image 20241123174608.png]]

![[Pasted image 20241123174617.png]]

![[Pasted image 20241123174626.png]]

![[Pasted image 20241123174633.png]]

![[Pasted image 20241123174640.png]]

### How Events Trigger JavaScript Code

1. Select the **element** node(s) the script should respond to
2. Indicate the **event** on the selected node(s) that will trigger a response
3. State the code you want to run when the event occurs

### Binding An Event To An Element

There are three ways to bind an event to an element:  
  
- HTML event handler attributes  
- Traditional DOM event handlers  
- DOM Level 2 event listeners

The following examples show a **blur** event on an element that triggers a function called checkUsername().

![[Pasted image 20241123174931.png]]

![[Pasted image 20241123175010.png]]

![[Pasted image 20241123175023.png]]![[Pasted image 20241123175034.png]]
![[Pasted image 20241123175051.png]]

Because you cannot have parentheses after the function names in event handlers or listeners, passing arguments requires a workaround.

![[Pasted image 20241123175120.png]]

An anonymous function is used as the second argument. Inside the anonymous function, a named function is called.

![[The Event Object]]