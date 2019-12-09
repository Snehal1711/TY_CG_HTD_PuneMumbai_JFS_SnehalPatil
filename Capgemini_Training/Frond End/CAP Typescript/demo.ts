let myName :string ='Snehal';
// myName = 123; error = we can not assign other datatype value

let company;  //implicitly considered as any datatype
company =1234;
company ='Capgemini';
company =true;


//Union
let age : string |number;
age= 12;
age = 'Twelve';
//age = true; giva an error

//Tuple
let details :[string, number, number]= ['abc',234,345];
let mobiles :(string|number)[] =['iphone','samsung','redmi',123,'123'];//to store homogenous type data
//let mobiles =['iphone','samsung','redmi' ,234,true];  //to store heterogenous type data
function test(a:number ,b:number):number{
    return a+b;
};

