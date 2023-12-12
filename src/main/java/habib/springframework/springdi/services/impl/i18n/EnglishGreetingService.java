package habib.springframework.springdi.services.impl.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import habib.springframework.springdi.services.GreetingService;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello World - EN";
	}
}
