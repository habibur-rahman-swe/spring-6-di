package habib.springframework.springdi.controllers;

import habib.springframework.springdi.services.GreetingService;

public class SetterInjectedController {
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
