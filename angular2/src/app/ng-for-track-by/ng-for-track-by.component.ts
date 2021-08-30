import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for-track-by',
  templateUrl: './ng-for-track-by.component.html',
  styleUrls: ['./ng-for-track-by.component.css']
})
export class NgForTrackByComponent implements OnInit {

  public employees: any[] =[];

  constructor() { 

    this.employees = [
      {id: 1, name: 'Mark', gender: 'Male', email: 'm@gmail.com'},
      {id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com'},
      {id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com'},
      {id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com'}
    ]

  }

  ngOnInit(): void {
  }

  onButtonClicked(){
    this.employees =  [
      { id: 1, name: 'Mark', gender: 'Male', email: 'm@gmail.com' },
      { id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com' },
      { id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com' },
      { id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com' },
      { id: 5, name: 'John', gender: 'Male', email: 'j@gmail.com' }
    ]
  }

  trackById(employee: any){
    return employee.id;
  }

}
