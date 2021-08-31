import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicesEmployeeListComponent } from './services-employee-list.component';

describe('ServicesEmployeeListComponent', () => {
  let component: ServicesEmployeeListComponent;
  let fixture: ComponentFixture<ServicesEmployeeListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServicesEmployeeListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicesEmployeeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
