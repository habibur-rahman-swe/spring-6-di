package habib.springframework.springdi.controllers;

import habib.springframework.springdi.services.GreetingService;

public class PropertyInjectedController {
	
	GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
