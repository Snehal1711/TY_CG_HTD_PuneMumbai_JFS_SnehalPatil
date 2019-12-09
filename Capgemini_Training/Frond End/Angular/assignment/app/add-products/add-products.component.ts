import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { ProductsService } from '../products.service';

@Component({
  selector: 'app-add-products',
  templateUrl: './add-products.component.html',
  styleUrls: ['./add-products.component.css']
})
export class AddProductsComponent implements OnInit {

  constructor(private productService: ProductsService) { }

  addProduct(productForm: NgForm) {
    console.log(productForm.value);
    this.productService.postData(productForm.value).subscribe(res => {
      console.log(res);
      productForm.reset();
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
