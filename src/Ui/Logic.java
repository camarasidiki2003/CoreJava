package Ui;

import java.util.Scanner;

import Opt.*;


public class Logic {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Give me first number");
		double num1 = userInput.nextDouble();
		System.out.println("Give me second number");
		double num2 = userInput.nextDouble();
		System.out.println("Select an operation: ADD, SUB, MULTI, DIV");
		String optValue = userInput.next();
		if(optValue.equalsIgnoreCase("ADD")){				
		// Call Add method
			System.out.println("Your solution is "+MathOpt.add(num1, num2));
			
					}     
		else if(optValue.equalsIgnoreCase("sub")){				
			// Call sub
			System.out.println("Your solution is "+MathOptTwo.sub(num1, num2));
		}
		else if(optValue.equalsIgnoreCase("multi")){				
			// Call multi method
		MathOptTwo obj = new MathOptTwo();
		System.out.println("Your solution is "+obj.multi(num1, num2));
		}
		else if(optValue.equalsIgnoreCase("Div")){				
			// Call div
			MathOpt obj = new MathOpt();
			System.out.println("Your solution is "+obj.div(num1, num2));
		}
		else {				
			System.out.println("I dont understand your input for operation, input diffrent one by re-running the project, Thanks");
		}
		userInput.close();
		
}
}
