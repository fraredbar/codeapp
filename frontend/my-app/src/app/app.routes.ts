import { Routes } from '@angular/router';
import { App } from './app';
import { Login } from './pages/login/login';
import { Register } from './pages/register/register';
import { HabitList } from './components/habit-list/habit-list';
import { DailyLogForm } from './components/daily-log-form/daily-log-form';
import { GratitudeEntry } from './components/gratitude-entry/gratitude-entry';
import { QuoteOfTheDay } from './components/quote-of-the-day/quote-of-the-day';

export const routes: Routes = [
    
    {path:'',component:App},
    {path:'login',component:Login},
    {path:'register',component:Register},
    { path:'habits', component: HabitList },
    { path:'daily-log', component: DailyLogForm },
    { path:'gratitude', component: GratitudeEntry },
    { path:'quote', component: QuoteOfTheDay }

];
