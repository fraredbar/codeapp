import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { EmployeeService } from '../../service/employee-service';
import { Employee } from '../../employee';
import { LoginRequest } from '../../models/LoginRequest';

@Component({
  selector: 'app-login',
   standalone: true,
  imports: [ReactiveFormsModule,CommonModule], 
  templateUrl: './login.html',
  styleUrl: './login.css'
})


export class Login implements OnInit{
  
  loginForm!: FormGroup;

  constructor(private fb: FormBuilder,  
    private employeeService: EmployeeService
  ) {
    this.loginForm = this.fb.group({
    email: ['', [Validators.required, Validators.email]],
    password: ['', Validators.required],
  });
  }

  ngOnInit(): void {
  
  }
 
  onSubmit() {
    if (this.loginForm.valid) {
        const custom: LoginRequest=this.loginForm.value;
        console.log(custom);
        this.employeeService.loginCustomer(custom).subscribe(
          res=>console.log(res)
        );
        this.loginForm.reset();
      } else {
        this.loginForm.markAllAsTouched();
      }
  }


}
