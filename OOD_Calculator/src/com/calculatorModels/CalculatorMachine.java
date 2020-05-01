package com.calculatorModels;

import com.calculations.MathematicalOperartions;

public class CalculatorMachine implements MathematicalOperartions{

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		
		return num1 - num2;
	}

	@Override
	public long multiply(long num1, long num2) {
		
		return num1*num2;
	}

	@Override
	public double[] divide(double num1, double num2) {
		double quotient = num1/num2;
		double remainder = num1%num2;
		double[] d = {quotient , remainder};
		return d;
	}
	
	

}
