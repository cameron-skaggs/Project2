import { Routes } from '@angular/router';
import { HometestComponent } from '../app/hometest/hometest.component';
import { SelectTestComponent } from '../app/select-test/select-test.component';



export const AppRoutes: Routes = [
    { path: '', component: SelectTestComponent},
    { path: 'home', component: HometestComponent}
]