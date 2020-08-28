import { Component } from '@angular/core';
import { User } from './hello-world/user.mode';
import { TestService } from './test.service';
import { HttpClient } from '@angular/common/http';
import { observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularDreamProject Naveen';
  user: User;
  inputText = 'Initial value';
// i need testService
 flightNumber:Number ;

routes =[ 
  { linkName: 'Contact' , url:'contact'},
  { linkName: 'Profile', url:'profile'}
] 

contactRoute: "contact";
 profileRoute:"profile";

 isCollapsed : boolean = true;
constructor(private svc: TestService, private http: HttpClient) {
   this.svc.printToConsle( ' testing the service injection ');
   this.user = new User();
   this.user.name = 'Foo Bar ???';
   this.user.designation = 'software engineer';
   this.user.address = '1000  street city state';
   this.user.phone = [
      '123-123-1234',
      '324-456-3456',
      '345-456-4444'
    ];
 }
 onNameKeyUp(event:any){
   this.flightNumber = event.target.value;
 }
  // tslint:disable-next-line: use-life-cycle-interface
  ngOnInit() {
   let obs = this.http.get('https://api.github.com/users/koushikkothagal');
      obs.subscribe((response) => console.log(response));
  }
   
  getProfile(){
   let obs = this.http.get('http://localhost:8080/Airlines/flightInfo/flightNumber/2018-01-31');
   obs.subscribe(
    (data:any[]) => {
      console.log(data);
    }
  )
  }

}
