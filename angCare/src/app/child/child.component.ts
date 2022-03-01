import { Component, OnInit, Output } from '@angular/core';
import { EventEmitter } from 'stream';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  inputs: ['pdata'],
  outputs:['cevent']
})





export class ChildComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  public pdata:string | undefined;
  cevent = new EventEmitter();

  onChange(value:string){
    this.cevent.emit(value);
  }

}
