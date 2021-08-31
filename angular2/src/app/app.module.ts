import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import {TitlePipe} from './title.pipe';
import { CounterParentComponent } from './counter-example/counter-parent/counter-parent.component';
import { CounterButtonComponent } from './counter-example/counter-button/counter-button.component';
import { CounterDisplayComponent } from './counter-example/counter-display/counter-display.component';
import { ServicesEmployeeListComponent } from './services-employee-list/services-employee-list.component';
import { ServicesEmployeeDetailComponent } from './services-employee-detail/services-employee-detail.component';
import { PostComponent } from './post/post.component';
import { PostPhotoGridComponent } from './post-photo-grid/post-photo-grid.component';

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
    PostPhotoGridComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
