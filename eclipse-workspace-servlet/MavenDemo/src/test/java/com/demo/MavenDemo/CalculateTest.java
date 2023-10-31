package com.demo.MavenDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculateTest {
private static Calculate obj;
@BeforeAll
public static void setup() {
	obj = new Calculate();
}
@AfterAll
public static void clear() {
	obj=null;
}
@Test
public void testAddNums() {
	assertEquals(15,obj.addNum(7,8));
}
@Test
public void testOddNums() {
	assertTrue(obj.oddNum(7));
}
@Test
public void testEvenNums() {
	assertTrue(obj.evenNum(8));
}
@Test
public void testDivNums() {
	assertEquals(1,obj.div(3,3));
}
@Test
public void testDivException() {
	assertThrows(ArithmeticException.class,()->obj.div(2,2));
}
}