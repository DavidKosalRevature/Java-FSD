import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-update',
  templateUrl: './employee-update.component.html',
  styleUrls: ['./employee-update.component.css']
})
export class EmployeeUpdateComponent implements OnInit {

  id: any;
  employee: any;

  constructor(private employeeService: EmployeeService, 
    private activatedRoute: ActivatedRoute) { 
      this.id = activatedRoute.snapshot.paramMap.get('id');
    }

  ngOnInit(): void {
    this.employeeService.getEmployeesById(this.id).subscribe(data => {
      this.employee = data;
    })
  }

  onSubmit(data: any){
    this.employeeService.updateEmployee(this.id, data).subscribe(x => console.log(x))
  }

}
