import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
   inputData: any;
  // news: any;
  values: any=[];

  constructor(private http: HttpClient) {

  }

   search(event) {
        this.inputData = event.target.value;
        this.http.get<any>('http://www.omdbapi.com/?s=&apikey=5f800381'+ this.inputData).subscribe(data => {
          this.values = data.search;
          console.log(data);
   },
 )};
   
  ngOnInit() {
  }

}
