"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var foo = /** @class */ (function () {
    function foo() {
    }
    foo.prototype.getFullDetails = function () {
        return this.name + this.gender;
    };
    return foo;
}());
var aprogramm = new foo();
var somObj = {
    name: "Test",
    gender: "Test",
    getFullDetails: function () { return "Test"; }
};
aprogramm = somObj;
//# sourceMappingURL=Animal.js.map