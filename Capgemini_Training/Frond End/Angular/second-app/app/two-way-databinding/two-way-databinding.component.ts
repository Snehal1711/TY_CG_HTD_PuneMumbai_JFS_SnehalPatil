import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-databinding',
  templateUrl: './two-way-databinding.component.html',
  styleUrls: ['./two-way-databinding.component.css']
})
export class TwoWayDatabindingComponent implements OnInit {

  name :string =null;
  mobile :number = null;

 printForm(){
   console.log(this.name);
   console.log(this.mobile);
 } 
  constructor() { }

  ngOnInit() {
  }

}
