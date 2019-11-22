import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      name : 'BMW',
      details : 'he Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
      name : 'www',
      details : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'Royal Enfields',
      details : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/07/11/18/moped-1031006__340.jpg',
      name : 'Bajaj',
      details : 'The Bugatti La Voiture Noire is a one-off supercar based on the Chiron. Unveiled at the 2019 Geneva Motor Show, it joins the Divo as a derivative from the already famous Chiron hypercar. The La Voiture Noire is a modern reinterpretation of the Type 57 SC Atlantic from the 1930s.'
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

  