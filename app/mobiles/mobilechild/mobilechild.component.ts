import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mobilechild',
  templateUrl: './mobilechild.component.html',
  styleUrls: ['./mobilechild.component.css']
})
export class MobilechildComponent implements OnInit {
  @Input() car1;
  constructor() { }

  ngOnInit() {
  }

}
