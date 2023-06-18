package com.testingcalculator.testing.service;

import com.testingcalculator.testing.exceptions.DivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    CalculatorService compute = new CalculatorServiceImpl();
///////////sum

    @Test
    void positiveSum() {
        assertEquals(10, compute.sum(5, 5));
    }

    @Test
    void negativeSum() {
        assertEquals(-5, compute.sum(-2, -3));
    }

    @Test
    void equalSum() {
        assertEquals(compute.sum(5, 4), compute.sum(4, 5));
    }

    ///////////////minus

    @Test
    void positiveMinus() {
        assertEquals(5, compute.minus(10, 5));
    }

    @Test
    void negativeMinus() {
        assertEquals(-5, compute.minus(5, 10));
    }

    @Test
    void equalMinus() {
        assertNotEquals(compute.minus(15, 4), compute.minus(4, 5));
    }

    ///////multiply

    @Test
    void positiveMultiply() {
        assertEquals(21, compute.multiply(7, 3));
    }

    @Test
    void negativeMultiply() {
        assertEquals(-48, compute.multiply(-6, 8));
    }

    @Test
    void equalMultiply() {
        assertNotEquals(compute.multiply(6, 4), compute.multiply(4, 5));
    }

    //////divide

    @Test
    void positiveDivide() {
        assertEquals(3, compute.divide(10, 3));
    }

    @Test
    void negativeDivide() {
        assertEquals(-5, compute.divide(-10, 2));
    }

    @Test
    void equalDevide() {
        assertThrows(DivideException.class, () -> compute.divide(5, 0));
    }
}
