package com.jap.calculator;

public class MathematicalCalculator {

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int subtract(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        //write the code and handle the ArithmeticException
        int quotient = 0;
        try {
            quotient = num1 / num2;
        } catch (Exception e) {
            return 0;
        }
        return quotient;
    }

    public int modulo(int num1, int num2) {
        int remainder = num1 % num2;
        return remainder;
    }
}
