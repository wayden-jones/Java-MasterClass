package com.company;

public class ComplexNumber {
    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public void add(ComplexNumber number) {
        this.imaginary += number.imaginary;
        this.real += number.real;
    }

    public void add(double real, double imaginary) {
        this.imaginary += imaginary;
        this.real += real;
    }

    public void subtract(double real, double imaginary) {
        this.imaginary -= imaginary;
        this.real -= real;
    }

    public void subtract(ComplexNumber number) {
        this.imaginary -= number.imaginary;
        this.real -= number.real;
    }
}
