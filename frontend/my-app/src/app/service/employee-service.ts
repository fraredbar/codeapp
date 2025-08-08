import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { LoginRequest } from '../models/LoginRequest';

@Injectable({
  providedIn: 'root'
})

export class EmployeeService {

  private api: string='http://localhost:8080/api/customers';

  constructor(private http:HttpClient){}

  createCustomer(employee:Employee):Observable<Employee>{
    return this.http.post<Employee>(this.api+'/create',employee);
  }

  loginCustomer(loginReq:LoginRequest):Observable<LoginRequest>{
    return this.http.post<LoginRequest>(this.api+'/login',loginReq,
    { withCredentials: true });
  }
  saveToken(token: string) {
    localStorage.setItem('token', token);
  }

  getToken(): string | null {
    return localStorage.getItem('token');
  }


  
}
