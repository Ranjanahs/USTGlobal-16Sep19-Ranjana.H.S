import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  inputData;
  news: any;
  enews: any;
  constructor(private http: HttpClient) {
    this.getNews();
  }
  getCountriesNews(event) {
    this.inputData = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=6554c4cabf934dce98ff3a6199a4e974&country='+this.inputData).subscribe(data => {
      this.news = data.articles;
    },
    );
  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
      this.news = data.articles;
  },
  );
  }
  
    ngOnInit() {
  }
}





















