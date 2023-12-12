package habib.springframework.springdi.services.impl;

import org.springframework.stereotype.Service;

import habib.springframework.springdi.services.GreetingService;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Friends don't let friends property";
	}

}
