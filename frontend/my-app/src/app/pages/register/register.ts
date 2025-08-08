import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { EmployeeService } from '../../service/employee-service';
import { Employee } from '../../employee';

@Component({
  selector: 'app-register',
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './register.html',
  styleUrl: './register.css'
})

export class Register implements OnInit{

    registerForm!: FormGroup;

    constructor(private fb: FormBuilder,private employeeService: EmployeeService) {
    this.registerForm = this.fb.group({
    name: ['', Validators.required],
    email: ['', [Validators.required, Validators.email]],
    password: ['', Validators.required],
  }); 
    }

    ngOnInit(): void {}

  onSubmit() {
    if (this.registerForm.valid) {
          this.registerForm.value;
            
            const custom: Employee=this.registerForm.value;
            custom.role="EMPLOYEE"
            console.log(custom);
            this.employeeService.createCustomer(custom).subscribe(
              res=>console.log(res)
            );
            this.registerForm.reset();
          } else {
            this.registerForm.markAllAsTouched();
          }
  }


}
