// var name = "Pedro";
// console.log("name: "+name);
// name = 45;
// console.log("name: "+name);
// const age = 23;
// let address = "";

// var myArray = [false, "", 45];
// console.log(myArray[0]);

// var myObj = {
//     name: "Henrik",
//     age: 34,
//     address: "Somewhere"
// }

//console.log(myObj.name);
// console.log(myObj["name"]);

// function myFunc(){
//     console.log("Hello from function");
//     return 34.2;
// }

// var result = myFunc();
// console.log(result);

// // function myFunc2(arg1, arg2, arg3){
// function myFunc2(){
//     var res = 0;
//     for(var i = 0; i < arguments.length; i++){
//         res += arguments[i];
//     }
//     return res;
//     // return arg1+arg2+arg3+arguments[3];
// }

// // var result2 = myFunc2(2, 5, 7);
// // var result2 = myFunc2("Hello ", "From ", 34, " 4th-arg");
// var res2 = myFunc2(45, 67, 23, 6, 11, 90);
// console.log(res2);

// var myMultiplier = function(arg1){
//     return arg1*arg1;
// };

// var callbackDemo = function(arg1, myCallback){
//     return myCallback(arg1);
// };

// //var result = callbackDemo(4, myMultiplier);
// result = callbackDemo(4, function(arg){
//     console.log("argumentet var: "+arg);
// });
function Person(name){
  this.name = name;
  console.log("Name: "+ this.name);
  setTimeout(function(){
    console.log("Hi  "+this.name);  //Explain this
  },2000);
}
//call it like this (do it, even if you know it’s silly ;-)
Person("Kurt Wonnegut");  //This calls the function
console.log("I'm global: "+ name);  //Explain this

