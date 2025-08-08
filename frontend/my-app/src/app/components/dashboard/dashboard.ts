import { Component } from '@angular/core';
import { DailyLogForm } from "../daily-log-form/daily-log-form";
import { GratitudeEntry } from "../gratitude-entry/gratitude-entry";
import { QuoteOfTheDay } from "../quote-of-the-day/quote-of-the-day";

@Component({
  selector: 'app-dashboard',
  imports: [DailyLogForm, GratitudeEntry, QuoteOfTheDay],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css'
})
export class Dashboard {

}
