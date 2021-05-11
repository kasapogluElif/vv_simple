package com.domain;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }
    @After
    public void tearDown() throws Exception {
        calc = null;
    }
    @Test
    public void testAdd() {
        double result = calc.add(10.5, 20.32);
        assertEquals(30.82, result,0.0000001);
    }
    @Test
    public void testSubtract() {
        double result = calc.subtract( 20.32,10.2);
        assertEquals(10.12, result,0.0000001);
    }
    @Test
    public void testMultiply() {
        double result = calc.multiply(3.2, 7.4);
        assertEquals(23.68, result,0.0000001);
    }
    @Test
    public void testDivide() {
        double result = calc.divide(10.5, 0.5);
        assertEquals(21, result,0.0000001);
    }




}
