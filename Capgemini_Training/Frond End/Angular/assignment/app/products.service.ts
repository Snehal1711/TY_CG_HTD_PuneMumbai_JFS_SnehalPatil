import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './add-products/products';
import { LoginResponse } from './login-response';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  api = 'https://products-d51ca.firebaseio.com/';
  products: Product[] = [];

  constructor(private http: HttpClient) { }

  postData(data) {
    return this.http.post(`${this.api}products.json`, data);
  }

  getData() {
    this.http.get(`${this.api}products.json`).subscribe(res => {
      console.log(res);
      const productArray = [];
      for (const key in res) {
        if (res.hasOwnProperty(key)) {
          productArray.push({...res[key], pk : key});
        }
      }
      this.products = productArray;
      console.log(this.products);
    });
  }

  deleteData(data) {
    return this.http.delete(`${this.api}products/${data.pk}.json` , data );
  }

  putData(data) {
    return this.http.put(`${this.api}products/${data.pk}.json` , data);
  }
}
