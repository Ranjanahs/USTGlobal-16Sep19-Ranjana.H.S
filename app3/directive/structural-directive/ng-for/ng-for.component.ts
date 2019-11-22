import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products =[
    {
      img : 'https://image.shutterstock.com/image-photo/pink-makeup-bag-cosmetic-beauty-260nw-570190234.jpg',
      name : 'cosmetics',
      price : 2330
    } ,
    {
      img : 'https://cdn.pixabay.com/photo/2017/11/26/19/50/jeans-2979818__340.jpg',
      name : 'jeans',
      price : 2000
    } ,
    {
      img : 'https://cdn.pixabay.com/photo/2019/03/18/08/29/nuts-4062624__340.jpg',
      name : 'avacado',
      price : 230
    } ,
  ];

  constructor() { }

  ngOnInit() {
  }

}
