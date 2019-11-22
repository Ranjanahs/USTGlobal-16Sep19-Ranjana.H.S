import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CountriesComponent } from './countries/countries.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchComponent } from './search/search.component';
import { CategoriesComponent } from './categories/categories.component';
import {RouterModule} from '@angular/router';
import { RanjanaComponent } from './ranjana/ranjana.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CountriesComponent,
    SourcesComponent,
    SearchComponent,
    CategoriesComponent,
    RanjanaComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '', component : HomeComponent},
      {path : 'countries', component : CountriesComponent},
      {path : 'categories', component : CategoriesComponent},
      {path : 'countries', component : CountriesComponent},
      {path : 'sources' , component : SourcesComponent},
      {path : 'search' , component : SearchComponent},
      {path : 'ranjana' , component : RanjanaComponent}
   ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
