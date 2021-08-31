import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  departments = [
    {id: 1, name: 'Admin'},
    {id: 2, name: 'Sales'},
    {id: 3, name: 'IT'},
    {id: 4, name: 'HR'},

  ]

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onButtonClick(department: any){
    this.router.navigate(['/department', department.id])
  }

}
