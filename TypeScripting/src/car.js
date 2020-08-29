"use strict";
var Car = /** @class */ (function () {
    //constructor 
    function Car(engine, tire) {
        this.engine = engine;
        this.tire = tire;
    }
    //function 
    Car.prototype.disp = function () {
        console.log("Function displays Engine is  :   " + this.engine + " " + this.tire);
    };
    return Car;
}());
//create an object 
var objTp = new Car("tst", "nave");
//access the field 
console.log("Reading attribute value Engine as :  " + objTp.engine + " " + objTp.tire);
//access the function
objTp.disp();
