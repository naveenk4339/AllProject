class Test{
	/* private firstName : string;
	private lastName : string; */

	readonly age;

	constructor(protected firstName : string , public lastName : string)
	{
	 /* this.firstName = firstName;
	 this.lastName = lastName; */
	}
	greeting(){
		return this.firstName + this.lastName;
	}
	getFirstName(){
		return this.firstName;
	}
	setFirstName(firstName : string){
		this.firstName = firstName;
	}
	
	getLastName(){
		return this.lastName;
	}
	setLastName(lastName : string){
		this.lastName = lastName;
	}

}

class Company{
	 
	constructor(readonly name:string){
		this.name=name;
	}


}
/* var aCompany: Company = new Company(name);
var day ='Monday'; */
enum DaysOfWeek{
	SUN,MON, TUE, WED, THU, FRI, SAT
}

let day : DaysOfWeek;
day = DaysOfWeek.FRI;

if(day === DaysOfWeek.FRI)
{
	console.log('got to work off');
}
