package VK;

import java.util.Scanner;

public class ss {
	
	public static void main(String[] args) {
		performProgram();   
		chooseNumber();
		}


		public static void performProgram(){
		int number;
		Scanner pj= new Scanner(System.in);
		    System.out.println("Please select a number that indicates what the program will perform");
		    chooseOption();
		    System.out.print("Enter the number of your choice: ");
		    number=pj.nextInt();
		}


		public static void chooseOption(){
		    System.out.println("1. Display the factors of a number");
		    System.out.println("2. Display whether a number is odd or even");
		    System.out.println("3. Display whether a number is a perfect number or not");
		    System.out.println("4. Display the elements of an array in ascending order");
		    System.out.println("5. Display the sum of odd elements in the array");
		}


		public static void chooseNumber(){
		int number = 0;
		//Error: variable might have not been initialized
		    if(number == 1)
		        getFactors();
		    if(number == 2)
		        displayOddEven();   
		}

		

          
		            
}          
