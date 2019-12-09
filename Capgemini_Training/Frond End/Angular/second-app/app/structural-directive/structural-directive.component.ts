import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directive',
  templateUrl: './structural-directive.component.html',
  styleUrls: ['./structural-directive.component.css']
})
export class StructuralDirectiveComponent implements OnInit {
flag =false;
person ='Snehal';
  students : Student[] =[
    {
      id :101,
      name : 'Anjali',
      age :24 ,
      degree : 'BE'
    },{
      id :102,
      name : 'Snehal',
      age :23 ,
      degree : 'BE'
    },{
      id :103,
      name : 'Shani',
      age :45 ,
      degree : 'Btech'
    },{
      id :105,
      name : 'Akash',
      age :56 ,
      degree : 'Bsc'
    },{
      id :105,
      name : 'Prachi',
      age :21 ,
      degree : 'Btech'
    }
  ]
  constructor() { 
    setTimeout(() =>{
      this.flag = true;
    },2000);
  }
    deleteStudent(student :Student) {
      let index =this.students.indexOf(student);
      this.students.splice(index,1);
    
  }

  ngOnInit() {
  }

}
