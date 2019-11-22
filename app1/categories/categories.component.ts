import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  inputData;
  news: any;
  enews: any;

  constructor(private http: HttpClient) { 
    this.getNews();
  }
  getCategoriesNews(event) {
    this.inputData = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=6554c4cabf934dce98ff3a6199a4e974&category='+this.inputData).subscribe(data => {
      this.news = data.articles;
    },
    );
  }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
      this.news = data.articles;
  },
  );
  }

  ngOnInit() {
  }

}
