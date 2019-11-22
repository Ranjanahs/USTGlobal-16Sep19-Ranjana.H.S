import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/08/05/10/27/iphone-410311__340.jpg',
      name : 'AZUS',
      details : 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
      name : 'Iphone',
      details : 'Iphone 5 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770__340.png',
      name : 'Samsung',
      details : 'Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      name : 'MI',
      details : 'Redmi 4A X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
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


 