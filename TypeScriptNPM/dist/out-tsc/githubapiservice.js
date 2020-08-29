"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var request = require("request");
var user_1 = require("./user");
var GitHubApiService = /** @class */ (function () {
    function GitHubApiService() {
    }
    GitHubApiService.prototype.getUserInfo = function () {
        var options = {
            headers: {
                'user': 'request'
            },
            json: true
        };
        request.get("http://localhost:8087/person/allList", function (error, response, body) {
            console.log(body);
            var user = new user_1.User(JSON.parse(body));
            console.log(user);
        });
    };
    GitHubApiService.prototype.getRepos = function () {
    };
    return GitHubApiService;
}());
exports.GitHubApiService = GitHubApiService;
//# sourceMappingURL=githubapiservice.js.map