package habib.springframework.springdi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import habib.springframework.springdi.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	MyController myController;
	
	@Test
	void testAutowirOfController() {
		System.out.println(myController.sayHello());
	}
	
	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);
		
		System.out.println(myController.sayHello());
	}
	
	@Test
	void contextLoads() {
	}

}
