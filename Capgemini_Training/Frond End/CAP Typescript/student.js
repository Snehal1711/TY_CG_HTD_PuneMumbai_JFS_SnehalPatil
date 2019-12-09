var Student = /** @class */ (function () {
    function Student(name, age, marks, degree) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    return Student;
}());
var s = new Student('Snehal', 22, 80.74);
console.log(s);
//s.printDetails();
var student1 = {
    name: 'Amol',
    age: 29,
    marks: 78
};
console.log(student1);
var students = [
    new Student('mayuri', 45, 56),
    {
        name: 'Aishwarya',
        age: 34,
        marks: 76
    },
    student1,
    s
];
console.log(students);
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student = students_1[_i];
    console.log(student);
}
