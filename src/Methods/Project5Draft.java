package Methods;
import java.util.Scanner;

public class Project5Draft {

		public static void main(String[] args) {
/*			  Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the first number:");
			int num1 = sc.nextInt();
			System.out.println("Please enter the second number:");
			int num2 = sc.nextInt();
			System.out.println("Please enter your operation:ADD, SUB, MULTI, DIV, please enter it here");
			String op = sc.next();
			if (op.equalsIgnoreCase("Add")) {
				System.out.println("After Addition your result will be: " +plus(num1,num2));
			} else if (op.equalsIgnoreCase("Sub")) {
				System.out.println("After Substraction your result will be: " +minus(num1,num2));
			}
			else if (op.equalsIgnoreCase("Multi")) {
				System.out.println("After multiplication your result will be: " +plus(num1,num2));
			}
			else if (op.equalsIgnoreCase("Div")) {
				System.out.println("After division your result will be: " +plus(num1,num2));
			}
			
			
			//plus(num1,num2);	
			
	/* 
	 Build a basic calculator (Plus, Minus, Multiplication, Division)
	(Ask user for a number and then ask for the second number
	– then ask for the operation: ADD, SUB, MULTI, DIV)
	Two of the math operation needs to be a static Methods and two of them to be non-static methods. All 4 operations should be in a separate class.
	Use “IF and ELSE” or “SWITCH”
	 
	2. Ask the USER for a string and print if the string is palindrome // wow = wow
	                                 
	3. Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.

	 
	 */
		}
		public static int plus(int num1, int num2) {
			int num=num1+num2;
			System.out.println(num);
			return num;
		}
		public static int minus(int num1, int num2) {
			int num=num1-num2;
			System.out.println(num);
			return num;
		}
		public int multiplication(int num1, int num2) {
			int num=num1+num2;
			System.out.println(num);
			return num;
		}
		public int division(int num1, int num2) {
			int num=num1+num2;
			System.out.println(num);
			return num;
			/* 
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
	    	 System.out.println(sum);
	       	     }

	     if (userInput.equalsIgnoreCase(sum)) {
	    	 
	    	 System.out.println("It is a palindrome, answer the next question please");
	     }
	    else {
	    		 System.out.println("It is not a palindrome, answer the next question, please");
	    }
	    }
	    
		
	
	}

	


*/
	}
		

	}


