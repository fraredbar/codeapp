import { Component, OnInit } from '@angular/core';
import { HabitService } from '../../service/habit-service';
import { Habit } from '../../models/Habit';

@Component({
  selector: 'app-habit-list',
  imports: [],
  templateUrl: './habit-list.html',
  styleUrl: './habit-list.css'
})
export class HabitList implements OnInit{
  habits: Habit[] = [];

  constructor(private habitService: HabitService) {}

  ngOnInit() {
    this.habitService.getHabits().subscribe(data => this.habits = data);
  }
}


