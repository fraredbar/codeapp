import { Component, OnInit } from '@angular/core';
import { HabitService } from '../../service/habit-service';
import { DailyLogService } from '../../service/daily-log-service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-daily-log-form',
  imports: [ReactiveFormsModule,FormsModule ],
  templateUrl: './daily-log-form.html',
  styleUrl: './daily-log-form.css'
})
export class DailyLogForm implements OnInit {
  habits: any[] = [];

  constructor(private habitService: HabitService, private dailyLogService: DailyLogService) {}

  ngOnInit() {
    this.habitService.getHabits().subscribe(habits => {
      this.habits = habits.map(h => ({ ...h, completed: false }));
    });
  }

  submit() {
    const statusList = this.habits.map(h => ({
      habitId: h.id,
      completed: h.completed
    }));

    this.dailyLogService.saveDailyStatus(statusList).subscribe(() => {
      alert('Registro guardado');
    });
  }
}

