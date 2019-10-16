import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { from } from 'rxjs';
import { MoviesComponent } from './movies/movies.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    AddmovieComponent,
    LoginComponent,
    

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,    
    RouterModule.forRoot([
    {path : '' , component : HeaderComponent},
    {path : 'movies', component : MoviesComponent},
    {path : 'addmovie' , component : AddmovieComponent},
    {path : 'login' , component : LoginComponent}
       
    ])


  ],
  providers: [],
  bootstrap: [AppComponent]
  
})
export class AppModule { }
