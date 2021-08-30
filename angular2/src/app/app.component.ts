import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular2';

  public parentData = 'Hi! from parent component';

  public message = 'this is a message from parent'
}
