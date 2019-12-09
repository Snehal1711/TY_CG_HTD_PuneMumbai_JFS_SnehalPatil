import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { BindingComponent } from './binding/binding.component';
import { TwoWayDatabindingComponent } from './two-way-databinding/two-way-databinding.component';
import { StructuralDirectiveComponent } from './structural-directive/structural-directive.component';
import { ProductsComponent } from './products/products.component';
import { ParentComponent } from './parent/parent.component';
import { BikeComponent } from './bike/bike.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  {path :'' ,component : HomeComponent},
  {path : 'data-binding', component : BindingComponent},
  {path : 'two way' , component:TwoWayDatabindingComponent},
  {path : 'structural-directives',component: StructuralDirectiveComponent},
  {path : 'products',component:ProductsComponent},
  {path : 'parent' ,component :ParentComponent},
  {path : 'bike' , component: BikeComponent},
  {path : 'login', component : LoginComponent},
  {path : 'register' ,component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
