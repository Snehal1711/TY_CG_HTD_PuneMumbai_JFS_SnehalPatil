import { Component, OnInit } from '@angular/core';
import {Bike } from '../bikes';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
  

  bikes : Bike[]=[
    {
      brand :'Royal Enfield',
      imgURL :'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
      model :'qwrrt',
      price :12345,
      specs :`qwert yteuruhwei wkroeio wpeofjjdk lwijoi`
    },{
      
        brand :'TVS',
        imgURL :'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
        model :'qwrrt',
        price :12345,
        specs :`qwert yteuruhwei wkroeio wpeofjjdk lwijoi`
    },{
        brand :'Honda',
        imgURL :'https://cdn.pixabay.com/photo/2014/03/25/16/26/motorbike-297090__340.png',
        model :'qwrrt',
        price :12345,
        specs :`qwert yteuruhwei wkroeio wpeofjjdk lwijoi`
    }
  ]

  selectedBike : Bike[]=this.bikes;

  selectBike(bike){
    this.selectedBike=bike;
  }

  constructor() { }

  ngOnInit() {

  }

}
