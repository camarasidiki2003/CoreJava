import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 /* Assignment:

Ask and Capture answer to the following questions:
What is your name?
How old are you?
What is your gender?
Where are you from?
Where do you live now?
Where do you work?
What is your job role?
What is your salary?
How much raise are you getting next year?

Based on the answer from part 1, Print out the following paragraph:
My name is James Bond. I am 40 years old, male. I work at IBM as Automation Engineer. I currently live in New York. I am originally from England. I make 100000.00 dollar. I will get 50000.00 as annual raise so my total salary would be 150000.00 dollar next year.
/*	
		Scanner scan= new Scanner(System.in);
		System.out.println("What is your name?");
		Scanner userInput= new Scanner(System.in);
		//String value=userInput.next();
		String myName=userInput.nextLine();
		//String value=userInput.nextLine();
		//System.out.println(value);
		//System.out.println(userInput.nextLine());
		//System.out.println(valueInt);
		System.out.println("How old are you?");
		Scanner userInputAge= new Scanner(System.in);
		int myAge=userInputAge.nextInt();
		System.out.println(myAge);
		System.out.println(userInputAge.nextLine());
		System.out.println("What is your gender?");
		Scanner userInputGender= new Scanner(System.in);
		String myGender=userInputGender.nextLine();
		System.out.println(myGender);
		System.out.println(userInputGender.nextLine());
		System.out.println("Where are you from?");
		Scanner userInputOrigin = new Scanner(System.in);
		String myOrigin=userInputOrigin.nextLine();
		System.out.println(myOrigin);
		System.out.println(userInputOrigin.nextLine());
		
		System.out.println("Where do you live now");
		Scanner userInputLive= new Scanner(System.in);
		String myLive=userInputLive.nextLine();
		//System.out.println(myAge);
		System.out.println(userInputLive.nextLine());
		
		System.out.println("Where do you work?");
		Scanner userInputWork= new Scanner(System.in);
		String myWork=userInputWork.nextLine();
		System.out.println(myWork);
		System.out.println(userInputWork.nextLine());
		System.out.println("What is your job role?");
		Scanner userInputRole= new Scanner(System.in);
		String myRole=userInputRole.nextLine();
		System.out.println(myRole);
		System.out.println(userInputRole.nextLine());
		System.out.println("What is your salary?");
		Scanner userInputSalary= new Scanner(System.in);
		Double mySalary=userInputSalary.nextDouble();
		System.out.println(mySalary);
		System.out.println(userInputSalary.nextLine());
		System.out.println("How much raise are you getting next year?");
		Scanner userInputRaise= new Scanner(System.in);
		Double myRaise=userInputRaise.nextDouble();
		System.out.println(myRaise);
		System.out.println();
		Double totalSalary=mySalary+myRaise;
		System.out.println("My name is " + myName +". I am "+ myAge +" years old "+ myGender +". I work at "+ myWork +" as "+ myRole +". I currently live in "+ myLive +". I am originally from "+ myOrigin +". I make "+ mySalary);
	    System.out.println(" dollar. I will get "+ myRaise +" as annual raise so my total salary would be "+ totalSalary + " dollar next year.");
 */
	Scanner scan= new Scanner(System.in);
	System.out.println("What is your name?");
	Scanner userInput= new Scanner(System.in);
	String myName=userInput.nextLine();
	System.out.println("How old are you?");
	Scanner userInputAge= new Scanner(System.in);
	int myAge=userInputAge.nextInt();
	System.out.println(myAge);
	System.out.println(userInputAge.nextLine());
	System.out.println("What is your gender?");
	Scanner userInputGender= new Scanner(System.in);
	String myGender=userInputGender.nextLine();
	System.out.println(myGender);
	System.out.println(userInputGender.nextLine());
	System.out.println("Where are you from?");
	Scanner userInputOrigin = new Scanner(System.in);
	String myOrigin=userInputOrigin.nextLine();
	System.out.println(myOrigin);
	System.out.println(userInputOrigin.nextLine());
	
	System.out.println("Where do you live now");
	Scanner userInputLive= new Scanner(System.in);
	String myLive=userInputLive.nextLine();
	//System.out.println(myAge);
	System.out.println(userInputLive.nextLine());
	
	System.out.println("Where do you work?");
	Scanner userInputWork= new Scanner(System.in);
	String myWork=userInputWork.nextLine();
	System.out.println(myWork);
	System.out.println(userInputWork.nextLine());
	System.out.println("What is your job role?");
	Scanner userInputRole= new Scanner(System.in);
	String myRole=userInputRole.nextLine();
	System.out.println(myRole);
	System.out.println(userInputRole.nextLine());
	System.out.println("What is your salary?");
	Scanner userInputSalary= new Scanner(System.in);
	Double mySalary=userInputSalary.nextDouble();
	System.out.println(mySalary);
	System.out.println(userInputSalary.nextLine());
	System.out.println("How much raise are you getting next year?");
	Scanner userInputRaise= new Scanner(System.in);
	Double myRaise=userInputRaise.nextDouble();
	System.out.println(myRaise);
	System.out.println();
	Double totalSalary=mySalary+myRaise;
	System.out.println("My name is " + myName +". I am "+ myAge +" years old "+ myGender +". I work at "+ myWork +" as "+ myRole +". I currently live in "+ myLive +". I am originally from "+ myOrigin +". I make "+ mySalary);
    System.out.println(" dollar. I will get "+ myRaise +" as annual raise so my total salary would be "+ totalSalary + " dollar next year.");
	
	}

}
