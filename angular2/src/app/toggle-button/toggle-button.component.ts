import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-toggle-button',
  templateUrl: './toggle-button.component.html',
  styleUrls: ['./toggle-button.component.css']
})
export class ToggleButtonComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  flag = true;

  employees =  [
      { id: 1, name: 'Mark', gender: 'Male', email: 'm@gmail.com' },
      { id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com' },
      { id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com' },
      { id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com' },
      { id: 5, name: 'John', gender: 'Male', email: 'j@gmail.com' }
    ]

  onButtonClicked(){
    if(this.flag){
      this.flag = false;
    } else{
      this.flag = true;
    }

    
  }

  trackById(employee: any){
    return employee.id;
  }

}
