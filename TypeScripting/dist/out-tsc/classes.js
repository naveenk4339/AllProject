var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person() {
    }
    /* constructor(firstName : string, lastName: string) {
        this.firstName = firstName
        this.lastName = lastName
    } */
    Person.prototype.greet = function () {
        console.log("hey there!");
    };
    return Person;
}());
//var aPerson = new Person("naveen" ,"seelam")
//console.log(aPerson);
var Programmer = /** @class */ (function (_super) {
    __extends(Programmer, _super);
    function Programmer() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Programmer.prototype.greet = function () {
        _super.prototype.greet.call(this);
        console.log("helloworld");
    };
    return Programmer;
}(Person));
var aProgrammer = new Programmer();
aProgrammer.greet();
//# sourceMappingURL=classes.js.map