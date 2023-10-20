package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.controller.HomeController;

public class HomeControllerTest {
	HomeController controller;

	@BeforeEach
	void setup() {
		controller = new HomeController();
	}

	@Test
	public void greetTest() {
		assertEquals("Hello World!", controller.greetMessage());
	}

	@Test
	public void greetMessageTest() {
		String expected = "Hello Nishchal";
		String actual = controller.greetMessageWithName("Nishchal");
		assertEquals(expected, actual);
	}

}
