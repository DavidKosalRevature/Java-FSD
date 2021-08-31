import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import {TitlePipe} from './title.pipe';
import { CounterParentComponent } from './counter-example/counter-parent/counter-parent.component';
import { CounterButtonComponent } from './counter-example/counter-button/counter-button.component';
import { CounterDisplayComponent } from './counter-example/counter-display/counter-display.component';
import { ServicesEmployeeListComponent } from './services-employee-list/services-employee-list.component';
import { ServicesEmployeeDetailComponent } from './services-employee-detail/services-employee-detail.component';
import { PostComponent } from './post/post.component';
import { PostPhotoGridComponent } from './post-photo-grid/post-photo-grid.component';
import { DepartmentComponent } from './department/department.component';
import { EmployeeComponent } from './employee/employee.component';
import { DepartmentDetailComponent } from './department-detail/department-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    TitlePipe,
    CounterParentComponent,
    CounterButtonComponent,
    CounterDisplayComponent,
    ServicesEmployeeListComponent,
    ServicesEmployeeDetailComponent,
    PostComponent,
    PostPhotoGridComponent,
    DepartmentComponent,
    EmployeeComponent,
    DepartmentDetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
