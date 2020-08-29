package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/api/hi")
	public String hi() {
		
		return "Hello World form Restful API";
	}
}
