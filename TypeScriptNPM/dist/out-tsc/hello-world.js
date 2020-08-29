"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Greeter = /** @class */ (function () {
    function Greeter(greeting) {
        this.greeting = greeting;
        this.firstName = "Naveen";
        this.lastName = "Seelam";
    }
    Greeter.prototype.greet = function () {
        return this.greeting;
    };
    return Greeter;
}());
exports.default = Greeter;
//# sourceMappingURL=hello-world.js.map