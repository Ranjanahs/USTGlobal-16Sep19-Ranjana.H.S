import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/05/28/car-1957037_960_720.jpg',
      name : 'PinkCar'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800_960_720.jpg',
      name : 'cuba'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521_960_720.jpg',
      name : '949'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      name : 'silvr'
    }
  ]
  
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    console.log(car);
    this.selectedCar = car;
  }
}
