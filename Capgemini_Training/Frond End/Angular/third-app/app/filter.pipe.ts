import { Pipe, PipeTransform } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(employees: Employee[], search :string): Employee[] {
    if(search === undefined){
      return employees;
    }else{
    return employees.filter((value,index,array) => {
      return value.empName.toLocaleLowerCase().includes(search.toLocaleLowerCase());
    })
  }
  }

}
