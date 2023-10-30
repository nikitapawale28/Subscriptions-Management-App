import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; // Import HttpClientModule
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { PublicationsComponent } from './publications/publications.component';
import { SubscriberComponent } from './subscriber/subscriber.component';
import { FormsModule } from '@angular/forms'; // Import FormsModule
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    PublicationsComponent,
    SubscriberComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule, // Add HttpClientModule to the imports array

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
