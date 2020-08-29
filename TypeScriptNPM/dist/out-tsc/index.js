"use strict";
/* #!/usr/bin/env node

import Greeter from './hello-world';
import * as _ from 'lodash';

var greeter = new Greeter("Hello, World!");
var str = greeter.greet();
console.log(greeter);
console.log(str);


var array = [1, 3, 5, 6, 8, 0, 10];
console.log(_.reverse(array));
var stringArray
    = ["sreing", "sds", "dfdfd"];






 */
Object.defineProperty(exports, "__esModule", { value: true });
var githubapiservice_1 = require("./githubapiservice");
var svc = new githubapiservice_1.GitHubApiService();
svc.getUserInfo();
//# sourceMappingURL=index.js.map