package it.carmelolagamba.springboot.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SystemControllerTest {

	@Autowired
	private SystemController systemController;
	
	@Test
	public void testPing() {
		String pong = systemController.ping();
		assertEquals("pong", pong, "Ping failed");
	}
	
}
