import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HometestComponent } from './hometest/hometest.component';
import { ManageCreateTestComponent } from './manage-create-test/manage-create-test.component';
import { ManageTestComponent } from './manage-test/manage-test.component';
import { ManageYearTestComponent } from './manage-year-test/manage-year-test.component';

@NgModule({
  declarations: [
    AppComponent,
    HometestComponent,
    ManageCreateTestComponent,
    ManageTestComponent,
    ManageYearTestComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
