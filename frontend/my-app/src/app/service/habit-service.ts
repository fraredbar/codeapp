import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Habit } from '../models/Habit';

@Injectable({
  providedIn: 'root'
})
export class HabitService {

  private baseUrl = '/api/habits'; // Ajusta si el backend usa otro prefijo

  constructor(private http: HttpClient) {}
  
  getHabits(): Observable<Habit[]> {
    return this.http.get<Habit[]>(this.baseUrl, { withCredentials: true });
  }
  
}
