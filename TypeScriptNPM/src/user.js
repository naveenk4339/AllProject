"use strict";
exports.__esModule = true;
var User = /** @class */ (function () {
    function User(userResponse) {
        this.empId = userResponse.empid;
        this.firstName = userResponse.firsName;
        this.age = userResponse.age;
        this.lastName = userResponse.lastName;
        this.id = userResponse.id;
    }
    return User;
}());
exports.User = User;
