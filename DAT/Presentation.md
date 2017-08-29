<img align="right" src="img/cphbusinessWhite.png" />  


# Javascript day 1  
## Topics:  
### Client vs Server what work is done by whom  
### Javascript is run in the browser (originally)  
### Demo: simple browser example setup with js file 

### Different versions of javascript: (ES5 and ES6/ES2015)  
### variables (no datatype, var, let and const, scope, global scope (beware!!))  
### arrays and Object  
### functions (declaration, hoisting)  
### falsy/truthy (false,undefined, null, 0, NaN, "") all others are truthy  
### Callback functions (functions as arguments to functions)  

# Javascript day 2  
## Topics:  
### array methods: filter and map

```javascript
var persons = ["Henrik", "Hanne", "Jens", "Josephine", "Victor"];


var shortlist = persons.filter(function(element, idx){ return element.length === 6});



shortlist.forEach(function(el){console.log(el)});


function myFilter(arr, callback){
    var resultArray = [];
    for(var i = 0; i < arr.length; i++){
        var element = arr[i];
        if(callback(element)){
            resultArray.push(element);
        }
    }
    return resultArray;
}

var result = myFilter(persons, function(element){ return element.length > 4});
console.log(result);
```

### prototype (extend behaviour of array)
### 'this' keyword in js
### constructors
### 

## Ressources:
[Constructors in js](https://css-tricks.com/understanding-javascript-constructors/)  
[this keywork](http://javascriptissexy.com/understand-javascripts-this-with-clarity-and-master-it/)  
[filter() on array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)  
[array.filter(callback) explained how it would have looked in java](demo/CallbackInJava)


# Javascript day 3  
## Topics:  
### DOM - Document Object Model
### events (bubbling)
### manipulating DOM based on events
### Demo: simple browser example setup with js file
### synchronous / asynchronous functions
### strict mode
### Ressources: 
[event bubbling](https://javascript.info/bubbling-and-capturing)  
[strict mode](https://www.w3schools.com/js/js_strict.asp)  
[Asynchronous code in javascript](https://www.pluralsight.com/guides/front-end-javascript/introduction-to-asynchronous-javascript)  

# Javascript day 4  
## Topics:  
###   
