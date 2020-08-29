export interface MyInterface {
	
    name: string;
	gender : string;

	getFullDetails(): string;
}

class foo implements MyInterface{
	name: string;	gender: string;
	getFullDetails(): string {
		return this.name + this.gender;
	}

	
}

let aprogramm: MyInterface = new foo();

let somObj ={
	name : "Test",
	gender: "Test",
	getFullDetails: () => "Test"

};

aprogramm = somObj;


interface Persons{
	firstName : string;
	lastName : string;
	getFullName() : string;
}



