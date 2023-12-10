package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import habib.springframework.springdi.services.impl.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyIntectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		
		propertyIntectedController = new PropertyInjectedController();
		propertyIntectedController.greetingService = new GreetingServiceImpl();
		
	}

	@Test
	void testSayHello() {
		System.out.println(propertyIntectedController.sayHello());
	}

}
