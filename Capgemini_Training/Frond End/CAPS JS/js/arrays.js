// var x =[12345 ,'Snehal',true , {name :'Snehal',age : 22}];
// console.log(x[3]);

// // for( i=0 ; i<=3 ;i++){
// //     console.log(x[i]);
// // }
// //retriving array members using for loop and length function
// for( i=0 ; i<x.length ;i++){
//     console.log(x[i]);
// }
var colors =['red','orange','yellow','green','blue'];
console.log('before pop :',colors);
colors.pop();
console.log('after pop',colors);
colors.push('white','black');
console.log('after push: ',colors);
colors.shift();             //remove elements from starting index
console.log('after shift: ',colors);
colors.unshift('violet','grey');  //add elemets in starting index
console.log('after unshift: ',colors);

colors.splice(2,2);             // it can add and remove elements
console.log('after splice: ',colors);

colors.splice(2,1,'indigo','yellow','pink');
console.log(colors);

// setTimeout(function (){
//     console.log('4 sec done')
// },4000);

//callback
function test(cb){
    console.log('test is started');
    cb();
    console.log('test is ended');
}

test(function (){
    console.log('callback is executed');
});

// var i =1;
// setInterval(function() {
//     console.log(i);
//     i++;
// }, 2000);

colors.forEach(function(value, index, array){
    console.log(value, index, array);
});

var m1Array=[101,102,105,117,120,130,140];
var newArray=m1Array.filter(function(value){
     return value>105;
 });
 console.log(newArray);

var myArray =[1,2,3,4,5,23,1,3,4,5,6,6,8,1,4,5,8,9]
var filteredArray =myArray.filter(function(value , index , array){
     return array.indexOf(value) === index;
 });
console.log(filteredArray);

// if(123=='123'){
//     console.log('true');
// }else{
//     console.log(false);
// }

//for of loop
console.log('for of loop')
for(var x of colors){
    console.log(x);
}

//for in loop for iterating arrays
console.log('for in loop')
for(var a in m1Array){
    console.log('the value is ',m1Array[a],' and the index is ',a);
}
//for in loop for iterating arrays
var movie ={
    name :'Three Idiots',
    actor : 'Amir Khan',
    actress : 'Karina Kapoor'
}

for(var key in movie){
    console.log(key, ":",movie[key]);
}







