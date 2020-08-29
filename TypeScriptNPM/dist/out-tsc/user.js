"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
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
//# sourceMappingURL=user.js.map