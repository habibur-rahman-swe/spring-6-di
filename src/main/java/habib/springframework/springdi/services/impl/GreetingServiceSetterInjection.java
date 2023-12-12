package habib.springframework.springdi.services.impl;

import org.springframework.stereotype.Service;

import habib.springframework.springdi.services.GreetingService;

@Service("setterBean")
public class GreetingServiceSetterInjection implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hey I'm setting a greeting!!";
	}

}
