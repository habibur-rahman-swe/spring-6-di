package habib.springframework.springdi.services.impl;

import habib.springframework.springdi.services.GreetingService;

public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello Everyone From Base Service!";
	}

}
