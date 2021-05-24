package day2;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
	
		 
		    Scanner input = new Scanner (System.in);
			System.out.println("Enter principal :");
			 int p = input.nextInt();
				System.out.println("Enter rate of interest:");
				 int r = input.nextInt();
					System.out.println("Enter time in years :");
					 int t = input.nextInt();
		             int  si  = (p*r*t)/100;   
		              System.out.println("Simple Interest is: " +si);  
		    }  
	}


