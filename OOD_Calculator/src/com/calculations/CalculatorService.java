package com.calculations;

import com.calculatorModels.Addition;
import com.calculatorModels.CalculatorMachine;
import com.calculatorModels.Subtraction;

public class CalculatorService {
	
	private String answer;
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public CalculatorService() {}
	
	public CalculatorService(Object obj) {
		CalculatorMachine calcMachine = new CalculatorMachine();
		int ans = 0;
		if (obj instanceof Addition) {
			ans = calcMachine.add(((Addition) obj).getNumberOne(), ((Addition) obj).getNumberTwo());
		} else if (obj instanceof Subtraction)
			ans = calcMachine.subtract(((Subtraction) obj).getNumberOne(), ((Subtraction) obj).getNumberTwo());
		this.answer = ans+"";
	}
	
	
	public CalculatorService(double num1 , double num2 ) {
		CalculatorMachine calcMachine = new CalculatorMachine();
		double[] ans = calcMachine.divide(num1, num2);
		this.answer = "Quotient = "+ans[0]+" AND Remainder = "+ans[1];
	}
	
	public CalculatorService (long num1 , long num2) {
		CalculatorMachine calcMachine = new CalculatorMachine();
		long ans = calcMachine.multiply(num1, num2);
		this.answer = ans+"";
	}
	

}
