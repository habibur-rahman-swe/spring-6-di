package habib.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import habib.springframework.springdi.services.GreetingService;

@Controller
public class Myi18NController {

	private final GreetingService greetingService;

	public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}