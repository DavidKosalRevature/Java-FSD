import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  template: `
  
  <h1>{{message}}</h1>
  <button (click) = "onButtonClicked()">Click Me</button>
  <input type="text" (change)="onChange()"/>
  <br>
  <input type="text" #myInput /><button (click)="onGetValue(myInput.value)" >Get the value</button>

  <hr>
  <br>
  <textarea #myText (keyup)="onKeyUp(myText.value)" ></textarea>
  <h1>{{140 - comment.length}}</h1>

  `,
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  public message = 'Hello Guest';

  public comment = ''

  constructor() { }

  ngOnInit(): void {
  }

  onButtonClicked(){
    console.log('button clicked')
    this.message = 'Hello Watson';
  }

  onChange(){
    this.message = 'Change happened'
  }

  onGetValue(input: any){
    console.log(input)
  }

  onKeyUp(data: any){
    this.comment = data
  }
}
