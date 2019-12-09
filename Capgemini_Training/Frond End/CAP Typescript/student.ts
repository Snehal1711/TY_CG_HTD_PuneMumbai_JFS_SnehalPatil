class Student{
    constructor(public name :String ,
        public age : number,
        public marks :number,
        public degree ?: string){   //optional variable

    }
    // printDetails(){
    //     console.log(`Name is ${this.name} Age is ${this.age} and Marks are ${this.marks}`);
    // }

}
let s = new Student('Snehal' , 22 , 80.74);
console.log(s);
//s.printDetails();

let student1 :Student ={
    name :'Amol',
    age : 29,
    marks :78
}
console.log(student1);

let students :Student[] =[
    new Student('mayuri',45,56),
    {
        name :'Aishwarya',
        age : 34,
        marks : 76
    },
    student1,
    s
];
console.log(students);

for (let student of students){
    console.log(student);
}
    

