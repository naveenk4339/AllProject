import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  I love mouni
  <h2>testing</h2>
  <p>{{myObject.Location}}</p>
  <ul>
  <li *ngFor="let arr of myArr">{{myArr}}</li>
  </ul>
  <p *ngIf="test =='naveen'; then tmpl1  else otherTmpl"> I love m</p>
  <ng-template #otherTmpl >no mouni loves me</ng-template>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'JavaSampeApproch hello angular4-client';
  hello = 'naveen hello';
  test = 'someThing';
  myArr = ['him', 'test'];
  myObject = {
    gender: 'male',
    age: 26,
    Location: 'USA'
  };


}
