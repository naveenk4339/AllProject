class Person{
	firstName : string;
	lastName : string;

	/* constructor(firstName : string, lastName: string) {
		this.firstName = firstName
		this.lastName = lastName
	} */

	greet(){
		console.log("hey there!");
	}
}

//var aPerson = new Person("naveen" ,"seelam")

//console.log(aPerson);

 class Programmer extends Person{
	 greet(){
		 super.greet()
		 console.log("helloworld");
	 }

	 /* greetLikeNormalPeople(){
		 super.greet()
	 } */
 }

var aProgrammer:Person = new Programmer();
aProgrammer.greet();
