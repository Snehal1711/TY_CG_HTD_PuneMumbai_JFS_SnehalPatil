import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomValidator } from '../register/custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  get email(){
    return this.registerForm.get('email');
  }

  get password(){
    return this.registerForm.get('password');
  }

  registerForm = new FormGroup({
    email : new FormControl('',[
      Validators.minLength(8),
      Validators.required,
    Validators.email,
    CustomValidator.noSpace
  ]),
    password : new FormControl('',[
      Validators.required,
      Validators.minLength(8)
    ])
  })

  printForm(registerForm :NgForm){
    
    console.log(registerForm.value);
  }
  ngOnInit() {
  }

}
