let person = {
    name : 'kajal',
    age : 22
}

let student ={
    ...person,
    id :1234,
    percentage :80.7
}
console.log(student);

let mumbaiCRs = ['Akash' ,'Aishwarya'];
let noidaCRs = ['karthik','Monali'];
let bangloreCRs =['Yasmin' ,'Shahid'];
let bhuvneshwarCRs =['kaushik','Nisha'];

let CRs =[
    ...mumbaiCRs,
    ...noidaCRs,
    ...bangloreCRs,
    ...bhuvneshwarCRs,
    'Snehal'
]
console.log(CRs);

let [name1, name2, name3,...restValues] = CRs;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restValues);

let{name,...restValues1} =student
console.log(name);
console.log(restValues1);