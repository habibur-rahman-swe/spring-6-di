package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {

	@Autowired
	SetterInjectedController setterInjectedController;
	
//	@BeforeEach
//	void setUp() throws Exception {
//		setterInjectedController = new SetterInjectedController();
//		setterInjectedController.setGreetingService(new GreetingServiceImpl());
//	}

	@Test
	void testSayHello() {
		System.out.println(setterInjectedController.sayHello());
	}

}
