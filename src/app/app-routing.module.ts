import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerComponent } from './customer/customer.component';
import { PublicationsComponent } from './publications/publications.component';


const routes: Routes = [
  { path: 'customer', component: CustomerComponent },
  { path: '', redirectTo: 'customer', pathMatch: 'full' },
  { path: 'publications', component: PublicationsComponent },

  // otherwise redirect to home
  { path: '**', redirectTo: 'customer' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }






