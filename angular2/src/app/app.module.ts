import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {TitlePipe} from './title.pipe';
import { CounterParentComponent } from './counter-example/counter-parent/counter-parent.component';
import { CounterButtonComponent } from './counter-example/counter-button/counter-button.component';
import { CounterDisplayComponent } from './counter-example/counter-display/counter-display.component';

@NgModule({
  declarations: [
    AppComponent,
    TitlePipe,
    CounterParentComponent,
    CounterButtonComponent,
    CounterDisplayComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
