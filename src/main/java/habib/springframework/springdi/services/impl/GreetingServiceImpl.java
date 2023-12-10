package habib.springframework.springdi.services.impl;

import org.springframework.stereotype.Service;

import habib.springframework.springdi.services.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello Everyone From Base Service!";
	}

}
