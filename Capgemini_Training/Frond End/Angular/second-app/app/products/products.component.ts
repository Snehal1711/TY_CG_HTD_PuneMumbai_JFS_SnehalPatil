import { Component, OnInit } from '@angular/core';
import { Product } from '../products'

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products : Product [] =[
    {
      name :'MacBook',
      imgURL : 'https://cdn.pixabay.com/photo/2016/11/23/14/37/apple-1853259__340.jpg',
      price : 59999,
      details : 'Very Good'
    },{
      name :'Smart Phone',
      imgURL : 'https://cdn.pixabay.com/photo/2017/09/27/02/52/smartphone-2790799__340.jpg',
      price : 19999,
      details : 'Very Good'
    },{
      name :'Washing Machine',
      imgURL : 'https://image.shutterstock.com/image-photo/empty-washing-machine-pile-dirty-260nw-566248510.jpg',
      price : 15999,
      details : 'Cleaning is superb'
    },{
      name :'Refrigerator',
      imgURL : 'https://image.shutterstock.com/image-photo/open-refrigerator-filled-fresh-fruits-260nw-561902914.jpg',
      price : 20999,
      details : 'Very good Cooling'
    },{
      name :'Smart Watch',
      imgURL : 'https://cdn.pixabay.com/photo/2015/06/25/17/21/smart-watch-821557__340.jpg',
      price : 9999,
      details : 'Very Good'
    }
  ]


  constructor() { }

  ngOnInit() {
  }

}
