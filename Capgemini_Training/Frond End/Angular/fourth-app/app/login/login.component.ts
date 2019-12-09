import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
 
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error =null;
  constructor(private auth : AuthService ,private router : Router) { }

  loginUser(form : NgForm){
    this.error=null;
    this.auth.login(form.value).subscribe(res =>{
      console.log(res);
      form.reset();
      if(res.registered){
        const user =JSON.stringify(res);
        localStorage.setItem('token',user);
        this.router.navigateByUrl('/about');
      }
    }, err =>{
      console.log(err);
      this.error=err.error.error.message;
      form.reset();
    })
  }

  ngOnInit() {
  }

}
