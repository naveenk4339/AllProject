import * as request from 'request';
import { User } from './user';

export class GitHubApiService {
	

	getUserInfo() {
		let options: any = {
			headers: {
				'user': 'request'
			},
			json: true
		} 
		request.get("http://localhost:8087/person/allList",  (error: any, response: any, body: any) => {
		console.log(body);
		let user = new User(JSON.parse(body));
		console.log(user);

		});
	}

	getRepos() {

	}
}