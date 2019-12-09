import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProductsComponent } from './products/products.component';
import { AddProductsComponent } from './add-products/add-products.component';
import { EditProductsComponent } from './edit-products/edit-products.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';


const routes: Routes = [
  {path : '' , component: HomeComponent},
  {path : 'products' , component : ProductsComponent},
  {path : 'add-products' , component: AddProductsComponent , canActivate : [AuthGuard]},
  {path : 'edit-products' , component : EditProductsComponent , canActivate : [AuthGuard]},
  {path : 'register' , component: RegisterComponent},
  {path : 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
