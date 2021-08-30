import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees = [
    {code: 'emp101', name: 'Mark', gender: 'Male', salary: 5000, dateOfBirth: '12/12/2000'},
    {code: 'emp102', name: 'Paul', gender: 'Male', salary: 4500, dateOfBirth: '05/06/2000'},
    {code: 'emp103', name: 'Watson', gender: 'Male', salary: 8000, dateOfBirth: '07/24/2000'},
    {code: 'emp104', name: 'Stacey', gender: 'Female', salary: 6000, dateOfBirth: '12/22/2000'},
    {code: 'emp105', name: 'Strong', gender: 'Female', salary: 7500, dateOfBirth: '01/12/2000'},
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
