import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TestService {

 printToConsle(arg){
   console.log(arg);
 }
}
