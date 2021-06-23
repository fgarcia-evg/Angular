import { routing } from './app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

import { HttpClientModule } from '@angular/common/http';

import { CookieService } from 'ng2-cookies';

import { HomeComponent } from './home/home.component';
import { LoginService } from './services/login/login.service';
import { UsersService } from './services/users/user.service';

@NgModule({
  declarations: [AppComponent, LoginComponent, RegisterComponent, HomeComponent],
  imports: [
    BrowserModule,
    routing,
    FormsModule,
    HttpClientModule,
  ],
  providers: [
    CookieService,
    LoginService,
    UsersService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
