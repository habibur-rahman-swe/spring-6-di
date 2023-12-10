package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import habib.springframework.springdi.services.impl.GreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testSayHello() {
		System.out.println(setterInjectedController.sayHello());
	}

}
