package habib.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

import habib.springframework.springdi.services.GreetingService;
import habib.springframework.springdi.services.impl.GreetingServiceImpl;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController() {
		this.greetingService = new GreetingServiceImpl();
	}

	public String sayHello() {

		System.out.println("I'm the controller!");

		return greetingService.sayGreeting();
	}

}
