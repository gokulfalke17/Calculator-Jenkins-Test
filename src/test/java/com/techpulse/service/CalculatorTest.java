package com.techpulse.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int add = calculator.add(5, 10);
        assertEquals(16, add);
    }

    @Test
    void testSubtract() {
        int subtract = calculator.subtract(10, 5);
        assertEquals(5, subtract);
    }

    @Test
    void testMultiply() {
        int multiply = calculator.multiply(5, 10);
        assertEquals(50, multiply);
    }

    @Test
    void testDivide() {
        int divide = calculator.divide(10, 2);
        assertEquals(5, divide);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

}
