import { Component, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-counter-button',
  templateUrl: './counter-button.component.html',
  styleUrls: ['./counter-button.component.css']
})
export class CounterButtonComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  counter = 0;

  @Output()
  childEvent = new EventEmitter();

  increment(){
    this.counter++;
    this.childEvent.emit(this.counter);
  }

  decrement(){
    this.counter--;
    this.childEvent.emit(this.counter);
  }

}
