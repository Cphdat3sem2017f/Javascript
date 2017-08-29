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