1. Browsers have default [[CSS]] that employ CSS without adding any of your own. The only way to remove this is by using a reset file commonly found on the internet. 
2. CSS's syntax is:
![[Pasted image 20240109165109.png]]
3. When addressing the styles of specific tags you may use the \#DivName (with a space) followed by the subsequent tag name e.g. p, h1, h2, \<b>: 

```HTML
<div id="Header">
	<p>This is some text</p>
	<h1>This is a title</h1>
	<h2>This is a smaller title</h2>
</div>
<p>This is some text outside of the div</p>
```

```CSS
header p{
	text-align: center; /*This will only change the paragraph within the div*/
}
p {
	color: black; /*This will change all of the paragraph tags within the document*/
}

```