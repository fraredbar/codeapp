import { Component, OnInit } from '@angular/core';
import { HabitService } from '../../service/habit-service';
import { Habit } from '../../models/Habit';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-habit-list',
  imports: [FormsModule],
  templateUrl: './habit-list.html',
  styleUrl: './habit-list.css'
})

export class HabitList implements OnInit{

newHabit: any;
habits: Habit[] = [];
habitForm!:FormGroup;

constructor(private fb:FormBuilder,
private habitService:HabitService
){this.habitForm=this.fb.group({
name:['',Validators.required,Validators.name],
category:['',Validators.required],
completed:[]
});
}


ngOnInit() {
    this.habitService.getHabits().subscribe(data => this.habits = data);
}

addHabit() {
if(this.habitForm.valid){
  const habit: Habit=this.habitForm.value;
  console.log(habit);
  this.habitService.addHabits(habit).subscribe(
    res=>console.log(res)
  );
  this.habitForm.reset();
}
}

getHabits(): void{
  this.habitService.getHabits().subscribe({
    next:(data)=>{
      this.habits=data;
    },
    error:(err)=>{
      console.error('Error al cargar datos',err)
    }
  
  }

  ) ;
}
  

}


