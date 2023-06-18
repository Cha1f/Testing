package com.testingcalculator.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ParametrizedCalculatorServiceTest {
    CalculatorService comp = new CalculatorServiceImpl();

    static Stream<Arguments> parametrizedMythod() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(313, 2, 315),
                Arguments.of(-123, 2967, 2844),
                Arguments.of(123, 2000, 2123),
                Arguments.of(448, -19, 429));
    }
    @ParameterizedTest
    @MethodSource("parametrizedMythod")
    void sum(int num1, int num2, int num3) {
        assertEquals(num3, comp.sum(num1, num2));
    }

    static Stream<Arguments> parametrizedMythodVersion2() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(313, 2),
                Arguments.of(-123, 2967),
                Arguments.of(123, 2000),
                Arguments.of(448, -19));
    }

    @ParameterizedTest
    @MethodSource("parametrizedMythodVersion2")
    void minus(int num1, int num2) {
        int expected = num1 - num2;
        int actual = comp.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parametrizedMythodVersion2")
    void multiply(int num1, int num2) {
        int expected = num1 * num2;
        int actual = comp.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parametrizedMythodVersion2")
    void divide(int num1, int num2) {
        int expected = num1 / num2;
        int actual = comp.divide(num1, num2);
        assertEquals(expected, actual);
    }
}
