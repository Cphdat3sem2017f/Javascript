var persons = ["Henrik", "Hanne", "Jens", "Josephine", "Victor"];


var shortlist = persons.filter(function(element, idx){ return element.length === 6});



shortlist.forEach(function(el){console.log(el)});

//Here the array is passed into the function as an input parameter
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

//Here we use prototype to extend the functionality of array:
Array.prototype.myFilter = function(callback){
    var resultArray = [];
    for(var i = 0; i < this.length; i++){ //Using this to refer to the object containing the actual function (myFilter())
        var element = this[i];
        if(callback(element)){
            resultArray.push(element);
        }
    }
    return resultArray;
}
var result = myFilter(persons, function(element){ return element.length > 4});
console.log(result);

var result2 = persons.myFilter(function(element){ return element.length < 6});
console.log(result2);