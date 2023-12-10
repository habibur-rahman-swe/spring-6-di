package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

	@Autowired
	PropertyInjectedController propertyIntectedController;
	
//	@BeforeEach
//	void setUp() throws Exception {
//		
//		propertyIntectedController = new PropertyInjectedController();
//		propertyIntectedController.greetingService = new GreetingServiceImpl();
//		
//	}

	@Test
	void testSayHello() {
		System.out.println(propertyIntectedController.sayHello());
	}

}
