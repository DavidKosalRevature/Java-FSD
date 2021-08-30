import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
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

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    PropertyComponent,
    DataBindingComponent,
    ClassBindingComponent,
    NgIfComponent,
    NgSwitchComponent,
    NgForComponent,
    NgForTrackByComponent,
    ToggleButtonComponent,
    PipesComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
