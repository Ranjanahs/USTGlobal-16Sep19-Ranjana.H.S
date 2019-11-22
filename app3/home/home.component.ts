import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  news;
  // img : string = 'https://cdn.pixabay.com/photo/2018/09/23/18/21/rose-flower-3698050__340.jpg';
  // isActive : boolean = false;
  // constructor() {

  //   setTimeout(() => {
  //     this.isActive = !this.isActive;
  //   }, 200);
  //  }
   constructor(private http: HttpClient) {
     this.getNews();

   }
   getNews() {
     this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=6554c4cabf934dce98ff3a6199a4e974').subscribe(data => {
       this.news = data.articles;
   }, err => {
     console.log(err);
   }, () => {
     console.log('news gt successfully');
   });
   }
  ngOnInit() {
  }

}

