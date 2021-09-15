import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { IEmployee } from '../models/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private BASEURL = 'http://localhost:9090/';
  private ENDPOINTS = {
    EMPLOYEE: 'employees',
  };

  constructor(private http: HttpClient) { }

  getEmployees(): Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(
      `${this.BASEURL + this.ENDPOINTS.EMPLOYEE}`
    );
  }

  getEmployeesById(id: any): Observable<IEmployee>{
    return this.http.get<IEmployee>(
      `${this.BASEURL + this.ENDPOINTS.EMPLOYEE}/@{id}`
    );
  }

  createEmployee(data: IEmployee): Observable<IEmployee> {
    return this.http.post<IEmployee>(
      `${this.BASEURL + this.ENDPOINTS.EMPLOYEE}`,
      data
    )
  }

  updateEmployee(id: any, data: IEmployee): Observable<IEmployee>{
    return this.http.put<IEmployee>(
      `${this.BASEURL + this.ENDPOINTS.EMPLOYEE}/${id}`,
      data
    );
  }

  deleteEmployee(id: any): Observable<IEmployee> {
    return this.http.delete<IEmployee>(
      `${this.BASEURL + this.ENDPOINTS.EMPLOYEE}/${id}`
    );
  }
}
