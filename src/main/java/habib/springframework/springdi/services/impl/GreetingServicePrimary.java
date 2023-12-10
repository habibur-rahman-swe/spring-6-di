package habib.springframework.springdi.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import habib.springframework.springdi.services.GreetingService;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello From the Primary Bean!!";
	}

}
