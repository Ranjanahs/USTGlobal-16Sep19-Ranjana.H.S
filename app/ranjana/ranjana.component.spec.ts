import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RanjanaComponent } from './ranjana.component';

describe('RanjanaComponent', () => {
  let component: RanjanaComponent;
  let fixture: ComponentFixture<RanjanaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RanjanaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RanjanaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
