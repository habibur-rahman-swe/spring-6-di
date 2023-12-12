package habib.springframework.springdi.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import habib.springframework.springdi.controllers.PropertyInjectedController;

@SpringBootTest
class GreetingServicePropertyInjectedTest {

	@Autowired
	PropertyInjectedController propertyInjectedController;
	
	@Test
	void testSayGreeting() {
		System.out.println(propertyInjectedController.sayHello());
	}

}
