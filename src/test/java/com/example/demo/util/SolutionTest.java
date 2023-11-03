package com.example.demo.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution;
	@BeforeEach
	public void setup() {
		solution = new Solution();
	}
	@Test
	public void test() {
		int actual = solution.stringToInteger("301");
		assertTrue(actual == 301);
	}
	
	@Test
	public void testCountFound3() {
		int actual = solution.count(6, 20);
		assertEquals(3, actual);
	}
	@Test
	public void testCountFoundNone() {
		int actual = solution.count(21, 29);
		assertEquals(0, actual);
	}
	@Test
	public void testCountFound3a() {
		int actual = solution.count(2, 1000000000);
		assertEquals(31621, actual);
	}

}
