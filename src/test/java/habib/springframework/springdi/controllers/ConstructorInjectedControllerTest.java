package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

	@Autowired
	ConstructorInjectedController controller;
	
//	@BeforeEach
//	void setUp() throws Exception {
//		controller = new ConstructorInjectedController(new GreetingServiceImpl());
//	}

	@Test
	void testSayHello() {
		System.out.println(controller.sayHello());
	}

}
