package Methods;

import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {
		String sum="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Please enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("Please enter your operation:ADD, SUB, MULTI, DIV, please enter it here");
		String op = sc.next();
		if (op.equalsIgnoreCase("Add")) {
			System.out.println("After Addition your result will be: " +Plus.plus(num1,num2));
		} else if (op.equalsIgnoreCase("Sub")) {
			System.out.println("After Substraction your result will be: " +Minus.minus(num1,num2));
		}
		else if (op.equalsIgnoreCase("Multi")) {
			Multiplication obj = new Multiplication();
			System.out.println("After multiplication your result will be: " +obj.multiplication(num1,num2));
		}
		else if (op.equalsIgnoreCase("Div")) {
			Division obj = new Division();
			System.out.println("After division your result will be: " +obj.division(num1,num2));
		}
		else {
			System.out.println("You did not enter the operation properly, sorry I can not give any answer to your question, Go to the next question please");
		}
			System.out.println("Please enter a string to check whether it is a palindrome or not:");
	     String userInput = sc.next();
	     char[] myArray=userInput.toCharArray();
	     
	    for(int i=userInput.length()-1;i>=0;i--) {
	    	 sum =sum+myArray[i];
	    	 
	       	     }
	    System.out.println(sum);

	     if (userInput.equalsIgnoreCase(sum)) {
	    	 
	    	 System.out.println(userInput+" is a palindrome, answer the next question please");
	     }
	    else {
	    		 System.out.println(userInput+" is not a palindrome, answer the next question, please");
	    }
	    System.out.println("please enter a number to see whether it is an odd or even number");
	     int number3 = sc.nextInt();
	      int myNumber=number3%2;
	      if (myNumber==1) {
	    	  System.out.println(number3+" is an odd number");
	      }
	      else {
	    	  System.out.println(number3+" is an even number, ");
	      }
	      System.out.println("THANK YOU SO MUCH FOR YOUR ATTENTION! GOD BLESS");
	     }
	    
		
	
	}

	


