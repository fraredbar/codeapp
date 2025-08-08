import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Habit } from '../models/Habit';
import { Employee } from '../employee';

@Injectable({
  providedIn: 'root'
})
export class HabitService {

  private baseUrl = 'http://localhost:8080/api/habitos';

  constructor(private http: HttpClient) {}
  
  getHabits(employee:Employee): Observable<Habit[]> {
    return this.http.get<Habit[]>(this.baseUrl+'/get', { withCredentials: true });
  }

  addHabits(habito:Habit):Observable<Habit[]>{
    return this.http.post<Habit[]>(this.baseUrl+'/add',habito,{withCredentials:true})
  }

  
}
