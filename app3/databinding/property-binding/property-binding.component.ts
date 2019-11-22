import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})

export class PropertyBindingComponent implements OnInit {
    name: string = 'Ranjana';
    imgUrl: string ='https://cdn.pixabay.com/photo/2019/09/25/17/25/baltic-sea-4504178_960_720.jpg'
    address: string = "#1153/A,Ashok Nagar,1st cross,Mandya"
    colorName: string = 'blue';
    isActive: boolean = false;
    colSpanValue: number = 2;
  constructor() {
    setInterval(() => {
      this.isActive = !this.isActive;
    },2000)
   }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'green';
    },2000)
  }
    

}
