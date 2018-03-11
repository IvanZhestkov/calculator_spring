package ru.kpfu.itis.model;

public class Calculator {

    private Double digit;

    private String operation;

    private String error;

    public Double getDigit() {
        return digit;
    }

    public void setDigit(Double digit) {
        this.digit = digit;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
