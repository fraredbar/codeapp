import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuoteOfTheDay } from './quote-of-the-day';

describe('QuoteOfTheDay', () => {
  let component: QuoteOfTheDay;
  let fixture: ComponentFixture<QuoteOfTheDay>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [QuoteOfTheDay]
    })
    .compileComponents();

    fixture = TestBed.createComponent(QuoteOfTheDay);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
