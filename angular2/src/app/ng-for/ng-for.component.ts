import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  

  constructor() { }

  ngOnInit(): void {
  }

  public names = ['Mark', 'Paul', 'Watson', 'Stacey', 'John'];

  public employees = [
    {id: 1, name: 'Mark', gender: 'Male', email: 'm@gmail.com'},
    {id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com'},
    {id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com'},
    {id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com'},
    {id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com'},
    {id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com'},
    {id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com'},

  ]
}
