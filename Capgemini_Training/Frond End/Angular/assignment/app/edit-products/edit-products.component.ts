import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service';
import { Product } from '../add-products/products';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-products',
  templateUrl: './edit-products.component.html',
  styleUrls: ['./edit-products.component.css']
})
export class EditProductsComponent implements OnInit {

  selectedProduct: Product = {
   productName: null,
   productCat: null,
   price: null,
   details: null,
   imgURL: null,
  };

  constructor( public productService: ProductsService) {
    this.productService.getData();
   }

   deleteProduct(product: Product) {
     this.productService.deleteData(product).subscribe(res => {
       console.log(res);
       console.log('Deleted Products');
       this.productService.getData();
     }, err => {
       console.log(err);
     });
   }

   selectProduct(product: Product) {
    this.selectedProduct = product;
   }

   addProduct(form: NgForm) {
     this.productService.putData(form.value).subscribe(res => {
       console.log(res);
       form.reset();
     }, err => {
       console.log(err);
     });
   }
  ngOnInit() {
  }

}
