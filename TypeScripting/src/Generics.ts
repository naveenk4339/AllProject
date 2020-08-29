
//import {person} from './classes';

function echo<T>(arg: T): T {
	return arg;
}

var myString  = echo(1);
console.log(myString)

class Engine{
	firstName: string;
	lastName : string;
	constructor(firstName, lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

class Admin extends Engine{

}

class Manger extends Engine{

}

let admin = new Admin('a' , 'a');

let manager = new Manger('a','a');

function personEcho<T extends Engine>(person: T) :T{
	
	return person;
}

var fool = personEcho(admin);

console.log(fool.firstName);
