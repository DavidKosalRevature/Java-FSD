import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-services-employee-list',
  templateUrl: './services-employee-list.component.html',
  styleUrls: ['./services-employee-list.component.css']
})
export class ServicesEmployeeListComponent implements OnInit {

  employees: any[] = [];

  constructor(private dataServices: DataService) {
    this.employees = dataServices.getEmployees();
   }

  ngOnInit(): void {
  }

}
