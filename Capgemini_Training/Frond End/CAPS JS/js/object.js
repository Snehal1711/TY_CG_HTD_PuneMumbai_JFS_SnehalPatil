var student ={
    name : 'Snehal',  
    age: 22 ,
    degree: 'BE' ,
    phno : 7645271891 ,
};
//using data from object
console.log('Name : ',student.name);   // to print object members
console.log(student);    // to print whole object

student.phno =987654321;
console.log(student);

student.selectedCompany = 'Cabgemini';  // to add new object member
console.log(student);

//using object constructor
var laptop = new Object();
laptop.brand ='Acer';
laptop.ram = '8GB';
laptop.processor = 'core i5';
laptop.price =39999;
console.log(laptop);

//to find keys present in object
console.log(Object.keys(laptop));

//to find length of object
console.log(Object.keys(laptop).length);
