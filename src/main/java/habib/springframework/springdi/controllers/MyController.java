package habib.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHello() {

		System.out.println("I'm the controller!");

		return "Hello Everyone!!!";
	}

}
