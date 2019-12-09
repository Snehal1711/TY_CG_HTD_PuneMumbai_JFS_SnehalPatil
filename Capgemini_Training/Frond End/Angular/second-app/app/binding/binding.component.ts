import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputData;
  name ='Snehal Patil';
  flag = true;
  imgURL ='https://cdn.pixabay.com/photo/2019/10/16/15/41/koi-4554767__340.jpg';
  imgURL1 ='https://cdn.pixabay.com/photo/2019/10/27/21/17/rose-4582852__340.jpg';

  constructor() { 
    // setTimeout(() =>{
    //   this.flag =false;
    // },4000);

    setInterval(() =>{
      this.flag =!this.flag;
    },1000);

   
  }
  eventOccured(input){
    console.log(input.value);
    console.log('keyup event is occured')
  }

  ngOnInit() {
  }

}
