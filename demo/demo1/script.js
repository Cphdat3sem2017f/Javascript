// var hej = document.getElementById("hello");
// hej.onclick = function(){
//   alert("Hello");
//   var self = this;
//   this.style.backgroundColor = 'red';
//   var myObj = {
//     name: "myObj er navnet",
//     print : function(){
      
//       console.log(this.name);
//       console.log(self);
//     }

//   };
//   //myObj.bind(this);
//   var d1 = "demo0";
//   myObj.print();
//   (this.demoFunc = function(){
//     var d1 = "demo1";
//     console.log(this);
//     console.log(d1);
//   })();
//   console.log(d1);
// //this.demoFunc();
// }

var cars = [{id: 1, make: 'Ford'}, {id: 2, make: 'Ford'}, {id: 3, make: 'Saab'}];
var filtered = cars.filter(function(element){
  if(element.make === 'Ford'){
    return true;
  } else{
    return false;
  }
});
console.log(filtered);