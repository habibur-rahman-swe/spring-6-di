package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import habib.springframework.springdi.services.impl.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void testSayHello() {
		System.out.println(controller.sayHello());
	}

}
