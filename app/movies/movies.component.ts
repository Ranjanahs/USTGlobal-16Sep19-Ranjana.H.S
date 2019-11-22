import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/10/31/17/41/dancing-dave-minion-510835__340.jpg',
      name : 'The Minnions',
      details : 'Its an awesome cartoon movie which makes children ver haappy...Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/08/08/11/51/jerusalem-church-2611203__340.jpg',
      name : 'The Conjuring',
      details : 'Jake, a paraplegic marine, replaces his brother on the Navi inhabited Pandora for a corporate mission. He is accepted by the natives as one of their own but he must decide where his loyalties lie.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/01/13/22/54/man-1139066__340.jpg',
      name : 'Avathar',
      details : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/12/18/13/03/grain-3026099__340.jpg',
      name : 'Thor',
      details : 'Thor is exiled by his father, Odin, the King of Asgard, to the Earth to live among mortals. When he lands on Earth, his trusted weapon Mjolnir is discovered and captured by S.H.I.E.L.D.'
    }
  ]
  
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}


 

  