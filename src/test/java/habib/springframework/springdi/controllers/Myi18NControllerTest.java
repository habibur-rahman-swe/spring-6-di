package habib.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("EN")
//@ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTest {

	@Autowired
	private Myi18NController myi18nController;
	
	@Test
	void testSayHello() {
		System.out.println(myi18nController.sayHello());
	}

}
