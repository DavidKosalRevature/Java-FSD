import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-services-employee-detail',
  templateUrl: './services-employee-detail.component.html',
  styleUrls: ['./services-employee-detail.component.css'],
  providers: [DataService]
})
export class ServicesEmployeeDetailComponent implements OnInit {

  employees: any[] = [];

  // constructor(private dataService: DataService) { 
  //   this.employees = dataService.getEmployees();
  // }

  ngOnInit(): void {
  }

}
