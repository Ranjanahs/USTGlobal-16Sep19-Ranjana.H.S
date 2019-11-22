import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RouterModule } from '@angular/router';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { ChildcarComponent } from './cars/childcar/childcar.component';
import { LaptopchildComponent } from './laptops/laptopchild/laptopchild.component';
import { MobilechildComponent } from './mobiles/mobilechild/mobilechild.component';
import { MoviechildComponent } from './movies/moviechild/moviechild.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikechildComponent } from './bikes/bikechild/bikechild.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    MoviesComponent,
    LaptopsComponent,
    MobilesComponent,
    TechElevateComponent,
    ChildcarComponent,
    LaptopchildComponent,
    MobilechildComponent,
    MoviechildComponent,
    BikesComponent,
    BikechildComponent
    
     
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : '', component : HomeComponent },
      {path : 'cars', component : CarsComponent },
      {path : 'bikes' , component : BikesComponent },
      {path : 'movies', component : MoviesComponent},
      {path : 'laptops', component : LaptopsComponent},
      {path : 'mobiles', component : MobilesComponent},
      {path :  '', component : TechElevateComponent}
      
   ])
  ],

   providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
