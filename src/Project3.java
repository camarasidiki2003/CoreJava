import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Ask the USER for a string (it should print “Please enter a String:”)
assume the user enters “hello”
Convert that string to all uppercase and print it (it should print “HELLO”)
Print the length of that string (it should print 5)
Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
Give the last char of the string (it should print “Z”)
Concatenate the string from step 1 with string "Test" (it should print “hello Test”)

		 * */
        Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string at your choice");
		Scanner userString = new Scanner(System.in);
		String a=userString.nextLine();
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
		String b = a.replace('o', 'z');
		System.out.println(b);
		//System.out.println(a.replace('o', 'Z'));
		System.out.println(b.charAt(b.length()-1));
		System.out.println(a.concat(" Test"));
    
	}

}
