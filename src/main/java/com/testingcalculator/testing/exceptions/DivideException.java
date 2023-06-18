package com.testingcalculator.testing.exceptions;

public class DivideException extends IllegalArgumentException {
    public DivideException() {
    }

    public DivideException(String s) {
        super(s);
    }

    public DivideException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideException(Throwable cause) {
        super(cause);
    }
}
