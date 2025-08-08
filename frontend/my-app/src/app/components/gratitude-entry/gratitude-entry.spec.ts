import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GratitudeEntry } from './gratitude-entry';

describe('GratitudeEntry', () => {
  let component: GratitudeEntry;
  let fixture: ComponentFixture<GratitudeEntry>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GratitudeEntry]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GratitudeEntry);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
