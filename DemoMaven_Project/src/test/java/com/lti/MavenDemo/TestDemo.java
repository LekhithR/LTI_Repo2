package com.lti.MavenDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDemo {

	
	
	
	
	
	@Test
	void strCheck() {
		String s1="Demo 1";
		System.out.println("This is the Testcase for string check ");
		assertEquals("Demo 1",s1);
	}
}
