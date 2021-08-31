import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getEmployees(){
    return[
      {id: 1, name: 'Mark', gender: "Male", email: "m@gmail.com"},
      {id: 2, name: 'Paul', gender: "Male", email: "p@gmail.com"},
      {id: 3, name: 'Watson', gender: "Male", email: "w@gmail.com"},
      {id: 4, name: 'Stacy', gender: "Female", email: "s@gmail.com"},
      {id: 5, name: 'Strong', gender: "Female", email: "s@gmail.com"},
    ]
  }
}
