import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { from } from 'rxjs';
@Component({
  selector: 'app-ranjana',
  templateUrl: './ranjana.component.html',
  styleUrls: ['./ranjana.component.css']
})
export class RanjanaComponent implements OnInit {
  news;
  enews;
  snews;
  
  constructor(private http: HttpClient) {
    this.geteNews();
    this.getNews();
    this.getsNews();
     }

  geteNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=entertainment&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
      this.enews = data.articles;
  }, err => {
    console.log(err);
  }, () => {
    console.log('news gt successfully');
  });
  }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
      this.news = data.articles;
  }, err => {
    console.log(err);
  }, () => {
    console.log('news gt successfully');
  });
  }

  getsNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=sports&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
      this.snews = data.articles;
  }, err => {
    console.log(err);
  }, () => {
    console.log('news gt successfully');
  });
  }
  ngOnInit() {
  }
}
