import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptopchild',
  templateUrl: './laptopchild.component.html',
  styleUrls: ['./laptopchild.component.css']
})
export class LaptopchildComponent implements OnInit {
  @Input() car1;

  constructor() { }

  ngOnInit() {
  }

}
