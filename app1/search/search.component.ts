import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  news: any;
  inputData: any;

  constructor(private http: HttpClient) {  }

  ngOnInit() {
  }
search(event)
{
  
  this.inputData = event.target.value;
  this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=6554c4cabf934dce98ff3a6199a4e974&q='+this.inputData).subscribe(data => {
    this.news = data.Title;
  },
  )
}
}
