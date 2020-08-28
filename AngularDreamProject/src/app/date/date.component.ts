import { Component, OnInit } from '@angular/core';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';

@Component({
  // tslint:disable-next-line: component-selector
  selector: 'date',
  templateUrl: './date.component.html',
  styleUrls: ['./date.component.css']
})
export class DateComponent implements OnInit {

  dateMessage: Date;
  someNumber = 200;
  constructor() {
    setInterval( () => {
    const currentDate = new Date();
    this.dateMessage = currentDate;
   } , 1000);


   }

  ngOnInit() {

  }
  addTwoNumber(a,b){
    return a+b;
  }
  

}
