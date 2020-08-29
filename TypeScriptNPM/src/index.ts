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




 import {GitHubApiService} from './githubapiservice';

 let svc = new GitHubApiService();
 svc.getUserInfo();



