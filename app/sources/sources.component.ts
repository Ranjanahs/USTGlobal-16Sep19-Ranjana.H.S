import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
  inputData;
  news: any;
  enews: any;

  constructor(private http: HttpClient) {
    this.getNews();
   }
   getSourcesNews(event) {
    this.inputData = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=6554c4cabf934dce98ff3a6199a4e974&sources='+this.inputData).subscribe(data => {
      this.news = data.articles;
    },
    );
  }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-times-of-india&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
      this.news = data.articles;
  },
  );
  }
  ngOnInit() {
  }

}
