import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
Given N --- Print backward to 0.
(Ask user for a number and let's assume N is 5 so if the user input 5
– then the program should print: 5 4 3 2 1 0)
Ask the user for a word and then print each character out one by one.
Example: user enters: hello; your program will print out: h e l l o
*/
	Scanner sc = new Scanner(System.in);
	System.out.println(" Question1: Please enter an integer");
	int  N = sc.nextInt();
	if (N<=0) {
		System.out.println(" Please enter an integer greater than zero");
		int N2 = sc.nextInt();
		
		if(N2>=0 && N2<4){
			  System.out.print(1);
			                   }
			    else {
			    	System.out.print(1);
			    	for(int i=4; i<=N2; i=i+4) {
					System.out.print(","+i);
				     }
			    }
		
			
		
		      }
	  else if(N>=0 && N<4){
	  System.out.print(1);
	                   }
	    else {
	    	System.out.print(1);
	    	for(int i=4; i<=N; i=i+4) {
			System.out.println(","+i);
		     }
		

	}
	System.out.println(" Question2: Please enter an integer to print backward");
	int uI = sc.nextInt();
	for(int i=uI;i>=0; i--) 
	{ 
		System.out.println(i);
	}
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Question3, Please input a text so we can spaced print them");
	String N2 = sc2.nextLine();
	for(int i=0;i<=N2.length()-1;i++) {
		System.out.print(" "+N2.charAt(i));
	}
	}
	
	}
	

