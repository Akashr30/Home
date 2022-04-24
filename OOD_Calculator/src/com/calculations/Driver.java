package com.calculations;

import java.util.Scanner;

import com.calculatorModels.Addition;

public class Driver {
	
	public static void main(String[] arg) {
		
		System.out.println("CALCULATOR SAYS, TRAIN YOUR MIND IDIOT !! SO THAT YOU DONT HAVE TO DEPENDENT ON ME NEXT TIME");
		
		System.out.println("PRESS 1 FOR ADDITION");
		System.out.println("PRESS 2 FOR SUBTRACTION");
		System.out.println("PRESS 3 FOR MULTIPLICATION");
		System.out.println("PRESS 4 FOR DIVISION");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice :");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
			case 1: 
				Addition add = new Addition();
				System.out.println("Enter the First Number : ");
				add.setNumberOne(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter the second Number : ");
				add.setNumberTwo(Integer.parseInt(sc.nextLine()));
				CalculatorService calculatorService = new CalculatorService(add);
				System.out.println("Sum is : "+calculatorService.getAnswer());
			default :
				System.out.println("NO SUCH OPTION IS PROVIDED...SELECT ANY ONE FROM THE GIVEN LIST");
		}
		
		
	}
	
}
