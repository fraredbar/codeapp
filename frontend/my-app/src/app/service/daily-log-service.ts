import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DailyLogService {
  private baseUrl = '/api/logs';

  constructor(private http: HttpClient) {}

  saveDailyStatus(statusList: { habitId: any; completed: any; }[]): Observable<any> {
    const body = { habits: statusList };

    return this.http.post(this.baseUrl, body, { withCredentials: true });
  }
  
}
