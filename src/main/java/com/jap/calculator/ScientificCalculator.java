package com.jap.calculator;

public class ScientificCalculator {

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
			scientificCalculator.floorOfANumber(9);
			scientificCalculator.power(5, 5);
			scientificCalculator.squareRoot(12);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}

		//Call all the methods one by one and surround them by try and respective catch blocks.
	}

	public double cielOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if (num <= 0) {
			throw new CalculatorException("The given number cannot be less than or equal to zero");
		} else {
			Math.ceil(num);
		}
		//or else call ceil method of Math class and return the value
		return 1;
	}
	
	public double floorOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if (num <= 0) {
			throw new CalculatorException("The given number cannot be less than or equal to zero");
		} else {
			Math.floor(num);
		}
		//or else call floor method of Math class and return the value
		return 1;
	}

	public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		if (num1 < num2) {
			throw new CalculatorException("Number 1 cannot be less than number 2");
		} else {
			Math.pow(num1, num2);
		}
		//else use Math pow method and return the value

		return -1;
	}

    public double squareRoot(int num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if (num <= 0) {
			throw new CalculatorException("Base and exponent cannot be zero");
		} else
			Math.sqrt(num);
		//or else call sqrt method of Math class and return the value
		return -1;
	}
}
