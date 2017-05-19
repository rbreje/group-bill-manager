package ro.rbreje.gbm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutheticationController {

	@RequestMapping("/")
	public String home(){
		return "is working";
	}
	
}
