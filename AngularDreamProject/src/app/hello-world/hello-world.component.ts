import { Component, OnInit, Input } from '@angular/core';
import { User } from './user.mode';

@Component({
  selector: 'app-hello-world',
  templateUrl: './hello-world.component.html',
  styleUrls: ['./hello-world.component.css']
})
export class HelloWorldComponent implements OnInit {


  // tslint:disable-next-line: no-input-rename
  @Input('user') user: User ;

  isCollapsed: boolean = true;
  constructor() {

   }

   toogleCollapse(){
     this.isCollapsed =!this.isCollapsed;
   }
  ngOnInit() {
    /* this.user = {
      name: this.userObj.name,
       title: this.userObj.designation,
        address: this.userObj.address,
         phone: this.userObj.phone,
      /* name: 'Foo Bar',
      title: 'Software Developer',
      address: '155 south herbon st, city, state, 1000',
      phone: ['123-2323-32323',
        '123-2323-32323',
      '123-2323-32323',
        '123-2323-32323'] 
    };*/ 
  }

}
