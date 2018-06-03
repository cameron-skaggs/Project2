import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HometestComponent } from './hometest/hometest.component';
import { ManageCreateTestComponent } from './manage-create-test/manage-create-test.component';
import { ManageTestComponent } from './manage-test/manage-test.component';
import { ManageYearTestComponent } from './manage-year-test/manage-year-test.component';
import { AppRoutes } from '../shared/app-routes';
import { SelectTestComponent } from './select-test/select-test.component';

@NgModule({
  declarations: [
    AppComponent,
    HometestComponent,
    ManageCreateTestComponent,
    ManageTestComponent,
    ManageYearTestComponent,
    SelectTestComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(AppRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
