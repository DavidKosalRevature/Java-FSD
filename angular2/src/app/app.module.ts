import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {TitlePipe} from './title.pipe';
import { TestComponent } from './test/test.component';
import { PropertyComponent } from './property/property.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { ClassBindingComponent } from './class-binding/class-binding.component';
import { NgIfComponent } from './ng-if/ng-if.component';
import { NgSwitchComponent } from './ng-switch/ng-switch.component';
import { NgForComponent } from './ng-for/ng-for.component';
import { NgForTrackByComponent } from './ng-for-track-by/ng-for-track-by.component';
import { ToggleButtonComponent } from './toggle-button/toggle-button.component';
import { PipesComponent } from './pipes/pipes.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { InputOutputComponent } from './input-output/input-output.component';

@NgModule({
  declarations: [
    AppComponent,
    TitlePipe,
    TestComponent,
    PropertyComponent,
    DataBindingComponent,
    ClassBindingComponent,
    NgIfComponent,
    NgSwitchComponent,
    NgForComponent,
    NgForTrackByComponent,
    ToggleButtonComponent,
    PipesComponent,
    EmployeeListComponent,
    InputOutputComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
