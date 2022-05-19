package project8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project8 {
/* Create a Int Array[] with unsorted numbers and sort without using Arrays.sort() function
 
2. Generate 500 RANDOM numbers, and find the Nth smallest number (range from 100 – 1000)
 
3.Ask the USER for a string (let’s assume they input “hello world”):
a. Find and Print the Duplicated Character (it should print: l o)


*/ public static void rd() {
	int counter;
    Random rnum = new Random();
    /* Below code would generate 500 random numbers
     * between 100 and 1000.
     */
    System.out.println("Random Numbers:");
    System.out.println("***************");
    for (counter = 100; counter <= 500; counter++) {
       System.out.println(rnum.nextInt(1000));
    }
}
	 public static void main(String[] args) {
	rd();
	Project8 obj = new Project8();
	obj.sorting1();
	obj.RandNumb();
	userInput();
	obj.nth();
	Scanner sc =new Scanner(System.in); // scanner object
	 System.out.println("Please enter a string:"); 
	 String theNumber = sc.next(); //to read user input
	
	}
	 
	 public int RandNumb() {
		 Random randnumb = new Random();
		 System.out.println("Random Numbers:");
		 System.out.println("**************");
		 for (int i=100; i<=1000; i++) {
			 System.out.println(randnumb.nextInt(1000));
			}
		return randnumb.nextInt(500);
	 }
	 public void sorting1() {
	 int[] arr = new int[]{0, 1, 3, 4,9, 7, 2, 6, 5};
		int newV=0;
		for (int b=0; b<arr.length; b++)
		System.out.print(arr[b]+" ");
		System.out.println(" is the unsorted list of the array");
		//Let sort the array the Arrays.sort() 
		// Let use For loop
		for (int i =0;i<arr.length; i++) {
		for (int j=i+1;j<arr.length; j++) {
			
			if (arr[i]>arr[j])
			{
				//swap values
				newV=arr[i];
				arr[i]=arr[j];
				arr[j]=newV;
			}
			}
			System.out.print(arr[i]+ " ");
			}
		System.out.println(" is the sorted list, sort performed by For loop");
	 }
	 public static void userInput() {
		 Scanner sc =new Scanner(System.in); // scanner object
		 System.out.println("Please enter a string:"); 
		 String theNumber =  sc.next(); //to read user input
	 }
	 public void nth() {
		 {
	            int numbers [] = {10, 15, 20, -88};
	             
	            int largest = numbers[0];
	            int smallest = numbers[0];
	             
	            for(int i = 1;  i<numbers.length; i++) {
	                 if(numbers[i]>largest) {
	                   largest = numbers[i];
	                 }
	                 else if(numbers[i]<smallest) {
	                   smallest = numbers[i];
	                 }
	          }
	           System.out.println("List of array is: " + Arrays.toString(numbers));
	           System.out.println("Largest numbers is : " +largest);
	           System.out.println("Smallest number is : " +smallest);
	        }
	 }
			
	

		}  


