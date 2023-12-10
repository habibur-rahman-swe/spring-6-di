package habib.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import habib.springframework.springdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
