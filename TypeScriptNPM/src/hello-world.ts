import * as request from 'request';

export default class Greeter {
    
    firstName: string = "Naveen";
    lastName: string = "Seelam";

    constructor(public greeting: string) { }

    greet() {
        return this.greeting;
    }

}

