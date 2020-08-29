"use strict";
//import {person} from './classes';
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
function echo(arg) {
    return arg;
}
var myString = echo(1);
console.log(myString);
var Engine = /** @class */ (function () {
    function Engine(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    return Engine;
}());
var Admin = /** @class */ (function (_super) {
    __extends(Admin, _super);
    function Admin() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Admin;
}(Engine));
var Manger = /** @class */ (function (_super) {
    __extends(Manger, _super);
    function Manger() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Manger;
}(Engine));
var admin = new Admin('a', 'a');
var manager = new Manger('a', 'a');
function personEcho(person) {
    return person;
}
var fool = personEcho(admin);
console.log(fool.firstName);
