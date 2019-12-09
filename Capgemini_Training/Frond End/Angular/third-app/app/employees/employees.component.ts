import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  constructor( public employeeService: EmployeeService) {
    this.employeeService.getData();
  }
  todaysDate = Date.now();

  selectedEmployee: Employee = {
    empId : null,
    empName : null,
    email : null,
    phone : null,
    status : null
  } ;

  deleteEmployee(employee: Employee) {
    this.employeeService.deleteData(employee).subscribe(response => {
      console.log(response);
      console.log('Deleted employee');
      //to update the table again
      this.employeeService.getData();
    }, err => {
      console.log(err);
    });
  }
  selectEmployee(employee: Employee) {
    this.selectedEmployee = employee;
  }

  submitForm(form: NgForm) {
      this.employeeService.putData(form.value).subscribe(response =>{
        console.log(response);
        form.reset();
      }, err => {
        console.log(err);
      });
  }

  ngOnInit() {
  }

}
