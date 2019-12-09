//function expression
var f =function(){
 console.log('Hello , Welcome to Banglore')
}
f();  //calling the funtion

//naming function
function add(a, b){
    console.log(a+b);
}
console.log('Addition');
add(20, 10);   //calling function

//immediately invoke function expression
(function(x, y){
    console.log('Multiplication of ',x,'and ',y,' is ',x*y);
})(50, 23);

//return keyword
function division(a,b){
    return a*b;
}
console.log('Division : ',division(20,30));
