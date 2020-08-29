import { Repo } from "./repo";

export class User {
	empId: number;
	firstName : string;
	id : number;
	age : number;
	lastName: string;
	followCount : number;
	repos: Repo[];

	constructor(userResponse: any) {
		this.empId = userResponse.empId;
		this.firstName = userResponse.firsName;
		this.age = userResponse.age;
		this.lastName = userResponse.lastName;
		this.id = userResponse.id;
	}
}