import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-counter-parent',
  templateUrl: './counter-parent.component.html',
  styleUrls: ['./counter-parent.component.css']
})
export class CounterParentComponent implements OnInit {

  
  public counter = '';

  constructor() { }

  ngOnInit(): void {
  }

}
