package com.example.demo;

import com.example.demo.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void testEndpoint() {
		HomeController cont = new HomeController();
		assert cont.home().equals("Não é mamãe!  from Azure App Service (in the staging slot)!");
	}

}
