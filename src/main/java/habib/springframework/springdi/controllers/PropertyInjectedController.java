package habib.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import habib.springframework.springdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyGreetingService")
	@Autowired
	GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
