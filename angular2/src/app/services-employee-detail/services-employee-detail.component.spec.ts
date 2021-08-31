import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicesEmployeeDetailComponent } from './services-employee-detail.component';

describe('ServicesEmployeeDetailComponent', () => {
  let component: ServicesEmployeeDetailComponent;
  let fixture: ComponentFixture<ServicesEmployeeDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServicesEmployeeDetailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicesEmployeeDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
