
##Day 4: JSON and AJAX

###XML vs. JSON
[SEE EXAMPLE HERE](https://www.w3schools.com/js/js_json_xml.asp)  

###JSON as javascript objects
- JSON.stringify(data) turns a Javascript object into JSON text and stores that JSON text in a string.
- JSON.parse(data) turns a string of JSON text into a Javascript object.
####Demo it in console

###Classic web application

![](/classicwebapp.png)  


###AJAX web application
![](/ajaxwebapp.png)  

###AJAX (Asynchronous Javascript and XML
![](/async.png)  

###AJAX contains:

- HTML and CSS for presentation
- DOM for dynamic display and interaction
- XML or JSON for interchange of data
- XMLHttpRequest object for asynchronous communication
- JavaScript to glue everything together
- jQuery to hide complexity and differences or modern browsers support fetch()

```
fetch('https://davidwalsh.name/demo/arsenal.json').then(function(response) { 
	// Convert to JSON
	return response.json();
}).then(function(j) {
	// Yay, `j` is a JavaScript object
	console.log(j); 
});
```

[Reference to more about the new javascript **fetch()** method](https://davidwalsh.name/fetch)  

##Demo ajax from java servlet  

###Same Origin Policy (SOP)
![](/SOP.png)  

###SOP examples: 
![](/SOP2.png)  

###Cross Origin Ressource Sharing
####Let the server do the fetching:
![](/cors.png)

### Javascript promise
[Promises explained here](http://www.html5rocks.com/en/tutorials/es6/promises/)  
![](/promise.png)
```
Code example here
```
### Javascript the event loop
[Understand the event loop](http://blog.carbonfive.com/2013/10/27/the-javascript-event-loop-explained/)  
JavaScript runtimes contain a message queue which stores a list of messages to be processed and their associated callback functions
![](/eventloop.png)



###Lets Demo
![](../img/demoman.png)


### SVG images
- Completely unrelated topic because it is used in the studypoint exercise tomorrow.
- Scalable Vector Graphics (SVG)
- XML-based
    - Look at fourHearts.svg and 
    - Countries_Europe.svg 
- Look at them in a text editor
- Look at how to select svg pars by id (the g-tags)

![](/svgcode.png)


