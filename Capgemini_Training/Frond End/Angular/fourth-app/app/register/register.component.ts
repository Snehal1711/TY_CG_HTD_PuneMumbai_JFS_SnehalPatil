import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  error =null;
  constructor( private auth : AuthService) { }

  registerUser(form : NgForm){
    this.error = null;
    this.auth.register(form.value).subscribe(res =>{
      console.log(res);
      form.reset();
    },err =>{
      console.log(err);
      this.error=err.error.error.message;
    });
  }

  ngOnInit() {
  }

}
