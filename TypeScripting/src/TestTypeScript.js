"use strict";
var Test = /** @class */ (function () {
    function Test(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        /* this.firstName = firstName;
        this.lastName = lastName; */
    }
    Test.prototype.greeting = function () {
        return this.firstName + this.lastName;
    };
    Test.prototype.getFirstName = function () {
        return this.firstName;
    };
    Test.prototype.setFirstName = function (firstName) {
        this.firstName = firstName;
    };
    Test.prototype.getLastName = function () {
        return this.lastName;
    };
    Test.prototype.setLastName = function (lastName) {
        this.lastName = lastName;
    };
    return Test;
}());
var Company = /** @class */ (function () {
    function Company(name) {
        this.name = name;
        this.name = name;
    }
    return Company;
}());
/* var aCompany: Company = new Company(name);
var day ='Monday'; */
var DaysOfWeek;
(function (DaysOfWeek) {
    DaysOfWeek[DaysOfWeek["SUN"] = 0] = "SUN";
    DaysOfWeek[DaysOfWeek["MON"] = 1] = "MON";
    DaysOfWeek[DaysOfWeek["TUE"] = 2] = "TUE";
    DaysOfWeek[DaysOfWeek["WED"] = 3] = "WED";
    DaysOfWeek[DaysOfWeek["THU"] = 4] = "THU";
    DaysOfWeek[DaysOfWeek["FRI"] = 5] = "FRI";
    DaysOfWeek[DaysOfWeek["SAT"] = 6] = "SAT";
})(DaysOfWeek || (DaysOfWeek = {}));
var day;
day = DaysOfWeek.FRI;
if (day === DaysOfWeek.FRI) {
    console.log('got to work off');
}
